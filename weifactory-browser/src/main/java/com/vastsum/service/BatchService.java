package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.vo.BatchInfo;
import com.vastsum.entity.Batch;

/**
 * 批次管理
 * @author ssj
 * @create 2017-09-03 16:35
 */
public interface BatchService {

    /**
     * 分页列出所有的批次信息
     * @param page
     * @param pageSize
     * @return 分页的批次信息
     */
     PageInfo<Batch> selectAllBatch(Integer page, Integer pageSize);

    /**
     *根据设备id和分页信息获取分页的批次信息
     * @param deviceId
     * @return 分页批次信息
     */
     PageInfo<Batch> selectBatchsByDeviceId(Integer deviceId, Integer page, Integer pageSize);

    /**
     *根据设备id获取最近的批次信息
     * @param deviceId
     * @return 最近的批次信息
     */
     Batch selectLastBatchByDeviceId(Integer deviceId);

    /**
     * 根据批次id获取批次详细信息
     * @param batchId
     * @return批次详细信息
     */
     Batch selectBatchBybatchId(Long batchId);

    /**
     * 根据订单号获取批次信息
     * @param orderNumber
     * @return Batch
     */
     Batch getBatchByOrderNumber(String orderNumber);

    /**
     * 根据用户id获取用户的批次信息
     * @param userId
     * @param page
     * @param pageSize
     * @return PageInfo<Batch>
     */
     PageInfo<BatchInfo> listBatchsByUserId(Integer userId, Integer page, Integer pageSize);
    /**
     * 添加一条批次信息
     * @param batch
     * @return 添加后的状态，1：成功，0：失败
     */
     int addBatch(Batch batch);

    /**
     * 修改批次信息
     * @param batch
     * @return 修改后的状态1：成功，0：失败
     */
     int updateBatch(Batch batch);

    /**
     * 根据批次id删除批次信息
     * @param batchId
     * @return 删除后的状态1:成功，0：失败
     */
     int deleteBatch(Long batchId);

    /**
     * 根据设备序列号，删除批次信息
     * @param deviceId
     * @return int
     */
     int deleteByDeviceId(Integer deviceId);

    /**
     * 批次关联模型
     * @param modelId
     * @return int
     */
     int updateBatchModel(Long batchId, int modelId);

    /**
     * 更改批次的订单状态标识
     * @param batchId
     * @param status
     * @return int
     */
     int updateBatchOrderStatus(Long batchId, String status);
     
     /**
      * 根据批次id更新托管状态
      * @param batchId
      * @return int
      */
     int updateTrustStatusByDeviceId(Long batchId);
     
     /**
      * 按照层级删除批次对应信息
      * @param layId 层级，参考字典 
      * @param batchId 批次id
      */
     void deleteLay(String layId, Long batchId);
}
