package com.chtwm.mall.core.service.hsws.model.request;

/**
 * 合格投资者认定申请查询(CRM)(D132) 接口实体类
 * @author Administrator
 *
 */
public class GetQualifyInvestorReqRequest extends BaseRequest {
	
	private static final long serialVersionUID = -2765327809250914298L;

	private Integer p_serialno; // "序列号 【序列号和客户编号至少有一个不为空】" N
	private String p_custno; // C12 "客户编号 【序列号和客户编号至少有一个不为空】" N
	private String p_status; // C8 预约状态【FUNDCRM3014字典】 N

	public Integer getP_serialno() {
		return p_serialno;
	}

	public void setP_serialno(Integer p_serialno) {
		this.p_serialno = p_serialno;
	}

	public String getP_custno() {
		return p_custno;
	}

	public void setP_custno(String p_custno) {
		this.p_custno = p_custno;
	}

	public String getP_status() {
		return p_status;
	}

	public void setP_status(String p_status) {
		this.p_status = p_status;
	}

}
