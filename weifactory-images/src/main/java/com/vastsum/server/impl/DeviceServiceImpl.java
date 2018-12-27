package com.vastsum.server.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.vastsum.server.DeviceService;

/**
 * @author ssj
 * @create 2017-10-08 19:52
 */
@Service(value = "deviceService")
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //根据批次id获取设备序列号
	@Override
	public String getSnByBatchId(Long batchId) {
		Integer deviceId = getDeviceIdByBatchId(batchId);
		return getSnByDeviceId(deviceId);
	}
	

	//根据设备序列号获取设备id
	@Override
	public Integer getDeviceIdBySn(String sn) {
		//获取设备id
		String snSql = "select sn,device_id from device where sn = ? order by gmt_create desc limit 1 ";
		Map<String, Object> forMap = jdbcTemplate.queryForMap(snSql, sn);
		if(forMap == null || forMap.isEmpty()){
			return null;
		}
		Object deviceId = forMap.get("device_id");
		return (Integer)deviceId;
	}

	//根据设备id获取最新的批次信息
	@Override
	public Map<String,Object> getLastByDeviceId(Integer deviceId) {
		String sql = "select b.* from batch as b left join device as d on b.device_id = d.device_id where b.device_id = ? order by gmt_create desc limit 1";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql, deviceId);
		return map;
	}

	//根据批次id查询出设备id
	@Override
	public Integer getDeviceIdByBatchId(Long batchId) {
		Map<String, Object> map = jdbcTemplate.queryForMap("select device_id from batch where batch_id = ?", batchId);
		if(map == null || map.isEmpty()){
			return null;
		}
		Integer deviceId = (Integer)map.get("device_id");
		return deviceId;
	}


	//根据设备id获取设备序列号
	@Override
	public String getSnByDeviceId(Integer deviceId) {
		Map<String, Object> map = jdbcTemplate.queryForMap("select sn from device where device_id = ?", deviceId); 
		if(map == null || map.isEmpty()){
			return null;
		}
		return (String)map.get("sn");
	}

	//根据历史数据号获取历史数据
	@Override
	public Long getHistoryIdByHistoryNo(String historyNo) {
		String sql = "select history_id from history_info where history_no = ?";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql, historyNo);
		return (Long)mapFor("history_id", map);
	}
	/**
	 * 根据key获取值
	 * @param key
	 * @param map
	 * @return Object
	 */
	private Object mapFor(String key, Map<String, Object> map){
		if(map == null || map.isEmpty()){
			return null;
		}
		return map.get(key);
	}
}
