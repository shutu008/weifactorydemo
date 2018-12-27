package com.vastsum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

import com.vastsum.properties.WeifactoryProperties;
import com.vastsum.social.properties.SocialProperties;

/**
 * @author ssj
 * @create 2017-12-18 22:23
 */
@SpringBootApplication
@MapperScan({"com.vastsum.dao","com.vastsum.schedule.dao"})
@EnableConfigurationProperties({WeifactoryProperties.class,
	SocialProperties.class}) 
@ImportResource(locations= {"classpath:spring-beans.xml"})
public class WeifactoryApplication {

    public static void main(String[] args){
        SpringApplication.run(WeifactoryApplication.class, args);
    }
}
