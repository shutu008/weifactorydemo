package com.vastsum.entity.vo;

import java.util.Date;

import com.vastsum.entity.BizOrder;

/**
 * @author ssj
 * @create 2017-10-21 9:00
 */
public class BizOrderVO extends BizOrder {
    private String expertName;
    
    private Date startTime;
    
    private Date endTime;

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
    
    
    
}
