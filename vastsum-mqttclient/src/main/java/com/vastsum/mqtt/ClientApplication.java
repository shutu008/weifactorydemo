package com.vastsum.mqtt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.integration.mqtt.outbound.MqttPahoMessageHandler;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class ClientApplication {
	
	  public static void main(String[] args) {
	        ConfigurableApplicationContext context =
	                new SpringApplicationBuilder(ClientApplication.class)
	                        .web(false)
	                        .run(args);
	        MyGateway gateway = context.getBean(MyGateway.class);
	        gateway.sendToMqtt("foo");
	    }
	
	 @Bean
	    public MqttPahoClientFactory mqttClientFactory() {
	        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
	        factory.setServerURIs("tcp://127.0.0.1:1883");
//	        factory.setUserName("username");
//	        factory.setPassword("password");
	        return factory;
	    }

	    @Bean
	    @ServiceActivator(inputChannel = "mqttOutboundChannel")
	    public MessageHandler mqttOutbound() {
	        MqttPahoMessageHandler messageHandler =
	                       new MqttPahoMessageHandler("testClient", mqttClientFactory());
	        messageHandler.setAsync(true);
	        messageHandler.setDefaultTopic("topic1");
	        return messageHandler;
	    }

	    @Bean
	    public MessageChannel mqttOutboundChannel() {
	        return new DirectChannel();
	    }

	    @MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
	    public interface MyGateway {

	        void sendToMqtt(String data);

	    }
	

}
