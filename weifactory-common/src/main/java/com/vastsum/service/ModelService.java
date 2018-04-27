package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.Model;

/**
 * 用户设置模型库，用于阈值提醒
 * @author ssj
 * @create 2017-10-22 8:05
 */
public interface ModelService {

    /**
     * 保存模型
     * @param model
     * @return Integer
     */
    Integer saveModel(Model model);

    /**
     * 更改模型库
     * @param model
     * @return Integer
     */
    Integer updateModel(Model model);

    /**
     * 删除模型库
     * @param modelId
     * @return Integer
     */
    Integer deleteModel(Integer modelId);

    /**
     * 根据模型库id,查询模型库
     * @param modelId
     * @return Model
     */
    Model getModelById(Integer modelId);

    /**
     * 根据条件查询模型库
     * @param model
     * @param page
     * @param pageSize
     * @return PageInfo<Model>
     */
    PageInfo<Model> listModels(Model model, Integer page, Integer pageSize);

    /**
     * 根据用户id查询模型库
     * @param userId
     * @param page
     * @param pageSize
     * @return PageInfo<Model>
     */
    PageInfo<Model> listModelsByUserId(Integer userId, Integer page, Integer pageSize);
}
