/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：SpringBootDockerApp.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworks.docker.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot Docker Integration App
 *
 * @author Yeqinglan
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.github.creativeworks.docker", "com.github.creativeworks.cxf" })
public class SpringBootDockerApp {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(SpringBootDockerApp.class);
    application.run(args);
  }

}
