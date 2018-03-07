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

    public static void add(String sn,SocketChannel socketChannel){
        map.put(sn,socketChannel);
    }

    public static Channel get(String sn){
        return map.get(sn);
    }

    //根据value获取key
    public static String getSn(Channel channel){
        Set<Map.Entry<String, SocketChannel>> entries = map.entrySet();
        String sn = "";
       for (Map.Entry<String, SocketChannel> e: entries){
           if (e.getValue().equals(channel)){
               sn = e.getKey();
               break;
           }
       }
       return sn;
    }

    public static void remove(SocketChannel socketChannel){
        for (Map.Entry entry:map.entrySet()){
            if (entry.getValue()==socketChannel){
                map.remove(entry.getKey());
            }
        }
    }

    public static Set<String> listSn(){
        return  map.keySet();
    }

}
