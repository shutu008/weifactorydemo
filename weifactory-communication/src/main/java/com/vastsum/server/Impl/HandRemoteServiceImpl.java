package com.vastsum.server.Impl;

import java.util.ArrayList;
import java.util.HashMap;


import com.vastsum.core.service.HandRemoteService;
import com.vastsum.entity.CommunicationMessage;
import com.vastsum.utils.NettyChannelMap;
import com.vastsum.utils.ParserMessageUtils;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

public class HandRemoteServiceImpl implements HandRemoteService{

	@Override
	public void sendOrder(HashMap<String, Object> hashMap) {
		if(hashMap.isEmpty()) return;
		ArrayList<CommunicationMessage> listCM =  ParserMessageUtils.encodeHashMap(hashMap);
		String sn = (String)hashMap.get("sn");
		Channel channel = NettyChannelMap.get(sn);
		for(CommunicationMessage cm : listCM) {
			channel.writeAndFlush(Unpooled.copiedBuffer(cm.getMsg().getBytes()));
		}
	}
}
