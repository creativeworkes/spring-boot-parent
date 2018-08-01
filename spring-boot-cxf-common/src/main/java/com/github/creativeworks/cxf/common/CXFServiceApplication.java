/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：CXFServiceApplication.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworks.cxf.common;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * CXFServiceApplication应用信息
 *
 * @author Yeqinglan
 */
public class CXFServiceApplication extends Application {

  private Set<Object> objects = new HashSet<>();
  private Set<Class<?>> classes = new HashSet<>();

  public CXFServiceApplication(List<Object> objects, List<Class<?>> classes) {
    this.objects = new HashSet<Object>(objects);
    this.classes = new HashSet<Class<?>>(classes);
  }

  @Override
  public Set<Class<?>> getClasses() {
    return this.classes;
  }

  @Override
  public Set<Object> getSingletons() {
    return this.objects;
  }
}