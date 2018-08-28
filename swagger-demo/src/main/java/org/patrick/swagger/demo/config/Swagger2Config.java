package org.patrick.swagger.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.DocExpansion;
import springfox.documentation.swagger.web.ModelRendering;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.TagsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger 配置文件
 * 
 * @author patrick.lau@foxmail.com
 *
 */
@Configuration
@EnableSwagger2
@Profile(value = {"dev"})
public class Swagger2Config {

  @Bean
  public Docket swaggerApi() {
    return initializeDocket();
  }

  @Bean
  public UiConfiguration uiConfig() {
    return UiConfigurationBuilder.builder().deepLinking(true).displayOperationId(false)
        .defaultModelsExpandDepth(1).defaultModelExpandDepth(1)
        .defaultModelRendering(ModelRendering.EXAMPLE).displayRequestDuration(false)
        .docExpansion(DocExpansion.NONE).filter(false).maxDisplayedTags(null)
        .operationsSorter(OperationsSorter.ALPHA).showExtensions(false).tagsSorter(TagsSorter.ALPHA)
        .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS).validatorUrl(null)
        .build();
  }

  /**
   * 初始化Docket，其他项目记得修改basePackage
   * 
   * @return
   */
  protected Docket initializeDocket() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
        .apis(RequestHandlerSelectors.basePackage("org.patrick.swagger.demo"))
        .paths(PathSelectors.any()).build();
  }

  /**
   * Api首页的基础信息
   * 
   * @return
   */
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("Swagger Demo")
        .description("Spring Boot 2.X + Swagger 2.9.X ")
        .termsOfServiceUrl("https://github.com/patrick-lau").version("1.0").build();
  }
}
