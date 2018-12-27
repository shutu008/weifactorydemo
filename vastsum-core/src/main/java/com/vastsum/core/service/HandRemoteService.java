package com.vastsum.core.service;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 手动控制的远程服务
 * @author Mike
 *
 */
public interface HandRemoteService {
	void sendOrder(HashMap<String, Object> hashMap);
	ArrayList<String> getOnlineDeviceList();
	
	/**
	 * 更新参数设置缓存
	 */
	void updateParamHelper();
	
	/**
	 * 更新字典缓存
	 */
	void updateDictHelper();
}
