package com.chtwm.mall.pojo.controller.common.result;

import java.io.Serializable;

/** 
 * CreateDate:2017年6月2日上午11:09:38 
 * @Description: 附件信息bean  
 * @author:shl
 * @version V1.0   
 */
public class AccessorysResult implements Serializable {
	
	/**
	 * serialVersionUID:序列化
	 */
	private static final long serialVersionUID = 7018612208682241114L;

	private String accessoryName;
	
	private String accessoryUrl;

	public String getAccessoryName() {
		return accessoryName;
	}

	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}

	public String getAccessoryUrl() {
		return accessoryUrl;
	}

	public void setAccessoryUrl(String accessoryUrl) {
		this.accessoryUrl = accessoryUrl;
	}
	
}
