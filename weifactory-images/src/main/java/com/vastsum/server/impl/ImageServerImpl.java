package com.vastsum.server.impl;

import com.vastsum.entity.Image;
import com.vastsum.server.ImageServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author ssj
 * @create 2017-11-11 9:45
 */
@Service("imageServer")
public class ImageServerImpl implements ImageServer {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //保存图片
    @Override
    public Integer save(Image image) {
        String sql = "insert into image(sn,sensor_mark,path,gmt_create) values(?,?,?,?)";
        int  i = jdbcTemplate.update(sql,
                image.getSn(),
                image.getSensorMark(),
                image.getPath(),
                image.getGmtCreate());
        return i;
    }
}
