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
        ChannelFuture cf1 = bootstrap.connect("localhost",8765).sync();
            cf1.channel().writeAndFlush(Unpooled.copiedBuffer("ZWGC2017100800008$".getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800008#1#1#1#2506786123137#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800008#2#1#0#2506786123137#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800008#3#1#0#2506786123137#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800008#4#1#0#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800008#5#1#1000#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800008#6#1#12#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800008#7#1#0#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800008#8#1#22222#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800008#9#1#0#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#10#1#0#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#11#1#11#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#12#1#2#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#13#1#1#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#14#1#111111#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#15#1#0#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#16#1#0#2506786123147#$").getBytes()));
                cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800008#17#1#0#2506786123147#$").getBytes()));


        cf1.channel().closeFuture().sync();
        workerGroup.shutdownGracefully();

    }
}
