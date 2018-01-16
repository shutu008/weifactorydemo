package com.vastsum.schedule.handler;

import org.springframework.stereotype.Service;

@Service(value ="defaultJobHandler")
public class DefaultJobHandler implements JobHandler {

	@Override
	public void test() {
		System.err.println("========定时任务测试方法============");
	}

}
