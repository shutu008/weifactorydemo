package com.vastsum;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * @author ssj
 * @create 2017-11-05 13:29
 */
public class NettyNioServer {
    public void server(int port) throws Exception{

        final ByteBuf buf = Unpooled.unreleasableBuffer(Unpooled.copiedBuffer("HI!\r\n".getBytes()));

        //事件循环组
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            //用来引导服务器配置
            ServerBootstrap b = new ServerBootstrap();
            //使用nio异步模式
            b.group(group).channel(NioServerSocketChannel.class).localAddress(new InetSocketAddress(port))
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new ChannelInboundHandlerAdapter(){
                                @Override
                                public void channelActive(ChannelHandlerContext ctx) throws Exception{
                                    //连接后，写消息到客户端，写完后便关闭连接
                                    ctx.writeAndFlush(buf.duplicate()).addListener(ChannelFutureListener.CLOSE);
                                }
                            });
                        }
                    });
            //绑定服务器接受连接
            ChannelFuture f = b.bind().sync();
            f.channel().closeFuture().sync();
        } catch (Exception ex){
            group.shutdownGracefully();
        }
    }
}
