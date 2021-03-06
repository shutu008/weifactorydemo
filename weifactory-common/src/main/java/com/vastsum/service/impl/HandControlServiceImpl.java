package com.vastsum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.dao.HandControlMapper;
import com.vastsum.entity.HandControl;
import com.vastsum.entity.HandControlExample;
import com.vastsum.service.HandControlService;


/**
 * 机器手动控制服务器
* @author shensj
* @date 2018年3月15日 下午8:05:20
 */
@Service
public class HandControlServiceImpl implements HandControlService {
	
	@Autowired
	private HandControlMapper handControlMapper;
		
	@Override
	public HandControl getById(Long handControlId) {
		return handControlMapper.selectByPrimaryKey(handControlId);
	}

	@Override
	public HandControl getByBatchId(Long batchId) {
		HandControlExample handControlExample = new HandControlExample();
		handControlExample.createCriteria().andBatchIdEqualTo(batchId).andStatusEqualTo("1");
		handControlExample.setOrderByClause("gmt_create desc");
		List<HandControl> list = handControlMapper.selectByExample(handControlExample);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	//保存或更新手动控制
	@Override
	public void saveOrUpdate(HandControl handControl) {
		if (handControl.getHandControlId() == null) {
			handControlMapper.insertSelective(handControl);
		}
		handControlMapper.updateByPrimaryKeySelective(handControl);
	}

	//更新手动控制状态
	@Override
	public void updateHandControlStatus(String sn, String status) {
		HandControl handControl = new HandControl();
		handControl.setStatus(status);
		
		HandControlExample handControlExample = new HandControlExample();
		handControlExample.createCriteria().andSnEqualTo(sn);
		handControlMapper.updateByExampleSelective(handControl, handControlExample);
		
	}
	

}
