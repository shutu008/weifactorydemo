package com.vastsum.server.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.vastsum.entity.DeviceSn;
import com.vastsum.entity.HistoryInfo;
import com.vastsum.server.DeviceService;

/**
 * @author ssj
 * @create 2017-10-08 19:52
 */
@Service(value = "deviceService")
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //根据设备序列号，查询设备信息
    @Override
    public DeviceSn getBySn(String sn) {
        DeviceSn deviceSn = (DeviceSn)jdbcTemplate.queryForObject("select * from device_sn where sn = ?",
                new Object[]{sn},
                new RowMapper<Object>() {
                    @Override
                    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                        DeviceSn deviceSn = new DeviceSn();
                        deviceSn.setSn(resultSet.getString("sn"));
                        deviceSn.setStatus(Integer.parseInt(resultSet.getString("status")));
                        deviceSn.setGmtCreate(resultSet.getDate("gmt_create"));
                        return deviceSn;
                    }
                });
        return deviceSn;
    }

    //更新设备状态
    @Override
    public int updateDeviceSnStatus(DeviceSn deviceSn) {
        int update = jdbcTemplate.update("update device_sn set status = ? where sn = ?",
                deviceSn.getStatus(), deviceSn.getSn());
        return update;
    }

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

	@Override
	public void updateHistoryInfoByHistoryNo(HistoryInfo historyInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveHistoryInfo(HistoryInfo historyInfo) {
		// TODO Auto-generated method stub
		
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
