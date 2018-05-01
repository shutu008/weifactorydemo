/**
 * 
 */
package com.vastsum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.dao.GrowthPatternParamMapper;
import com.vastsum.dao.ParamSetMapper;
import com.vastsum.entity.GrowthPatternParam;
import com.vastsum.entity.GrowthPatternParamExample;
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
	@Autowired
	private GrowthPatternParamMapper growthPatternParamMapper;

	/* 保存或更新参数设置信息
	 * @see com.vastsum.service.ParamSetService#saveOrUpdate(com.vastsum.entity.ParamSet)
	 */
	@Override
	public void saveOrUpdate(ParamSet paramSet) {
		if (paramSet.getParamSetId() == null) {
			paramSetMapper.insert(paramSet);
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

	@Override
	public void saveOrUpdateGrowthParam(GrowthPatternParam growthPatternParam) {
		if (growthPatternParam.getGrowthId() != null) {
			update(growthPatternParam);
		}else {
			save(growthPatternParam);
		}
		
	}
	
	//保存生长模式参数
	private void save(GrowthPatternParam growthPatternParam) {
		growthPatternParamMapper.insert(growthPatternParam);
	}
	
	//修改生长模式参数
	private void update(GrowthPatternParam growthPatternParam) {
		growthPatternParamMapper.updateByPrimaryKeySelective(growthPatternParam);
	}

	//根据生长模式来获取对应的列表
	@Override
	public List<GrowthPatternParam> listByGrowthNo(Integer growthNo) {
		GrowthPatternParamExample growthPatternParamExample = new GrowthPatternParamExample();
		growthPatternParamExample.createCriteria().andGrowthNoEqualTo(growthNo);
		growthPatternParamExample.setOrderByClause("growth_order desc");
		return growthPatternParamMapper.selectByExample(growthPatternParamExample);
	}

	//根据设备序列号获取最新的参数设置信息,有用的
	@Override
	public ParamSet getLastBySn(String sn) {
		ParamSetExample paramSetExample = new ParamSetExample();
		paramSetExample.createCriteria().andSnEqualTo(sn).andStatusEqualTo("1");
		paramSetExample.setOrderByClause("gmt_create desc");
		List<ParamSet> list = paramSetMapper.selectByExample(paramSetExample);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	//更改设置的参数设置状态
	@Override
	public void updateParamSetStatus(String sn, String status) {
		ParamSetExample paramSetExample = new ParamSetExample();
		paramSetExample.createCriteria().andSnEqualTo(sn);
		
		ParamSet paramSet = new ParamSet();
		paramSet.setStatus(status);
		paramSetMapper.updateByExampleSelective(paramSet, paramSetExample);
	}

	@Override
	public List<GrowthPatternParam> listGrowthAll() {
		GrowthPatternParamExample example = new GrowthPatternParamExample();
		return growthPatternParamMapper.selectByExample(example);
	}

}
