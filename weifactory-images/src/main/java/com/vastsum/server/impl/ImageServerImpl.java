package com.vastsum.server.impl;

import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.vastsum.entity.Image;
import com.vastsum.server.DeviceService;
import com.vastsum.server.ImageServer;
import com.vastsum.utils.DateTimeUtils;

/**
 * @author ssj
 * @create 2017-11-11 9:45
 */
@Service("imageServer")
public class ImageServerImpl implements ImageServer {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    private DeviceService deviceService;
    
    /**
     * 一天只保存一张图片
     */
    @Override
    public void save(Image image) {
    	//根据设备id获取最新的批次信息、
    	Integer deviceId = deviceService.getDeviceIdBySn(image.getSn());
    	if (deviceId == null) {
			return;
		}
    	Map<String, Object> map = deviceService.getLastByDeviceId(deviceId);
    	if (map == null || map.isEmpty()) {
			return;
		}
    	String sql = "insert into image (sn, )";
    	
        
    }

    /**
     * 判断当天的图片是否保存过
     */
    //imageSensor 枚举值
	@Override
	public boolean hasImageByDate(String sn, Date date, String imageSensor) {
		Date startDate = DateTimeUtils.getStartTime(date);
		Date endDate = DateTimeUtils.getEndTime(date);
		if (startDate == null || endDate == null) {
			return false;
		}
		String sql = "select * from image where sn = ? and gmt_create between ? and ? order by gmt_create DESC limit 1";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql, sn, startDate, endDate);
		if (map == null || map.isEmpty()) {
			return false;
		}
		
		Object object = null;
		switch (imageSensor) {
		case "POO1":
			object = map.get("one_pic_name");
			break;
		case "POO2":
			object = map.get("two_pic_name");
			break;
		case "POO3":
			object = map.get("three_pic_name");
			break;
		default:
			break;
		}
		
		if (object == null || StringUtils.isBlank(object.toString())) {
			return false;
		}
		return true;
		
	}

	@Override
	public void update(Image image) {
		Map<String, Object> map = this.getLastImageBySn(image.getSn(), image.getGmtCreate());
		if (map == null || map.isEmpty()) {
			return;
		}
		Long image_id = (Long)map.get("id");
		
		String sql = null;
		if (StringUtils.isBlank(image.getSensorMark())) {
			return;
		}
		if ("POO1".equals(image.getSensorMark())) {
			sql = "update image set one_pic_name = ? where id = ? " ;
			jdbcTemplate.update(sql, image.getOnePicName(),image_id);
		}
		if ("POO2".equals(image.getSensorMark())) {
			sql = "update image set two_pic_name = ? where id = ? " ;
			jdbcTemplate.update(sql, image.getTwoPicName(),image_id);
		}
		if ("POO3".equals(image.getSensorMark())) {
			sql = "update image set three_pic_name = ? where id = ? " ;
			jdbcTemplate.update(sql, image.getThreePicName(),image_id);
		}
				
	}

	//根据设备序列号和日期获取那天的图片信息
	@Override
	public Map<String, Object> getLastImageBySn(String sn, Date date) {
		Date startDate = DateTimeUtils.getStartTime(date);
		Date endDate = DateTimeUtils.getEndTime(date);
		if (startDate == null || endDate == null) {
			return null;
		}
		String sql = "select * from image where sn = ? and gmt_create between ? and ? order by gmt_create DESC limit 1";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql, sn, startDate, endDate);
		return map;
	}

}
