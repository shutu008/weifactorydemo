package com.vastsum.main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class Demo {
 
	
    private static final Logger logger = LoggerFactory.getLogger(Demo.class);
    public static void main(String[] args) throws Exception{
        logger.info("客户端启动！！！");
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(workerGroup).channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                socketChannel.pipeline().addLast(new ImgClientHandler());
            }
        });

        //121.196.217.247  #设备编号#传感器编号#类型#数据#   121.196.217.247
        // 0为整形，1为浮点，2为字符串
        ChannelFuture cf1 = bootstrap.connect("127.0.0.1",8235).sync();
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer("#ZWGC#00000017#0005#001#ZWGC2017100800007#1234567890123$".getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer("#ZWGC#00000001#0005#006#1#1234567890123$".getBytes()));
        cf1.channel().closeFuture().sync();
        workerGroup.shutdownGracefully();
    }
}
