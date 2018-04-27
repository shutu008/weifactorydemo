package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.SysDictionary;

import java.util.List;
import java.util.Map;

/**
 * @author ssj
 * @create 2017-07-29 12:44
 */
public interface DictionaryService {
    //缓存字典
    public void getCacheDic();

    //添加字典对象
    public int add(SysDictionary sysDictionary);

    //更新字典对象
    public int update(SysDictionary sysDictionary);

    //查询所有父字典分页
    public PageInfo<SysDictionary> findParentDictionaryForPage(Integer pageNo, Integer pageSize);

    //根据父字典的id查询所有的子字典分页信息
    public PageInfo<SysDictionary> findChildDictionaryForPage(Integer id, Integer pageNo, Integer pageSize);

    //查询所有父字典
    public List<SysDictionary> selectParentDictionary();

    //查询所有子字典
    public List<SysDictionary> selectChildDictionary(Integer id);


    //获取父字典map<id,dict>
    public Map<Integer, SysDictionary> findParentMap();

    //获取子map<parentId,List>
    public Map<Integer,List<SysDictionary>> findChildMap();

    //根据parentId获取子字典对应的<code,name>
    public Map<String,String> findCodeNameByParentId(Integer parentId);

    //从内存中获取父字典
    public Map<Integer, SysDictionary> getDictParentMap();

    //从内存中获取子字典
    public Map<Integer, List<SysDictionary>> getDictChildMap();

}
