package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.Device;
import com.vastsum.entity.DeviceSn;
import com.vastsum.entity.vo.UserDevice;
import com.vastsum.pojo.PageCondition;

import java.util.Date;
import java.util.List;

public interface DeviceService {

    /**
     * 管理员获取所有的设备信息
     * @param page
     * @param pageSize
     * @return PageInfo<Device>
     */
    PageInfo<Device> pageByDevice(Device device ,String username, PageCondition pageCondition);
    
    /**
     * 管理员获取所有的设备信息
     * @param page
     * @param pageSize
     * @return PageInfo<UserDevice>
     */
    PageInfo<UserDevice> findByPage(int page, int pageSize);
    
    
    /**
     * 根据条件获取设备列表
     * @param device
     * @return List<Device>
     */
    List<Device> findByExample(Device device);
    
    /**
     * 根据托管状态获取设备列表
     * @param trustStatus
     * @return List<Device>
     */
    List<Device> findByTrustStatus(String trustStatus);

    /**
     * 用户获取自己所有的设备信息
     * @param userid
     * @param page
     * @param pageSize
     * @return PageInfo<Device>
     */
    PageInfo<Device> findByUserId(Integer userid, Integer page, Integer pageSize);

    /**
     * 根据用户id获取用户的所有设备，用于目录
     * @param userId
     * @return List<Device>
     */
    List<Device> findDevicesByuserId(Integer userId);

    /**
     * 添加设备
     * @param device
     * @return int
     */
    int add(Device device);

    /**
     * 删除设备
     * @param device
     * @return int
     */
    int deleteByDeviceId(Device device);

    /**
     * 更新设备信息
     * @param device
     * @return int
     */
    int update(Device device);

    /**
     * 根据设备序列号，获取设备的注册信息
     * @param sn
     * @return DeviceSn
     */
    DeviceSn getBySn(String sn);
    
    /**
     * 判断系统中是或否已经有这个设备序列号
     * 如果系统中有返回true,如果没有返回false
     * @param sn
     * @return boolean
     */
    boolean hasDeviceSn(String sn);

    /**
     * 根据设备序列号，获取设备的绑定信息
     * @param sn
     * @return Device
     */
    Device getDeviceBySn(String sn);

    /**
     * 根据设备id获取设备序列号
     * @param deviceId
     * @return String
     */
    String getSnByDeviceId(Integer deviceId);

    /**
     * 根据专家id，获取被托管的设备信息
     * @param expertId
     * @param page
     * @param pageSize
     * @return PageInfo<Device>
     */
    PageInfo<Device> pageTurstDevicesByExpertId(Integer expertId, int page, int pageSize);
    /**
     * 根据专家id，获取被托管的设备信息
     * @param expertId
     * @return PageInfo<Device>
     */
    List<Device> turstDevicesByExpertId(Integer expertId);
    
    
   /**
    *  获取设备序列号列表
    * @param deviceSn
    * @param startTime
    * @param endTime
    * @param pageCondition
    * @return PageInfo<DeviceSn>
    */
    PageInfo<DeviceSn> pageByDeviceSn(DeviceSn deviceSn, Date startTime,Date endTime, PageCondition pageCondition);
    
    /**
     * 添加设备序列号，系统中注册设备序列号信息
     * @param deviceSn
     * @return int
     */
    int addDeviceSn(DeviceSn deviceSn);
    
    /**
     * 根据设备ID获取设备信息
     * @param deviceId
     * @return Device
     */
    Device getById(Integer deviceId);
    
}
