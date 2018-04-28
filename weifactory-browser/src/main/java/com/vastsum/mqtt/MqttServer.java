package com.vastsum.mqtt;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  
/** 
 * Title:Server 这是发送消息的服务端
 * Description: 服务器向多个客户端推送主题，即不同客户端可向服务器订阅相同主题 
 * @author shensj
 */  
public class MqttServer {  

	private static final Logger LOGGER = LoggerFactory.getLogger(MqttServer.class);
	    //tcp://MQTT安装的服务器地址:MQTT定义的端口号  
	    public String host;  
	    //定义一个主题  
	    public String topic;  
	    //定义MQTT的ID，可以在MQTT服务配置中指定  
	    private  String clientId;  
	    private MqttClient mqttClient;  
	    private MqttTopic mqttTopic;  
	    private String userName;  //非必须
	    private String passWord;  //非必须

	    private MqttMessage mqttMessage;  
	    
	    
		public MqttServer(String host, String topic, String clientId, MqttClient mqttClient, MqttTopic mqttTopic,
				String userName, String passWord, MqttMessage mqttMessage) {
			super();
			this.host = host;
			this.topic = topic;
			this.clientId = clientId;
			this.mqttClient = mqttClient;
			this.mqttTopic = mqttTopic;
			this.userName = userName;
			this.passWord = passWord;
			this.mqttMessage = mqttMessage;
		}
		
		public MqttServer(String host, String topic, String clientId, MqttClient mqttClient, 
				MqttTopic mqttTopic, MqttMessage mqttMessage) {
			super();
			this.host = host;
			this.topic = topic;
			this.clientId = clientId;
			this.mqttClient = mqttClient;
			this.mqttTopic = mqttTopic;
			this.mqttMessage = mqttMessage;
		}
		
		public MqttServer(String topic, String clientId, MqttMessage mqttMessage) throws MqttException {
			this.host = "tcp://121.196.217.247:1883";
			this.topic = topic;
			this.clientId = clientId;
			this.mqttMessage = mqttMessage;
			// MemoryPersistence设置clientid的保存形式，默认为以内存保存  
	    	mqttClient = new MqttClient(host, clientId, new MemoryPersistence()); 
	        //可以取消订阅，但是对方不知道服务器已经取消topic订阅，可以发条消息，如果没有回复，说明没用了
	        connect();
		}

	    /** 
	     *  用来连接服务器 
	     */  
	    private void connect() {  
	        MqttConnectOptions options = new MqttConnectOptions();  
	        options.setCleanSession(false);  
//	        options.setUserName(userName);  
//	        options.setPassword(passWord.toCharArray());  
	        // 设置超时时间  
	        options.setConnectionTimeout(10);  
	        // 设置会话心跳时间  
	        options.setKeepAliveInterval(20);  
	        try {  
	        	mqttClient.setCallback(new PushCallback());  
	        	mqttClient.connect(options);  

	            mqttTopic = mqttClient.getTopic(topic);  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  

	    /** 
	     * 
	     * @param topic 
	     * @param message 
	     * @throws MqttPersistenceException 
	     * @throws MqttException 
	     */  
	    public void publish(MqttTopic topic , MqttMessage message) throws MqttPersistenceException,  
	            MqttException {  
	        MqttDeliveryToken token = topic.publish(message);  
	        token.waitForCompletion();  
	        LOGGER.info("message is published completely! "  
	                + token.isComplete());  
	    }

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getTopic() {
			return topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getClientId() {
			return clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public MqttClient getMqttClient() {
			return mqttClient;
		}

		public void setMqttClient(MqttClient mqttClient) {
			this.mqttClient = mqttClient;
		}

		public MqttTopic getMqttTopic() {
			return mqttTopic;
		}

		public void setMqttTopic(MqttTopic mqttTopic) {
			this.mqttTopic = mqttTopic;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassWord() {
			return passWord;
		}

		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}

		public MqttMessage getMqttMessage() {
			return mqttMessage;
		}

		public void setMqttMessage(MqttMessage mqttMessage) {
			this.mqttMessage = mqttMessage;
		}


		
	    
	}  
