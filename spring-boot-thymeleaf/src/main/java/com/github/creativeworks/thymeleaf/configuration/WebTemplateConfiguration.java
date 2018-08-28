/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：WebTemplateConfiguration.java
 * 模块说明：
 * 修改历史：
 * 2018/8/27- Yeqinglan - 创建。
 */
package com.github.creativeworks.thymeleaf.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

/**
 * 页面模板实用配置
 *
 * @author Yeqinglan
 */
@Configuration
public class WebTemplateConfiguration {

  @Bean
  public ViewResolver viewResolverBean(SpringTemplateEngine engine) {
    ThymeleafViewResolver resolver = new ThymeleafViewResolver();
    resolver.setCharacterEncoding("UTF-8");
    resolver.setTemplateEngine(engine);
    return null;
  }

}
