package com.vastsum.service;

import java.util.HashMap;

import com.vastsum.entity.HandControl;

/**
 * 手动控制接口
* @author shensj
* @date 2018年3月15日 下午7:57:20
 */
public interface HandControlService {
	
	/**
	 * 根据id获取手动控制信息
	 * @param headControlId
	 * @return HandControl
	 */
	HandControl getById(Long headControlId);
	
	/**
	 * 根据批次id获取手动控制信息
	 * @param batchId
	 * @return HandControl
	 */
	HandControl getByBatchId(Long batchId);
	
	
	/**
	 * 更新或保存手动控制信息 
	 * @param handControl
	 */
	void saveOrUpdate(HandControl handControl);
	
	/**
	 * 生成包含所有与数据库不对应的标记
	 * @param handControl
	 * @return
	 */
	public HashMap<String,Object> changeOrder(HandControl handControl);
	

}
