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
		return list;
	}

}
