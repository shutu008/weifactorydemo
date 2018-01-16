package com.vastsum.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import com.vastsum.service.ControlService;

@Configuration
public class RmiClientConfig {
	
	//注入一个rmibean，学习学习，如果没有注入会报错，找不到ControlService
	@Bean
	public RmiProxyFactoryBean getControlService(){
		RmiProxyFactoryBean controlService = new RmiProxyFactoryBean();  
		controlService.setServiceUrl("rmi://121.196.217.247:8100/ControlService");  
		controlService.setServiceInterface(ControlService.class);  
        return controlService; 
	}
	

}
