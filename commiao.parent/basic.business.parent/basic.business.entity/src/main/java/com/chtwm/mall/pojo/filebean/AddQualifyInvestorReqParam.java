/**
 * @file AddQualifyInvestorReqParam.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年6月17日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年6月17日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.chtwm.mall.pojo.filebean;

import java.io.Serializable;

/**
 * @brief 合格投资者认定请求参数bean
 *
 * 合格投资者认定请求参数bean
 * 
 * @author
 *    - 2016年6月17日  申贺龙  创建初始版本
 *
 */
public class AddQualifyInvestorReqParam implements Serializable{
	private static final long serialVersionUID = 7671890684298764512L;
	
	private String p_custno; // C12 客户编号 Y
	private String p_provetype; // C1 证明类型【1-资产证明 2-收入证明】 Y
	private Double p_provebalance; // N16.2 证明金额 N
	private Integer p_filegroupno; // N10 附件组编号(外部系统) N
	private Integer p_fileno; // N10 附件ID(外部系统) N
	private String p_filename; // C255 附件名称 Y
	private String p_filepath; // C255 附件路径(绝对地址) Y
	private String p_systemfrom; // C1 系统来源【FUNDCRM3145字典】 Y
	
	public String getP_custno() {
		return p_custno;
	}
	public String getP_provetype() {
		return p_provetype;
	}
	public Double getP_provebalance() {
		return p_provebalance;
	}
	public Integer getP_filegroupno() {
		return p_filegroupno;
	}
	public Integer getP_fileno() {
		return p_fileno;
	}
	public String getP_filename() {
		return p_filename;
	}
	public String getP_filepath() {
		return p_filepath;
	}
	public String getP_systemfrom() {
		return p_systemfrom;
	}
	public void setP_custno(String p_custno) {
		this.p_custno = p_custno;
	}
	public void setP_provetype(String p_provetype) {
		this.p_provetype = p_provetype;
	}
	public void setP_provebalance(Double p_provebalance) {
		this.p_provebalance = p_provebalance;
	}
	public void setP_filegroupno(Integer p_filegroupno) {
		this.p_filegroupno = p_filegroupno;
	}
	public void setP_fileno(Integer p_fileno) {
		this.p_fileno = p_fileno;
	}
	public void setP_filename(String p_filename) {
		this.p_filename = p_filename;
	}
	public void setP_filepath(String p_filepath) {
		this.p_filepath = p_filepath;
	}
	public void setP_systemfrom(String p_systemfrom) {
		this.p_systemfrom = p_systemfrom;
	}
}
