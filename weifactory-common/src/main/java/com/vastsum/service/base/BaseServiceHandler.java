package com.vastsum.service.base;import com.github.pagehelper.PageInfo;

/**
 * 
* @Description: 基础service,用于其他service继承
* @author shensj 
* @date 2018年3月14日 下午9:14:32 
*
 */
public class BaseServiceHandler<T> {

	
	protected PageInfo<T> page() {
		return null;
	}
}
