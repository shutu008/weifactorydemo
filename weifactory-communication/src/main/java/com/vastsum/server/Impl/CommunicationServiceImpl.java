package com.vastsum.server.Impl;

import com.vastsum.entity.CommunicationLog;
import com.vastsum.server.CommunicationService;
import com.vastsum.utils.ParseIpAddress;
import com.vastsum.utils.ResourceProperty;

import io.netty.channel.ChannelHandlerContext;

import java.net.SocketAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author ssj
 * @create 2017-11-19 11:24
 */
@Service(value = "communicationService")
public class CommunicationServiceImpl implements CommunicationService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //将连接数据写入到数据库中
    @Override
    public int save(CommunicationLog a) {
        String sql = "INSERT  INTO communication_log(sn, server_net_address, client_ip_address, client_port, server_ip_address, server_port, option_type) values(?,?,?,?,?,?,?)";
        int i = jdbcTemplate.update(sql,
                a.getSn(),
                a.getServerNetAddress(),
                a.getClientIpAddress(),
                a.getClientPort(),
                a.getServerIpAddress(),
                a.getServerPort(),
                a.getOptiontype());
        return i;
    }

    //更新日志信息，添加上设备序列号
    @Override
    public int update(long connectId, String sn) {
        String sql = "UPDATE communication_log SET SN=? WHERE client_connection_id = ?";
        return jdbcTemplate.update(sql,sn,connectId);
    }
    
  //获取通信日志信息
    @Override
    public CommunicationLog createLog(ChannelHandlerContext ctx, int optionType, String sn){
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
