package com.vastsum.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vastsum.entity.SysParam;
import com.vastsum.service.SysParamService;

/**
 * 单例-饿汉式（系统启动时加载）
 * @author shutu008
 *
 */
@Component
public class ParamHelper {
	
	@Autowired
	private SysParamService sysParamService;
	
	private ParamHelper(){};
	
	private static ParamHelper paramHelper;
	
	private static final Set<SysParam> set = new HashSet<>();
	
	@PostConstruct
    public void init(){
	 paramHelper = this;
      loadCache();
    };
	
	//从数据库中加载参数信息
	public static void loadCache() {
		List<SysParam> listSysParam = paramHelper.sysParamService.listByStatus(true);
		set.clear();
		set.addAll(listSysParam);
	}
	
	/**
	 * 根据参数code获取参数的值
	 * @param code
	 * @return String
	 */
	public static String getValueByCode(String code){
		for (SysParam sysParam : set) {
			if (sysParam.getParamCode().equals(code)) {
				return sysParam.getParamValue();
			}
		}
		return null;
	}
	

}
