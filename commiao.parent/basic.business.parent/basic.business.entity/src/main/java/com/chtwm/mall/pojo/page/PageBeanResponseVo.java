package com.chtwm.mall.pojo.page;

import java.util.List;

/** 
 * CreateDate:2017年3月4日上午10:42:37 
 * @Description: 接口返回封装响应bean  
 * @author:shl
 * @version V1.0   
 */
public class PageBeanResponseVo<T> {
	//总记录数
	private String totalCount;
	//总页数
	private String totalPage;
	//响应集合
	private List<T> resultList;
	public String getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getResultList() {
		return resultList;
	}
	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
}
