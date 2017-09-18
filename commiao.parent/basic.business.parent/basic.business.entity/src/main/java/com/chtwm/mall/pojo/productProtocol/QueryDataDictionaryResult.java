package com.chtwm.mall.pojo.productProtocol;

import java.io.Serializable;

/**
 * 
 */
public class QueryDataDictionaryResult  implements Serializable  {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 889965317838283696L;
	
	private String caption; //中文值
	private String keyValue;//字典对应值id
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getKeyValue() {
		return keyValue;
	}
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}
	
}