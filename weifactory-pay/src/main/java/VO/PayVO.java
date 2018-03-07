package VO;

import lombok.Data;

import java.util.HashMap;

@Data
public class PayVO {
    private String appId;
    private String timeStamp;
    private String nonceStr;
    private String packages;
    private String signType;
    private String paySign;
    public HashMap<String,String> toHashMap(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("appId",appId);
        hashMap.put("timeStamp",timeStamp);
        hashMap.put("nonceStr",nonceStr);
        hashMap.put("package",packages);
        hashMap.put("signType",signType);
        return hashMap;
    }
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getNonceStr() {
		return nonceStr;
	}
	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}
	public String getPackages() {
		return packages;
	}
	public void setPackages(String packages) {
		this.packages = packages;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	public String getPaySign() {
		return paySign;
	}
	public void setPaySign(String paySign) {
		this.paySign = paySign;
	}
    
    
}
