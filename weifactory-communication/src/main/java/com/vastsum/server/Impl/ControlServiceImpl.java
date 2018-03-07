package com.vastsum.server.Impl;

import com.vastsum.pojo.AskBody;
import com.vastsum.server.ControlService;
import com.vastsum.utils.NettyChannelMap;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Set;

/**
 * @author ssj
 * @create 2017-10-21 10:35
 */
@Service(value = "controlService")
public class ControlServiceImpl implements ControlService, Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControlServiceImpl.class);
    private static final long serialVersionUID = -4795523337973759894L;

    @Override
    public AskBody controlMsg(String sn, String sensorType, String status, Long period) {
        Channel channel = NettyChannelMap.get(sn);
        if (channel != null){
            //组装数据
            String data = "#A001#0000#"+sensorType+"#"+status+"#"+period+"#$";
            channel.writeAndFlush(Unpooled.copiedBuffer(data.getBytes()));
            LOGGER.info("向设备序列号为{"+sn+"}机器，发送指令{"+data+"}");
            return AskBody.ok("指令发送成功");
        }

        return AskBody.error("设备未连接上服务器");
    }

    @Override
    public AskBody controlData(String sn, String controlType, String extendStr, String data1, String data2, String data3) {
        Channel channel = NettyChannelMap.get(sn);
        if (channel != null){
            //组装数据
            String data = "#"+controlType+"#"+extendStr+"#"+data1+"#"+data2+"#"+data3+"#$";
            channel.writeAndFlush(Unpooled.copiedBuffer(data.getBytes()));
            LOGGER.info("向设备序列号为{"+sn+"}机器，发送指令{"+data+"}");
            return AskBody.ok("指令发送成功");
        }

        return AskBody.error("设备未连接上服务器");
    }

    //获取所有在线设备序列号
    @Override
    public Set<String> listOnDeviceSn() {
       return NettyChannelMap.listSn();
    }

    //关闭指定的设备
    @Override
    public AskBody closeDeviceChannel(String sn) {
        Channel channel = NettyChannelMap.get(sn);
        if (channel == null){
            return new AskBody(200,"设备未连接上服务器",null,true);
        }
        channel.close();
        return new AskBody(200,"设备已断开",null,true);
    }
}
