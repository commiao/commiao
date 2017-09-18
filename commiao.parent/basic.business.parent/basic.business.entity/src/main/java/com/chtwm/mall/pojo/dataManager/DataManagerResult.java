package com.chtwm.mall.pojo.dataManager;

import java.io.Serializable;

public class DataManagerResult implements Serializable{
	
    private static final long serialVersionUID = 8252362879017203185L;
    
	private String dataType;//数据类型
	private String dataValue;//值
    
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getDataValue() {
		return dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}
}
