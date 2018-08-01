/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：CXFServiceConfiguration.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworkes.cxf.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.model.ApplicationInfo;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.creativeworkes.cxf.service.impl.CXFServiceImpl;

/**
 * ApacheCXF服务配置
 *
 * @author Yeqinglan
 */
@Configuration
public class CXFServiceConfiguration {

  /**
   * ApacheCXF支持发布多个server服务
   *
   * <p>
   * 多个服务的bean名称必须不同{@link Bean#name()}
   * 多个服务之间的address{@link JAXRSServerFactoryBean#setAddress(String)}必须不相同
   *
   * <p>
   * {@link JAXRSServerFactoryBean#setServiceBeans(List)} 与
   * {@link JAXRSServerFactoryBean#setResourceProviders(List)}作用一致
   *
   * @param bus
   *          the central place in CXF
   * @return CXF服务Bean
   */
  @Bean
  @Autowired
  public Server server(Bus bus) {
    JAXRSServerFactoryBean server = new JAXRSServerFactoryBean();
    server.setBus(bus);
    server.setAddress("/rest");
    /* 设置CXF服务处理切面 */
    server.setFeatures(Arrays.asList(new LoggingFeature()));
    /* 设置服务提供方 */
    server.setServiceBeans(Arrays.asList(new CXFServiceImpl()));
    // server.setResourceProviders(Arrays.asList(new SingletonResourceProvider(new
    // CXFServiceImpl())));
    server.setApplicationInfo(new ApplicationInfo(new CXFServiceApplication(server), bus));

    return server.create();
  }

  /**
   * CXFServlet servlet手动配置，覆盖系统内置配置
   *
   * @return CXFServlet servlet bean
   */
  @Bean
  public ServletRegistrationBean cxfServlet() {
    ServletRegistrationBean bean = new ServletRegistrationBean();
    bean.setEnabled(true);
    bean.setServlet(new CXFServlet());
    bean.setLoadOnStartup(1);
    bean.setUrlMappings(Arrays.asList("/service/*"));

    return bean;
  }

  public class CXFServiceApplication extends Application {

    private Set<Object> objects = new HashSet<>();
    private Set<Class<?>> classes = new HashSet<>();

    public CXFServiceApplication(JAXRSServerFactoryBean server) {
      this.objects = new HashSet<Object>(Arrays.asList(server.getFeatures(), server
        .getProviders()));
      this.classes = new HashSet<Class<?>>(Arrays.asList(LoggingFeature.class));
    }

    @Override
    public Set<Class<?>> getClasses() {
      return this.classes;
    }

    @Override
    public Set<Object> getSingletons() {
      return this.objects;
    }
  }

}
