package com.vastsum.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.SysParamMapper;
import com.vastsum.entity.SysParam;
import com.vastsum.entity.SysParamExample;
import com.vastsum.entity.SysParamExample.Criteria;
import com.vastsum.service.SysParamService;

@Service
public class SysParamImpl implements SysParamService {

	@Autowired
	private SysParamMapper sysParamMapper;
	
	@Override
	public int save(SysParam sysParam) {
		return sysParamMapper.insertSelective(sysParam);
	}

	@Override
	public int update(SysParam sysParam) {
		return sysParamMapper.updateByPrimaryKeySelective(sysParam);
	}

	@Override
	public int delete(Long paramId) {
		return sysParamMapper.deleteByPrimaryKey(paramId);
	}

	@Override
	public SysParam getByParamId(Long paramId) {
		return sysParamMapper.selectByPrimaryKey(paramId);
	}

	@Override
	public PageInfo<SysParam> listByPage(SysParam sysParam, Integer page, Integer pageSize) {
		SysParamExample sysParamExample = new SysParamExample();
		if (sysParam != null) {
			Criteria criteria = sysParamExample.createCriteria();
			if (StringUtils.isNotBlank(sysParam.getParamCode())) {
				criteria.andParamCodeLike("%"+sysParam.getParamCode()+"%");
			}
			
			if (StringUtils.isNotBlank(sysParam.getParamName())) {
				criteria.andParamNameLike("%"+sysParam.getParamName()+"%");
			}
			
			if (StringUtils.isNotBlank(sysParam.getParamValue())) {
				criteria.andParamValueLike("%"+sysParam.getParamValue()+"%");
			}
			
			if (StringUtils.isNotBlank(sysParam.getStatus())) {
				criteria.andStatusEqualTo(sysParam.getStatus());
			}
		}
		sysParamExample.setOrderByClause("sort asc");
		page = page == 0? 1:page;
		pageSize = pageSize == 0? 10:pageSize;
		PageHelper.startPage(page,pageSize);
		List<SysParam> list = sysParamMapper.selectByExample(sysParamExample);
			return new PageInfo<>(list);
		
	}

	@Override
	public List<SysParam> list(SysParam sysParam) {
		SysParamExample sysParamExample = new SysParamExample();
		if (sysParam != null) {
			Criteria criteria = sysParamExample.createCriteria();
			if (StringUtils.isNotBlank(sysParam.getParamCode())) {
				criteria.andParamCodeLike("%"+sysParam.getParamCode()+"%");
			}
			
			if (StringUtils.isNotBlank(sysParam.getParamName())) {
				criteria.andParamNameLike("%"+sysParam.getParamName()+"%");
			}
			
			if (StringUtils.isNotBlank(sysParam.getParamValue())) {
				criteria.andParamValueLike("%"+sysParam.getParamValue()+"%");
			}
			
			if (StringUtils.isNotBlank(sysParam.getStatus())) {
				criteria.andStatusEqualTo(sysParam.getStatus());
			}
		}
		sysParamExample.setOrderByClause("sort asc");
		List<SysParam> list = sysParamMapper.selectByExample(sysParamExample);
		return list;
	}

	//获取可以的参数列表
	@Override
	public List<SysParam> listByStatus(boolean status) {
		SysParam sysParam = new SysParam();
		if (status) {
			sysParam.setStatus("1");
		}else{
			sysParam.setStatus("0");
		}
		return this.list(sysParam);
	}

}
