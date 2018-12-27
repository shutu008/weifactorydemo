package com.vastsum.server;

import java.util.Map;

/**
 * @author ssj
 * @create 2017-10-08 19:51
 * 基础功能服务
 */
public interface DeviceService {

    
    /**
     * 根据批次id获取设备信息
     * @param batchId
     * @return String
     */
    String getSnByBatchId(Long batchId);
    
    /**
     * 根据设备id获取设备序列号
     * @param deviceId
     * @return String
     */
    String getSnByDeviceId(Integer deviceId);
    
    
    /**
     * 根据设备序列号获取设备id
     * @param sn
     * @return Integer
     */
    Integer getDeviceIdBySn(String sn);
    
    /**
     * 根据设备id获取批次信息
     * @param deviceId
     * @return Batch
     */
    Map<String, Object> getLastByDeviceId(Integer deviceId);
    
    /**
     * 根据批次id获取设备id
     * @param batchId
     * @return Long
     */
    Integer getDeviceIdByBatchId(Long batchId);
    
    /**
     * 根据历史数据号获取历史数据id,主要用于通过历史数据号是更新数据还是插入数据
     * @param historyNo
     * @return Long
     */
    Long getHistoryIdByHistoryNo(String historyNo);
    
   
}
