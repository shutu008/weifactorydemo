package com.vastsum.service;

import java.util.Date;
import java.util.List;

import com.vastsum.entity.HistoryInfo;

/**
 * 历史数据服务
* @author shensj
* @date 2018年3月15日 下午8:15:13
 */
public interface HistoryInfoService {

	/**
	 * 根据时间区间获取历史数据信息
	 * @param startDate
	 * @param endDate
	 * @return List<HistoryInfo>
	 */
	List<HistoryInfo> listByTime(Long batchId, Date startDate, Date endDate);
}
