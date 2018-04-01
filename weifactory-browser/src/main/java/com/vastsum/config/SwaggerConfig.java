package com.vastsum.config;

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
@EnableSwagger2
public class SwaggerConfig {

	 @Bean
	 public Docket createRestApi() {
	 return new Docket(DocumentationType.SWAGGER_2)
			 .groupName("微植物工厂网络软件接口")
			 .apiInfo(apiInfo())
			 .select()
			 .apis(RequestHandlerSelectors.basePackage("com.vastsum"))
			 .paths(PathSelectors.any())
			 .build();
	 }

	 private ApiInfo apiInfo() {
	 return new ApiInfoBuilder()
	 .title("微植物工厂网络软件")
	 .description("微植物工厂网络软件")
	 .termsOfServiceUrl("http://api.weifactory.vastsum.net:8080/")
	 .contact(new Contact("shensj", "www.vastyun.com", "info@vastsum.com"))
	 .license("The Apache License, Version 2.0")
	 .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
	 .version("2.0")
	 .build();
	 }
}
