/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：SpringBootLog4j2App.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworkes.log4j2.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot Log4j2
 *
 * @author Yeqinglan
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.github.creativeworkes.log4j2" })
public class SpringBootLog4j2App {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(SpringBootLog4j2App.class);
    application.run(args);
  }

}
