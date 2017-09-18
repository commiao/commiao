package com.chtwm.mall.pojo.controller.common.params;

import java.io.Serializable;

/** 
 * CreateDate:2017年6月2日上午10:28:30 
 * @Description: 查询公共协议接口入参
 * @author:shl
 * @version V1.0   
 */
public class QueryProtocolsParams implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -6387326719568809122L;

	private String ids;
	
	private String custType;
	
	private String investType;
	
	private String applyType;
	
	private String clientType;

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getInvestType() {
		return investType;
	}

	public void setInvestType(String investType) {
		this.investType = investType;
	}

	public String getApplyType() {
		return applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	
}
