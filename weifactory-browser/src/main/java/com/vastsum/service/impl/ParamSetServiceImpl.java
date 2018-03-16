/**
 * 
 */
package com.vastsum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.dao.ParamSetMapper;
import com.vastsum.entity.ParamSet;
import com.vastsum.entity.ParamSetExample;
import com.vastsum.service.ParamSetService;

/**
* @author shensj
* @date 2018年3月15日 下午7:49:04
*/
@Service
public class ParamSetServiceImpl implements ParamSetService {
	
	@Autowired
	private ParamSetMapper paramSetMapper;

	/* 保存或更新参数设置信息
	 * @see com.vastsum.service.ParamSetService#saveOrUpdate(com.vastsum.entity.ParamSet)
	 */
	@Override
	public void saveOrUpdate(ParamSet paramSet) {
		if (paramSet.getParamSetId() != null) {
			paramSetMapper.insertSelective(paramSet);
		}else {
			paramSetMapper.updateByPrimaryKeySelective(paramSet);
		}
		
	}

	/* 根据参数设置的id获取参数设置信息
	 * @see com.vastsum.service.ParamSetService#getById(java.lang.Long)
	 */
	@Override
	public ParamSet getById(Long paramId) {
		return paramSetMapper.selectByPrimaryKey(paramId);
	}

	/* 根据批次id获取参数设置信息
	 * @see com.vastsum.service.ParamSetService#getByBatchId(java.lang.Long)
	 */
	@Override
	public ParamSet getByBatchId(Long batchId) {
		ParamSetExample paramSetExample = new ParamSetExample();
		paramSetExample.createCriteria().andBatchIdEqualTo(batchId);
		paramSetExample.setOrderByClause("gmt_create desc");
		List<ParamSet> list = paramSetMapper.selectByExample(paramSetExample);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

}
