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
public class Client3 {


    private static final Logger logger = LoggerFactory.getLogger(Client3.class);
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

        ChannelFuture cf1 = bootstrap.connect("121.196.217.247",8765).sync();
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer("ZWGC2017100800003$".getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800003#1#1#23.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800003#2#1#24.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800003#3#1#24.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800003#4#1#25.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800003#5#1#23.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800003#6#1#33.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800003#7#1#25.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800003#8#1#73.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(( "#ZWGC2017100800003#9#1#23.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800003#10#1#13.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800003#11#1#53.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800003#12#1#63.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800003#13#1#23.4#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800003#14#1#23.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800003#15#1#25.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800003#16#0#26.2#35067861351#$").getBytes()));
        cf1.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC2017100800003#17#0#27.2#35067861351#$").getBytes()));
        cf1.channel().closeFuture().sync();
        workerGroup.shutdownGracefully();
    }
}
