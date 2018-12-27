package com.vastsum.utils;

import java.util.List;

import com.github.pagehelper.PageInfo;

public class PageUtils {

	
	private PageUtils() {};
	
	/**
	 * pageInfo 转化，主要用于更换list对象
	 * @param pageInfo
	 * @return PageInfo<T>
	 */
	public static <E,T> PageInfo<T> convert(PageInfo<E> pageInfo, List<T> list){
		
		PageInfo<T> page= new PageInfo<>();
		page.setList(list);
		page.setEndRow(pageInfo.getEndRow());
		page.setFirstPage(pageInfo.getFirstPage());
		page.setHasNextPage(pageInfo.isHasNextPage());
		page.setHasPreviousPage(pageInfo.isHasPreviousPage());
		page.setIsFirstPage(pageInfo.isIsFirstPage());
		page.setIsLastPage(pageInfo.isIsLastPage());
		page.setLastPage(pageInfo.getLastPage());
		page.setNavigateFirstPage(pageInfo.getNavigateFirstPage());
		page.setNavigateLastPage(pageInfo.getNavigateLastPage());
		page.setNavigatepageNums(pageInfo.getNavigatepageNums());
		page.setNavigatePages(pageInfo.getNavigatePages());
		page.setNextPage(pageInfo.getNextPage());
		page.setOrderBy(pageInfo.getOrderBy());
		page.setPageNum(pageInfo.getPageNum());
		page.setPages(pageInfo.getPages());
		page.setPageSize(pageInfo.getPageSize());
		page.setPrePage(pageInfo.getPrePage());
		page.setSize(pageInfo.getSize());
		page.setStartRow(pageInfo.getStartRow());
		page.setTotal(pageInfo.getTotal());
		return page;
		
	}
}
