package com.vastsum.main;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ssj
 * @create 2017-09-24 17:22
 */
public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    public static void main(String[] args) throws Exception{
        logger.info("客户端启动！！！");
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();

        bootstrap.group(workerGroup).channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                socketChannel.pipeline().addLast(new ClientHandler());
            }
        });

        //121.196.217.247  #设备编号#传感器编号#类型#数据#   121.196.217.247
        // 0为整形，1为浮点，2为字符串
        ChannelFuture cf1 = bootstrap.connect("121.196.217.247",8765).sync();
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer("#ZWGC#00000017#0005#001#ZWGC2018032665194#1234567890123$".getBytes()));
        cf1.channel().closeFuture().sync();
        workerGroup.shutdownGracefully();
    }
}
