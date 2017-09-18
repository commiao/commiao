package com.chtwm.mall.pojo.updatePof;

import java.io.Serializable;

/**
 * 公募用户信息修改Result
 * 
 * @author wrx
 *
 */
public class UpdatePofUserResult implements Serializable{
	private static final long serialVersionUID = -1996931330942406834L;
	
	private String allotNo;//申请编号

	public String getAllotNo() {
		return allotNo;
	}

	public void setAllotNo(String allotNo) {
		this.allotNo = allotNo;
	}
	
}
