#springboot基本框架  
   官方文档：
   https://docs.spring.io/spring-boot/docs/2.0.0.RELEASE/reference/htmlsingle/#boot-features-spring-mvc-static-content  
  
**System Requirements**  

Spring Boot 2.0.0.RELEASE requires Java 8 or 9 and Spring Framework 5.0.4.RELEASE or above. Explicit build support is provided for Maven 3.2+ and Gradle 4.
    
<hr>
  
  Spring Boot supports the following embedded servlet containers:  
   
|Name	|Servlet | Version |
|--------   | -----:  | :----: |
|Tomcat  |8.5 | 3.1 |
|Jetty |9.4| 3.1 |
|Undertow |1.4| 3.1 |
      
Static Content
--------------------- 
By default, Spring Boot serves static content from a directory called /static (or /public or /resources or /META-INF/resources) in the classpath or from the root of the ServletContext. It uses the ResourceHttpRequestHandler from Spring MVC so that you can modify that behavior by adding your own WebMvcConfigurer and overriding the addResourceHandlers method.
  
 配置文件：
 -------------
 application.yml  关于yml的用法请参照官方文档
 
 日志文件：
 ---------
 logback-spring.xml 请参照官方文档配置
 
 **根据springboot设计思想，约定大于配置，大部分内容按照官方约定，并未独立配置，独立配置，请参照官方文档**