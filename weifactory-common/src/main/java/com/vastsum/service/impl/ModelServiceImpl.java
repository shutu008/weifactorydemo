package com.vastsum.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.ModelMapper;
import com.vastsum.entity.ModelExample;
import com.vastsum.entity.UserRole;
import com.vastsum.service.ModelService;
import com.vastsum.dao.UserRoleMapper;
import com.vastsum.entity.Model;
import com.vastsum.entity.UserRoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 模型库管理，每个用户只能有5条可用模型库
 * @author ssj
 * @create 2017-10-22 8:19
 */
@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public Integer saveModel(Model model) {
       return modelMapper.insertSelective(model);
    }

    @Override
    public Integer updateModel(Model model) {
        return modelMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public Integer deleteModel(Integer modelId) {
        return modelMapper.deleteByPrimaryKey(modelId);
    }

    @Override
    public Model getModelById(Integer modelId) {
        return modelMapper.selectByPrimaryKey(modelId);
    }

    @Override
    public PageInfo<Model> listModels(Model model, Integer page, Integer pageSize) {
        ModelExample modelExample = new ModelExample();
        ModelExample.Criteria criteria = modelExample.createCriteria()
                .andModelNameLike("%" + model.getModelName() + "%")
                .andStatusEqualTo(true);
        //根据用户id获取用户的权限
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(model.getUserId());
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        UserRole userRole = userRoles.get(0);
        //如果不是管理员，根据用户搜索
        if (userRole.getRoleId() != 1){
            criteria.andUserIdEqualTo(model.getUserId());
        }
        modelExample.setOrderByClause("gmt_modified desc");
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<Model> models = modelMapper.selectByExample(modelExample);
        return new PageInfo<>(models);
    }

    @Override
    public PageInfo<Model> listModelsByUserId(Integer userId, Integer page, Integer pageSize) {
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        ModelExample modelExample = new ModelExample();
        modelExample.createCriteria()
                .andUserIdEqualTo(userId)
                .andStatusEqualTo(true);
        PageHelper.startPage(page,pageSize);
        List<Model> models = modelMapper.selectByExample(modelExample);
        return new PageInfo<>(models);
    }
}
