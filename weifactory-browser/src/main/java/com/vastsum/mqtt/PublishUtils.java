package com.vastsum.mqtt;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PublishUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(PublishUtils.class);
	
	private PublishUtils() {};
	
	public static void publish(MqttServer mqttServer) {
		MqttMessage mqttMessage = mqttServer.getMqttMessage();
		try {
			mqttServer.publish(mqttServer.getMqttTopic() , mqttMessage);
		} catch (MqttException e) {
			LOGGER.error("publish异常,clientId:"+mqttServer.getClientId()+";topic:"+mqttServer.getTopic());
			e.printStackTrace();
		} 
	}

}
