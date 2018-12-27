package com.vastsum.server.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.dao.HistoryDataMapper;
import com.vastsum.entity.HistoryData;
import com.vastsum.server.HistroyDataService;

@Service(value = "historyDataService")
public class HistoryDataServiceImpl implements HistroyDataService{

	@Autowired
	private HistoryDataMapper historyDataMapper;
	
	@Override
	public int save(HistoryData historyData) {
		return historyDataMapper.insertSelective(historyData);
	}
	
}