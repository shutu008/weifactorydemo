package com.vastsum.server.Impl;

import com.vastsum.entity.DeviceSn;
import com.vastsum.server.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ssj
 * @create 2017-10-08 19:52
 */
@Service(value = "deviceService")
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //根据设备序列号，查询设备信息
    @Override
    public DeviceSn getBySn(String sn) {
        DeviceSn deviceSn = (DeviceSn)jdbcTemplate.queryForObject("select * from device_sn where sn = ?",
                new Object[]{sn},
                new RowMapper<Object>() {
                    @Override
                    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                        DeviceSn deviceSn = new DeviceSn();
                        deviceSn.setSn(resultSet.getString("sn"));
                        deviceSn.setStatus(Integer.parseInt(resultSet.getString("status")));
                        deviceSn.setGmtCreate(resultSet.getDate("gmt_create"));
                        return deviceSn;
                    }
                });
        return deviceSn;
    }

    //更新设备状态
    @Override
    public int updateDeviceSnStatus(DeviceSn deviceSn) {
        int update = jdbcTemplate.update("update device_sn set status = ? where sn = ?",
                deviceSn.getStatus(), deviceSn.getSn());
        return update;
    }
}
