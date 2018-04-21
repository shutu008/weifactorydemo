package com.vastsum.main;

import java.net.SocketAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.vastsum.entity.BizException;
import com.vastsum.entity.CommunicationLog;
import com.vastsum.entity.CommunicationMessage;
import com.vastsum.entity.SensorCollection;
import com.vastsum.pojo.ArrayToEntity;
import com.vastsum.pojo.ExceptionTypeEnum;
import com.vastsum.pojo.NewConnection;
import com.vastsum.pojo.OptionType;
import com.vastsum.pojo.WrapData;
import com.vastsum.server.CommunicationService;
import com.vastsum.server.DataService;
import com.vastsum.utils.DataUtils;
import com.vastsum.utils.NettyChannelMap;
import com.vastsum.utils.ParseIpAddress;
import com.vastsum.utils.ParserMessageUtils;
import com.vastsum.utils.ResourceProperty;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.SocketChannel;

public class NewServerHandler extends ChannelInboundHandlerAdapter {
	private DataService dataService;
    @Autowired
    private NewConnection newConnection;
    @Autowired
    private CommunicationService communicationService;
    @Autowired
    private ArrayToEntity arrayToEntity;

    //是否第一次执行标志
    boolean flag = true;

    private static final Logger LOGGER = LoggerFactory.getLogger(ServerHandler.class);

    //连接断开时调用的方法
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        //客户端断开，将断开信息写入到数据库
        CommunicationLog c = getCommunicationLog(ctx, OptionType.DISCONNECT.getValue(), NettyChannelMap.getSn((SocketChannel)ctx.channel()));
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
        //获取当前时间戳，返回给客户端标识现在开始
        System.out.println("我是服务器-已有客户端连接上服务器....");
       //获取连接的ip地址
        LOGGER.info("获取客户端ip:" + ctx.channel().remoteAddress());

    }


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception{
        String request = (String)msg;
        CommunicationMessage cm = ParserMessageUtils.parser(request);
        LOGGER.info("来自客户端的原始数据："+request);
        SensorCollection sensorCollection = null;
        if (flag){
        	String sn = cm.getData();
            LOGGER.info("进行激活验证：返回时间戳为:"+String.valueOf(System.currentTimeMillis()));
            //设备序列号与SocketChannel绑定
            NettyChannelMap.add(sn, (SocketChannel)ctx.channel());
            //客户端连接
            CommunicationLog c = getCommunicationLog(ctx, OptionType.CONNECT.getValue(), sn);
            communicationService.save(c);

            LOGGER.info("设备序列号已经与设备绑定,设备序列号："+sn+";Channel对象："+(SocketChannel)ctx.channel());
            Integer status = newConnection.connStatus(sn);
            if (status == 0 || status== -1){
                ctx.writeAndFlush(Unpooled.copiedBuffer("-1".getBytes()));
            }
            if (status == 1){
                String currentTime = String.valueOf(System.currentTimeMillis());
                ctx.writeAndFlush(Unpooled.copiedBuffer(currentTime.getBytes()));
            }
            flag = false;
            //第一次处理结束，不向下执行
            return;
        }

        try {
            //判断如果客户端断开重连接只发送设备号
            if (request == null || "".equals(request)){
                return;
            }
            if (request.indexOf("#") < 0){
                //说明发送的是设备序列号
                String currentTime = String.valueOf(System.currentTimeMillis());
                ctx.writeAndFlush(Unpooled.copiedBuffer(currentTime.getBytes()));
                LOGGER.info("不再进行激活验证，已经激活的设备再次连接服务器，返回时间戳为："+currentTime);
                return;
            }

        }catch (Exception ex){
            ex.getMessage();
            LOGGER.error("数据转化过程中出现异常！");
        }
        String[] dataArray = DataUtils.dataToArray(request);
        WrapData wrapData = arrayToEntity.to(dataArray);
        //正常数据处理
        if (wrapData.getDataType() == 1){
            sensorCollection = new SensorCollection();
            sensorCollection.setSn(wrapData.getSn());
            sensorCollection.setSensor(wrapData.getSensor());
            sensorCollection.setDataType(wrapData.getDataType());
            sensorCollection.setData(wrapData.getData());
            sensorCollection.setBatchNo(wrapData.getBatchNo());
            Integer i = dataService.insert(sensorCollection);
            LOGGER.info("获取的数据为："+(String)msg+"-数据处理结果："+i);
            ctx.writeAndFlush(Unpooled.copiedBuffer((""+i).getBytes()));
        }
        //设备异常处理
        if (wrapData.getDataType() == 2){
            BizException bizException = new BizException();
            bizException.setSn(wrapData.getSn());
            bizException.setExceptionType(ExceptionTypeEnum.DEVICE_EXCEPTION.getId());
            bizException.setExceptionContent(wrapData.getData());
            bizException.setSensorNo(wrapData.getSensor());
            int j = dataService.exceptionInsert(bizException);
            LOGGER.info("设备异常处理结果："+j);
            ctx.writeAndFlush(Unpooled.copiedBuffer((""+j).getBytes()));
        }

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception{
        cause.printStackTrace();
        ctx.close();
    }

    public DataService getDataService() {
        return dataService;
    }

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
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
