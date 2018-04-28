package com.vastsum.mqtt.service;

import com.vastsum.mqtt.ClientApplication.MyGateway;

public class DefaultSend implements MyGateway{

	@Override
	public void sendToMqtt(String data) {
		System.out.println("客户端发送数据："+data);
	}

}
