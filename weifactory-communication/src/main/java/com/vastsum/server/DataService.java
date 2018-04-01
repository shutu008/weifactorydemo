package com.vastsum.server;

import com.vastsum.entity.BizException;
import com.vastsum.entity.HistoryInfo;
import com.vastsum.entity.SensorCollection;

/**
 * @author ssj
 * @create 2017-09-25 21:57
 */
public interface DataService {

    /**
     * 通信采集的数据，插入到表中
     * @param sensorCollection
     * @return int
     */
	@Deprecated
    int insert(SensorCollection sensorCollection);
	
	/**
	 * 更新历史数据信息
	 * @param historyInfo
	 * @return void
	 */
	void update(HistoryInfo historyInfo) throws Exception;

    /**
     * 获取任务调度开始的位置
     * @return int
     */
    int getTempSensorId();

    /**
     * 业务异常数据插入到数据库中
     * @param bizExption
     * @return int
     */
    int exceptionInsert(BizException bizExption);

    /**
     * 业务数据异常插入到数据库中
     * @param sensorCollection
     * @return int
     */
    int bizExceptionSave(SensorCollection sensorCollection);
}
