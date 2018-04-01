package com.vastsum.comm;

import java.util.Map;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vastsum.server.DeviceService;

/**
 * 基础接口测试
* @author shensj
* @date 2018年3月31日 下午6:08:52
 */
public class DeviceServiceTest {
	
	private static Logger logger = LoggerFactory.getLogger(DeviceServiceTest.class);
	private static DeviceService deviceService;
	
	private ApplicationContext context;
	
	@BeforeClass
	public static void init(){
		 ApplicationContext 
		 context = new ClassPathXmlApplicationContext("spring-context.xml"); 
		 deviceService = (DeviceService)context.getBean("deviceService"); 
	}
	
	@Test
	public void testGetDeviceIdByBatchId(){
		Integer deviceId = deviceService.getDeviceIdByBatchId(39L);
		logger.info(deviceId+"");
	}
	
	@Test
	public void testGetSnByDeviceId(){
		String sn = deviceService.getSnByDeviceId(24);
		logger.info(sn);
	}
	
	@Test
	public void testGetLastByDeviceId(){
		Map<String, Object> map = deviceService.getLastByDeviceId(42);
		logger.info(ReflectionToStringBuilder.toString(map));
	}
	
	

}
