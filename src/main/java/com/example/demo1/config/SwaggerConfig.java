package com.example.demo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // 开启
public class SwaggerConfig {

    @Bean
    public Docket getDocket() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())//指定接口说明书
                .select()//指定监控哪些接口
                .apis(
                        RequestHandlerSelectors.basePackage("com.example.demo1.controller")
                ).paths(PathSelectors.any())//指定文档的扫描范围
                .build();

        return docket;
    }

    public ApiInfo getApiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("用户管理系统接口文档")
                .description("描述信息")
                .version("v1.1")
                .contact(
                        new Contact("zhangsan","url","email")
                )
                .build();

        return apiInfo;
    }
}
