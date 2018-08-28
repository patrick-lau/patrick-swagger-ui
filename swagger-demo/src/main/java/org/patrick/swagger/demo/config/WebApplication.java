package org.patrick.swagger.demo.config;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.WebApplicationObjectSupport;

/**
 * 项目启动式触发的应用
 * 
 * @author patrick.lau@foxmail.com
 *
 */
@Configuration
public class WebApplication extends WebApplicationObjectSupport {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @Value("${app.version}")
  private String appVersion;

  @Value("${spring.profiles.active}")
  private String profile;

  @Override
  protected void initServletContext(ServletContext servletContext) {
    log.info("Applcation run initServletContext ……");

    super.initServletContext(servletContext);

    log.info("Application current version is :{}, run env：{}", appVersion, profile);
  }

}
