/**
 * 
 */
package com.vastsum.service.impl;

import java.text.DateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.dao.FeedParamSetMapper;
import com.vastsum.dao.GrowthPatternParamMapper;
import com.vastsum.dao.ParamSetMapper;
import com.vastsum.entity.FeedParamSet;
import com.vastsum.entity.FeedParamSetExample;
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
	@Autowired
	private FeedParamSetMapper feedParamSetMapper;

	/* 保存或更新参数设置信息
	 * @see com.vastsum.service.ParamSetService#saveOrUpdate(com.vastsum.entity.ParamSet)
	 */
	@Override
	public void saveOrUpdate(ParamSet paramSet) {
		if (paramSet.getParamSetId() == null) {
			paramSet.setStatus("1");
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
		growthPatternParamMapper.insertSelective(growthPatternParam);
	}
	
	//修改生长模式参数
	private void update(GrowthPatternParam growthPatternParam) {
		growthPatternParamMapper.updateByPrimaryKeySelective(growthPatternParam);
	}

	//根据生长模式来获取对应的列表
	@Override
	public List<GrowthPatternParam> listByGrowthNo(String plantNo, Integer growthNo) {
		GrowthPatternParamExample growthPatternParamExample = new GrowthPatternParamExample();
		growthPatternParamExample.createCriteria()
		.andGrowthNoEqualTo(growthNo)
		.andPlantNoEqualTo(plantNo);
		growthPatternParamExample.setOrderByClause("growth_order asc");
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

	@Override
	public void deleteBySn(String sn) {
		ParamSetExample example = new ParamSetExample();
		example.createCriteria().andSnEqualTo(sn);
		paramSetMapper.deleteByExample(example);
	}

	@Override
	public void saveOrUpdateFeedParamSet(FeedParamSet feedParamSet) {
		if (feedParamSet.getFeedParamId() == null) {
			saveFeedParamSet(feedParamSet);
		}else {
			updateFeedParamSet(feedParamSet);
		}
	}

	@Override
	public FeedParamSet getByPlantId(String plantId) {
		FeedParamSetExample example = new FeedParamSetExample();
		example.createCriteria().andPlantIdEqualTo(plantId);
		example.setOrderByClause("gmt_create desc");
		List<FeedParamSet> selectByExample = feedParamSetMapper.selectByExample(example);
		
		if (selectByExample == null || selectByExample.isEmpty()) {
			return null;
		}
		return selectByExample.get(0);
	}
	
	private void saveFeedParamSet(FeedParamSet feedParamSet) {
		feedParamSetMapper.insertSelective(feedParamSet);
	}
	
	private void updateFeedParamSet(FeedParamSet feedParamSet) {
		feedParamSetMapper.updateByPrimaryKeySelective(feedParamSet);
	}

	//更新页面植物工厂的时间显示20180529201945
	@Override
	public void updateParamDeviceTime(String sn, String date) {
		ParamSet paramSet = getLastBySn(sn);
		String year = date.substring(0, 4);
		String mounth = date.substring(4,6);
		String day = date.substring(6,8);
		String hours = date.substring(8,10);
		String miniment = date.substring(10,12);
		String ss = date.substring(12,14);
		String newTime = year+"-"+mounth+"-"+day+" "+hours+":"+miniment+":"+ss;
		paramSet.setDaySet(newTime);
		saveOrUpdate(paramSet);
	}
}
