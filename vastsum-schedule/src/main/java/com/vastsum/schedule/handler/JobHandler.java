package com.vastsum.schedule.handler;

public interface JobHandler {
	
	void test();
	
	/**
	 * 当机器托管给服务器之后，自动下发每天的参数设置信息
	 */
	void selfParamSet();

}
