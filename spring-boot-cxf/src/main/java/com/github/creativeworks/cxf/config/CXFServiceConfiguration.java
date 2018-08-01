/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：CXFServiceConfiguration.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworks.cxf.config;

import static com.github.creativeworks.cxf.common.JAXRSServerFactoryBeanUtils.*;

import java.util.List;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.creativeworks.cxf.service.impl.CXFServiceImpl;

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
    server.setFeatures(features());
    /* 设置服务提供方 */
    server.setServiceBeans(serviceBeans(new CXFServiceImpl()));
    // server.setResourceProviders(Arrays.asList(new SingletonResourceProvider(new
    // CXFServiceImpl())));
    server.setApplicationInfo(applicationInfo(server, bus));

    return server.create();
  }

}
