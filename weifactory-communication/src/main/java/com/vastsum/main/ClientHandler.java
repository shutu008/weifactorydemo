package com.vastsum.main;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * @author ssj
 * @create 2017-09-24 17:16
 */
public class ClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void  channelActive(ChannelHandlerContext ctx) throws Exception{
        System.out.println("我是客户端-客户端连接上服务器......");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception{

        try {
            ByteBuf buf = (ByteBuf)msg;
            byte[] data = new byte[buf.readableBytes()];
            buf.readBytes(data);

            String request = new String(data,"utf-8");
            System.out.println("Client:"+request);
        }finally {
            ReferenceCountUtil.release(msg);
        }

    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,Throwable cause) throws Exception{
        cause.printStackTrace();
        ctx.close();
    }
}








