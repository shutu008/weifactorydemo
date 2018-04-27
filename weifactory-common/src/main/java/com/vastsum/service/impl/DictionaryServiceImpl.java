package com.vastsum.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.entity.SysDictionary;
import com.vastsum.entity.SysDictionaryExample;
import com.vastsum.service.DictionaryService;
import com.vastsum.dao.SysDictionaryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author ssj
 * @create 2017-07-29 12:46
 */
public class DictionaryServiceImpl implements DictionaryService {
    private static Logger logger = LoggerFactory.getLogger(DictionaryServiceImpl.class);
    //所有父字典<code,dic>
    private static Map<Integer, SysDictionary> dictParentMap = new HashMap<>();
    //根据父节点保存的子节点
    private static Map<Integer, List<SysDictionary>> dictChildMap = new HashMap<>();
    @Autowired
    private SysDictionaryMapper sysDictionaryMapper;

    @Override
    public void getCacheDic() {
      // dictParentMap = this.findParentMap();
       //dictChildMap = this.findChildMap();
        findParentMap();
        findChildMap();
       logger.info("父字典map:"+dictParentMap.toString()+"子字典map:"+dictChildMap.toString());
    }

    @Override
    public int add(SysDictionary sysDictionary) {
        int i = sysDictionaryMapper.insertSelective(sysDictionary);
        if (i>0){
            logger.info("字典插入成功");
            return 1;
        }else {
            logger.info("字典插入失败");
        }
        return 0;
    }

    @Override
    public int update(SysDictionary sysDictionary) {
        int i = sysDictionaryMapper.updateByPrimaryKeySelective(sysDictionary);
        if (i>0){
            logger.info("字典更新成功");
            return 1;
        }else {
            logger.info("字典更新失败");
        }
        return 0;
    }

    //分页查询父节点
    @Override
    public PageInfo<SysDictionary> findParentDictionaryForPage(Integer pageNo, Integer pageSize) {
        SysDictionaryExample sysDictionaryExample = new SysDictionaryExample();
        sysDictionaryExample.createCriteria().andHasChildEqualTo(true)
        .andDisabledEqualTo(false);//true表示是父字典
        //设置默认分页
        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo,pageSize);
        List<SysDictionary> sysDictionaries = sysDictionaryMapper.selectByExample(sysDictionaryExample);
        PageInfo<SysDictionary> pageInfo = new PageInfo<>(sysDictionaries);
        return pageInfo;
    }

    //根据父字典查询所有的子节点
    @Override
    public PageInfo<SysDictionary> findChildDictionaryForPage(Integer id, Integer pageNo, Integer pageSize) {
        SysDictionaryExample sysDictionaryExample = new SysDictionaryExample();
        sysDictionaryExample.createCriteria().andParentIdEqualTo(id)
        .andDisabledEqualTo(false);
        //设置默认分页
        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo,pageSize);
        List<SysDictionary> list = sysDictionaryMapper.selectByExample(sysDictionaryExample);
        PageInfo<SysDictionary> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    //查询所有父节点
    @Override
    public List<SysDictionary> selectParentDictionary() {
        SysDictionaryExample sysDictionaryExample = new SysDictionaryExample();
        sysDictionaryExample.createCriteria().andHasChildEqualTo(true);
        return sysDictionaryMapper.selectByExample(sysDictionaryExample);

    }

    //查询所有子节点
    @Override
    public List<SysDictionary> selectChildDictionary(Integer id) {
        SysDictionaryExample sysDictionaryExample = new SysDictionaryExample();
        sysDictionaryExample.createCriteria().andParentIdEqualTo(id)
                .andDisabledEqualTo(false);
      return sysDictionaryMapper.selectByExample(sysDictionaryExample);
    }

    //将父字典封装成map
    @Override
    public Map<Integer, SysDictionary> findParentMap() {
        Iterator<SysDictionary> iterator = this.selectParentDictionary().iterator();
        while (iterator.hasNext()){
            SysDictionary next = iterator.next();
            dictParentMap.put(next.getId(),next);
        }
        return dictParentMap;
    }

    //将子节点封装成map<父字典项id,所有子字典>
    @Override
    public Map<Integer, List<SysDictionary>> findChildMap() {
        Iterator<SysDictionary> iterator = this.selectParentDictionary().iterator();
        while (iterator.hasNext()){
            //注意不要连续两次使用next()方法
            SysDictionary next = iterator.next();
            List<SysDictionary> childDictionary = this.selectChildDictionary(next.getId());
            dictChildMap.put(next.getId(),childDictionary);
        }
        return dictChildMap;
    }

    //根据父字典获取子字典对应的code和name
    @Override
    public Map<String, String> findCodeNameByParentId(Integer parentId) {
        List<SysDictionary> childList = dictChildMap.get(parentId);
        Map<String,String> childMap = new HashMap<>();
        for (SysDictionary sysDictionary : childList) {
            childMap.put(sysDictionary.getCode(),sysDictionary.getName());
        }
        return childMap;
    }

    @Override
    public Map<Integer, SysDictionary> getDictParentMap() {
        return dictParentMap;
    }

    @Override
    public Map<Integer, List<SysDictionary>> getDictChildMap() {
        return dictChildMap;
    }

}
