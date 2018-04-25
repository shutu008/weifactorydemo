package com.vastsum.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;

import com.vastsum.listener.ClientChannelFutureListener;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author ssj
 * @create 2017-11-04 14:19
 */
public class ImgClient {
    public static void main(String[] args) throws Exception{
        ImgClient client=new ImgClient();
        client.connect();
    }
    public void connect(){
        EventLoopGroup group=new NioEventLoopGroup();
        try{
            Bootstrap b=new Bootstrap();
            b.group(group).channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY,true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new ImgClientHandler());
                        }
                    });
            ChannelFuture f=b.connect("localhost",8235).sync();
            // ChannelFuture f=b.connect("121.196.217.247",8235).sync();

            //要发送的数据
            InputStream in = new FileInputStream("/Users/shutu008/Pictures/b.jpg");
            //图片数据处理
            File file = new File("/Users/shutu008/Pictures/b.jpg");
            long len = file.length();
            DecimalFormat decimalFormat = new DecimalFormat("00000000");
            String dataLen = decimalFormat.format(len);
            Integer intDateLen = Integer.valueOf(dataLen);
            byte[] imageData = new byte[intDateLen];
            in.read(imageData);
            f.channel().writeAndFlush(Unpooled.copiedBuffer("#ZWGC#00000017#0005#001#ZWGC2017100800007#1234567890123$".getBytes()));
            f.channel().writeAndFlush(Unpooled.copiedBuffer(("#ZWGC#"+dataLen+"#0003#999#").getBytes()));
            
            f.channel().writeAndFlush(Unpooled.copiedBuffer(imageData)).addListener(new ClientChannelFutureListener());
            f.channel().writeAndFlush(Unpooled.copiedBuffer(("$").getBytes()));
            in.close();
           // f.channel().closeFuture().sync();
        }catch (Exception e){
        	e.printStackTrace();
        }finally {
            group.shutdownGracefully();
        }
    }
}
