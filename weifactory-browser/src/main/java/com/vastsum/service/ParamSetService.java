/**
 * 
 */
package com.vastsum.service;

import com.vastsum.entity.ParamSet;

/**
 * 系统业务参数设置管理
* @author shensj
* @date 2018年3月15日 下午7:44:42
*/
public interface ParamSetService {
	
	
	/**
	 * 添加或保存参数设置数据
	 */
	void saveOrUpdate(ParamSet paramSet);
	
	/**
	 * 根据参数id获取参数信息
	 * @param paramId
	 * @return ParamSet
	 */
	ParamSet getById(Long paramId);
	
	
	/**
	 * 根据批次id获取参数设置的信息
	 * @param batchId
	 * @return ParamSet
	 */
	ParamSet getByBatchId(Long batchId);
	

}
