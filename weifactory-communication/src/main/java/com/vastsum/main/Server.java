package com.vastsum.main;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ssj
 * @create 2017-09-24 16:53
 */
public class Server {

    private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);

    private static final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-rmi.xml","spring-context.xml"});
    static {
        ctx.start();
    }
    public static void main(String[] args) throws Exception {

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
                        socketChannel.pipeline().addLast(getServerHandler());
                    }


        });

        //获取配置文件中的端口号配置
        String s = ResourceProperty.getProperty("netty.port");
        Integer inetPort = Integer.parseInt(s);
        ChannelFuture future= bootstrap.bind(inetPort).sync();

        future.channel().closeFuture().sync();
        bossGroup.shutdownGracefully();
        workerGroup.shutdownGracefully();
    }

    private static ServerHandler getServerHandler(){
        ServerHandler serverHandler = (ServerHandler) SpringConfigUtil.getBean("serverHandler");
        LOGGER.info("获取的springbean:"+serverHandler.getClass().getName());
        return serverHandler;
    }
}
