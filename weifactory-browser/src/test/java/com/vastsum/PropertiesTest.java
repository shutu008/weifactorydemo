package com.vastsum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vastsum.social.properties.SocialProperties;

@SpringBootTest(classes = WeifactoryApplication.class)
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
public class PropertiesTest {

	@Autowired
	private SocialProperties socialProperties;
	
	@Test
	public void test1(){
		String appId = socialProperties.getWeixin().getAppId();
		System.out.println(appId);
	}
}
