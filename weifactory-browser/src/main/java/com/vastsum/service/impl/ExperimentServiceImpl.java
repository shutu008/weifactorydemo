package com.vastsum.service.impl;

import com.vastsum.dao.ExperimentMapper;
import com.vastsum.entity.Experiment;
import com.vastsum.entity.ExperimentExample;
import com.vastsum.service.ExperimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperimentServiceImpl implements ExperimentService {

    @Autowired
    private ExperimentMapper experimentMapper;

    @Override
    public List<Experiment> findByDeviceId(Integer deviceId) {
        ExperimentExample experimentExample = new ExperimentExample();
        experimentExample.createCriteria().andDeviceIdEqualTo(deviceId);
        experimentExample.setOrderByClause("gmt_create desc");
        return experimentMapper.selectByExample(experimentExample);
    }

    @Override
    public int add(Experiment experiment){
        int i = experimentMapper.insertSelective(experiment);
        return i>0?i:0;
    }

    @Override
    public int update(Experiment experiment){
        int i = experimentMapper.updateByPrimaryKeySelective(experiment);
        return i>0?i:0;
    }

    @Override
    public Experiment findExperimentByexperId(Integer experimentId) {
       return experimentMapper.selectByPrimaryKey(experimentId);
    }

    @Override
    public int deleteExperimentByexperId(Integer experimentId) {
        return experimentMapper.deleteByPrimaryKey(experimentId);
    }
}
