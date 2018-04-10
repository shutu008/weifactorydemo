package com.vastsum.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.dao.HistoryInfoMapper;
import com.vastsum.entity.HistoryInfo;
import com.vastsum.entity.HistoryInfoExample;
import com.vastsum.service.HistoryInfoService;

@Service
public class HistoryInfoServiceImpl implements HistoryInfoService {

	
	@Autowired
	private HistoryInfoMapper historyInfoMapper;
	
	//根据时间区间查询历史数据
	@Override
	public List<HistoryInfo> listByTime(Long batchId, Date startDate, Date endDate) {
		HistoryInfoExample historyInfoExample = new HistoryInfoExample();
		historyInfoExample.createCriteria().andGmtCreateBetween(startDate, endDate);
		historyInfoExample.setOrderByClause("gmt_create asc");
		List<HistoryInfo> list = historyInfoMapper.selectByExample(historyInfoExample);
		//判断，如果开始时间小于第一条时间，则开始时间为传入的时间，并且纵坐标为0
		//如果结束时间，大于查询出来的结束时间，则结束时间的纵坐标点为0
		if (!list.isEmpty()) {
			HistoryInfo startPoint = list.get(0);
			HistoryInfo endPoint = list.get(list.size() - 1);
			if (startPoint.getGmtCreate().after(startDate)) {
				list.add(0, getZero(startDate));
			}
			if (endPoint.getGmtCreate().before(endDate)) {
				list.add( getZero(endDate));
			}
		}
		return list;
	}
	
	private HistoryInfo getZero(Date date){
		HistoryInfo a = new HistoryInfo();
		a.setGmtCreate(date);
		a.setOneHumidity(0.0);
		a.setOneLed1("0");
		a.setOneLed2("0");
		a.setOneLed3("0");
		a.setOneTemperature(0.0);
		a.setOneYy("0");
		a.setTwoHumidity(0.0);
		a.setTwoLed1("0");
		a.setTwoLed2("0");
		a.setTwoLed3("0");
		a.setTwoTemperature(0.0);
		a.setTwoYy("0");
		a.setThreeHumidity(0.0);
		a.setThreeLed1("0");
		a.setThreeLed2("0");
		a.setThreeLed3("0");
		a.setThreeTemperature(0.0);
		a.setThreeYy("0");
		return a;
	}

}
