/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：CXFServiceImpl.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworkes.cxf.service.impl;

import org.springframework.stereotype.Service;

import com.github.creativeworkes.cxf.service.CXFService;

/**
 * CXF服务接口实现
 *
 * @author Yeqinglan
 */
@Service
public class CXFServiceImpl implements CXFService {

  @Override
  public String hello() {
    return "Hello CXF";
  }
}
