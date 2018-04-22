package com.vastsum.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.entity.CommunicationLog;
import com.vastsum.entity.CommunicationMessage;
import com.vastsum.pojo.NewConnection;
import com.vastsum.pojo.OptionType;
import com.vastsum.server.CommunicationService;
import com.vastsum.server.HistroyDataService;
import com.vastsum.utils.NettyChannelMap;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.SocketChannel;


public class NewServerHandler extends ChannelInboundHandlerAdapter {
	
    @Autowired
    private NewConnection newConnection;
    @Autowired
    private CommunicationService communicationService;
    @Autowired
    private HistroyDataService histroyDataService;

    //是否第一次执行标志
    boolean flag = true;

    private static final Logger LOGGER = LoggerFactory.getLogger(NewServerHandler.class);

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        //客户端断开，将断开信息写入到数据库
    	String sn = NettyChannelMap.getSn((SocketChannel)ctx.channel());
        CommunicationLog c = communicationService.createLog(ctx, OptionType.DISCONNECT.getValue(), sn);
        communicationService.save(c);
        //channel失效，从Map中移除
        NettyChannelMap.remove((SocketChannel)ctx.channel());
    }

    /**
     * 客户端连接上netty，发送给客端当前时间标识
     * 连接上服务器但是还没有发送消息时
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception{
        System.out.println("我是服务器-已有客户端连接上服务器....");
        LOGGER.info("获取客户端ip:" + ctx.channel().remoteAddress());
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg){
        String request = (String)msg;
        LOGGER.info("来自客户端的原始数据："+request);
        CommunicationMessage cm = new CommunicationMessage(request);
        if(!cm.parserOk()) {
			new Exception("解析错误").printStackTrace();;
        	return;
        }
        String sn = cm.getSn();
        if (flag){
        	// 第一次连接时
        	// 创建channel，存入map
            LOGGER.info("进行激活验证：返回时间戳为:"+String.valueOf(System.currentTimeMillis()));
            NettyChannelMap.add(sn, (SocketChannel)ctx.channel());
            // 存日志
            CommunicationLog c = communicationService.createLog(ctx, OptionType.CONNECT.getValue(), sn);
            communicationService.save(c);
            LOGGER.info("设备序列号已经与设备绑定,设备序列号："+sn+";Channel对象："+(SocketChannel)ctx.channel());
            // 数据库状态改变
            Integer status = newConnection.connStatus(cm);
            if (status == 0 || status== -1){
            	CommunicationMessage cmReplay = new CommunicationMessage(sn,5,5,"1");
                ctx.writeAndFlush(Unpooled.copiedBuffer(cmReplay.getMsg().getBytes()));
            }else if (status == 1){
                CommunicationMessage cmReplay = new CommunicationMessage(sn,5,1,"1");
                ctx.writeAndFlush(Unpooled.copiedBuffer(cmReplay.getMsg().getBytes()));
            }
            flag = false;
            return;
        }
        try {
            //判断如果客户端断开重连接只发送设备号
            if (request == null || "".equals(request)){
            	CommunicationMessage cmReplay = new CommunicationMessage(sn,5,5,"1");
            	ctx.writeAndFlush(Unpooled.copiedBuffer(cmReplay.getMsg().getBytes()));
                return;
            }
            if (cm.getModel() == 1) {
            	histroyDataService.save(cm);
            	ctx.writeAndFlush(Unpooled.copiedBuffer(cm.getMsg().getBytes()));
            	return;
            }
            if (cm.getModel() == 5){
                //说明发送的是设备序列号
            	String currentTime = String.valueOf(System.currentTimeMillis());
            	CommunicationMessage cmReplay = new CommunicationMessage(sn,5,4,currentTime);
                ctx.writeAndFlush(Unpooled.copiedBuffer(cmReplay.getMsg().getBytes()));
                LOGGER.info("不再进行激活验证，已经激活的设备再次连接服务器，返回时间戳为："+currentTime);
                return;
            }
        }catch (Exception ex){
            ex.getMessage();
            LOGGER.error("数据转化过程中出现异常！");
        }

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception{
        cause.printStackTrace();
        ctx.close();
    }

    
}
