package net.vastsum.weifactory.wechatpay.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Component
@Data
public class WechatRelation {
    @Id
    @GeneratedValue
    private Integer wechatRelationId;

    private Integer userId;

    private String openid;

    private Boolean detailInfo;

	public Integer getWechatRelationId() {
		return wechatRelationId;
	}

	public void setWechatRelationId(Integer wechatRelationId) {
		this.wechatRelationId = wechatRelationId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public Boolean getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(Boolean detailInfo) {
		this.detailInfo = detailInfo;
	}
    
    
}
