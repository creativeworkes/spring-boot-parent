/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：JAXRSServerFactoryBeanUtils.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworks.cxf.common;

import java.util.Arrays;
import java.util.List;

import org.apache.cxf.Bus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.model.ApplicationInfo;

/**
 * CXF公共切面服务
 *
 * @author Yeqinglan
 */
public class JAXRSServerFactoryBeanUtils {

  public static List serviceBeans(Object... obj) {
    return Arrays.asList(obj);
  }

  public static List<Feature> features() {
    return Arrays.asList(new LoggingFeature());
  }

  public static ApplicationInfo applicationInfo(JAXRSServerFactoryBean server, Bus bus) {
    return new ApplicationInfo(new CXFServiceApplication(Arrays.asList(server
      .getFeatures(), server.getProviders()), Arrays.asList(LoggingFeature.class)), bus);
  }

}
