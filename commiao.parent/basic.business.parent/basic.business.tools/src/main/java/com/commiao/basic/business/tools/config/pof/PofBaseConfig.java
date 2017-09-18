package com.commiao.basic.business.tools.config.pof;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 
 * CreateDate:2017年6月25日下午5:35:44 
 * @Description: 公募的基本配置文件
 * @author:jingmiao
 * @version V1.0   
 */
@Component
public class PofBaseConfig {
	
	/**
	 * 银行账户类型. 
	 */
	@Value("${bank.account.type}")
	private String bankAccountType;

	/**
	 * 商户名称. 
	 */
	@Value("${merchant.name}")
	private String merchantName;
	
	/**
	 * 银联鉴权超时时间（单位：秒）. 
	 */
	@Value("${unionpay.auth.wait.time}")
	private String unionpayAuthWaitTime;

	/**
	 * 银联鉴权循环检查间隔时间（单位：秒）. 
	 */
	@Value("${unionpay.auth.check.wait.time}")
	private String unionpayCheckAuthWaitTime;

	/**
	 * 优先在线支付渠道-M是通联 3是银联. 
	 */
	@Value("${ufx.trade.capitalMode.online}")
	private String ufxTradeCapitalModeOnline;
	
	/**
	 * 优先汇款支付渠道-1是柜台 K是网下委托. 
	 */
	@Value("${ufx.trade.capitalMode.offline}")
	private String ufxTradeCapitalModeOffline;
	
	/**
	 * service调用超时时间配置. 
	 */
	@Value("${pof.service.timeOut}")
	private String serviceTimeOut;

	
	/**
	 * 现金宝配置-基金代码 003075. 
	 */
	@Value("${pof.cash.treasure.code}")
	private String cashTreasureCode;

	/**
	 * 现金宝配置-基金名称 恒添宝. 
	 */
	@Value("${pof.cash.treasure.name}")
	private String cashTreasureName;
	/**
	 * 公募调用鉴权服务器地址.
	 */
	@Value("${pof.authenticate.server.url}")
	private String AuthenticateServerUrl ;
	
	
	/**
	 * 金服私募WAP推送明泽用户信息 htjf.pef.ticket
	 */
	@Value("${htjf.pef.ticket}")
	private String htjfPefTicket;
	/**
	 * 金服私募WAP推送明泽用户信息 htjf.pef.key
	 */
	@Value("${htjf.pef.key}")
	private String htjfPefKey;
	/**
	 * 金服公募PC跳转明泽详情页并登录 htjf.htmz.ticket
	 */
	@Value("${htjf.htmz.ticket}")
	private String htjfHtmzTicket;
	/**
	 * 金服公募PC跳转明泽详情页并登录 htjf.htmz.key
	 */
	@Value("${htjf.htmz.key}")
	private String htjfHtmzKey;
	
	/** 
	 * @Description::(金服私募WAP推送明泽用户信息 htjf.pef.ticket). <br/> 
	 * @author jingmiao
	 * @return
	 */ 
	public String getHtjfPefTicket(){
		return htjfPefTicket;
	}
	/** 
	 * @Description::(金服私募WAP推送明泽用户信息 htjf.pef.key). <br/> 
	 * @author jingmiao
	 * @return
	 */ 
	public String getHtjfPefKey(){
		return htjfPefKey;
	}
	/** 
	 * @Description::(金服公募PC跳转明泽详情页并登录 htjf.htmz.ticket). <br/> 
	 * @author jingmiao
	 * @return
	 */ 
	public String getHtjfHtmzTicket(){
		return htjfHtmzTicket;
	}
	/** 
	 * @Description::(金服公募PC跳转明泽详情页并登录 htjf.htmz.key). <br/> 
	 * @author jingmiao
	 * @return
	 */ 
	public String getHtjfHtmzKey(){
		return htjfHtmzKey;
	}

	/**
	 * 公募调用鉴权服务器接口名称.
	 */
	@Value("${pof.authenticate.interface.url}")
	private String AuthenticateInterfaceUrl ;
	
	/**
	 * 获取 银行账户类型.
	 * @return the bankAccountType
	 */
	public String getBankAccountType() {
		return bankAccountType;
	}



	/**
	 * 获取 商户名称.
	 * @return the merchantName
	 */
	public String getMerchantName() {
		return merchantName;
	}



	/**
	 * 获取 银联鉴权超时时间（单位：秒）.
	 * @return the unionpayAuthWaitTime
	 */
	public String getUnionpayAuthWaitTime() {
		return unionpayAuthWaitTime;
	}



	/**
	 * 获取 银联鉴权循环检查间隔时间（单位：秒）.
	 * @return the unionpayCheckAuthWaitTime
	 */
	public String getUnionpayCheckAuthWaitTime() {
		return unionpayCheckAuthWaitTime;
	}



	/**
	 * 获取 优先在线支付渠道-M是通联 3是银联.
	 * @return the ufxTradeCapitalModeOnline
	 */
	public String getUfxTradeCapitalModeOnline() {
		return ufxTradeCapitalModeOnline;
	}



	/**
	 * 获取 优先汇款支付渠道-1是柜台 K是网下委托.
	 * @return the ufxTradeCapitalModeOffline
	 */
	public String getUfxTradeCapitalModeOffline() {
		return ufxTradeCapitalModeOffline;
	}



	/**
	 * 获取 service调用超时时间配置.
	 * @return the serviceTimeOut
	 */
	public String getServiceTimeOut() {
		return serviceTimeOut;
	}



	/**
	 * 获取 现金宝配置-基金代码 003075.
	 * @return the cashTreasureCode
	 */
	public String getCashTreasureCode() {
		return cashTreasureCode;
	}



	/**
	 * 获取 现金宝配置-基金名称 恒添宝.
	 * @return the cashTreasureName
	 */
	public String getCashTreasureName() {
		return cashTreasureName;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public void setUnionpayAuthWaitTime(String unionpayAuthWaitTime) {
		this.unionpayAuthWaitTime = unionpayAuthWaitTime;
	}

	public void setUnionpayCheckAuthWaitTime(String unionpayCheckAuthWaitTime) {
		this.unionpayCheckAuthWaitTime = unionpayCheckAuthWaitTime;
	}

	public void setUfxTradeCapitalModeOnline(String ufxTradeCapitalModeOnline) {
		this.ufxTradeCapitalModeOnline = ufxTradeCapitalModeOnline;
	}

	public void setUfxTradeCapitalModeOffline(String ufxTradeCapitalModeOffline) {
		this.ufxTradeCapitalModeOffline = ufxTradeCapitalModeOffline;
	}

	public void setServiceTimeOut(String serviceTimeOut) {
		this.serviceTimeOut = serviceTimeOut;
	}

	public void setCashTreasureCode(String cashTreasureCode) {
		this.cashTreasureCode = cashTreasureCode;
	}

	public void setCashTreasureName(String cashTreasureName) {
		this.cashTreasureName = cashTreasureName;
	}

	public String getAuthenticateServerUrl() {
		return AuthenticateServerUrl;
	}

	public void setAuthenticateServerUrl(String authenticateServerUrl) {
		AuthenticateServerUrl = authenticateServerUrl;
	}

	public String getAuthenticateInterfaceUrl() {
		return AuthenticateInterfaceUrl;
	}

	public void setAuthenticateInterfaceUrl(String authenticateInterfaceUrl) {
		AuthenticateInterfaceUrl = authenticateInterfaceUrl;
	}
}
