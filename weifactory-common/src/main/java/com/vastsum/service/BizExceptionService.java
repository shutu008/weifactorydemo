package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.BizException;

import java.util.List;

/**
 * 业务异常服务
 * @author ssj
 * @create 2017-11-17 22:03
 */
public interface BizExceptionService {
	
	/**
	 * 保存业务异常信息
	 * @param function 传感器标识
	 * @param sn 设备序列号
	 * @param data 数据
	 */
	void save(String function, String sn, String data);

    /**
     * 列出所有业务异常
     * @return List<BizException>
     */
    List<BizException> listAll();

    /**
     * 列出和传入的用户id相关的异常。
     * @param userId
     * @return List<BizException>
     */
    List<BizException> listByUserId(int userId);

    /**
     * 根据设备序列号列出相关异常
     * @param sn
     * @return List<BizException>
     */
    List<BizException> listBySn(String sn);

    /**
     * 根据条件列出业务异常
     * @param bizException
     * @return List<BizException>
     */
    List<BizException> listByBizException(BizException bizException);

    /**
     * 根据条件分页列出异常信息
     * @param bizException
     * @return PageInfo<BizException>
     */
    PageInfo<BizException> pageByBizException(BizException bizException, int page, int pageSize);

    /**
     * 根据id获取业务异常
     * @param exceptionId
     * @return BizException
     */
    BizException getById(long exceptionId);

    /**
     * 根据异常id删除对应异常
     * @param exceptionId
     * @return int
     */
    int delete(long exceptionId);
    
    
}
