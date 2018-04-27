package com.vastsum.service.impl;

import com.vastsum.dao.SysDictItemMapper;
import com.vastsum.dao.SysDictMapper;
import com.vastsum.entity.SysDict;
import com.vastsum.entity.SysDictExample;
import com.vastsum.entity.SysDictItem;
import com.vastsum.entity.SysDictItemExample;
import com.vastsum.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ssj
 * @create 2017-10-24 21:38
 */
@Service
public class DictServiceImpl implements DictService {

    @Autowired
    private SysDictMapper sysDictMapper;
    @Autowired
    private SysDictItemMapper sysDictItemMapper;

    //添加字典
    @Override
    public Integer save(SysDict sysDict) {
        return sysDictMapper.insertSelective(sysDict);
    }

    //更新字典信息
    @Override
    public Integer update(SysDict sysDict) {
       return sysDictMapper.updateByPrimaryKeySelective(sysDict);
    }

    //根据code获取字典
    @Override
    public SysDict getSysDictByCode(String code) {
        return sysDictMapper.selectByPrimaryKey(code);
    }

    //根据字典CODE和字典项ITEMCODE获取字典项
    @Override
    public SysDictItem getSysDictItemByCodeAndItemCode(String code, String itemCode) {
        SysDictItemExample sysDictItemExample = new SysDictItemExample();
        sysDictItemExample.createCriteria()
                .andDictCodeEqualTo(code)
                .andItemCodeEqualTo(itemCode);
        List<SysDictItem> sysDictItems = sysDictItemMapper.selectByExample(sysDictItemExample);
        if (sysDictItems == null || sysDictItems.isEmpty()){
            return null;
        }
        return sysDictItems.get(0);
    }

    //列出所有字典，1：有效的字典，0:有效无效全部给出
    @Override
    public List<SysDict> listSysDict(String boo) {
        SysDictExample sysDictExample = new SysDictExample();
        if ("1".equals(boo)){
            sysDictExample.createCriteria().andStatusEqualTo("1");
            sysDictExample.setOrderByClause("order_number asc");
            List<SysDict> sysDicts = sysDictMapper.selectByExample(sysDictExample);
            return sysDicts;
        }
        sysDictExample.setOrderByClause("order_number asc");
        List<SysDict> sysDicts = sysDictMapper.selectByExample(sysDictExample);
        return sysDicts;
    }

    //不分页列出字典
    @Override
    public List<SysDict> listSysDictNoPage(String boo) {
        SysDictExample sysDictExample = new SysDictExample();
        sysDictExample.createCriteria().andStatusEqualTo(boo);
        sysDictExample.setOrderByClause("order_number asc");
        return sysDictMapper.selectByExample(sysDictExample);
    }

    //保存字典项
    @Override
    public Integer saveDictItem(SysDictItem sysDictItem) {
        return sysDictItemMapper.insertSelective(sysDictItem);
    }

    //更新字典项
    @Override
    public Integer updateDictItem(String code, SysDictItem sysDictItem) {
        SysDictItemExample sysDictItemExample = new SysDictItemExample();
        sysDictItemExample.createCriteria()
                .andDictCodeEqualTo(code)
                .andItemCodeEqualTo(sysDictItem.getItemCode());
        int i = sysDictItemMapper.updateByExampleSelective(sysDictItem, sysDictItemExample);
        return i;
    }

    //根据字典code列出字典项（可用的）
    @Override
    public List<SysDictItem> listSysDictItemByCode(String code) {
        SysDictItemExample sysDictItemExample = new SysDictItemExample();
        sysDictItemExample.createCriteria()
                .andDictCodeEqualTo(code)
                .andStatusEqualTo("1");
        sysDictItemExample.setOrderByClause("order_number asc");
        List<SysDictItem> sysDictItems = sysDictItemMapper.selectByExample(sysDictItemExample);
        return sysDictItems;
    }

    //根据字典code列出对应的字典项
    @Override
    public List<SysDictItem> listSysDictItemNoPage(String code) {
        SysDictItemExample sysDictItemExample = new SysDictItemExample();
        sysDictItemExample.createCriteria()
                .andDictCodeEqualTo(code)
                .andStatusEqualTo("1");
        sysDictItemExample.setOrderByClause("order_number asc");
        return sysDictItemMapper.selectByExample(sysDictItemExample);
    }
}
