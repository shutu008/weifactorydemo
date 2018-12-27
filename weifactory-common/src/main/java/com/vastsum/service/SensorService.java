package com.vastsum.service;

import java.util.HashMap;

import com.vastsum.entity.GrowthPatternParam;
import com.vastsum.entity.HandControl;
import com.vastsum.entity.ParamSet;

/**
 * 通信数据处理
 * @author shutu008
 *
 */
public interface SensorService {
	
	/**
	 * 下发参数设置信息
	 * @param paramSet
	 * @return HashMap<String,Object>
	 */
	HashMap<String,Object> changeOrder(ParamSet paramSet);
	
	/**
	 * 下发生长模式参数设置信息
	 * @param growthPatternParam
	 * @return HashMap<String,Object>
	 */
	HashMap<String,Object> changeOrder( GrowthPatternParam growthPatternParam);
	
	/**
	 * 获取植物工厂时间
	 * @return HashMap<String, Object>
	 */
	HashMap<String, Object> getDeviceTime(String sn);

	/**
	 * 手动控制
	 * @param handControl
	 * @return
	 */
	HashMap<String, Object> changeOrder(HandControl handControl);


}
