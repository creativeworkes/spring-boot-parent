/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：SpringBootQuickStartApp.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworks.quickstart.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Quick Start
 *
 * @author Yeqinglan
 */
@SpringBootApplication
public class SpringBootQuickStartApp {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(SpringBootQuickStartApp.class);
    application.run(args);
  }

}
