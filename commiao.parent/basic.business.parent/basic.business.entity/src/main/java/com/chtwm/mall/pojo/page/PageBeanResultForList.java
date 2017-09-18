package com.chtwm.mall.pojo.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/** 
 * CreateDate:2016年9月21日下午3:18:37 
 * @Description: 供第三方接口分页信息使用的bean  
 * @author:shl
 * @version V1.0   
 * @param <T>
 */
public class PageBeanResultForList<T> {
	
	private List<T> pageList;
	
	private String totalCount;
	
	private String totalPage;
	
	public PageBeanResultForList(){
		
	}
	
	public Map<String,Object> getPageItems(){
		 Map<String,Object> map = new HashMap<String, Object>(2);
	     //数据总条数
         map.put("totalCount", totalCount);
         //总页数 
         map.put("totalPages", totalPage);
         
         return map;
	}
	public PageBeanResultForList(List<T> pageList){
		this.pageList = pageList;
	}

	public List<T> getPageList() {
		return pageList;
	}

	public void setPageList(List<T> pageList) {
		this.pageList = pageList != null?pageList:new ArrayList<T>();
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

}
