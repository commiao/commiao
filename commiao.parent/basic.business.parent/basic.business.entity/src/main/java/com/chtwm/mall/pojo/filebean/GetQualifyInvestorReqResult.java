package com.chtwm.mall.pojo.filebean;

import java.io.Serializable;

public class GetQualifyInvestorReqResult implements Serializable {

	private static final long serialVersionUID = -6442688524852077000L;

	private Integer l_serialno; // N10 序列号 N
	private String c_custno; // C12 客户编号 N
	private String c_custname; // C60 客户名称 N
	private String c_provetype; // C1 证明类型 N
	private String c_provetypedic; // C10 证明类型字典值 N
	private Double f_provebalance; // N16.2 证明金额 N
	private Integer l_storageid; // N10 附件ID N
	private String c_provevaliddate; // C10 认定有效期 N
	private String c_status; // C1 状态 N
	private String c_statusdic; // C30 状态字典值 N
	private String c_creator; // C16 创建人ID N
	private String c_creatorname; // C30 创建人名称 N
	private String c_createdate; // C20 创建时间 N
	private String c_auditor; // C16 审核人ID N
	private String c_auditorname; // C30 审核人名称 N
	private String c_auditoption; // C1 审核结果 N
	private String c_auditoptiondic; // C30 审核结果字典 N
	private String c_auditdate; // C20 审核时间 N

	public Integer getL_serialno() {
		return l_serialno;
	}

	public void setL_serialno(Integer l_serialno) {
		this.l_serialno = l_serialno;
	}

	public String getC_custno() {
		return c_custno;
	}

	public void setC_custno(String c_custno) {
		this.c_custno = c_custno;
	}

	public String getC_custname() {
		return c_custname;
	}

	public void setC_custname(String c_custname) {
		this.c_custname = c_custname;
	}

	public String getC_provetype() {
		return c_provetype;
	}

	public void setC_provetype(String c_provetype) {
		this.c_provetype = c_provetype;
	}

	public String getC_provetypedic() {
		return c_provetypedic;
	}

	public void setC_provetypedic(String c_provetypedic) {
		this.c_provetypedic = c_provetypedic;
	}

	public Double getF_provebalance() {
		return f_provebalance;
	}

	public void setF_provebalance(Double f_provebalance) {
		this.f_provebalance = f_provebalance;
	}

	public Integer getL_storageid() {
		return l_storageid;
	}

	public void setL_storageid(Integer l_storageid) {
		this.l_storageid = l_storageid;
	}

	public String getC_provevaliddate() {
		return c_provevaliddate;
	}

	public void setC_provevaliddate(String c_provevaliddate) {
		this.c_provevaliddate = c_provevaliddate;
	}

	public String getC_status() {
		return c_status;
	}

	public void setC_status(String c_status) {
		this.c_status = c_status;
	}

	public String getC_statusdic() {
		return c_statusdic;
	}

	public void setC_statusdic(String c_statusdic) {
		this.c_statusdic = c_statusdic;
	}

	public String getC_creator() {
		return c_creator;
	}

	public void setC_creator(String c_creator) {
		this.c_creator = c_creator;
	}

	public String getC_creatorname() {
		return c_creatorname;
	}

	public void setC_creatorname(String c_creatorname) {
		this.c_creatorname = c_creatorname;
	}

	public String getC_createdate() {
		return c_createdate;
	}

	public void setC_createdate(String c_createdate) {
		this.c_createdate = c_createdate;
	}

	public String getC_auditor() {
		return c_auditor;
	}

	public void setC_auditor(String c_auditor) {
		this.c_auditor = c_auditor;
	}

	public String getC_auditorname() {
		return c_auditorname;
	}

	public void setC_auditorname(String c_auditorname) {
		this.c_auditorname = c_auditorname;
	}

	public String getC_auditoption() {
		return c_auditoption;
	}

	public void setC_auditoption(String c_auditoption) {
		this.c_auditoption = c_auditoption;
	}

	public String getC_auditoptiondic() {
		return c_auditoptiondic;
	}

	public void setC_auditoptiondic(String c_auditoptiondic) {
		this.c_auditoptiondic = c_auditoptiondic;
	}

	public String getC_auditdate() {
		return c_auditdate;
	}

	public void setC_auditdate(String c_auditdate) {
		this.c_auditdate = c_auditdate;
	}

}
