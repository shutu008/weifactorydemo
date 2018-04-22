package com.vastsum.schedule.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;
import javax.validation.Validator;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ScheduleConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public SchedulerFactoryBean schedulerFactoryBean(){
		
		SchedulerFactoryBean scheduleFactory = new SchedulerFactoryBean();
		try {
			scheduleFactory.setQuartzProperties(quartzProperties());
			scheduleFactory.setDataSource(dataSource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scheduleFactory;
		
	}
	
	/*
     * quartz初始化监听器
     */
//    @Bean
//    public QuartzInitializerListener executorListener() {
//       return new QuartzInitializerListener();
//    }
	
	 @Bean  
    public Properties quartzProperties() throws IOException {  
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();  
        propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));  
        propertiesFactoryBean.afterPropertiesSet();  
        return propertiesFactoryBean.getObject();  
    } 
	 
	//创建schedule    
    @Bean(name = "scheduler")  
    public Scheduler scheduler() {  
      return schedulerFactoryBean().getScheduler();  
    } 
    
//  //国际化异常消息
//    @Bean  
//    public Validator getValidator() throws Exception {  
//        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();  
//        validator.setValidationMessageSource(getMessageSource());  
//        return validator;  
//    }
//    
//    public ResourceBundleMessageSource getMessageSource() throws Exception {  
//        ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();  
//        rbms.setDefaultEncoding("UTF-8");  
//        rbms.setBasenames("ErrorMessages", "ValidationMessages_schedule",  
//                "ValidationMessages");  
//        return rbms;  
//    }  

}
