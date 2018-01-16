package com.vastsum.schedule.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

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

}
