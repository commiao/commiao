package com.commiao.domain.enums;

/**
 * @author jingmiao
 * 交易状态-系统判断交易状态的依据
 */
public enum TradeStatus {

	/**
	 * 待处理 1111
	 */
	HUIXIN_WAITING("1111"),
	/**
	 * 处理失败 9999
	 */
	HUIXIN_FAIL("9999"),
	/**
	 * 处理成功 0000
	 */
	HUIXIN_SUCCESS("0000");

	private String tradeType;
	 
	TradeStatus(String status){
		this.tradeType = status;
	}
	
	public String value(){
		return tradeType;
	}
}
