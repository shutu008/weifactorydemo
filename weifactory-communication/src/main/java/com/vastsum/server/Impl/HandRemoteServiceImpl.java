package com.vastsum.server.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vastsum.core.service.HandRemoteService;
import com.vastsum.entity.CommunicationMessage;
import com.vastsum.utils.NettyChannelMap;
import com.vastsum.utils.ParserMessageUtils;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

public class HandRemoteServiceImpl implements HandRemoteService{
	
	private static Logger logger = LoggerFactory.getLogger(HandRemoteServiceImpl.class);

	@Override
	public void sendOrder(HashMap<String, Object> hashMap) {
		if(hashMap == null || hashMap.isEmpty()) return;
		logger.info("当前要下发数据给机器："+hashMap.get("sn"));
		ArrayList<CommunicationMessage> listCM =  ParserMessageUtils.encodeHashMap(hashMap);
		logger.info("下发数据时，当前存在的channel的列表："+NettyChannelMap.listSn().toString());
		String sn = (String)(hashMap.get("sn"));
		NettyChannelMap nettyChannelMap = NettyChannelMap.getInstance();
		Channel channel = nettyChannelMap.get(sn);
		logger.info("一共有"+listCM.size()+"条指令");
		for(CommunicationMessage cm : listCM) {
			logger.info("下达的控制指令："+cm.getMsg());
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				logger.error("发送给机器数据时候sleep失败");
				e.printStackTrace();
			}
			channel.writeAndFlush(Unpooled.copiedBuffer(cm.getMsg().getBytes()));
		}
	}
	
	public ArrayList<String> getOnlineDeviceList(){
		Set<String> set = NettyChannelMap.listSn();
		return new ArrayList<String>(set);
	}
}
