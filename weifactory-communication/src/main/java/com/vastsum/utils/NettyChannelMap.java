package com.vastsum.utils;

import io.netty.channel.Channel;
import io.netty.channel.socket.SocketChannel;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ssj
 * @create 2017-10-19 21:22
 */
public class NettyChannelMap implements Serializable {
    private static final long serialVersionUID = 5945996498161834927L;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(NettyChannelMap.class);
    private static final Map<String,SocketChannel> map=new ConcurrentHashMap<String, SocketChannel>();
    private static final Map<SocketChannel, String> mapReverse=new ConcurrentHashMap<SocketChannel, String>();
    
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
    public void add(String sn,SocketChannel socketChannel){
    	LOGGER.info("设备序列号为："+sn +";socketChanndel为："+ReflectionToStringBuilder.toString(socketChannel));
    	
			map.put(sn,socketChannel);
			mapReverse.put(socketChannel, sn);
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

    public void remove(SocketChannel socketChannel){
    	synchronized (mapReverse) {
			synchronized (map) {
				String sn = mapReverse.get(socketChannel);
				map.remove(sn);
				mapReverse.remove(socketChannel);
			}
		}
    }

    public static Set<String> listSn(){
        return  map.keySet();
    }

}
