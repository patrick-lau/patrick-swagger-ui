# 简介
Java版本的Swagger UI，在原有UI基础上进行微调UI，并不损失原有UI特性。

### patrick-swagger-ui
- 核心UI界面，无Java代码
- 可以Jar方式提供html界面

### swagger-demo
- 多种API接口配置例子直接使用
- 基于Spring Boot 2.0的无配置文件实现
- 支持线上环境关闭Swagger，只在开发环境启用

# 前置知识点
- [Spring Boot 2.X](https://spring.io/projects/spring-boot)
- [Swagger](https://swagger.io)
- [Springfox](https://github.com/springfox)
- [Maven](http://maven.apache.org)

# 使用指南
- checkout patrick-swagger-ui, 并使用mvn package 生成jar
- 将patrick-swageer-ui.jar上传到Maven私服或本地Maven缓存目录
- checkout swaager-demo，并等待编译通过
- 在Application.java右击运行项目
- 通过 http://localhost:port/project-name/swagger-ui.html 进行访问






