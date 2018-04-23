package com.vastsum.utils;

import io.netty.channel.Channel;
import io.netty.channel.socket.SocketChannel;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ssj
 * @create 2017-10-19 21:22
 */
public class NettyChannelMap implements Serializable {
    private static final long serialVersionUID = 5945996498161834927L;
    private static Map<String,SocketChannel> map=new ConcurrentHashMap<String, SocketChannel>();
    private static Map<SocketChannel, String> mapReverse=new ConcurrentHashMap<SocketChannel, String>();
    
    /**
     * 添加sn对应的channel
     * @param sn
     * @param socketChannel
     */
    public static void add(String sn,SocketChannel socketChannel){
		synchronized (map) {
			synchronized(mapReverse) {
				map.put(sn,socketChannel);
				mapReverse.put(socketChannel, sn);
			}
		}
		System.out.println(sn+"含有："+map.containsValue(sn));
    }

    public static Channel get(String sn){
    	System.out.println("序列号为："+sn);
        return map.get(sn);
    }

    //根据value获取key
    public static String getSn(Channel channel){
    	return mapReverse.get(channel);
    }

    public static void remove(SocketChannel socketChannel){
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
