package com.chtwm.mall.core.service.hsws.model.request;

/**
 * 撤销合格投资者认定申请(CRM)(D135) 接口实体类
 * @author Administrator
 *
 */
public class CancelQualifyInvestorReqRequest extends BaseRequest {

	private static final long serialVersionUID = -927065260096519923L;

	private String p_serialno; // C10 序列号 Y

	public String getP_serialno() {
		return p_serialno;
	}

	public void setP_serialno(String p_serialno) {
		this.p_serialno = p_serialno;
	}

}
