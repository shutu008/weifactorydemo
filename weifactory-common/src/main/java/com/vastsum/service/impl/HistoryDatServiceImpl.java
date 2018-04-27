package com.vastsum.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.dao.HistoryDataMapper;
import com.vastsum.entity.HistoryData;
import com.vastsum.entity.HistoryDataExample;
import com.vastsum.service.HistoryDataService;

@Service
public class HistoryDatServiceImpl implements HistoryDataService {

	
	
	@Autowired
	private HistoryDataMapper historyDataMapper;
	
	//根据时间区间查询历史数据
	@Override
	public List<HistoryData> listByTime(String sn,String identify, Date startDate, Date endDate) {
		HistoryDataExample historyDataExample = new HistoryDataExample();
		historyDataExample.createCriteria()
		.andServerTimeBetween(startDate, endDate)
		.andIdentifyEqualTo(identify);
		historyDataExample.setOrderByClause("server_time asc");
		List<HistoryData> list = historyDataMapper.selectByExample(historyDataExample);
		//判断，如果开始时间小于第一条时间，则开始时间为传入的时间，并且纵坐标为0
		//如果结束时间，大于查询出来的结束时间，则结束时间的纵坐标点为0
		if (!list.isEmpty()) {
			HistoryData startPoint = list.get(0);
			HistoryData endPoint = list.get(list.size() - 1);
			if (startPoint.getServerTime().after(startDate)) {
				list.add(0, getZero(startDate, identify,  sn));
			}
			if (endPoint.getServerTime().before(endDate)) {
				list.add( getZero(endDate, identify, sn));
			}
		}
		return list;
	}
	
	private HistoryData getZero(Date date, String identify, String sn){
		HistoryData historyData = new HistoryData();
		historyData.setSn(sn);
		historyData.setDeviceTime(date);
		historyData.setIdentify(identify);
		historyData.setServerTime(date);
		historyData.setValue("0");
		return historyData;
	}

}
