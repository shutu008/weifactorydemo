package com.vastsum.service;

import com.vastsum.entity.Experiment;

import java.util.List;

/**
 * @author shutu008
 */
public interface ExperimentService {
    /**
     * 根据设备id查询实验信息
     * @param deviceId
     * @return 所有实验信息
     */
    List<Experiment> findByDeviceId(Integer deviceId);

    /**
     * 添加实验数据
     * @param experiment
     * @return 实验添加状态1：成功，0失败
     */
    int add(Experiment experiment);

    /**
     * 更新实验数据
     * @param experiment
     * @return 实验更新状态1：成功，0失败
     */
    int update(Experiment experiment);

    /**
     * 根据实验id查询实验详情信息
     * @param experimentId
     * @return 根据id查询的实验信息
     */
    Experiment findExperimentByexperId(Integer experimentId);

    /**
     * 根据实验id删除实验信息
     * @param experimentId
     * @return 返回删除状态1：成功，0失败
     */
    int deleteExperimentByexperId(Integer experimentId);
}
