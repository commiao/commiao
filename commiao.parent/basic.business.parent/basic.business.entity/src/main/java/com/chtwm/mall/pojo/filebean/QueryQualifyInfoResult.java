package com.chtwm.mall.pojo.filebean;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月8日上午11:59:42 
 * @Description: 查询合格投资者认定响应结果集 
 * @author:shl
 * @version V1.0   
 */
public class QueryQualifyInfoResult implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -1821787309664506964L;
	/**
	 * 审核结果
	 */
	private String auditResult;
	/**
	 * 审核结果字典值
	 */
	private String auditResultDic;
	/**
	 * 有效期
	 */
	private String proveValidDate = "";
	/**
	 * 序列号
	 */
	private String serialno;
	
	/**
	 * 审核返回信息
	 */
	private String retReason;
	
	/**
	 * 上传文件名
	 */
	private String pathWeb;
	
	/**
	 * 上传时间
	 */
	private String createDate;
	
	public String getAuditResult() {
		return auditResult;
	}

	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public String getAuditResultDic() {
		return auditResultDic;
	}

	public void setAuditResultDic(String auditResultDic) {
		this.auditResultDic = auditResultDic;
	}

	public String getProveValidDate() {
		return proveValidDate;
	}

	public void setProveValidDate(String proveValidDate) {
		this.proveValidDate = proveValidDate;
	}

	public String getRetReason() {
		return retReason;
	}

	public void setRetReason(String retReason) {
		this.retReason = retReason;
	}

	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getPathWeb() {
		return pathWeb;
	}

	public void setPathWeb(String pathWeb) {
		this.pathWeb = pathWeb;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
}
