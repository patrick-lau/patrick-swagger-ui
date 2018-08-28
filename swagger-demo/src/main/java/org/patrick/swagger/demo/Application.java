package org.patrick.swagger.demo;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 本地启动类
 * 
 * @author patrick.lau@foxmail.com
 *
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

  private static Logger log = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {

    log.info("Start the application ……");

    ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    String[] activeProfiles = context.getEnvironment().getActiveProfiles();

    log.info("Spring Boot use the profile is :{}", Arrays.toString(activeProfiles));
    log.info("Application current version is :{}",
        context.getEnvironment().getProperty("app.version"));

    log.info("Congratulations!!!!!! Application startup completed.");


  }


  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return super.configure(builder);
  }



}
