package com.vastsum.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations= {"classpath:spring-beans.xml"})
public class ServiceConfig {
	
}
