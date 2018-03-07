package com.vastsum.server.Impl;

import com.vastsum.server.SensorService;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

/**
 * @author ssj
 * @create 2017-10-14 20:54
 */
public class SensorServiceImpl implements SensorService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public SensorServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void workData(){
        //查询临时表开始整理数据的位置
        Map<String, Object> objectMap = jdbcTemplate.queryForMap("select * from weifactory.temp_quarz_sensor_id ORDER BY sensor_id DESC limit 1");
        System.out.println(ReflectionToStringBuilder.toString(objectMap));
        Integer sensorRowNum = (Integer) objectMap.get("sensor_id");

        //调用程序整理的存储过程
        jdbcTemplate.execute("CALL process_sensor("+sensorRowNum+")");

    }
}
