package com.vastsum.entity.vo;

import com.vastsum.entity.User;

import java.util.List;
import java.util.Map;

/**
 * 托管视图
 * @author ssj
 * @create 2017-10-15 18:33
 */
public class OrderVO {

    private String  plantOne;            //第一层植物名
    private String plantTwo;             //第二层植物名称
    private String plantThree;           //第三层植物名称
    private String sn;                   //设备序列号
    private Map<String, String> deposit; //托管//对象
    private List<User> exports;          //专家列表//数组
    private Double cost;                 //费用
    private Integer batchId;             //批次id

    public String getPlantOne() {
        return plantOne;
    }

    public void setPlantOne(String plantOne) {
        this.plantOne = plantOne;
    }

    public String getPlantTwo() {
        return plantTwo;
    }

    public void setPlantTwo(String plantTwo) {
        this.plantTwo = plantTwo;
    }

    public String getPlantThree() {
        return plantThree;
    }

    public void setPlantThree(String plantThree) {
        this.plantThree = plantThree;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Map<String, String> getDeposit() {
        return deposit;
    }

    public void setDeposit(Map<String, String> deposit) {
        this.deposit = deposit;
    }

    public List<User> getExports() {
        return exports;
    }

    public void setExports(List<User> exports) {
        this.exports = exports;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }
}
