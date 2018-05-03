package com.vastsum.service;

import java.util.Date;
import java.util.List;

import com.vastsum.entity.HistoryData;

/**
 * 历史数据服务
* @author shensj
* @date 2018年3月15日 下午8:15:13
 */
public interface HistoryDataService {

	/**
	 * 根据时间区间获取历史数据信息
	 * @param sn
	 * @param identity
	 * @param startDate
	 * @param endDate
	 * @return List<HistoryData>
	 */
	List<HistoryData> listByTime(String sn,String identity, Date startDate, Date endDate);
	
	/**
	 * 根据数据标识，获取最新的数据信息
	 * @param sn
	 * @param function
	 * @return String
	 */
	String getDataBySnAndFunction(String sn, String function);
}
