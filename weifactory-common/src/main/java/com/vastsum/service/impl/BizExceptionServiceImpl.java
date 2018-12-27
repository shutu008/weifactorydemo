package com.vastsum.service.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.BizExceptionMapper;
import com.vastsum.dao.DeviceMapper;
import com.vastsum.entity.Batch;
import com.vastsum.entity.BizException;
import com.vastsum.entity.BizExceptionExample;
import com.vastsum.entity.Device;
import com.vastsum.entity.DeviceExample;
import com.vastsum.entity.Model;
import com.vastsum.service.BatchService;
import com.vastsum.service.BizExceptionService;
import com.vastsum.service.ModelService;
import com.vastsum.service.RoleService;
import com.vastsum.utils.BizUtils;

/**
 * @author ssj
 * @create 2017-11-17 22:15
 */
@Service
public class BizExceptionServiceImpl implements BizExceptionService {
	
	private static Logger logger = LoggerFactory.getLogger(BizExceptionServiceImpl.class);

    @Autowired
    private BizExceptionMapper bizExceptionMapper;

    @Autowired
    private RoleService roleService;
    @Autowired
    private DeviceMapper deviceMapper;
    @Autowired
    private BatchService batchService;
    @Autowired
    private ModelService modelService;

    //列出所有的业务异常信息
    @Override
    public List<BizException> listAll() {
        BizExceptionExample bizExceptionExample = new BizExceptionExample();
        bizExceptionExample.setOrderByClause("exception_id desc");
        List<BizException> bizExceptions = bizExceptionMapper.selectByExample(bizExceptionExample);
        return bizExceptions;
    }

    //列出和用户相关的异常
    @Override
    public List<BizException> listByUserId(int userId) {
        BizExceptionExample bizExceptionExample = new BizExceptionExample();
        bizExceptionExample.createCriteria().andUserIdEqualTo(userId);
        bizExceptionExample.setOrderByClause("exception_id desc");
        List<BizException> bizExceptions = bizExceptionMapper.selectByExample(bizExceptionExample);
        return bizExceptions;
    }

    //根据设备序列号获取相关异常
    @Override
    public List<BizException> listBySn(String sn) {
        BizExceptionExample bizExceptionExample = new BizExceptionExample();
        bizExceptionExample.createCriteria().andSnEqualTo(sn);
        bizExceptionExample.setOrderByClause("exception_id desc");
        List<BizException> bizExceptions = bizExceptionMapper.selectByExample(bizExceptionExample);
        return bizExceptions;
    }

    //根据条件获取异常列表
    @Override
    public List<BizException> listByBizException(BizException bizException) {
        BizExceptionExample bizExceptionExample = new BizExceptionExample();
        bizExceptionExample.setOrderByClause("gmt_create desc");
        BizExceptionExample.Criteria criteria = bizExceptionExample.createCriteria();
        //首先保证userid是必须要传的值
        int userId = bizException.getUserId();
        //根据用户id获取用户的角色，如果角色等于超级管理员，列出所有的异常信息
       if (!roleService.isAdminByUserId(userId)){
           criteria.andUserIdEqualTo(userId);
       }
       String sn = bizException.getSn();
       if (sn != null){
           criteria.andSnEqualTo(sn);
       }

       Integer sensorId = bizException.getSensorNo();
       if (sensorId != null){
           criteria.andSensorNoEqualTo(sensorId);
       }

       Integer exceptionType = bizException.getExceptionType();
       if (exceptionType != null){
           criteria.andExceptionTypeEqualTo(exceptionType);
       }
        List<BizException> bizExceptions = bizExceptionMapper.selectByExample(bizExceptionExample);
        return bizExceptions;
    }

    //根据条件分页列出所有的异常
    @Override
    public PageInfo<BizException> pageByBizException(BizException bizException, int page, int pageSize) {

        BizExceptionExample bizExceptionExample = new BizExceptionExample();
        bizExceptionExample.setOrderByClause("gmt_create desc");
        BizExceptionExample.Criteria criteria = bizExceptionExample.createCriteria();
        //首先保证userid是必须要传的值
        int userId = bizException.getUserId();
        //根据用户id获取用户的角色，如果角色等于超级管理员，列出所有的异常信息
        if (!roleService.isAdminByUserId(userId)){
            criteria.andUserIdEqualTo(userId);
        }
        String sn = bizException.getSn();
        if (sn != null){
            criteria.andSnLike("%"+sn+"%");
        }

        Integer sensorId = bizException.getSensorNo();
        if (sensorId != null){
            criteria.andSensorNoEqualTo(sensorId);
        }

        Integer exceptionType = bizException.getExceptionType();
        if (exceptionType != null){
            criteria.andExceptionTypeEqualTo(exceptionType);
        }

        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<BizException> bizExceptions = bizExceptionMapper.selectByExample(bizExceptionExample);
        return new PageInfo<>(bizExceptions);
    }

    @Override
    public BizException getById(long exceptionId) {
        return bizExceptionMapper.selectByPrimaryKey(exceptionId);
    }

    @Override
    public int delete(long exceptionId) {
        return bizExceptionMapper.deleteByPrimaryKey(exceptionId);
    }

	@Override
	public void save(String function, String sn, String data) {
		BizException bizException = new BizException();
		
		DeviceExample deviceExample = new DeviceExample();
		deviceExample.createCriteria().andSnEqualTo(sn);
		List<Device> list = deviceMapper.selectByExample(deviceExample);
		if (list == null || list.isEmpty()) {
			return;
		}
		Device device = list.get(0);
		if (device == null) {
			return;
		}
		Integer deviceId = device.getDeviceId();
		logger.info("植物工厂异常：设备序列号为："+sn);
		Integer userId = device.getUserId();
		logger.info("植物工厂异常：用户ID为："+userId);
		//判断当前批次是否关联了模型
		Batch batch = batchService.selectLastBatchByDeviceId(deviceId);
		if (batch == null || batch.getModelId() == null) {
			logger.info("当前设备没有关联阈值信息");
			return ;
		}
		logger.info("模型关联的批次ID"+batch.getBatchId());
		Model model = modelService.getModelById(batch.getModelId());
		Double tup = model.getTemperatureUp();
		Double tdown = model.getTemperatureDown();
		Double hup = model.getHumidityUp();
		Double hdown = model.getHumidityDown();
		Set<String> tset = new HashSet<>();
		Set<String> hset = new HashSet<>();
		tset.add("104");
		hset.add("105");
		tset.add("204");
		hset.add("205");
		tset.add("304");
		hset.add("305");
		logger.info("获取植物工厂原始数据："+data+";function="+function);
		
		bizException.setExceptionType(1);
		bizException.setGmtCreate(new Date());
		bizException.setSensorNo(Integer.parseInt(function));
		bizException.setSn(sn);
		bizException.setUserId(userId);
		
		if (tset.contains(function)) {
			Double data2 = BizUtils.parseData(data);
			if (data2 > tup) {
				bizException.setExceptionContent("温度过高");
			}
			if (data2 < tdown) {
				bizException.setExceptionContent("温度过低");
			}
		}else if (hset.contains(function)) {
			Double data3 = BizUtils.parseData(data);
			if (data3> hup) {
				bizException.setExceptionContent("湿度过高");
			}
			if (data3 < hdown) {
				bizException.setExceptionContent("湿度过低");
			}
		}else {
			logger.info("数据处于模型之内");
			return;
		}
		
		bizExceptionMapper.insertSelective(bizException);
	}
	
}
