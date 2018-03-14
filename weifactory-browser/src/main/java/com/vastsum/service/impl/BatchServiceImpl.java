package com.vastsum.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.BatchMapper;
import com.vastsum.dao.BizOrderMapper;
import com.vastsum.dao.JoinMapper;
import com.vastsum.entity.BatchExample;
import com.vastsum.entity.BizOrder;
import com.vastsum.entity.BizOrderExample;
import com.vastsum.entity.Batch;
import com.vastsum.entity.vo.BatchInfo;
import com.vastsum.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ssj
 * @create 2017-09-03 18:52
 */
@Service
public class BatchServiceImpl implements BatchService {

    @Autowired
    private BatchMapper batchMapper;
    @Autowired
    private JoinMapper joinMapper;

    @Autowired
    private BizOrderMapper orderMapper;

    @Override
    public PageInfo<Batch> selectAllBatch(Integer page, Integer pageSize) {
        //查询条件
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<Batch> batches = joinMapper.selectBatchInfos();
        return new PageInfo<>(batches);
    }

    //根据设备id查询出可用的批次信息
    @Override
    public PageInfo<Batch> selectBatchsByDeviceId(Integer deviceId, Integer page, Integer pageSize) {
        //查询条件
        BatchExample batchExample = new BatchExample();
        batchExample.setOrderByClause("gmt_create desc");
        batchExample.createCriteria()
                .andDeviceIdEqualTo(deviceId)
                .andStatusEqualTo("1");
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<Batch> batches = batchMapper.selectByExample(batchExample);
        return new PageInfo<>(batches);
    }

    //根据设备id获取最新的批次信息
    @Override
    public Batch selectLastBatchByDeviceId(Integer deviceId) {
        BatchExample batchExample = new BatchExample();
        batchExample.createCriteria()
                .andDeviceIdEqualTo(deviceId)
                .andStatusEqualTo("1");
        //排序，按照时间倒序
        batchExample.setOrderByClause("gmt_create desc");
        List<Batch> batches = batchMapper.selectByExample(batchExample);
        if (batches!=null && !batches.isEmpty()) {
            return batches.get(0);
        }
        return null;
    }

    @Override
    public Batch selectBatchBybatchId(Integer batchId) {
        return batchMapper.selectByPrimaryKey(batchId);
    }


    @Override
    public Batch getBatchByOrderNumber(String orderNumber) {
        BizOrderExample bizOrderExample = new BizOrderExample();
        bizOrderExample.createCriteria().andOrderNumberEqualTo(orderNumber);
        List<BizOrder> bizOrders = orderMapper.selectByExample(bizOrderExample);
        if (bizOrders == null || bizOrders.isEmpty()){
            return  null;
        }
        BizOrder bizOrder = bizOrders.get(0);
        Integer batchId = bizOrder.getBatchId();
        return batchMapper.selectByPrimaryKey(batchId);

    }

    //根据用户id用户的批次信息
    @Override
    public PageInfo<BatchInfo> listBatchsByUserId(Integer userId, Integer page, Integer pageSize) {
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<BatchInfo> batchInfos = joinMapper.selectBatchInfoByUserId(userId);
        return new PageInfo<>(batchInfos);
    }

    @Override
    public int addBatch(Batch batch) {
      return  batchMapper.insertSelective(batch);
    }

    @Override
    public int updateBatch(Batch batch) {
        //必须有主键
        return batchMapper.updateByPrimaryKeySelective(batch);
    }

    @Override
    public int deleteBatch(Integer batchId) {
        return batchMapper.deleteByPrimaryKey(batchId);
    }

    //根据设备id删除批次信息
    @Override
    public int deleteByDeviceId(Integer deviceId) {
        BatchExample batchExample = new BatchExample();
        batchExample.createCriteria().andDeviceIdEqualTo(deviceId);
        return batchMapper.deleteByExample(batchExample);
    }

    //批次关联模型
    @Override
    public int updateBatchModel(int batchId, int modelId) {
        Batch batch = new Batch();
        batch.setModelId(modelId);
        batch.setBatchId(batchId);
      return batchMapper.updateByPrimaryKeySelective(batch);
    }

    //更改批次的订单状态标识
    @Override
    public int updateBatchOrderStatus(Integer batchId, String status) {
        Batch batch = new Batch();
        batch.setBatchId(batchId);
        batch.setOrderStatus(status);
        int i = batchMapper.updateByPrimaryKeySelective(batch);
        return i;
    }
}
