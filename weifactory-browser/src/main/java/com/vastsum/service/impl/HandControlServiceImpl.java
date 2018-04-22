package com.vastsum.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.dao.HandControlMapper;
import com.vastsum.entity.Batch;
import com.vastsum.entity.HandControl;
import com.vastsum.entity.HandControlExample;
import com.vastsum.service.BatchService;
import com.vastsum.service.DeviceService;
import com.vastsum.service.HandControlService;


/**
 * 机器手动控制服务器
* @author shensj
* @date 2018年3月15日 下午8:05:20
 */
@Service
public class HandControlServiceImpl implements HandControlService {
	
	@Autowired
	private HandControlMapper handControlMapper;
	
	@Autowired
	private BatchService batchService;

	@Autowired
	private DeviceService deviceService;
	
	@Override
	public HandControl getById(Long handControlId) {
		return handControlMapper.selectByPrimaryKey(handControlId);
	}

	@Override
	public HandControl getByBatchId(Long batchId) {
		HandControlExample handControlExample = new HandControlExample();
		handControlExample.createCriteria().andBatchIdEqualTo(batchId);
		handControlExample.setOrderByClause("gmt_create desc");
		List<HandControl> list = handControlMapper.selectByExample(handControlExample);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public void saveOrUpdate(HandControl handControl) {
		if (handControl.getHandControlId() == null) {
			handControlMapper.insertSelective(handControl);
		}
		handControlMapper.updateByPrimaryKeySelective(handControl);
	}
	
	@Override
	public HashMap<String,Object> changeOrder(HandControl handControl) {
		HandControl dbHandControl = getById(handControl.getHandControlId());
		Class<HandControl> clazz = HandControl.class;
		Field[] fields = clazz.getDeclaredFields();
		HashMap<String,Object> hashMap = new HashMap<>();
		Batch batch = batchService.selectBatchBybatchId(dbHandControl.getBatchId());
		String sn = deviceService.getSnByDeviceId(batch.getDeviceId());
		hashMap.put("sn", sn);
		for(Field f : fields) {
			try {
				String fieldName = f.getName();
				String publicMethodName = "get"+fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1);
				Method m = clazz.getMethod(publicMethodName);
				Object resultCurrent = (Object)m.invoke(handControl);
				Object resultDb = (Object)m.invoke(dbHandControl);
				if(resultCurrent!=null&&!resultCurrent.equals(resultDb)) {
					hashMap.put(fieldName, resultCurrent);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return hashMap;
	}

}
