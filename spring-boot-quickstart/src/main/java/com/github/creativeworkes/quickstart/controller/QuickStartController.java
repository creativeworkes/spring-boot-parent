/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：QuickStartController.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworkes.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @author Yeqinglan
 */
@RestController
@RequestMapping("qucikstart")
public class QuickStartController {

  @RequestMapping("hello")
  public String hello() {
    return "Hello you!";
  }

}
