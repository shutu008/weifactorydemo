package com.vastsum.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.service.DeviceService;
import com.vastsum.dao.BizExceptionMapper;
import com.vastsum.entity.BizException;
import com.vastsum.entity.BizExceptionExample;
import com.vastsum.service.BizExceptionService;
import com.vastsum.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ssj
 * @create 2017-11-17 22:15
 */
@Service
public class BizExceptionServiceImpl implements BizExceptionService {

    @Autowired
    private BizExceptionMapper bizExceptionMapper;

    @Autowired
    private RoleService roleService;
    @Autowired
    private DeviceService deviceService;

    //列出所有的业务异常信息
    @Override
    public List<BizException> listAll() {
        BizExceptionExample bizExceptionExample = new BizExceptionExample();
        bizExceptionExample.setOrderByClause("exception_id desc");
        List<BizException> bizExceptions = bizExceptionMapper.selectByExample(bizExceptionExample);
        return bizExceptions;
    }

    //列出和用户相关的异常
    @Override
    public List<BizException> listByUserId(int userId) {
        BizExceptionExample bizExceptionExample = new BizExceptionExample();
        bizExceptionExample.createCriteria().andUserIdEqualTo(userId);
        bizExceptionExample.setOrderByClause("exception_id desc");
        List<BizException> bizExceptions = bizExceptionMapper.selectByExample(bizExceptionExample);
        return bizExceptions;
    }

    //根据设备序列号获取相关异常
    @Override
    public List<BizException> listBySn(String sn) {
        BizExceptionExample bizExceptionExample = new BizExceptionExample();
        bizExceptionExample.createCriteria().andSnEqualTo(sn);
        bizExceptionExample.setOrderByClause("exception_id desc");
        List<BizException> bizExceptions = bizExceptionMapper.selectByExample(bizExceptionExample);
        return bizExceptions;
    }

    //根据条件获取异常列表
    @Override
    public List<BizException> listByBizException(BizException bizException) {
        BizExceptionExample bizExceptionExample = new BizExceptionExample();
        BizExceptionExample.Criteria criteria = bizExceptionExample.createCriteria();
        //首先保证userid是必须要传的值
        int userId = bizException.getUserId();
        //根据用户id获取用户的角色，如果角色等于超级管理员，列出所有的异常信息
       if (!roleService.isAdminByUserId(userId)){
           criteria.andUserIdEqualTo(userId);
       }
       String sn = bizException.getSn();
       if (sn != null){
           criteria.andSnEqualTo(sn);
       }

       Integer sensorId = bizException.getSensorNo();
       if (sensorId != null){
           criteria.andSensorNoEqualTo(sensorId);
       }

       Integer exceptionType = bizException.getExceptionType();
       if (exceptionType != null){
           criteria.andExceptionTypeEqualTo(exceptionType);
       }
        List<BizException> bizExceptions = bizExceptionMapper.selectByExample(bizExceptionExample);
        return bizExceptions;
    }

    //根据条件分页列出所有的异常
    @Override
    public PageInfo<BizException> pageByBizException(BizException bizException, int page, int pageSize) {

        BizExceptionExample bizExceptionExample = new BizExceptionExample();
        BizExceptionExample.Criteria criteria = bizExceptionExample.createCriteria();
        //首先保证userid是必须要传的值
        int userId = bizException.getUserId();
        //根据用户id获取用户的角色，如果角色等于超级管理员，列出所有的异常信息
        if (!roleService.isAdminByUserId(userId)){
            criteria.andUserIdEqualTo(userId);
        }
        String sn = bizException.getSn();
        if (sn != null){
            criteria.andSnEqualTo(sn);
        }

        Integer sensorId = bizException.getSensorNo();
        if (sensorId != null){
            criteria.andSensorNoEqualTo(sensorId);
        }

        Integer exceptionType = bizException.getExceptionType();
        if (exceptionType != null){
            criteria.andExceptionTypeEqualTo(exceptionType);
        }

        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<BizException> bizExceptions = bizExceptionMapper.selectByExample(bizExceptionExample);
        return new PageInfo<>(bizExceptions);
    }

    @Override
    public BizException getById(long exceptionId) {
        return bizExceptionMapper.selectByPrimaryKey(exceptionId);
    }

    @Override
    public int delete(long exceptionId) {
        return bizExceptionMapper.deleteByPrimaryKey(exceptionId);
    }
}
