/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：CXFService.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworks.cxf.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * CXFService服务接口
 *
 * @author Yeqinglan
 */
@Path("cxf")
public interface CXFService {

  @GET
  @Path("echo")
  String hello();

}
