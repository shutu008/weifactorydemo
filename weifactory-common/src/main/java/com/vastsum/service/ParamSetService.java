/**
 * 
 */
package com.vastsum.service;

import java.util.List;

import com.vastsum.entity.GrowthPatternParam;
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
	
	/**
	 * 根据设备序列号获取最新的参数设置信息
	 * @param sn
	 * @return ParamSet
	 */
	ParamSet getLastBySn(String sn);
	
	/**
	 * 更改参数设置状态
	 * @param sn
	 * @param status
	 */
	void updateParamSetStatus(String sn,String status);
	
	
	
	/**
	 * 添加或修改一个参数
	 * @param growthPatternParam
	 */
	void saveOrUpdateGrowthParam(GrowthPatternParam growthPatternParam);
	
	/**
	 * 按照生长模式查询参数设置
	 * @param growthNo
	 * @return List<GrowthPatternParam>
	 */
	List<GrowthPatternParam> listByGrowthNo(Integer growthNo);
	
	

}
