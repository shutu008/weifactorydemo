package com.vastsum.utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vastsum.entity.GrowthPatternParam;
import com.vastsum.service.ParamSetService;

/**
 * 单例-饿汉式（系统启动时加载）
 * @author shutu008
 *
 */
@Component
public class GrowthParamCache {
	
	@Autowired
	private ParamSetService paramSetService;
	
	private GrowthParamCache(){};
	
	private static GrowthParamCache growthParamCache;
	
	private static final Set<GrowthPatternParam> set = new HashSet<>();
	
	@PostConstruct
    public void init(){
		growthParamCache = this;
      loadCache();
    };
	
	//从数据库中加载参数信息
	public static void loadCache() {
		List<GrowthPatternParam> listSysParam = growthParamCache.paramSetService.listGrowthAll();
		set.clear();
		set.addAll(listSysParam);
	}
	
	/**
	 * 获取指定生长模式的参数设置
	 * @param growthNo
	 * @return Set<GrowthPatternParam>
	 */
	public static List<GrowthPatternParam> listByModelId(Integer growthNo){
		List<GrowthPatternParam> growthList = new ArrayList<>();
		for (GrowthPatternParam param : set) {
			if (growthNo.equals(param.getGrowthNo())) {
				growthList.add(param);
			}
		}
		//进行排序
		growthList.sort(new Comparator<GrowthPatternParam>() {

			@Override
			public int compare(GrowthPatternParam o1, GrowthPatternParam o2) {
				if (o1.getGrowthOrder() >=  o2.getGrowthOrder()) {
					return 1;
				}else {
					return -1;
				}
			}
			
		});
		return growthList;
	}
	

}
