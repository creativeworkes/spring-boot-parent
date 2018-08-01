/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：CXFServletBean.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworks.cxf.common;

import java.util.Arrays;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * CXFServletBean
 *
 * @author Yeqinglan
 */
@Configuration
public class CXFServletBean {

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
}
