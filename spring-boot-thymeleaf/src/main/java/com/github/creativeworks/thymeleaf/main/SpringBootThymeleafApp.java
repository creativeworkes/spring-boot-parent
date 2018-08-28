/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：SpringBootThymeleafApp.java
 * 模块说明：
 * 修改历史：
 * 2018/8/27- Yeqinglan - 创建。
 */
package com.github.creativeworks.thymeleaf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Spring Boot Thymeleaf Application
 *
 * @author Yeqinglan
 */
@EnableWebMvc
@SpringBootApplication
@ComponentScan(basePackages = {"com.github.creativeworks.thymeleaf"})
public class SpringBootThymeleafApp {
  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(SpringBootThymeleafApp.class);
    application.run(args);
  }
}
