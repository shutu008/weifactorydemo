package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.Device;
import com.vastsum.entity.DeviceSn;

import java.util.List;

public interface DeviceService {

    /**
     * 管理员获取所有的设备信息
     * @param page
     * @param pageSize
     * @return PageInfo<Device>
     */
    PageInfo<Device> findAllByPage(int page, int pageSize);

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
     * @param exportId
     * @param page
     * @param pageSize
     * @return PageInfo<Device>
     */
    PageInfo<Device> pageTurstDevicesByExportId(Integer exportId, int page, int pageSize);
    
    /**
     * 获取设备序列号列表
     * @param page
     * @param pageSize
     * @return PageInfo<DeviceSn>
     */
    PageInfo<DeviceSn> pageDeviceSn(Integer page, Integer pageSize);
    
    /**
     * 添加设备序列号，系统中注册设备序列号信息
     * @param deviceSn
     * @return int
     */
    int addDeviceSn(DeviceSn deviceSn);
    
}
