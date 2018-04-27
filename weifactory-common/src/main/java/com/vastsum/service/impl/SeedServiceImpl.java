package com.vastsum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.SeedMapper;
import com.vastsum.entity.Seed;
import com.vastsum.entity.SeedExample;
import com.vastsum.service.SeedService;


/**
 * 育苗室管理
*  
* @author shensj 
* @date 2018年3月14日 下午9:22:32 
*
 */
@Service
public class SeedServiceImpl implements SeedService {
	
	@Autowired
	private SeedMapper seedMapper;

	@Override
	public void add(Seed seed) {
		seedMapper.insertSelective(seed);
	}

	@Override
	public void update(Seed seed) {
		seedMapper.updateByPrimaryKeySelective(seed);
	}

	@Override
	public Seed getById(Long seedId) {
		return seedMapper.selectByPrimaryKey(seedId);
	}

	@Override
	public void delete(Long seedId) {
		seedMapper.deleteByPrimaryKey(seedId);
	}

	@Override
	public List<Seed> listAll() {
		SeedExample seedExample = new SeedExample();
		seedExample.setOrderByClause("gmt_create desc");
		List<Seed> list = seedMapper.selectByExample(seedExample);
		return list;
	}

	@Override
	public PageInfo<Seed> pageBybatchId(Long batchId,Integer page, Integer pageSize) {
		SeedExample seedExample = new SeedExample();
		seedExample.createCriteria().andBatchIdEqualTo(batchId);
		seedExample.setOrderByClause("gmt_create desc");
		return pageInfo(seedExample, page, pageSize);
	}

	@Override
	public Seed getLastByBatchId(Long batchId) {
		SeedExample seedExample = new SeedExample();
		seedExample.createCriteria().andBatchIdEqualTo(batchId)
		.andStatusEqualTo("1");
		seedExample.setOrderByClause("gmt_create desc");
		return getByExample(seedExample);
	}
	
	
	private PageInfo<Seed> pageInfo(SeedExample seedExample,Integer page, Integer pageSize){
		page = (page == 0 || page== null)? 1:page;
        pageSize = (pageSize == 0 || pageSize == null)? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<Seed> list = seedMapper.selectByExample(seedExample);
		return new PageInfo<>(list);
	}
	
	private Seed getByExample(SeedExample seedExample){
		List<Seed> list = seedMapper.selectByExample(seedExample);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public void abandonSeed(Long seedId) {
		Seed seed = new Seed();
		seed.setSeedId(seedId);
		seed.setStatus("0");
		update(seed);
	}

}
