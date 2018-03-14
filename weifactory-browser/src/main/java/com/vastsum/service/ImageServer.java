package com.vastsum.service;

import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.Image;
import com.vastsum.entity.vo.ImageVO;

/**
 * 图片服务 
 * @author ssj
 * @create 2017-11-11 11:28
 */
public interface ImageServer {

    /**
     * 查询图片
     * @param imageVO
     * @return PageInfo<Image>
     */
    PageInfo<Image> pageImage(ImageVO imageVO);

    /**
     * 根据设备序列号获取图片
     * @param sn
     * @return List<Image>
     */
    List<Image> listBySn(String sn);

    /**
     * 列出所有的图片
     * @return List<Image>
     */
    List<Image> listAll();

    /**
     * 根据设备序列号和传感器标识获取图片列表
     * @param sn
     * @param sensorType
     * @return List<Image>
     */
    List<Image> listBySnAndSensorType(String sn, String sensorType);

    /**
     * 根据用户id获取图片信息
     * @param userId
     * @return List<Image>
     */
    List<Image> listByUserId(Integer userId);

    /**
     * 根据设备序列号和传感器标识获取最新的图片信息
     * @param sn
     * @param sensorType
     * @return Image
     */
    Image getLastBySnAndSensorType(String sn, String sensorType);

    /**
     * 根据id获取图片
     * @param id
     * @return Image
     */
    Image getById(Long id);

    /**
     * 通过路径获取图片信息
     * @param path
     * @return Image
     */
    Image getByPath(String path);

    /**
     * 保存图片
     * @param image
     * @return Integer
     */
    Integer save(Image image);

    /**
     * 更新图片
     * @param image
     * @return Integer
     */
    Integer update(Image image);
    
    /**
     * 根据时间和位置获取图片信息
     * @param sn
     * @param date
     * @return Image
     */
    Image getImageByDate(String sn, Date date);
    
    /**
     * 根据位置获取最新的图片
     * @param sn
     * @return Image
     */
    Image getLastImageByDate(String sn);
}
