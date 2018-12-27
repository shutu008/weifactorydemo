package com.vastsum.pojo;


/**
 * 分页查询的条件
 * @author shutu008
 *
 */
public class PageCondition {

	/**
	 * 页码 默认：1
	 */
	private Integer page = 1;
	
	/**
	 * 页数 默认：10
	 */
	private Integer pageSize = 10;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	
	
}
