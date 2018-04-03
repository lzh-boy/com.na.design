package com.na.design;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Arrays;
@ServletComponentScan
@MapperScan("com.na.design.dao")
@EnableTransactionManagement
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    private transient static final Log log = LogFactory.getLog(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("\nヾ(◍°∇°◍)ﾉﾞ    娜姐毕设启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
                "      _____                      \n" +
                "   ||//    \\\\      //\\\\          \n" +
                "   ||       ||      //__\\\\     \n" +
                "   ||       ||     //____\\\\     \n" +
                "   ||       ||    //      \\\\     \n" +
                "   ||       ||   //        \\\\      \n");
    }
    /**
     *<p>@Description 使springboot在tomcat上运行，增加了继承SpringBootServletInitializer</p>
     *<p>@createDate 15:15 2018/2/1</p>
     *@param builder 构建器
     *@return SpringApplicationBuilder
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            log.info("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
