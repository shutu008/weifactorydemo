package com.vastsum.main;

import com.vastsum.decoder.ImageDecoder;
import com.vastsum.utils.ResourceProperty;
import com.vastsum.utils.SpringConfigUtil;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ssj
 * @create 2017-09-24 16:53
 */
public class ImgServer {
    private static final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-context.xml"});
    static {
        ctx.start();
    }
    public static void main(String[] args) throws Exception{

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //2.第二个线程组，用于实际的业务处理操作
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        //3.创建一个辅助类Bootstrap，就是对service进行一系列配置
        ServerBootstrap bootstrap = new ServerBootstrap();
        //将两个工作线程组加进来
        bootstrap.group(bossGroup,workerGroup)
        //自定NioServerSocketChannel这种类型的通信
        .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG,10240)
                .handler(new LoggingHandler(LogLevel.INFO))
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
//                    	//设置特殊分隔符
//                        ByteBuf buf = Unpooled.copiedBuffer("$".getBytes());
//                        //指定缓冲大小
//                        socketChannel.pipeline().addLast(new DelimiterBasedFrameDecoder(10240000,buf));
                    	socketChannel.pipeline().addLast("imageDecoder", new ImageDecoder());
                        socketChannel.pipeline().addLast(getServerHandler());
                    }

        });

        //获取配置文件中的端口号配置
        String s = ResourceProperty.getProperty("netty.file.port");
        Integer inetPort = Integer.parseInt(s);
        ChannelFuture future= bootstrap.bind(inetPort).sync();

        future.channel().closeFuture().sync();
        bossGroup.shutdownGracefully();
        workerGroup.shutdownGracefully();
    }

    private static ImgServerHandler getServerHandler(){
        ImgServerHandler serverHandler = (ImgServerHandler) SpringConfigUtil.getBean("serverHandler");
        return serverHandler;
    }
}
