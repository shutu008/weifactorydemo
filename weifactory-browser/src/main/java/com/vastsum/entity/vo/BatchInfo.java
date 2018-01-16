package com.vastsum.entity.vo;

import com.vastsum.entity.Batch;
import io.swagger.annotations.ApiModel;

/**
 * @author ssj
 * @create 2017-09-10 14:40
 */
@ApiModel(description="管理员批次管理模型")
public class BatchInfo extends Batch {
    //设备名称
    private String sn;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }
}
