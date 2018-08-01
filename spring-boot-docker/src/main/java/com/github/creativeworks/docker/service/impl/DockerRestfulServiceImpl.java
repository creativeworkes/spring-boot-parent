/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * <p>
 * 项目名：spring-boot-parent
 * 文件名：DockerRestfulServiceImpl.java
 * 模块说明：
 * 修改历史：
 * 2018-08-01 - Yeqinglan - 创建。
 */
package com.github.creativeworks.docker.service.impl;

import com.github.creativeworks.docker.service.DockerRestfulService;
import org.springframework.stereotype.Service;

/**
 * DockerRestful服务实现
 *
 * @author Yeqinglan
 */
@Service
public class DockerRestfulServiceImpl implements DockerRestfulService {

  @Override
  public String echo() {
    return "Hello Docker!";
  }

}
