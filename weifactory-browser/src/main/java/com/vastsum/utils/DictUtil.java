package com.vastsum.utils;

import com.vastsum.entity.SysDict;
import com.vastsum.entity.SysDictItem;
import com.vastsum.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * 单例模式字典工具
 * @author ssj
 * @create 2017-07-29 12:52
 */
@Component
public class DictUtil {

    @Autowired
    private DictService dictService;

    private static DictUtil dictUtil;
    /**
     * 缓存整个字典信息
     */
    private static Map<String, Set<SysDictItem>> dictParentMap = new TreeMap<>();

    @PostConstruct
    public void init(){
        dictUtil = this;
        loadCache();
    };

    //构造一个单例对象
/*    public static synchronized DictUtil getInstance(){
        if (dictUtil==null){
            dictUtil = new DictUtil();
            return dictUtil;
        }
        return dictUtil;
    }*/

    /**
     * 根据字典code获取
     * @param code
     * @return Set<SysDictItem>
     */
    public Set<SysDictItem> getSysDictItemsByCode(String code){
        //调用这个方法只能new（getInstance），此时已经被实例化
        Set<SysDictItem> set = dictParentMap.get(code);
        return set;
    }

    /**
     * 载入字典缓存
     */
    public static void loadCache(){
        //列出所有有用的字典；
        List<SysDict> sysDicts = dictUtil.dictService.listSysDictNoPage("1");
        for(SysDict sysDict : sysDicts){
            String code = sysDict.getCode();
            List<SysDictItem> sysDictItems = dictUtil.dictService.listSysDictItemNoPage(code);
            Set<SysDictItem> set = new HashSet<>();
            set.addAll(sysDictItems);
            dictParentMap.put(code, set);
        }
    }

}
