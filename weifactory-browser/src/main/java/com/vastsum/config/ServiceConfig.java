package com.vastsum.config;

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ServiceConfig {
	
//	//国际化异常消息校验
    @Bean  
    public Validator getValidator() throws Exception {  
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();  
        validator.setValidationMessageSource(getMessageSource());  
        return validator;  
    }
    
    private ResourceBundleMessageSource getMessageSource() throws Exception {  
        ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();  
        rbms.setDefaultEncoding("UTF-8");  
        rbms.setBasenames("ValidationMessages_browser", "ValidationMessages_schedule");  
        return rbms;  
    }
	
}
