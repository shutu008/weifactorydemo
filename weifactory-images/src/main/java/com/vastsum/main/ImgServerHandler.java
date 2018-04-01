package com.vastsum.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.Date;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.vastsum.entity.CommunicationLog;
import com.vastsum.entity.Image;
import com.vastsum.entity.ImageData;
import com.vastsum.pojo.OptionType;
import com.vastsum.server.CommunicationService;
import com.vastsum.server.ImageServer;
import com.vastsum.utils.NettyChannelMap;
import com.vastsum.utils.ParseIpAddress;
import com.vastsum.utils.ResourceProperty;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.SocketChannel;

/**
 * @author ssj
 * @create 2017-09-24 17:02
 */
@Service("serverHandler")
@Scope("prototype")
public class ImgServerHandler extends ChannelInboundHandlerAdapter {

    @Autowired
    private ImageServer imageServer;
    @Autowired
    private CommunicationService communicationService;


    private static final Logger LOGGER = LoggerFactory.getLogger(ImgServerHandler.class);

    /**
     * 客户端连接上netty，发送给客户端当前时间标识
     * 连接上服务器但是还没有发送消息时
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception{
        //获取当前时间戳，返回给客户端标识现在开始
        LOGGER.info("我是服务器-已有客户端连接上服务器....");
        //获取连接的ip地址
        LOGGER.info("获取客户端ip:" + ctx.channel().remoteAddress());
        Long currentTime = System.currentTimeMillis();
        //当机器连接上服务器时，返回给客户端的信息
        ctx.writeAndFlush(Unpooled.copiedBuffer((currentTime+"").getBytes()));
        LOGGER.info("设备连接上服务器，返回时间戳："+currentTime);

    }

    //连接断开时调用的方法
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        //客户端断开，将断开信息写入到数据库
        CommunicationLog c = getCommunicationLog(ctx, OptionType.DISCONNECT.getValue(), NettyChannelMap.getSn((SocketChannel)ctx.channel()));
        communicationService.save(c);
        //channel失效，从Map中移除
        NettyChannelMap.remove((SocketChannel)ctx.channel());
    }



    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception{
       ImageData imageData = (ImageData)msg;
       if (imageData != null) {
	      
           long currentTime = System.currentTimeMillis();
           Random random = new Random();
           int i = random.nextInt(100);
           String fileName = imageData.getSn()+"_"+currentTime+"_"+i+".jpg";
           String path= ResourceProperty.getProperty("img.dir")+fileName;
           File file=new File(path);
           if(!file.exists()){
               file.createNewFile();
           }
           
	       try(FileOutputStream fos=new FileOutputStream(file,true)) {
	           fos.write(imageData.getImageByte());
	           fos.flush();
	           //设备序列号与SocketChannel绑定
	           NettyChannelMap.add(imageData.getSn(), (SocketChannel)ctx.channel());
	           //将数据写到文件之后将文件地址写入数据库，只需要写入文件名即可，web读取时加上主机名
	           LOGGER.info("图片写入成功！");
	           Integer j = saveImage(imageData.getSn(), imageData.getSensorType(), fileName);
	           //客户端连接
	           CommunicationLog c = getCommunicationLog(ctx, OptionType.CONNECT.getValue(), imageData.getSn());
	           communicationService.save(c);
	
	           ctx.writeAndFlush(Unpooled.copiedBuffer((""+j).getBytes()));
	           ctx.writeAndFlush(Unpooled.copiedBuffer("666666".getBytes()));
	           //执行成功主动断开连接
	           ctx.close();
	       } catch (IOException e) {
	           ctx.writeAndFlush(Unpooled.copiedBuffer(("0").getBytes()));
	           ctx.close();
	           e.printStackTrace();
	       }
       
       }
    }
    
    

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception{
        cause.printStackTrace();
        ctx.close();
    }

    //保存图片信息
    private Integer saveImage(String sn, String sensorMark, String path){
       /* Image image  = new Image();
        image.setSn(sn);
        image.setSensorMark(sensorMark);
        image.setPath(path);
        image.setGmtCreate(new Date());
        Integer i = imageServer.save(image);
        return i;*/
    	return 0;
    }
    
    

    //获取通信日志信息
    private CommunicationLog getCommunicationLog(ChannelHandlerContext ctx, int optionType, String sn){
        CommunicationLog c = new CommunicationLog();
        SocketAddress remoteAddress = ctx.channel().remoteAddress();
        SocketAddress localAddress = ctx.channel().localAddress();
        c.setSn(sn);
        c.setClientPort(ParseIpAddress.getPort(remoteAddress.toString()));
        c.setClientIpAddress(ParseIpAddress.getAddress(remoteAddress.toString()));
        c.setServerPort(ParseIpAddress.getPort(localAddress.toString()));
        c.setServerIpAddress(ParseIpAddress.getAddress(localAddress.toString()));
        c.setServerNetAddress(ResourceProperty.getProperty("netty.ip"));
        c.setOptiontype(optionType);
        return c;
    }
}
