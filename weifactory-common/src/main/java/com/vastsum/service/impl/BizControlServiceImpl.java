package com.vastsum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.BizControlMapper;
import com.vastsum.entity.BizControl;
import com.vastsum.entity.BizControlExample;
import com.vastsum.service.BizControlService;

/**
 * @author ssj
 * @create 2017-11-18 10:17
 */
@Service
public class BizControlServiceImpl implements BizControlService {

    @Autowired
    private BizControlMapper bizControlMapper;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //列出所有的开关
    @Override
    public List<BizControl> listAll() {
        BizControlExample bizControlExample = new BizControlExample();
        bizControlExample.setOrderByClause("control_id asc");
        return bizControlMapper.selectByExample(bizControlExample);
    }

    //根据设备序列号，列出所有可用的开关
    @Override
    public List<BizControl> listBySn(String sn) {
        BizControlExample bizControlExample = new BizControlExample();
        bizControlExample.setOrderByClause("control_id asc");
        bizControlExample.createCriteria().andEnabledEqualTo("1")
                .andSnEqualTo(sn);
        return bizControlMapper.selectByExample(bizControlExample);
    }

    //列出是否可用的
    @Override
    public List<BizControl> listByEnabled(String enabled) {
        BizControlExample bizControlExample = new BizControlExample();
        bizControlExample.createCriteria().andEnabledEqualTo(enabled);
        bizControlExample.setOrderByClause("control_id asc");
        return bizControlMapper.selectByExample(bizControlExample);
    }

    //列出是否开启的
    @Override
    public List<BizControl> listByStatus(String status) {
        BizControlExample bizControlExample = new BizControlExample();
        bizControlExample.createCriteria().andEnabledEqualTo(status);
        bizControlExample.setOrderByClause("control_id asc");
        return bizControlMapper.selectByExample(bizControlExample);
    }

    //根据条件分页查询开关状态
    @Override
    public PageInfo<BizControl> pageBizControl(BizControl bizControl, int page, int pageSize) {
        BizControlExample bizControlExample = new BizControlExample();
        BizControlExample.Criteria criteria = bizControlExample.createCriteria();
        bizControlExample.setOrderByClause("control_id asc");
        if (bizControl == null){
            //如果查询条件为null,默认列出所有开关
            page = page == 0? 1:page;
            pageSize = pageSize == 0? 10:pageSize;
            PageHelper.startPage(page,pageSize);
            return new PageInfo<>(listAll());
        }
        String sn = bizControl.getSn();
        if ( sn != null){
            criteria.andSnEqualTo(sn);
        }
        String actuatorName = bizControl.getActuatorName();
        if (actuatorName != null && "".equals(actuatorName)){
            criteria.andActuatorNameLike("%"+actuatorName+"%");
        }
        Integer actuatorId = bizControl.getActuatorId();
        if (actuatorId != null){
            criteria.andActuatorIdEqualTo(actuatorId);
        }
        String status = bizControl.getStatus();
        if (status != null){
            criteria.andStatusEqualTo(status);
        }
        String timeVal = bizControl.getStatus();
        if (timeVal != null){
            criteria.andTimevalEqualTo(timeVal);
        }

        String enabled = bizControl.getEnabled();
        if (enabled != null){
            criteria.andEnabledEqualTo(enabled);
        }
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<BizControl> bizControls = bizControlMapper.selectByExample(bizControlExample);

        return new PageInfo<>(bizControls);
    }

    //保存开关
    @Override
    public int save(BizControl bizControl) {
        return bizControlMapper.insertSelective(bizControl);
    }

    //更新开关状态
    @Override
    public int update(BizControl bizControl) {
        BizControlExample bizControlExample = new BizControlExample();
        bizControlExample.createCriteria()
                .andSnEqualTo(bizControl.getSn())
                .andActuatorIdEqualTo(bizControl.getActuatorId());
        return bizControlMapper.updateByExample(bizControl, bizControlExample);
    }

    //更新开关的状态,是否可用
    @Override
    public int updateEnabled(long controlId, String enabled) {
        BizControl bizControl = new BizControl();
        bizControl.setControlId(controlId);
        bizControl.setEnabled(enabled);
        return bizControlMapper.updateByPrimaryKeySelective(bizControl);
    }

    //删除开关
    @Override
    public int delete(long controlId) {
        return bizControlMapper.deleteByPrimaryKey(controlId);
    }

    //根据设备序列号删除设备控制信息
    @Override
    public int deleteBySn(String sn) {
        BizControlExample bizControlExample = new BizControlExample();
        bizControlExample.createCriteria().andSnEqualTo(sn);
        return bizControlMapper.deleteByExample(bizControlExample);
    }

    //根据id查看开关
    @Override
    public BizControl getById(long controlId) {
        return bizControlMapper.selectByPrimaryKey(controlId);
    }

    //根据条件查询出控制信息
    @Override
    public BizControl getByBizControlExample(BizControl bizControl) {
        BizControlExample bizControlExample = new BizControlExample();
        bizControlExample.createCriteria()
                .andSnEqualTo(bizControl.getSn())
                .andActuatorIdEqualTo(bizControl.getActuatorId());
        return bizControlMapper.selectByExample(bizControlExample).get(0);
    }

    //初始化机构控制
    @Override
    public void intActuator(String sn) {
        jdbcTemplate.execute("call process_init_device_actuator('"+sn+"')");
    }
}
