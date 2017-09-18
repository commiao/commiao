package com.chtwm.mall.pojo.controller.common.result;

import java.io.Serializable;
import java.util.List;

/** 
 * CreateDate:2017年6月2日上午11:08:02 
 * @Description: 查询结果-响应结果集  
 * @author:shl
 * @version V1.0   
 */
public class QueryProtocolsResult implements Serializable {
	/**
	 * serialVersionUID:序列化 
	 */
	private static final long serialVersionUID = 1773395653665773264L;

	private String id;
	
	private String title;
	
	private String isContent;

	private String content;
	
	private String isAccessory;
	
	private List<AccessorysResult> accessorys;

	public String getIsContent() {
		return isContent;
	}

	public void setIsContent(String isContent) {
		this.isContent = isContent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIsAccessory() {
		return isAccessory;
	}

	public void setIsAccessory(String isAccessory) {
		this.isAccessory = isAccessory;
	}

	public List<AccessorysResult> getAccessorys() {
		return accessorys;
	}

	public void setAccessorys(List<AccessorysResult> accessorys) {
		this.accessorys = accessorys;
	}

	
}
