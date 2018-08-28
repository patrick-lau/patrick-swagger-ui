package org.patrick.swagger.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * MVC配置器，可添加拦截器等操作
 * 
 * @author patrick.lau@foxmail.com
 *
 */
@Configuration
public class WebMvcConfig implements InitializingBean, WebMvcConfigurer {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    WebMvcConfigurer.super.addInterceptors(registry);
    log.debug("Can add some interceptors here");
  }

  @Override
  public void afterPropertiesSet() throws Exception {}


}

