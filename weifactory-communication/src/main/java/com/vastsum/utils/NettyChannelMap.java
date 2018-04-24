package com.vastsum.utils;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.Channel;
import io.netty.channel.socket.SocketChannel;

/**
 * @author ssj
 * @create 2017-10-19 21:22
 */
public class NettyChannelMap implements Serializable {
    private static final long serialVersionUID = 5945996498161834927L;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(NettyChannelMap.class);
    private static final Map<String,Channel> map=new ConcurrentHashMap<String, Channel>();
    private static final Map<Channel, String> mapReverse=new ConcurrentHashMap<Channel, String>();
    
    private NettyChannelMap() {}
    
    private static NettyChannelMap nettyChannelMap = new NettyChannelMap();
    
    public static NettyChannelMap getInstance() {
    	return nettyChannelMap;
    }
    /**
     * 添加sn对应的channel
     * @param sn
     * @param socketChannel
     */
    public void add(String sn, Channel channel){
    	LOGGER.info("设备序列号为："+sn +";socketChanndel为："+ReflectionToStringBuilder.toString(channel));
    	
			map.put(sn,channel);
			mapReverse.put(channel, sn);
		LOGGER.info("已将设备序列号和通道添加到map中");
		
    }

    public Channel get(String sn){
    	LOGGER.info("通过设备序列号获取通道"+sn);
        return map.get(sn);
    }

    //根据value获取key
    public String getSn(Channel channel){
    	return mapReverse.get(channel);
    }

    public void remove(Channel channel){
    	LOGGER.debug("断开链接，移除channel："+channel);
    	synchronized (mapReverse) {
			synchronized (map) {
				String sn = mapReverse.get(channel);
				map.remove(sn);
				mapReverse.remove(channel);
			}
		}
    }

    public static Set<String> listSn(){
        return  map.keySet();
    }

}
