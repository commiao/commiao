package com.chtwm.mall.pojo.controller.pc.product.result;


/**
 * 
 * @author seven
 *
 */
/*
{
    data: 
		{ 
         }

    ,
    hmac:"", //预留字段
    msg: "success",
    status: "0"
}
 */
public class ProductReserveResult {
	//是否需要重定向签署合同页面1.否 2.是
	private String redirectFlag;
	
	private String signUrl;
	
	private String signTip;
	
	private String ecSpecifyCode;
	//产品名称
	private String fundName;
	//募集账号
	private String raiseAcco;
	//募集户名
	private String raiseName;
	//募集银行名称
	private String raiseBankName;
	
	//产品电子合同代码
	private String taFundCode;
	

	public String getSignUrl() {
		return signUrl;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}

	public String getSignTip() {
		return signTip;
	}

	public void setSignTip(String signTip) {
		this.signTip = signTip;
	}

	public String getEcSpecifyCode() {
		return ecSpecifyCode;
	}

	public void setEcSpecifyCode(String ecSpecifyCode) {
		this.ecSpecifyCode = ecSpecifyCode;
	}

	public String getRedirectFlag() {
		return redirectFlag;
	}

	public void setRedirectFlag(String redirectFlag) {
		this.redirectFlag = redirectFlag;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getRaiseAcco() {
		return raiseAcco;
	}

	public void setRaiseAcco(String raiseAcco) {
		this.raiseAcco = raiseAcco;
	}

	public String getRaiseName() {
		return raiseName;
	}

	public void setRaiseName(String raiseName) {
		this.raiseName = raiseName;
	}

	public String getRaiseBankName() {
		return raiseBankName;
	}

	public void setRaiseBankName(String raiseBankName) {
		this.raiseBankName = raiseBankName;
	}

	public String getTaFundCode() {
		return taFundCode;
	}

	public void setTaFundCode(String taFundCode) {
		this.taFundCode = taFundCode;
	}
	
	

}
