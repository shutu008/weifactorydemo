package com.vastsum.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.SysParam;

/**
 * 系统参数管理
 * @author shutu008
 *
 */
public interface SysParamService {
	
	/**
	 * 保存系统参数
	 * @param sysParam
	 * @return int
	 */
	int save(SysParam sysParam);
	
	/**
	 * 修改系统参数（必须包含主键）
	 * @param sysParam
	 * @return int
	 */
	int update(SysParam sysParam);
	
	/**
	 * 删除系统参数
	 * @param paramId
	 * @return int
	 */
	int delete(Long paramId);
	
	/**
	 * 根据参数id查询系统参数详细信息
	 * @param paramId
	 * @return SysParam
	 */
	SysParam getByParamId(Long paramId);
	
	/**
	 * 分页列出系统参数信息
	 * @param sysParam
	 * @param page
	 * @param pageSize
	 * @return PageInfo<SysParam>
	 */
	PageInfo<SysParam> listByPage(SysParam sysParam, Integer page, Integer pageSize);
	
	/**
	 * 根据条件列出系统参数信息
	 * @param sysParam
	 * @return List<SysParam>
	 */
	List<SysParam> list(SysParam sysParam);
	
	/**
	 * 获取可用的参数列表
	 * @param status
	 * @return List<SysParam>
	 */
	List<SysParam> listByStatus(boolean status);

}
