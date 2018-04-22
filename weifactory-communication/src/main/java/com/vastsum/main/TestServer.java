package com.vastsum.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vastsum.utils.ResourceProperty;
import com.vastsum.utils.SpringConfigUtil;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class TestServer {
	public static void main(String[] args) throws IOException, InterruptedException {
		// 装载Spring，注册Dubbo服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath*:/spring-context.xml"});
        context.start();
        // 启动netty服务器
        //1.第一个线程组，用于接收Client端连接的
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //2.第二个线程组，用于实际的业务处理操作
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        //3.创建一个辅助类Bootstrap，就是对service进行一系列配置
        ServerBootstrap bootstrap = new ServerBootstrap();
        //将两个工作线程组加进来
        bootstrap.group(bossGroup,workerGroup)
        //自定NioServerSocketChannel这种类型的通信
        .channel(NioServerSocketChannel.class)
        .handler(new LoggingHandler(LogLevel.INFO))
        .childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                //设置特殊分隔符
                ByteBuf buf = Unpooled.copiedBuffer("$".getBytes());
                //指定缓冲大小
                socketChannel.pipeline().addLast(new DelimiterBasedFrameDecoder(1024,buf));
                //设置字符串形式的解码
                socketChannel.pipeline().addLast(new StringDecoder());
                socketChannel.pipeline().addLast((NewServerHandler)SpringConfigUtil.getBean("serverHandler"));
            }
        });

        //获取配置文件中的端口号配置
        String s = ResourceProperty.getProperty("netty.port");
        Integer inetPort = Integer.parseInt(s);
        ChannelFuture future= bootstrap.bind(inetPort).sync();

        future.channel().closeFuture().sync();
        bossGroup.shutdownGracefully();
        workerGroup.shutdownGracefully();
        // press any key to exit
        System.in.read();
	}
}
