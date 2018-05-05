package com.vastsum.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.vastsum.entity.CommunicationLog;
import com.vastsum.entity.DataEntity;
import com.vastsum.entity.Image;
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
//        Long currentTime = System.currentTimeMillis();
//        //当机器连接上服务器时，返回给客户端的信息
//        ctx.writeAndFlush(Unpooled.copiedBuffer((currentTime+"").getBytes()));
//        LOGGER.info("设备连接上服务器，返回时间戳："+currentTime);
        
    }

    //连接断开时调用的方法
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
    	LOGGER.info("客户端已经与服务器断开："+NettyChannelMap.getSn((SocketChannel)ctx.channel()));
        //客户端断开，将断开信息写入到数据库
        CommunicationLog c = getCommunicationLog(ctx, OptionType.DISCONNECT.getValue(), NettyChannelMap.getSn((SocketChannel)ctx.channel()));
        communicationService.save(c);
        //channel失效，从Map中移除
        NettyChannelMap.remove((SocketChannel)ctx.channel());
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception{
       DataEntity dataEntity = (DataEntity)msg;
       long currentTime = System.currentTimeMillis();
       if (dataEntity != null) {
	      //先获取设备信息，连接上通道，然后再保存数据
    	   if ("0005".equals(dataEntity.getModuleType()) && "001".equals(dataEntity.getSensorType())) {
			String sn = new String(dataEntity.getData());
			 NettyChannelMap.add(sn, (SocketChannel)ctx.channel());
			 LOGGER.info("设备序列号已经与通道绑定："+sn+"通道为："+((SocketChannel)ctx.channel()).toString());
			   ctx.writeAndFlush(Unpooled.copiedBuffer((ResourceProperty.getProperty("response.success")+currentTime+"$").getBytes()));
			 //客户端连接
	           CommunicationLog c = getCommunicationLog(ctx, OptionType.CONNECT.getValue(), sn);
	           communicationService.save(c);
    	   }else {
    		   LOGGER.info("开始获取图片数据");
    		   String sn = NettyChannelMap.getSn(ctx.channel());
    		   if (StringUtils.isBlank(sn)) {
				throw new NullPointerException("设备序列号不存在！");
			}
               Random random = new Random();
               int i = random.nextInt(100);
               String fileName = sn+"_"+currentTime+"_"+i+".jpg";
               String path= ResourceProperty.getProperty("img.dir")+fileName;
               File file = new File(path);
               File fileParent = file.getParentFile();  
               if(!fileParent.exists()){  
                   fileParent.mkdirs();  
               }  
               file.createNewFile();
               
    	       try(FileOutputStream fos=new FileOutputStream(file,true)) {
    	           fos.write(dataEntity.getData());
    	           fos.flush();
    	           //将数据写到文件之后将文件地址写入数据库，只需要写入文件名即可，web读取时加上主机名
    	           LOGGER.info("图片写入成功！,存储路径为："+path+fileName);
    	            saveImage(sn, dataEntity.getSensorType(), fileName);
    	       } catch (IOException e) {
    	           ctx.writeAndFlush(Unpooled.copiedBuffer((ResourceProperty.getProperty("response.success")+currentTime+"$").getBytes()));
    	           ctx.close();
    	           e.printStackTrace();
    	       }
           
    	   }//end else
    	   
          
       }
    }
    
    

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception{
        cause.printStackTrace();
        ctx.close();
    }

    //保存图片信息
    private void saveImage(String sn, String sensorMark, String fileName){
      Image image = new Image();
      image.setSn(sn);
      image.setSensorMark(sensorMark);
      image.setOnePicName(fileName);
      image.setGmtCreate(new Date());
      imageServer.save(image);
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
