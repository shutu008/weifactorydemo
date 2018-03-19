package com.vastsum.listener;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;

/**
 * @author ssj
 * @create 2017-11-09 21:44
 */
public class ClientChannelFutureListener implements ChannelFutureListener {

    //客户端的监听器
    @Override
    public void operationComplete(ChannelFuture future) throws Exception {

        if (future.isSuccess()){
            System.out.println("数据写入成功！");
        }else {
            System.out.println("数据写入失败！");
            future.cause().printStackTrace();
        }
    }
}
