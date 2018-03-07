package com.vastsum.server.Impl;

import com.vastsum.entity.CommunicationLog;
import com.vastsum.server.CommunicationService;
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
}
