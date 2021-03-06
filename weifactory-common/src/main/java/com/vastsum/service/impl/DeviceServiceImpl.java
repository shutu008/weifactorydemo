package com.vastsum.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.BizOrderMapper;
import com.vastsum.dao.DeviceMapper;
import com.vastsum.dao.DeviceSnMapper;
import com.vastsum.dao.JoinMapper;
import com.vastsum.dao.UserMapper;
import com.vastsum.entity.BizOrder;
import com.vastsum.entity.BizOrderExample;
import com.vastsum.entity.Device;
import com.vastsum.entity.DeviceExample;
import com.vastsum.entity.DeviceExample.Criteria;
import com.vastsum.entity.DeviceSn;
import com.vastsum.entity.DeviceSnExample;
import com.vastsum.entity.User;
import com.vastsum.entity.UserExample;
import com.vastsum.entity.vo.UserDevice;
import com.vastsum.pojo.PageCondition;
import com.vastsum.service.DeviceService;

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
    @Autowired
    private JoinMapper joinMapper;
    @Autowired
    private UserMapper userMapper;

    //根据条件查询设备列表
    @Override
    public PageInfo<Device> pageByDevice(Device device,String username, PageCondition pageCondition){
    	
        DeviceExample example = new DeviceExample();
        Criteria criteria = example.createCriteria();
        
        if (StringUtils.isNotBlank(device.getSn())) {
			criteria.andSnLike("%"+device.getSn()+"%");
		}
        if (StringUtils.isNotBlank(device.getDeviceType())) {
			criteria.andDeviceTypeEqualTo(device.getDeviceType());
		}
        if (StringUtils.isNotBlank(username)) {
			UserExample userExample = new UserExample();
			com.vastsum.entity.UserExample.Criteria createCriteria = userExample.createCriteria();
			createCriteria.andUserNameLike("%"+username+"%");
			List<User> userList = userMapper.selectByExample(userExample);
			if (userList == null || userList.isEmpty()) {
				PageInfo<Device> pageList = new PageInfo<>();
				return pageList;
			}
			List<Integer> list = new ArrayList<>();
			for (User user : userList) {
				list.add(user.getUserId());
			}
			criteria.andUserIdIn(list);
		}
        
        example.setOrderByClause("gmt_create desc");
        PageHelper.startPage(pageCondition.getPage(),pageCondition.getPageSize());
        List<Device> deviceList = deviceMapper.selectByExample(example);
        return new PageInfo<>(deviceList);
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
    public PageInfo<Device> pageTurstDevicesByExpertId(Integer expertId, int page, int pageSize) {
        BizOrderExample bizOrderExample = new BizOrderExample();
        bizOrderExample.createCriteria()
        .andExpertIdEqualTo(expertId)
        .andOrderStateEqualTo(new Byte("3"));
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
       deviceExample.createCriteria().andOrderStatusEqualTo("3")
       .andTrustStatusEqualTo("2");
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<Device> devices = deviceMapper.selectByExample(deviceExample);
        return new PageInfo<>(devices);
    }
    
    @Override
	public List<Device> turstDevicesByExpertId(Integer expertId){
    	 BizOrderExample bizOrderExample = new BizOrderExample();
         bizOrderExample.createCriteria()
         .andExpertIdEqualTo(expertId)
         .andOrderStateEqualTo(new Byte("3"));
         List<BizOrder> bizOrders = bizOrderMapper.selectByExample(bizOrderExample);
         if (bizOrders == null || bizOrders.isEmpty()){
             return new ArrayList<>();
         }
         //获取设备序列号列表
         List<String> snList = new ArrayList<>();
         for (BizOrder bizOrder : bizOrders){
             snList.add(bizOrder.getSn());
         }
        DeviceExample deviceExample = new DeviceExample();
        deviceExample.createCriteria().andOrderStatusEqualTo("3")
        .andTrustStatusEqualTo("2");
         List<Device> devices = deviceMapper.selectByExample(deviceExample);
         return devices;
    }

    //获取设备序列号列表
	@Override
	public PageInfo<DeviceSn> pageByDeviceSn(DeviceSn deviceSn, Date startTime,Date endTime, PageCondition pageCondition) {
		
        DeviceSnExample example = new DeviceSnExample();
        com.vastsum.entity.DeviceSnExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(deviceSn.getSn())) {
			criteria.andSnLike("%"+deviceSn.getSn()+"%");
		}
        if (deviceSn.getStatus() !=null) {
			criteria.andStatusEqualTo(deviceSn.getStatus());
		}
        if (startTime!= null && endTime != null) {
			criteria.andGmtCreateBetween(startTime, endTime);
		}
        example.setOrderByClause("gmt_create desc");
        PageHelper.startPage(pageCondition.getPage(),pageCondition.getPageSize());
        List<DeviceSn> deviceSns = deviceSnMapper.selectByExample(example);
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

	@Override
	public PageInfo<UserDevice> findByPage(int page, int pageSize) {
		page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
		List<UserDevice> list = joinMapper.findByUserDeviceDto();
		return new PageInfo<>(list);
	}

	@Override
	public Device getById(Integer deviceId) {
		return deviceMapper.selectByPrimaryKey(deviceId);
	}

	@Override
	public List<Device> findByExample(Device device) {
		DeviceExample deviceExample = new DeviceExample();
		Criteria criteria = deviceExample.createCriteria();
		if (device != null) {
			if (StringUtils.isNotBlank(device.getSn())) {
				criteria.andSnEqualTo(device.getSn());
			}
			if (StringUtils.isNotBlank(device.getTrustStatus())) {
				criteria.andTrustStatusEqualTo(device.getTrustStatus());
			}
			if (StringUtils.isNotBlank(device.getOrderStatus())) {
				criteria.andOrderStatusEqualTo(device.getOrderStatus());
			}
			if (device.getUserId() != null) {
				criteria.andUserIdEqualTo(device.getUserId());
			}
		}
		List<Device> list = deviceMapper.selectByExample(deviceExample);
		return list;
	}

	@Override
	public List<Device> findByTrustStatus(String trustStatus) {
		Device device = new Device();
		device.setTrustStatus(trustStatus);
		return this.findByExample(device);
	}
    
}
