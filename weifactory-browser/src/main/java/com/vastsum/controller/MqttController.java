package com.vastsum.controller;

import javax.validation.Valid;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.mqtt.MqttServer;
import com.vastsum.mqtt.PublishUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/mqtt")
@Api(value = "/mqtt",tags={"mqtt通信"})
public class MqttController {


    @PostMapping(value="/publish")
    @ApiOperation(value="给传感器发送指令@20180428")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "clientId",value = "clientId(设备序列号)", required = true),
            @ApiImplicitParam(paramType = "query",name = "topic",value = "topic（传感器标识）",required = true),
            @ApiImplicitParam(paramType = "query",name = "message",value = "要发送的消息",required = true)
    })
    public ResponseEntity<ResultModel> add(
            @RequestParam(value = "clientId",required = true)String clientId,
            @RequestParam(value = "topic",required = true)String topic,
            @RequestParam(value = "message",required = true)String message
    ){
    	MqttMessage mqttMessage = new MqttMessage();
    	mqttMessage.setQos(1);
    	mqttMessage.setPayload(message.getBytes());
    	mqttMessage.setRetained(true);
    	try {
			MqttServer mqttServer = new MqttServer(topic, clientId, mqttMessage);
			PublishUtils.publish(mqttServer);
		} catch (MqttException e) {
			e.printStackTrace();
			return V.error("控制指令发送失败！");
			
		}
            return V.ok();
    }
    
}
