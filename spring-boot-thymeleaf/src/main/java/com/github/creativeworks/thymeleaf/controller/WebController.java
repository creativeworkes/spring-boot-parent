/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：WebController.java
 * 模块说明：
 * 修改历史：
 * 2018/8/28- Yeqinglan - 创建。
 */
package com.github.creativeworks.thymeleaf.controller;

import static com.github.creativeworks.thymeleaf.common.TemplateNameConstant.INDEX_TEMPLATE_NAME;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 页面转发控制器
 *
 * @author Yeqinglan
 */
@Controller
public class WebController {

  @GetMapping("/")
  public String home() {
    return INDEX_TEMPLATE_NAME;
  }
}
