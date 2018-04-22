package com.vastsum.server.Impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.vastsum.entity.CommunicationMessage;
import com.vastsum.server.HistroyDataService;

@Service(value = "historyDataService")
public class HistoryDataServiceImpl implements HistroyDataService{

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	private String tableName = "history_data";
	
	@Override
	public int save(CommunicationMessage cm) {
		String sql = "INSERT INTO " + tableName + "sn, identify, value, server_time, device_time"
				+ "VALUES(?,?,?,?,?)";
		int i = jdbcTemplate.update(sql,
				cm.getSn(),
				cm.getFunction().toString(),
				cm.getData(),
				new Date(),
				cm.getTime());
		return i;
	}
	
}