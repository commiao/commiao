package com.chtwm.mall.core.service.hsws.model.request;

/**
 * @author Administrator
 *
 */
public class GetQualifyInvestorFlagRequest extends BaseRequest {

	private static final long serialVersionUID = 7006159988337951473L;

	private String p_custno; // C12 客户编号 Y
	private Double p_reservebalance; // N16.2 预约金额 Y

	public String getP_custno() {
		return p_custno;
	}

	public void setP_custno(String p_custno) {
		this.p_custno = p_custno;
	}

	public Double getP_reservebalance() {
		return p_reservebalance;
	}

	public void setP_reservebalance(Double p_reservebalance) {
		this.p_reservebalance = p_reservebalance;
	}

}
