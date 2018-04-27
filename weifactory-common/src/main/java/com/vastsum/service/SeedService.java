package com.vastsum.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.Seed;

/**
 * 
* @Description: 育苗室管理
* @author shensj 
* @date 2018年3月14日 下午9:01:42 
*
 */
public interface SeedService {

	
	
	/**
	 * 添加育苗室
	 * @param seed
	 */
	void add(Seed seed);
	
	/**
	 * 修改育苗室信息
	 * @param seed
	 */
	void update(Seed seed);
	
	/**
	 * 根据育苗室id查询育苗室信息
	 * @param seedId
	 * @return Seed
	 */
	Seed getById(Long seedId);
	
	/**
	 * 根据id删除育苗室信息
	 * @param seedId
	 */
	void delete(Long seedId);
	
	/**
	 * 列出所有育苗室信息
	 * @return List<Seed>
	 */
	List<Seed> listAll();
	
	/**
	 * 根据批次id获取育苗室列表
	 * @param batchId
	 * @param page
	 * @param pageSize
	 * @return PageInfo<Seed>
	 */
	PageInfo<Seed> pageBybatchId(Long batchId,Integer page, Integer pageSize);
	
	/**
	 * 根据批次id获取最新的育苗室
	 * @param batchId
	 * @return Seed
	 */
	Seed getLastByBatchId(Long batchId);
	
	/**
	 * 废弃育苗批次
	 * @param seedId
	 */
	void abandonSeed(Long seedId);
	
}
