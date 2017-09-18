package com.chtwm.mall.pojo.controller.pc.product.result;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月13日下午9:41:24 
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author:shl
 * @version V1.0   
 */
public class QueryRedemptionResult implements Serializable{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -3330646564449726592L;
	
	private String managerName;
	
	private String productName;
	
	private String totalShare;
	
	private String custName;
	
	private String maskCertNo;
	
	private String linkPhone;

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTotalShare() {
		return totalShare;
	}

	public void setTotalShare(String totalShare) {
		this.totalShare = totalShare;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getMaskCertNo() {
		return maskCertNo;
	}

	public void setMaskCertNo(String maskCertNo) {
		this.maskCertNo = maskCertNo;
	}

	public String getLinkPhone() {
		return linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	
}
