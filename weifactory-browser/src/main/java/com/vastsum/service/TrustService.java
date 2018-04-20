package com.vastsum.service;


/**
 * 托管服务
 * @author shutu008
 *
 */
public interface TrustService {
	
	/**
	 *托管服务
	 * @param sn
	 * @param trustStatus
	 */
	void trust(Integer deviceId, String trustStatus);
	
	/**
	 *  取消设备托管
	 * @param deviceId
	 */
	void cancelTrust(Integer deviceId);
	
	/**
	 * 托管给服务器
	 * @param deviceId
	 */
	void serverTrust(Integer deviceId);
	
	/**
	 *  托管给专家
	 * @param deviceId
	 */
	void expertTrust(Integer deviceId);

}
