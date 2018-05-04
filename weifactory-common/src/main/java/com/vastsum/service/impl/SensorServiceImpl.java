package com.vastsum.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.dao.HandControlMapper;
import com.vastsum.dao.ParamSetMapper;
import com.vastsum.entity.GrowthPatternParam;
import com.vastsum.entity.HandControl;
import com.vastsum.entity.ParamSet;
import com.vastsum.service.SensorService;
import com.vastsum.utils.BizUtils;
import com.vastsum.utils.ResourceProperty;


/**
 * 数据下发功能
 * @author shutu008
 *
 */
@Service
public class SensorServiceImpl implements SensorService {
	
	private static final Logger logger = LoggerFactory.getLogger(SensorServiceImpl.class);
	
	@Autowired
	private ParamSetMapper paramSetMapper;
	
	@Autowired
	private HandControlMapper handControlMapper;

	//手动控制
	@Override
	public HashMap<String,Object> changeOrder(HandControl handControl) {
		Set<String> set = new TreeSet<>();
		set.add("T0001110");set.add("T0001210");set.add("T0001310");
		HashMap<String,Object> hashMap = new HashMap<>();
		hashMap.put("sn", handControl.getSn());
		//判断当前数据库中有没有数据，如果没有，下发所有值
		if (handControl.getHandControlId() == null) {
			//BeanUtilsHashMapper<HandControl> beanUtilsHashMapper = new BeanUtilsHashMapper<>(HandControl.class);
			Map<String, Object> hash = resultAllMap(handControl, HandControl.class,"handControl");
//			Map<String, String> hash = beanUtilsHashMapper.toHash(handControl);
			hashMap.putAll(hash);
		}else {
			HandControl dbHandControl = handControlMapper.selectByPrimaryKey(handControl.getHandControlId());
			HashMap<String,Object> resultMap = resultMap(dbHandControl, handControl, HandControl.class,"handControl");
			hashMap.putAll(resultMap);
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
		logger.info("准备下发的hashmap:"+hashMap.toString());
		return hashMap;
	}
	
	//参数设置
	@Override
	public HashMap<String, Object> changeOrder(ParamSet paramSet) {
		HashMap<String,Object> hashMap = new HashMap<>();
		hashMap.put("sn", paramSet.getSn());
		
		//判断当前数据库中有没有数据，如果没有，下发所有值
		if (paramSet.getParamSetId() == null) {
			Map<String, Object> hash = resultAllMap(paramSet, ParamSet.class,"paramSet");
//			BeanUtilsHashMapper<ParamSet> beanUtilsHashMapper = new BeanUtilsHashMapper<>(ParamSet.class);
//			Map<String, String> hash = beanUtilsHashMapper.toHash(paramSet);
			hashMap.putAll(hash);
		}else {
			ParamSet primevalParamSet= paramSetMapper.selectByPrimaryKey(paramSet.getParamSetId());
			HashMap<String,Object> resultMap = resultMap(primevalParamSet, paramSet, ParamSet.class,"paramSet");
			hashMap.putAll(resultMap);
		}
		
		//数据处理
		Set<Entry<String, Object>> entrySet = hashMap.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			String key = entry.getKey();
			//处理同步服务器时间设置
			if ("T0002900".equals(key)) {
				String data = BizUtils.dateFormat((Date)hashMap.get(key));
				hashMap.put(key, data);
			}
			
			//处理一天之内的时间，白天开始时间，晚上开始时间
			if ("T0002904".equals(key) || "T0002904".equals(key) || "T0002905".equals(key) || "T0002906".equals(key)) {
				String data = BizUtils.timeFormat((String)hashMap.get(key));
				hashMap.put(key, data);
			}
			
			//处理温湿度
			if ("T0002212".equals(key) || "T0002213".equals(key) 
					|| "T0002214".equals(key) || "T0002215".equals(key)
					|| "T0002312".equals(key) || "T0002313".equals(key)
					|| "T0002314".equals(key) || "T0002315".equals(key)
					|| "T0002112".equals(key) || "T0002113".equals(key)
					|| "T0002114".equals(key) || "T0002115".equals(key)) {
				String data = BizUtils.handle3data((String)hashMap.get(key));
				hashMap.put(key, data);
			}
		}
		
		logger.info("准备下发的hashmap:"+hashMap.toString());
		return hashMap;
	}
	
	
	//生长模式参数设置
	@Override
	public HashMap<String, Object> changeOrder(GrowthPatternParam growthPatternParam) {
		// TODO Auto-generated method stub
		return null;
	}

	//获取植物工厂时间
	@Override
	public HashMap<String, Object> getDeviceTime(String sn) {
		HashMap<String, Object> hashMap = new HashMap<>();
		hashMap.put("sn", sn);
		hashMap.put("T0005003", "1");
		return hashMap;
	}
	
	/**
	 *  处理对象，获取差值
	 * @param dbData 数据库中保存的记录
	 * @param currentData 目前要下发的记录
	 * @param clazz
	 * @return
	 */
	private <T> HashMap<String, Object> resultMap(T dbData,T currentData, Class<T> clazz, String objectName){
		HashMap<String, Object> hashMap = new HashMap<>();
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			logger.info("字段的类型："+f.getType().toString());
				try {
					String fieldName = f.getName();
					logger.info("字段名："+fieldName);
					String publicMethodName = "get"+fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1);
					logger.info("方法名："+publicMethodName);
					Method m = clazz.getMethod(publicMethodName);
					Object resultCurrent = (Object)m.invoke(currentData);
					Object resultDb = (Object)m.invoke(dbData);
					logger.info("当前值："+resultCurrent);
					logger.info("数据库中值："+resultDb);
					if(resultCurrent !=null && !resultCurrent.equals(resultDb)) {
						String function = StringUtils.trim(ResourceProperty.getProperties("dataConvert.properties").getProperty(objectName+"."+fieldName));
						hashMap.put(function, resultCurrent);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		
		return hashMap;
	}
	
	/**
	 *  处理对象，获取差值
	 * @param currentData 目前要下发的记录
	 * @param clazz
	 * @return
	 */
	private <T> HashMap<String, Object> resultAllMap(T currentData, Class<T> clazz, String objectName){
		HashMap<String, Object> hashMap = new HashMap<>();
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			logger.info("字段的类型："+f.getType().toString());
				try {
					String fieldName = f.getName();
					logger.info("字段名："+fieldName);
					String publicMethodName = "get"+fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1);
					logger.info("方法名："+publicMethodName);
					Method m = clazz.getMethod(publicMethodName);
					Object resultCurrent = (Object)m.invoke(currentData);
					logger.info("当前值："+resultCurrent);
					if(resultCurrent !=null) {
						String function = StringUtils.trim(ResourceProperty.getProperties("dataConvert.properties").getProperty(objectName+"."+fieldName));
						hashMap.put(function, resultCurrent);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		
		return hashMap;
	}
	
	
	
//	public static void main(String[] args) {
//		String function = ResourceProperty.getProperties("dataConvert.properties").getProperty("handControl.mpjs");
//		System.out.println(function);
//	}
	
	

}
