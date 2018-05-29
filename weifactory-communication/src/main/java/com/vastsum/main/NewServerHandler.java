package com.vastsum.main;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.vastsum.entity.CommunicationLog;
import com.vastsum.entity.CommunicationMessage;
import com.vastsum.entity.HistoryData;
import com.vastsum.pojo.NewConnection;
import com.vastsum.pojo.OptionType;
import com.vastsum.server.CommunicationService;
import com.vastsum.server.HistroyDataService;
import com.vastsum.service.BizExceptionService;
import com.vastsum.service.ParamSetService;
import com.vastsum.utils.BizUtils;
import com.vastsum.utils.NettyChannelMap;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;


public class NewServerHandler extends ChannelInboundHandlerAdapter {
	
    @Autowired
    private NewConnection newConnection;
    @Autowired
    private CommunicationService communicationService;
    @Autowired
    private HistroyDataService histroyDataService;
    @Autowired
    private BizExceptionService bizExceptionService;
    @Autowired
    private ParamSetService paramSetService;

    //是否第一次执行标志
    boolean flag = true;

    private static final Logger LOGGER = LoggerFactory.getLogger(NewServerHandler.class);

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        //客户端断开，将断开信息写入到数据库
    	NettyChannelMap nettyChannelMap = NettyChannelMap.getInstance();
    	String sn = nettyChannelMap.getSn(ctx.channel());
    	LOGGER.info("设备序列号为{}设备断开链接",sn);
        CommunicationLog c = communicationService.createLog(ctx, OptionType.DISCONNECT.getValue(), sn);
        communicationService.save(c);
        //channel失效，从Map中移除
        nettyChannelMap.remove(ctx.channel());
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
			new Exception(cm.getParserResult()).printStackTrace();
        	return;
        }
        
        if (flag){
            String sn = cm.getSn();
            LOGGER.info("设备序列号是："+sn);
        	// 第一次连接时
        	// 创建channel，存入map
            LOGGER.info("进行激活验证：返回时间戳为:"+String.valueOf(System.currentTimeMillis()));
            NettyChannelMap nettyChannelMap = NettyChannelMap.getInstance();
            nettyChannelMap.add(sn, ctx.channel());
            LOGGER.info(NettyChannelMap.listSn().toString());
            LOGGER.info(sn+"含有："+nettyChannelMap.get(sn));
            // 存日志
            CommunicationLog c = communicationService.createLog(ctx, OptionType.CONNECT.getValue(), sn);
            communicationService.save(c);
            LOGGER.info("设备序列号已经与设备绑定,设备序列号："+sn+";Channel对象："+ctx.channel());
            // 数据库状态改变
            Integer status = newConnection.connStatus(cm);
            if (status == 0 || status== -1){
            	CommunicationMessage cmReplay = new CommunicationMessage(sn,5,5,"1");
            	LOGGER.info("数据库状态改变失败，即将向客户端发送消息："+cmReplay.getMsg());
                ctx.writeAndFlush(Unpooled.copiedBuffer(cmReplay.getMsg().getBytes()));
            }else if (status == 1){
                CommunicationMessage cmReplay = new CommunicationMessage(sn,5,2,"1");
                LOGGER.info("数据库状态改变成功，即将向客户端发送消息："+cmReplay.getMsg());
                ctx.writeAndFlush(Unpooled.copiedBuffer(cmReplay.getMsg().getBytes()));
            }
            flag = false;
            return;
        }
        try {
            if (request == null || "".equals(request)){
            	 NettyChannelMap nettyChannelMap = NettyChannelMap.getInstance();
            	 String sn = nettyChannelMap.getSn(ctx.channel());
            	CommunicationMessage cmReplay = new CommunicationMessage(sn,5,5,"1");
            	ctx.writeAndFlush(Unpooled.copiedBuffer(cmReplay.getMsg().getBytes()));
                return;
            }
            //历史数据采集
            if (cm.getModel() == 4) {
            	
            	HistoryData historyData = new HistoryData();
            	historyData.setDeviceTime(cm.getTime());
            	historyData.setIdentify(cm.getFunction()+"");
            	historyData.setServerTime(new Date());
            	historyData.setSn(NettyChannelMap.getInstance().getSn(ctx.channel()));
            	Set<String> set = new HashSet<>();
            	set.add("104");
            	set.add("105");
            	set.add("204");
            	set.add("205");
            	set.add("304");
            	set.add("305");
        		if (set.contains(cm.getFunction()+"")) {
        			Double data = BizUtils.parseData(cm.getData());
        			historyData.setValue(data+"");
        		}else {
					historyData.setValue(cm.getData());
				}
            	histroyDataService.save(historyData);
            	LOGGER.info("保存采集数据："+historyData.toString());
            	bizExceptionService.save(cm.getFunction()+"", NettyChannelMap.getInstance().getSn(ctx.channel()), cm.getData());
            	return;
            }
            //系统级设计
            if (cm.getModel() == 5){
            	//机器响应给我的指令,保存数据库
                if (cm.getFunction() == 4) {
                	//String currentTime = String.valueOf(System.currentTimeMillis());
                	 NettyChannelMap nettyChannelMap = NettyChannelMap.getInstance();
                	 String sn = nettyChannelMap.getSn(ctx.channel());
                	 //更新
                	 paramSetService.updateParamDeviceTime(sn, cm.getData());
                    return;
				}
                if (cm.getFunction() == 6) {
//                	 //客户端断开，将断开信息写入到数据库
                	NettyChannelMap nettyChannelMap = NettyChannelMap.getInstance();
                	String sndevice = nettyChannelMap.getSn(ctx.channel());
                	LOGGER.info("设备序列号为{}设备，主动断开链接",sndevice);
//                    CommunicationLog c = communicationService.createLog(ctx, OptionType.DISCONNECT.getValue(), sndevice);
//                    communicationService.save(c);
//                    //channel失效，从Map中移除
//                    nettyChannelMap.remove(ctx.channel());
					ctx.close();
				}
            	
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
