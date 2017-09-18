package com.commiao.basic.business.tools.config.pof;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 
 * CreateDate:2017年6月25日下午4:36:00 
 * @Description: 获取恒生接口入参 
 * @author:jingmiao
 * @version V1.0   
 */
@Component
public class PofHsParamCongfig {
	
	/**
	 * 网点代码-交易访问来源. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADE_ACCESS_SOURCE
	 */
	@Value("${htjf.access.source}")
	private String tradeAccessSource;

	/**
	 * 判断是否开启民生支付渠道标志. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PAYMENT_ENABLE
	 */
	@Value("${htjf.cmbc.payment.isEnable}")
	private String cmbcPaymentIsEnable;
	
	/**
	 * 交易委托方式配置. 
	 */
	@Value("${ufx.trust.way}")
	private String ufxTrustWay;
	
	/**
	 * 明细资金方式配置. 
	 */
	@Value("${ufx.detail.fund.way}")
	private String ufxDetailFundWay;
	
	/**
	 * 交易来源配置. 
	 */
	@Value("${ufx.trade.source}")
	private String ufxTradeSource;

	/**
	 * 汇款协议号配置(是否签约汇款). 
	 */
	@Value("${ufx.remit.tance.no}")
	private String ufxRemittanceNo;

	/**
	 * 接口类型配置. 
	 */
	@Value("${ufx.fund.interface.type}")
	private String fundInterfaceType;
	
	/**
	 * 默认开户taNO. 
	 */
	@Value("${ufx.default.taNo}")
	private String ufxDefaultTaNo;
	
	
	/**
	 * 获取 网点代码-交易访问来源. <br>  POF_INTERFACE_PROPERTIES_KEY_TRADE_ACCESS_SOURCE
	 * @return the tradeAccessSource
	 */
	public String getTradeAccessSource() {
		return tradeAccessSource;
	}

	/**
	 * 获取 判断是否开启民生支付渠道标志. <br>  POF_INTERFACE_PROPERTIES_KEY_PAYMENT_ENABLE
	 * @return the cmbcPaymentIsEnable
	 */
	public String getCmbcPaymentIsEnable() {
		return cmbcPaymentIsEnable;
	}

	/**
	 * 获取 交易委托方式配置.
	 * @return the ufxTrustWay
	 */
	public String getUfxTrustWay() {
		return ufxTrustWay;
	}

	/**
	 * 获取 明细资金方式配置.
	 * @return the ufxDetailFundWay
	 */
	public String getUfxDetailFundWay() {
		return ufxDetailFundWay;
	}

	/**
	 * 获取 交易来源配置.
	 * @return the ufxTradeSource
	 */
	public String getUfxTradeSource() {
		return ufxTradeSource;
	}

	/**
	 * 获取 汇款协议号配置(是否签约汇款).
	 * @return the ufxRemittanceNo
	 */
	public String getUfxRemittanceNo() {
		return ufxRemittanceNo;
	}

	/**
	 * 获取 接口类型配置.
	 * @return the fundInterfaceType
	 */
	public String getFundInterfaceType() {
		return fundInterfaceType;
	}

	/**
	 * 获取 默认开户taNO.
	 * @return the ufxDefaultTaNo
	 */
	public String getUfxDefaultTaNo() {
		return ufxDefaultTaNo;
	}
	
}
