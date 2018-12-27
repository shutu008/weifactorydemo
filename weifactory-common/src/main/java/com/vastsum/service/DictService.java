package com.vastsum.service;

import com.vastsum.entity.SysDict;
import com.vastsum.entity.SysDictItem;

import java.util.List;

/**
 * 字典管理
 * @author ssj
 * @create 2017-10-24 21:26
 */
public interface DictService {

    /**
     * 添加字典
     * @param sysDict
     * @return Integer
     */
    Integer save(SysDict sysDict);

    /**
     * 更新字典状态
     * @param sysDict
     * @return Integer
     */
    Integer update(SysDict sysDict);

    /**
     * 根据字典code，获取字典
     * @param code
     * @return SysDict
     */
    SysDict getSysDictByCode(String code);

    /**
     * 根据字典CODE和字典项ITEMCODE获取字典项
     * @param code
     * @param itemCode
     * @return SysDictItem
     */
    SysDictItem getSysDictItemByCodeAndItemCode(String code, String itemCode);

    /**
     * 根据状态列出字典
     * @param boo
     * @return  List<SysDict>
     */
    List<SysDict> listSysDict(String boo);

    /**
     * 不分页列出字典
     * @param boo
     * @return List<SysDict>
     */
    List<SysDict> listSysDictNoPage(String boo);

    /**
     * 在对应字典下面，添加字典项
     * @param sysDictItem
     * @return Integer
     */
    Integer saveDictItem(SysDictItem sysDictItem);

    /**
     * 修改字典项
     * @param code
     * @param sysDictItem
     * @return Integer
     */
    Integer updateDictItem(String code, SysDictItem sysDictItem);

    /**
     * 根据字典code，获取字典项
     * @param code
     * @return List<SysDictItem>
     */
    List<SysDictItem> listSysDictItemByCode(String code);

    /**
     * 不分页列出所有对应的字典项
     * @param code
     * @return List<SysDictItem>
     */
    List<SysDictItem> listSysDictItemNoPage(String code);

}
