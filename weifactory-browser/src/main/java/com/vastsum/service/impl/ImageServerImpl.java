package com.vastsum.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.ImageMapper;
import com.vastsum.entity.Device;
import com.vastsum.entity.Image;
import com.vastsum.entity.ImageExample;
import com.vastsum.entity.Role;
import com.vastsum.entity.vo.ImageVO;
import com.vastsum.properties.WeifactoryProperties;
import com.vastsum.service.DeviceService;
import com.vastsum.service.ImageServer;
import com.vastsum.service.UserRoleService;
import com.vastsum.utils.ResourceProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ssj
 * @create 2017-11-11 11:51
 */
@Service
public class ImageServerImpl implements ImageServer {

	@Autowired
	private WeifactoryProperties weifactoryProperties;
	

    @Autowired
    private ImageMapper imageMapper;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private DeviceService deviceService;

    //分页查询图片列表
    @Override
    public PageInfo<Image> pageImage(ImageVO imageVO) {
    	//图片服务器地址
    	String path = weifactoryProperties.getImage().getHostUrl();
    	
        Integer page = imageVO.getPage();
        Integer pageSize = imageVO.getPageSize();
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        Integer userId = imageVO.getUserId();
        //根据用户Id获取用户的权限
        Role role = userRoleService.findRoleByuserId(userId);
        if (role == null){
            return new PageInfo<>(new ArrayList<>());
        }
        ImageExample imageExample = new ImageExample();
        ImageExample.Criteria criteria = imageExample.createCriteria();
        //根据用户id获取设备列表
        if (!"ROLE_ADMIN".equals(role.getRoleName())){
            List<Device> deviceList = deviceService.findDevicesByuserId(userId);
            if (deviceList == null || deviceList.isEmpty()){
                return new PageInfo<>(new ArrayList<>(0));
            }
            //获取设备序列号
            List<String> snList = new ArrayList<>();
            for (Device device: deviceList){
                snList.add(device.getSn());
            }
            criteria.andSnIn(snList);
        }

        //设备序列号条件
        if (imageVO.getSn() !=null && !imageVO.getSn().isEmpty()){
            criteria.andSnEqualTo(imageVO.getSn());
        }
        //传感器类型条件
        String sensorType = imageVO.getSensorType();
        if (sensorType !=null && !sensorType.isEmpty()){
            criteria.andSensorMarkEqualTo(sensorType);
        }
        //开始时间和结束时间
        Date startTime = imageVO.getStartTime();
        Date endTime = imageVO.getEndTime();
        if (startTime != null && endTime != null){
            criteria.andGmtCreateBetween(startTime, endTime);
        }
        imageExample.setOrderByClause(" gmt_create desc");
        PageHelper.startPage(page,pageSize);
        List<Image> images = imageMapper.selectByExample(imageExample);
        if (images == null || images.isEmpty()){
            return new PageInfo<>(images);
        }
        for (Image image : images){
            String s = path + image.getPath();
            image.setPath(s);

        }
        return new PageInfo<>(images);
    }

    @Override
    public List<Image> listBySn(String sn) {
    	//图片服务器地址
    	String path = weifactoryProperties.getImage().getHostUrl();
        ImageExample imageExample = new ImageExample();
        imageExample.createCriteria().andSnEqualTo(sn);
        imageExample.setOrderByClause(" gmt_create desc");
        List<Image> images = imageMapper.selectByExample(imageExample);
        if (images == null || images.isEmpty()){
            return images;
        }
        for (Image image : images){
            String s = path + image.getPath();
            image.setPath(s);

        }
        return images;
    }

    //列出所有的图片
    @Override
    public List<Image> listAll() {
        ImageExample imageExample = new ImageExample();
        imageExample.setOrderByClause(" gmt_create desc");
        List<Image> images = imageMapper.selectByExample(imageExample);
        if (images == null || images.isEmpty()){
            return images;
        }
        for (Image image : images){
            String s = weifactoryProperties.getImage().getHostUrl() + image.getPath();
            image.setPath(s);

        }
        return images;
    }

    @Override
    public List<Image> listBySnAndSensorType(String sn, String sensorType) {
        ImageExample imageExample = new ImageExample();
        imageExample.createCriteria().andSnEqualTo(sn)
                .andSensorMarkEqualTo(sensorType);
        imageExample.setOrderByClause(" gmt_create desc");
        List<Image> images = imageMapper.selectByExample(imageExample);
        if (images == null || images.isEmpty()){
            return images;
        }
        for (Image image : images){
            String s = weifactoryProperties.getImage().getHostUrl() + image.getPath();
            image.setPath(s);

        }
        return images;
    }

    @Override
    public List<Image> listByUserId(Integer userId) {
        //根据用户Id获取用户的权限
        Role role = userRoleService.findRoleByuserId(userId);
        if ("ROLE_ADMIN".equals(role.getRoleName())){
            //如果是管理员，则返回所有的图片
            return listAll();
        }
        //根据用户id获取设备列表
        List<Device> deviceList = deviceService.findDevicesByuserId(userId);
        if (deviceList == null || deviceList.isEmpty()){
            return new ArrayList<>(0);
        }
        //获取设备序列号
        List<String> snList = new ArrayList<>();
        for (Device device: deviceList){
            snList.add(device.getSn());
        }
        ImageExample imageExample = new ImageExample();
        imageExample.createCriteria().andSnIn(snList);
        imageExample.setOrderByClause(" gmt_create desc");
        List<Image> images = imageMapper.selectByExample(imageExample);
        if (images == null || images.isEmpty()){
            return images;
        }
        for (Image image : images){
            String s = weifactoryProperties.getImage().getHostUrl() + image.getPath();
            image.setPath(s);

        }
        return images;
    }

    //获取最新的图片
    @Override
    public Image getLastBySnAndSensorType(String sn, String sensorType) {
        List<Image> images = listBySnAndSensorType(sn, sensorType);
        if (images != null && !images.isEmpty()){
            Image image = images.get(0);
            image.setPath(image.getPath());
            return image;
        }
        return null;
    }

    //根据id获取图片信息
    @Override
    public Image getById(Long id) {
        Image image = imageMapper.selectByPrimaryKey(id);
        image.setPath(weifactoryProperties.getImage().getHostUrl()+image.getPath());
        return image;
    }

    //根据路径获取图片
    @Override
    public Image getByPath(String path) {
        ImageExample imageExample = new ImageExample();
        imageExample.createCriteria().andPathEqualTo(path);
        List<Image> images = imageMapper.selectByExample(imageExample);
        if (images == null || images.isEmpty()){
            return null;
        }
        Image image = images.get(0);
        image.setPath(path+image.getPath());
        return image;
    }

    //保存图片
    @Override
    public Integer save(Image image) {
        return imageMapper.updateByPrimaryKey(image);
    }

    //更新图片
    @Override
    public Integer update(Image image) {
        return imageMapper.insert(image);
    }
}
