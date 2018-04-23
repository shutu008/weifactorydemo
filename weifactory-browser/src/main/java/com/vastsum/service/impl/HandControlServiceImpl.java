package com.vastsum.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.hash.BeanUtilsHashMapper;
import org.springframework.stereotype.Service;

import com.vastsum.dao.HandControlMapper;
import com.vastsum.entity.HandControl;
import com.vastsum.entity.HandControlExample;
import com.vastsum.service.HandControlService;
import com.vastsum.utils.BizUtils;


/**
 * 机器手动控制服务器
* @author shensj
* @date 2018年3月15日 下午8:05:20
 */
@Service
public class HandControlServiceImpl implements HandControlService {
	
	@Autowired
	private HandControlMapper handControlMapper;
	
	private static Logger logger = LoggerFactory.getLogger(HandControlServiceImpl.class);
	
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
		logger.info(ReflectionToStringBuilder.toString(handControl));
		Set<String> set = new TreeSet<>();
		set.add("wd1");set.add("wd2");set.add("wd3");
		HashMap<String,Object> hashMap = new HashMap<>();
		hashMap.put("sn", handControl.getSn());
		//判断当前数据库中有没有数据，如果没有，下发所有值
		if (handControl.getHandControlId() == null) {
			BeanUtilsHashMapper<HandControl> beanUtilsHashMapper = new BeanUtilsHashMapper<>(HandControl.class);
			Map<String, String> hash = beanUtilsHashMapper.toHash(handControl);
			hashMap.putAll(hash);
		}else {
			HandControl dbHandControl = getById(handControl.getHandControlId());
			Class<HandControl> clazz = HandControl.class;
			Field[] fields = clazz.getDeclaredFields();
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
		
		}
		//数据处理
		Set<Entry<String, Object>> entrySet = hashMap.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			String key = entry.getKey();
			if (set.contains(key)) {
				String b = BizUtils.handle3data(entry.getValue().toString());
				hashMap.put(key, b);
			}
		}
		logger.info(hashMap.toString());
		return hashMap;
	}
	

}
