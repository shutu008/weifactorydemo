package com.vastsum.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	
	private static Logger logger = LoggerFactory.getLogger(ImgClient.class);
	
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
            //ChannelFuture f=b.connect("localhost",8235).sync();
             ChannelFuture f=b.connect("121.196.217.247",8235).sync();

            //要发送的数据
            InputStream in = new FileInputStream("/Users/shutu008/Pictures/b.jpg");
            //图片数据处理
            File file = new File("/Users/shutu008/Pictures/b.jpg");
            long len = file.length();
            DecimalFormat decimalFormat = new DecimalFormat("00000000");
            String dataLen = decimalFormat.format(len);
            logger.info("数据长度："+dataLen);
            Integer intDateLen = Integer.valueOf(dataLen);
            byte[] imageData = new byte[intDateLen];
            in.read(imageData);
            f.channel().writeAndFlush(Unpooled.copiedBuffer("#ZWGC#00000017#0005#001#ZWGC2018032645641#1234567890123$".getBytes()));
            byte[] a = ("#ZWGC#"+dataLen+"#0003#999#").getBytes();
            byte[] a1 = "1234567890123#".getBytes();
            byte[] b1 = "$".getBytes();
            byte[] c = new byte[a.length+imageData.length+b1.length+a1.length];
            for (int i = 0; i < a.length; i++) {
				c[i] = a[i];
			}
            for(int i = 0; i< imageData.length ;i++) {
            	c[a.length+i] = imageData[i];
            }
            for(int i = 0; i< a1.length ;i++) {
            	c[a.length+imageData.length+i] = a1[i];
            }
            for (int i = 0; i < b1.length; i++) {
				c[a.length+imageData.length+a1.length+i] =b1[i];
			}
            f.channel().writeAndFlush(Unpooled.copiedBuffer(c));
            f.channel().writeAndFlush(Unpooled.copiedBuffer(c));
            in.close();
            f.channel().closeFuture().sync();
        }catch (Exception e){
        	e.printStackTrace();
        }finally {
            group.shutdownGracefully();
        }
    }
}
