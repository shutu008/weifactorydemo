package com.vastsum.mqtt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class MqttApplication {

	  public static void main(String[] args) {
	        new SpringApplicationBuilder(MqttApplication.class)
	                .web(false)
	                .run(args);
	    }
	
	
	 @Bean
	    public MessageChannel mqttInputChannel() {
	        return new DirectChannel();
	    }

	    @Bean
	    public MessageProducer inbound() {
	        MqttPahoMessageDrivenChannelAdapter adapter =
	                new MqttPahoMessageDrivenChannelAdapter("tcp://127.0.0.1:1883", "testClient",
	                                                 "topic1", "topic2");
	        adapter.setCompletionTimeout(5000);
	        adapter.setConverter(new DefaultPahoMessageConverter());
	        adapter.setQos(1);
	        adapter.setOutputChannel(mqttInputChannel());
	        return adapter;
	    }

	    @Bean
	    @ServiceActivator(inputChannel = "mqttInputChannel")
	    public MessageHandler handler() {
	        return new MessageHandler() {

	            @Override
	            public void handleMessage(Message<?> message) throws MessagingException {
	                System.out.println(message.getPayload());
	            }

	        };
	    }
}
