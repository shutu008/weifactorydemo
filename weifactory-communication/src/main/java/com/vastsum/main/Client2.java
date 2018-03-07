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
public class Client2 {


    private static final Logger logger = LoggerFactory.getLogger(Client2.class);
    public static void main(String[] args) throws Exception{
        logger.info("客户端启动！！！");
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();

        bootstrap.group(workerGroup).channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                socketChannel.pipeline().addLast(new ClientHandler());
            }
        });

        //121.196.217.247  #设备编号#传感器编号#类型#数据#   121.196.217.247

        ChannelFuture cf1 = bootstrap.connect("121.196.217.247",8765).sync();
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer("ZWGC2017100800008$".getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#1#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#2#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#3#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#4#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#5#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#6#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#7#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#8#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#9#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#10#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#11#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#12#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#13#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#14#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#15#2#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#16#0#传感器出错#15067861553#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#17#0#传感器出错#15067861553#$").getBytes()));
        cf1.channel().closeFuture().sync();
        workerGroup.shutdownGracefully();


    }
}
