package com.chtwm.mall.pojo.controller.pc.investor.result;

import java.io.Serializable;

/** 
 * CreateDate:2017年6月5日上午10:42:27 
 * @Description: 查询投资者分类结果集  
 * @author:shl
 * @version V1.0   
 */
public class QueryInvestClassifyResult implements Serializable {
	
	/**
	 * serialVersionUID:序列化
	 */
	private static final long serialVersionUID = -4831943064837186069L;

	private String name;
	
	private String investType;
	
	private String auditStatus;
	
	private String auditStatusDic;
	
	private String auditOption;
	
	private String auditDate;
	
	private String currentClassification;
	
	private String currentClassificationDic;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvestType() {
		return investType;
	}

	public void setInvestType(String investType) {
		this.investType = investType;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getAuditStatusDic() {
		return auditStatusDic;
	}

	public void setAuditStatusDic(String auditStatusDic) {
		this.auditStatusDic = auditStatusDic;
	}

	public String getAuditOption() {
		return auditOption;
	}

	public void setAuditOption(String auditOption) {
		this.auditOption = auditOption;
	}

	public String getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(String auditDate) {
		this.auditDate = auditDate;
	}

	public String getCurrentClassification() {
		return currentClassification;
	}

	public void setCurrentClassification(String currentClassification) {
		this.currentClassification = currentClassification;
	}

	public String getCurrentClassificationDic() {
		return currentClassificationDic;
	}

	public void setCurrentClassificationDic(String currentClassificationDic) {
		this.currentClassificationDic = currentClassificationDic;
	}
}
