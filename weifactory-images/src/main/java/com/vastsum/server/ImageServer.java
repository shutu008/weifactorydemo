package com.vastsum.server;

import java.util.Date;
import java.util.Map;

import com.vastsum.entity.Image;

/**
 * 图片处理服务
 * @author ssj
 * @create 2017-11-11 9:43
 */
public interface ImageServer {
	
	/**
	 * 判断当天某一传感器是否保存过了图片
	 * @param date
	 * @return
	 */
	boolean hasImageByDate(String sn, Date date, String imageSensor);

    /**
     * 保存图片
     * @param image
     */
    void save(Image image);
    
    /**
     * 更新图片信息
     * @param image
     */
    void update(Image image);
    
    /**
     * 根据设备序列号获取最新的图片信息
     * @param sn
     * @return Map<String, Object>
     */
    Map<String, Object> getLastImageBySn(String sn, Date date);
    
    
}
