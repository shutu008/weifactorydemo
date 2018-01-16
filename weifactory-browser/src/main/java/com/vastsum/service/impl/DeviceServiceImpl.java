package com.vastsum.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.BizOrderMapper;
import com.vastsum.dao.DeviceMapper;
import com.vastsum.entity.*;
import com.vastsum.service.DeviceService;
import com.vastsum.dao.DeviceSnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 设备管理服务器
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceMapper deviceMapper;
    @Autowired
    private DeviceSnMapper deviceSnMapper;
    @Autowired
    private BizOrderMapper bizOrderMapper;

    @Override
    public PageInfo<Device> findAllByPage(int page, int pageSize)
    {
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<Device> deviceList = this.findAll();
        return new PageInfo<>(deviceList);

    }

    private List<Device> findAll()
    {
        DeviceExample deviceExample = new DeviceExample();
        deviceExample.setOrderByClause("gmt_create desc");
        return deviceMapper.selectByExample(deviceExample);
    }

    @Override
    public PageInfo<Device> findByUserId(Integer userId,Integer page,Integer pageSize)
    {
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        DeviceExample deviceExample = new DeviceExample();
        deviceExample.createCriteria().andUserIdEqualTo(userId);
        deviceExample.setOrderByClause("gmt_create desc");
        PageHelper.startPage(page,pageSize);
        List<Device> devices = deviceMapper.selectByExample(deviceExample);
        return new PageInfo<>(devices);
    }

    @Override
    public List<Device> findDevicesByuserId(Integer userId) {
        DeviceExample deviceExample = new DeviceExample();
        deviceExample.createCriteria().andUserIdEqualTo(userId);
        deviceExample.setOrderByClause("gmt_create desc");
        return deviceMapper.selectByExample(deviceExample);
    }

    @Override
    public int add(Device device)
    {
        int i = deviceMapper.insertSelective(device);
        return i>0?i:0;
    }

    @Override
    public int deleteByDeviceId(Device device)
    {
        DeviceExample deviceExample = new DeviceExample();
        deviceExample.createCriteria().andDeviceIdEqualTo(device.getDeviceId());
        return deviceMapper.deleteByExample(deviceExample);
    }

    @Override
    public int update(Device device)
    {
        int i = deviceMapper.updateByPrimaryKeySelective(device);
        if(i>0) {
            return i;
        }
        return 0;
    }

    //获取设备激活信息
    @Override
    public DeviceSn getBySn(String sn) {
        DeviceSn deviceSn = deviceSnMapper.selectByPrimaryKey(sn);
        return deviceSn;
    }

    @Override
    public Device getDeviceBySn(String sn) {
        DeviceExample deviceExample = new DeviceExample();
        deviceExample.createCriteria().andSnEqualTo(sn);
        List<Device> devices = deviceMapper.selectByExample(deviceExample);
        if (devices != null && !devices.isEmpty()) {
            return devices.get(0);
        }
        return null;
    }

    //根据设备Id获取设备序列号
    @Override
    public String getSnByDeviceId(Integer deviceId) {
        Device device = deviceMapper.selectByPrimaryKey(deviceId);
        if (device == null){
            return  null;
        }
        return device.getSn();
    }

    //根据专家id，获取被托管的设备信息
    @Override
    public PageInfo<Device> pageTurstDevicesByExportId(Integer exportId, int page, int pageSize) {
        BizOrderExample bizOrderExample = new BizOrderExample();
        bizOrderExample.createCriteria().andExpertIdEqualTo(exportId);
        List<BizOrder> bizOrders = bizOrderMapper.selectByExample(bizOrderExample);
        if (bizOrders == null || bizOrders.isEmpty()){
            return new PageInfo<Device>(new ArrayList<>(0));
        }
        //获取设备序列号列表
        List<String> snList = new ArrayList<>();
        for (BizOrder bizOrder : bizOrders){
            snList.add(bizOrder.getSn());
        }
       DeviceExample deviceExample = new DeviceExample();
       deviceExample.createCriteria().andSnIn(snList);
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<Device> devices = deviceMapper.selectByExample(deviceExample);
        return new PageInfo<>(devices);
    }

    //获取设备序列号列表
	@Override
	public PageInfo<DeviceSn> pageDeviceSn(Integer page, Integer pageSize) {
		page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        DeviceSnExample deviceSnExample = new DeviceSnExample();
        deviceSnExample.setOrderByClause("gmt_create desc");
        PageHelper.startPage(page,pageSize);
        List<DeviceSn> deviceSns = deviceSnMapper.selectByExample(deviceSnExample);
        return new PageInfo<>(deviceSns);
	}

	//添加设备序列号
	@Override
	public int addDeviceSn(DeviceSn deviceSn) {
		return deviceSnMapper.insert(deviceSn);
	}

	@Override
	public boolean hasDeviceSn(String sn) {
		DeviceSn deviceSn = this.getBySn(sn);
		return deviceSn == null ? false:true;
	}
    
}
