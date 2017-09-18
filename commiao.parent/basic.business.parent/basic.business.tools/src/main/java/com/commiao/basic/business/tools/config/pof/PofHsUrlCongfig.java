package com.commiao.basic.business.tools.config.pof;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 
 * CreateDate:2017年6月25日下午4:11:11 
 * @Description: 获取恒生接口uri
 * @author:jingmiao
 * @version V1.0   
 */
@Component
public class PofHsUrlCongfig {
	
	/**
	 * 获取连接超时时间,单位: 毫秒 http.client.maxConnectTime. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_HTTPCLIENT_MAXCONNECTTIME
	 */
	@Value("${http.client.maxConnectTime}")
	private String httpClientMaxConnectTime;
	/**
	 * 获取传输超时时间, 单位: 毫秒 http.client.maxSocketTime. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_HTTPCLIENT_MAXSOCKETTIME
	 */
	@Value("${http.client.maxSocketTime}")
	private String httpClientMaxSocketTime;
	/**
	 * 获取恒生接口url ufx.baseUrl. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_BASE_URL
	 */
	@Value("${ufx.baseUrl}")
	private String hsBaseUrl;
	/**
	 * Q1001 最新基金行情查询接口 ufx.uri.newhq.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_NEWHQ_QRY_URI
	 */
	@Value("${ufx.uri.newhq.qry}")
	private String newhqQryUri;
	/**
	 * Q1002 份额查询接口 ufx.uri.share.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_SHARE_QRY_URI
	 */
	@Value("${ufx.uri.share.qry}")
	private String shareQryUri;
	/**
	 * Q1003 基金信息查询接口 ufx.uri.fundinfo.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_FUNDINFO_QRY_URI
	 */
	@Value("${ufx.uri.fundinfo.qry}")
	private String fundinfoQryUri;
	/**
	 * Q1004 折扣优惠设置查询接口 ufx.uri.discount.setting.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_DISCOUNT_SETTING_QRY_URI
	 */
	@Value("${ufx.uri.discount.setting.qry}")
	private String discountSettingQryUri;
	/**
	 * Q1005 费率查询接口 ufx.uri.rate.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_RATE_QRY_URI
	 */
	@Value("${ufx.uri.rate.qry}")
	private String rateQryUri;
	/**
	 * Q1006 份额查询接口 v101 ufx.uri.share.qry.v101.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_SHARE_QRY_V101_URI
	 */
	@Value("${ufx.uri.share.qry.v101}")
	private String shareQryV101Uri;
	/**
	 * Q1007 份额查询接口 v101 ufx.uri.share.qry.v1011.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_SHARE_QRY_V1011_URI
	 */
	@Value("${ufx.uri.share.qry.v1011}")
	private String shareQryV1011Uri;
	/**
	 * Q2001 交易申请查询接口 ufx.uri.trade.apply.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADE_APPLY_QRY_URI
	 */
	@Value("${ufx.uri.trade.apply.qry}")
	private String tradeApplyQryUri;
	/**
	 * Q2008 交易申请查询接口V101 ufx.uri.trade.apply.qry.v101.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADE_APPLY_QRY_V101_URI
	 */
	@Value("${ufx.uri.trade.apply.qry.v101}")
	private String tradeApplyQryV101Uri;
	/**
	 * 交易申请查询接口 ufx.uri.trade_apply_qry_v1.0.3.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADE_APPLY_QRY_V103_URI
	 */
	@Value("${ufx.uri.trade.apply.qry.v103}")
	private String tradeApplyQryV103Uri;
	/**
	 * Q2002 交易确认查询接口 ufx.uri.trade.confirm.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADE_CONFIRM_QRY_URI
	 */
	@Value("${ufx.uri.trade.confirm.qry}")
	private String tradeConfirmQryUri;
	/**
	 * 交易确认查询接口 ufx.uri.trade.confirm.qry.v103<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADE_CONFIRM_QRY_V103_URI
	 */
	@Value("${ufx.uri.trade.confirm.qry.v103}")
	private String tradeConfirmQryV103Uri;
	/**
	 * Q2003 分红明细查询接口 v102 ufx.uri.divi.qry.v102.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_DIVI_QRY_V102_URI
	 */
	@Value("${ufx.uri.divi.qry.v102}")
	private String diviQryV102Uri;
	/**
	 * Q2004 交易限制查询 v101 ufx.uri.trade.limit.qry.v101.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADE_LIMIT_QRY_V101_URI
	 */
	@Value("${ufx.uri.trade.limit.qry.v101}")
	private String tradeLimitQryV101Uri;
	/**
	 * Q2005 电子合同查询接口 ufx.uri.electronic.contract.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_ELECTRONIC_CONTRACT_QRY_URI
	 */
	@Value("${ufx.uri.electronic.contract.qry}")
	private String electronicContractQryUri;
	/**
	 * Q2006 约定书查询接口 ufx.uri.stipulator.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_STIPULATOR_QRY_URI
	 */
	@Value("${ufx.uri.stipulator.qry}")
	private String stipulatorQryUri;
	/**
	 * Q2007 风险揭示书查询接口 ufx.uri.risk.disclosure.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_RISK_DISCLOSURE_QRY_URI
	 */
	@Value("${ufx.uri.risk.disclosure.qry}")
	private String riskDisclosureQryUri;
	/**
	 * Q2009 投资者每日收益查询接口 ufx.uri.dayincome.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_DAYINCOME_QRY_URI
	 */
	@Value("${ufx.uri.dayincome.qry}")
	private String dayincomeQryUri;
	/**
	 * Q3001 问卷题目查询接口 ufx.uri.paperinfo.question_qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PAPERINFO_QUESTION_QRY_URI
	 */
	@Value("${ufx.uri.paperinfo.question_qry}")
	private String paperinfoQuestionQryUri;
	/**
	 * Q3002 问卷题目选项查询接口 ufx.uri.paperinfo.question.section.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PAPERINFO_QUESTION_SECTION_QRY_URI
	 */
	@Value("${ufx.uri.paperinfo.question.section.qry}")
	private String paperinfoQuestionSectionQryUri;
	/**
	 * Q3003 客户银行帐号查询接口 v101 ufx.uri.accobank.qry.v101.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_ACCOBANK_QRY_V101_URI
	 */
	@Value("${ufx.uri.accobank.qry.v101}")
	private String accobankQryV101Uri;
	/**
	 * Q3004 TA账号查询接口 v101 ufx.uri.account.qry.v101.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_ACCOUNT_QRY_V101_URI
	 */
	@Value("${ufx.uri.account.qry.v101}")
	private String accountQryV101Uri;
	/**
	 * Q3005 客户资料查询接口 ufx.uri.clientinfo.qry.acct.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_CLIENTINFO_QRY_ACCT_URI
	 */
	@Value("${ufx.uri.clientinfo.qry.acct}")
	private String clientinfoQryAcctUri;
	/**
	 * 客户资料查询接口 ufx.uri.clientinfo.qry.acct.v102. 
	 */
	@Value("${ufx.uri.clientinfo.qry.acct.v102}")
	private String clientinfoQryAcctV102Uri;
	/**
	 * Q3006 交易账户资料查询接口 ufx.uri.tradeaccount.qry.acct.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADEACCOUNT_QRY_ACCT_URI
	 */
	@Value("${ufx.uri.tradeaccount.qry.acct}")
	private String tradeaccountQryAcctUri;
	/**
	 * Q3007 客户银行帐号查询接口 demo ufx.uri.accobank.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_ACCOUNT_QRY_URI
	 */
	@Value("${ufx.uri.accobank.qry}")
	private String accobankQryUri;
	/**
	 * T4001 预约申购接口 ufx.uri.allot.trade.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_ALLOT_TRADE_URI
	 */
	@Value("${ufx.uri.allot.trade}")
	private String allotTradeUri;
	/**
	 * @description <p>预约申购接口-民生支付渠道专用</p>
	 * @author heshiyuan
	 * @date 04/08/2017 4:24 PM
	 */
	@Value("${ufx.uri.allot.trade.v102}")
	private String allotTradeV102Uri;
	/**
	 * T4002 预约赎回接口 ufx.uri.redeem.trade.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_REDEEM_TRADE_URI
	 */
	@Value("${ufx.uri.redeem.trade}")
	private String redeemTradeUri;
	/**
	 * T4003 撤单接口 ufx.uri.undotradeapply.trade.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_UNDOTRADEAPPLY_TRADE_URI
	 */
	@Value("${ufx.uri.undotradeapply.trade}")
	private String undotradeapplyTradeUri;
	/**
	 * Q1004 折扣优惠设置查询接口 ufx.uri.discount.setting.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_SUBSCRIBE_TRADE_URI
	 */
    @Value("${ufx.uri.subscribe.trade}")
    private String subscribeTradeUri;
    /**
     * @description <p>认购</p>
     * @author heshiyuan 
     * @date 04/08/2017 5:35 PM
     */
    @Value("${ufx.uri.subscribe.trade.v102}")
    private String subscribeTradeV102Uri;
	/**
	 * T4005 快速赎回接口 v101 ufx.uri.fastredeem.trade.V101.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_FASTREDEEM_TRADE_V101_URI
	 */
	@Value("${ufx.uri.fastredeem.trade.v101}")
	private String fastredeemTradeV101Uri;
	/**
	 * T4006 电子合同签署接口 ufx.uri.electronic.contract.sign.trade.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_ELECTRONIC_CONTRACT_SIGN_TRADE_URI
	 */
	@Value("${ufx.uri.electronic.contract.sign.trade}")
	private String electronicContractSignTradeUri;
	/**
	 * T5001 交易密码修改接口 ufx.uri.tradepassword.mod.acct.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADEPASSWORD_MOD_ACCT_URI
	 */
	@Value("${ufx.uri.tradepassword.mod.acct}")
	private String tradepasswordModAcctUri;
	/**
	 * T5002 登录身份验证接口 ufx.uri.login.acct.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_LOGIN_ACCT_URI
	 */
	@Value("${ufx.uri.login.acct.v101}")
	private String loginAcctV101Uri;
	/**
	 * T5003 交易帐号销户接口 ufx.uri.transaccount.close.acct.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRANSACCOUNT_CLOSE_ACCT_URI
	 */
	@Value("${ufx.uri.transaccount.close.acct}")
	private String transaccountCloseAcctUri;
	/**
	 * T5004 开户接口 ufx.uri.fundacct.direct.open.acct.V101.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_FUNDACCT_DIRECT_OPEN_ACCT_V101_URI
	 */
	@Value("${ufx.uri.fundacct.direct.open.acct.v101}")
	private String fundacctDirectOpenAcctV101Uri;
	/**
	 * T5005 增开交易账号接口 ufx.uri.tradeaccount.add.acct.V101.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADEACCOUNT_ADD_ACCT_V101_URI
	 */
	@Value("${ufx.uri.tradeaccount.add.acct.v101}")
	private String tradeaccountAddAcctV101Uri;
	/**
	 * T5006 问卷调查内容增加接口 ufx.uri.paperinfo.add.acct.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PAPERINFO_ADD_ACCT_URI
	 */
	@Value("${ufx.uri.paperinfo.add.acct}")
	private String paperinfoAddAcctUri;
	/**
	 * T5007 问卷调查内容查询接口 ufx.uri.paperinfo.qry.acct.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PAPERINFO_QRY_ACCT_URI
	 */
	@Value("${ufx.uri.paperinfo.qry.acct}")
	private String paperinfoQryAcctUri;
	/**
	 * T5008 交易密码清密接口 ufx.uri.tradepassword.clear.acct.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_TRADEPASSWORD_CLEAR_ACCT_URI
	 */
	@Value("${ufx.uri.tradepassword.clear.acct}")
	private String tradepasswordClearAcctUri;
	/**
	 * T5009 客户资料修改接口 ufx.uri.clientinfo.mod.acct.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_CLIENTINFO_MOD_ACCT_URI
	 */
	@Value("${ufx.uri.clientinfo.mod.acct.v101}")
	private String clientinfoModAcctUri;
	
	/**
	 * T5010 开户接口 ufx.uri.fundacct.direct.open.acct.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_FUNDACCT_DIRECT_OPEN_ACCT_URI
	 */
	@Value("${ufx.uri.fundacct.direct.open.acct}")
	private String fundacctDirectOpenAcctUri;
	/**
	 * P6002 身份认证接口(银联鉴权第一步) ufx.uri.pay.identity.auth.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PAY_IDENTITY_AUTH_URI
	 */
	@Value("${ufx.uri.pay.identity.auth}")
	private String payIdentityAuthUri;
	/**
	 * P6003 身份认证后处理接口(银联鉴权第二步) ufx.uri.pay.identify.auth.after.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PAY_IDENTIFY_AUTH_AFTER_URI
	 */
	@Value("${ufx.uri.pay.identify.auth.after}")
	private String payIdentifyAuthAfterUri;
	/**
	 * 组合投资 ufx.uri.portfolio.trade.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PORTFOLIO_TRADE_URI
	 */
	@Value("${ufx.uri.portfolio.trade}")
	private String portfolioTradeUri;
	/**
	 * 组合投资交易查询 ufx.uri.portfolio.summary.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PORTFOLIO_SUMMARY_QRY_URI
	 */
	@Value("${ufx.uri.portfolio.summary.qry}")
	private String portfolioSummaryQryUri;
	/**
	 * 投资组合查询 ufx.uri.portfolio.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PORTFOLIO_QRY_URI
	 */
	@Value("${ufx.uri.portfolio.qry}")
	private String portfolioQryUri;
	/**
	 * 修改分红方式 ufx.uri.dividendmethod.trade.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_DIVIDEND_METHOD_TRADE_URI
	 */
	@Value("${ufx.uri.dividendmethod.trade}")
	private String dividendMethodTradeUri;
	/**
	 * 解除签约接口 ufx.uri.unwind.contract.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_UNWIND_CONTRACT_URI
	 */
	@Value("${ufx.uri.unwind.contract}")
	private String unwindContractUri;
	/**
	 * 短信签约接口 ufx.uri.pay.sign.contract.sms.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_PAY_SIGN_CONTRACT_SMS_URI
	 */
	@Value("${ufx.uri.pay.sign.contract.sms}")
	private String paySignContractSmsUri;
	/**
	 * 份额组合编号查询借口 ufx.uri.share.portfolio.code.qry.<br/>
	 * POF_INTERFACE_PROPERTIES_KEY_SHARE_PORTFOLIO_CODE_QRY_URI
	 */
	@Value("${ufx.uri.share.portfolio.code.qry}")
	private String sharePortfolioCodeQryUri;
	
	/**
	 * 合规开户
	 */
	@Value("${ufx.uri.fundacct.direct.open.acct.v102}")
	private String fundacctDirectOpenAcctV102;
	/**
	 * 合规账户申请查询
	 */
	@Value("${ufx.uri.account.apply.qry.v101}")
	private String accountApplyQryV101;
	/**
	 * 合规客户资料修改
	 */
	@Value("${ufx.uri.clientinfo.mod.acct.v101}")
	private String clientinfoModAcctV101;
	/**
	 * 合规客户资料查询
	 */
	@Value("${ufx.uri.clientinfo.qry.acct.v102}")
	private String clientinfoQryAcctV102;
	
	
	
	/**
	 * 获取 合规开户
	 * @return the fundacctDirectOpenAcctV102
	 */
	public String getFundacctDirectOpenAcctV102() {
		return fundacctDirectOpenAcctV102;
	}

	/**
	 * 获取 合规账户申请查询
	 * @return the accountApplyQryV101
	 */
	public String getAccountApplyQryV101() {
		return accountApplyQryV101;
	}

	/**
	 * 获取 合规客户资料修改
	 * @return the clientinfoModAcctV101
	 */
	public String getClientinfoModAcctV101() {
		return clientinfoModAcctV101;
	}

	/**
	 * 获取 合规客户资料查询
	 * @return the clientinfoQryAcctV102
	 */
	public String getClientinfoQryAcctV102() {
		return clientinfoQryAcctV102;
	}

	/**
	 * @Description::连接超时时间,单位: 毫秒<br/>
	 * @author hehch
	 * @return
	 */
	public int getHttpClientMaxConnectTime() {
		try {
			return Integer.parseInt(httpClientMaxConnectTime);
		} catch (Exception e) {
			return Integer.valueOf(20000).intValue();
		}
	}

	/**
	 * @Description::传输超时时间, 单位: 毫秒<br/>
	 * @author hehch
	 * @return
	 */
	public int getHttpClientMaxSocketTime() {
		try {
			return Integer.parseInt(httpClientMaxSocketTime);
		} catch (Exception e) {
			return Integer.valueOf(20000).intValue();
		}
	}
	
	/**
	 * 获取 获取恒生接口url ufx.baseUrl. <br>  POF_INTERFACE_PROPERTIES_KEY_BASE_URL
	 * @return the hsBaseUrl
	 */
	public String getHsBaseUrl() {
		return hsBaseUrl;
	}
	/**
	 * 获取 Q1001 最新基金行情查询接口 ufx.uri.newhq.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_NEWHQ_QRY_URI
	 * @return the newhqQryUri
	 */
	public String getNewhqQryUri() {
		return newhqQryUri;
	}
	/**
	 * 获取 Q1002 份额查询接口 ufx.uri.share.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_SHARE_QRY_URI
	 * @return the shareQryUri
	 */
	public String getShareQryUri() {
		return shareQryUri;
	}
	/**
	 * 获取 Q1003 基金信息查询接口 ufx.uri.fundinfo.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_FUNDINFO_QRY_URI
	 * @return the fundinfoQryUri
	 */
	public String getFundinfoQryUri() {
		return fundinfoQryUri;
	}
	/**
	 * 获取 Q1004 折扣优惠设置查询接口 ufx.uri.discount.setting.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_DISCOUNT_SETTING_QRY_URI
	 * @return the discountSettingQryUri
	 */
	public String getDiscountSettingQryUri() {
		return discountSettingQryUri;
	}
	/**
	 * 获取 Q1005 费率查询接口 ufx.uri.rate.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_RATE_QRY_URI
	 * @return the rateQryUri
	 */
	public String getRateQryUri() {
		return rateQryUri;
	}
	/**
	 * 获取 Q1006 份额查询接口 v101 ufx.uri.share.qry.v101.<br>  POF_INTERFACE_PROPERTIES_KEY_SHARE_QRY_V101_URI
	 * @return the shareQryV101Uri
	 */
	public String getShareQryV101Uri() {
		return shareQryV101Uri;
	}
	/**
	 * 获取 Q1007 份额查询接口 v101 ufx.uri.share.qry.v1011.<br>  POF_INTERFACE_PROPERTIES_KEY_SHARE_QRY_V1011_URI
	 * @return the shareQryV1011Uri
	 */
	public String getShareQryV1011Uri() {
		return shareQryV1011Uri;
	}
	/**
	 * 获取 Q2001 交易申请查询接口 ufx.uri.trade.apply.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_TRADE_APPLY_QRY_URI
	 * @return the tradeApplyQryUri
	 */
	public String getTradeApplyQryUri() {
		return tradeApplyQryUri;
	}
	/**
	 * 获取 Q2008 交易申请查询接口V101 ufx.uri.trade.apply.qry.v101.<br>  POF_INTERFACE_PROPERTIES_KEY_TRADE_APPLY_QRY_V101_URI
	 * @return the tradeApplyQryV101Uri
	 */
	public String getTradeApplyQryV101Uri() {
		return tradeApplyQryV101Uri;
	}
	/**
	 * 获取 交易申请查询接口 ufx.uri.trade_apply_qry_v1.0.3.<br>  POF_INTERFACE_PROPERTIES_KEY_TRADE_APPLY_QRY_V103_URI
	 * @return the tradeApplyQryV103Uri
	 */
	public String getTradeApplyQryV103Uri() {
		return tradeApplyQryV103Uri;
	}
	/**
	 * 获取 Q2002 交易确认查询接口 ufx.uri.trade.confirm.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_TRADE_CONFIRM_QRY_URI
	 * @return the tradeConfirmQryUri
	 */
	public String getTradeConfirmQryUri() {
		return tradeConfirmQryUri;
	}
	/**
	 * 获取 交易确认查询接口 ufx.uri.trade.confirm.qry.v103<br>  POF_INTERFACE_PROPERTIES_KEY_TRADE_CONFIRM_QRY_V103_URI
	 * @return the tradeConfirmQryV103Uri
	 */
	public String getTradeConfirmQryV103Uri() {
		return tradeConfirmQryV103Uri;
	}
	/**
	 * 获取 Q2003 分红明细查询接口 v102 ufx.uri.divi.qry.v102.<br>  POF_INTERFACE_PROPERTIES_KEY_DIVI_QRY_V102_URI
	 * @return the diviQryV102Uri
	 */
	public String getDiviQryV102Uri() {
		return diviQryV102Uri;
	}
	/**
	 * 获取 Q2004 交易限制查询 v101 ufx.uri.trade.limit.qry.v101.<br>  POF_INTERFACE_PROPERTIES_KEY_TRADE_LIMIT_QRY_V101_URI
	 * @return the tradeLimitQryV101Uri
	 */
	public String getTradeLimitQryV101Uri() {
		return tradeLimitQryV101Uri;
	}
	/**
	 * 获取 Q2005 电子合同查询接口 ufx.uri.electronic.contract.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_ELECTRONIC_CONTRACT_QRY_URI
	 * @return the electronicContractQryUri
	 */
	public String getElectronicContractQryUri() {
		return electronicContractQryUri;
	}
	/**
	 * 获取 Q2006 约定书查询接口 ufx.uri.stipulator.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_STIPULATOR_QRY_URI
	 * @return the stipulatorQryUri
	 */
	public String getStipulatorQryUri() {
		return stipulatorQryUri;
	}
	/**
	 * 获取 Q2007 风险揭示书查询接口 ufx.uri.risk.disclosure.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_RISK_DISCLOSURE_QRY_URI
	 * @return the riskDisclosureQryUri
	 */
	public String getRiskDisclosureQryUri() {
		return riskDisclosureQryUri;
	}
	/**
	 * 获取 Q2009 投资者每日收益查询接口 ufx.uri.dayincome.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_DAYINCOME_QRY_URI
	 * @return the dayincomeQryUri
	 */
	public String getDayincomeQryUri() {
		return dayincomeQryUri;
	}
	/**
	 * 获取 Q3001 问卷题目查询接口 ufx.uri.paperinfo.question_qry.<br>  POF_INTERFACE_PROPERTIES_KEY_PAPERINFO_QUESTION_QRY_URI
	 * @return the paperinfoQuestionQryUri
	 */
	public String getPaperinfoQuestionQryUri() {
		return paperinfoQuestionQryUri;
	}
	/**
	 * 获取 Q3002 问卷题目选项查询接口 ufx.uri.paperinfo.question.section.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_PAPERINFO_QUESTION_SECTION_QRY_URI
	 * @return the paperinfoQuestionSectionQryUri
	 */
	public String getPaperinfoQuestionSectionQryUri() {
		return paperinfoQuestionSectionQryUri;
	}
	/**
	 * 获取 Q3003 客户银行帐号查询接口 v101 ufx.uri.accobank.qry.v101.<br>  POF_INTERFACE_PROPERTIES_KEY_ACCOBANK_QRY_V101_URI
	 * @return the accobankQryV101Uri
	 */
	public String getAccobankQryV101Uri() {
		return accobankQryV101Uri;
	}
	/**
	 * 获取 Q3004 TA账号查询接口 v101 ufx.uri.account.qry.v101.<br>  POF_INTERFACE_PROPERTIES_KEY_ACCOUNT_QRY_V101_URI
	 * @return the accountQryV101Uri
	 */
	public String getAccountQryV101Uri() {
		return accountQryV101Uri;
	}
	/**
	 * 获取 Q3005 客户资料查询接口 ufx.uri.clientinfo.qry.acct.<br>  POF_INTERFACE_PROPERTIES_KEY_CLIENTINFO_QRY_ACCT_URI
	 * @return the clientinfoQryAcctUri
	 */
	public String getClientinfoQryAcctUri() {
		return clientinfoQryAcctUri;
	}
	/**
	 * 获取 客户资料查询接口 ufx.uri.clientinfo.qry.acct.v102.
	 * @return the clientinfoQryAcctUriV102Uri
	 */
	public String getClientinfoQryAcctV102Uri() {
		return clientinfoQryAcctV102Uri;
	}
	
	/**
	 * 获取 Q3006 交易账户资料查询接口 ufx.uri.tradeaccount.qry.acct.<br>  POF_INTERFACE_PROPERTIES_KEY_TRADEACCOUNT_QRY_ACCT_URI
	 * @return the tradeaccountQryAcctUri
	 */
	public String getTradeaccountQryAcctUri() {
		return tradeaccountQryAcctUri;
	}
	/**
	 * 获取 Q3007 客户银行帐号查询接口 demo ufx.uri.accobank.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_ACCOUNT_QRY_URI
	 * @return the accobankQryUri
	 */
	public String getAccobankQryUri() {
		return accobankQryUri;
	}
	/**
	 * 获取 T4001 预约申购接口 ufx.uri.allot.trade.<br>  POF_INTERFACE_PROPERTIES_KEY_ALLOT_TRADE_URI
	 * @return the allotTradeUri
	 */
	public String getAllotTradeUri() {
		return allotTradeUri;
	}
	/**
	 * 获取 T4002 预约赎回接口 ufx.uri.redeem.trade.<br>  POF_INTERFACE_PROPERTIES_KEY_REDEEM_TRADE_URI
	 * @return the redeemTradeUri
	 */
	public String getRedeemTradeUri() {
		return redeemTradeUri;
	}
	/**
	 * 获取 T4003 撤单接口 ufx.uri.undotradeapply.trade.<br>  POF_INTERFACE_PROPERTIES_KEY_UNDOTRADEAPPLY_TRADE_URI
	 * @return the undotradeapplyTradeUri
	 */
	public String getUndotradeapplyTradeUri() {
		return undotradeapplyTradeUri;
	}
	/**
	 * 获取 Q1004 折扣优惠设置查询接口 ufx.uri.discount.setting.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_SUBSCRIBE_TRADE_URI
	 * @return the subscribeTradeUri
	 */
	public String getSubscribeTradeUri() {
		return subscribeTradeUri;
	}
	/**
	 * 获取 T4005 快速赎回接口 v101 ufx.uri.fastredeem.trade.V101.<br>  POF_INTERFACE_PROPERTIES_KEY_FASTREDEEM_TRADE_V101_URI
	 * @return the fastredeemTradeV101Uri
	 */
	public String getFastredeemTradeV101Uri() {
		return fastredeemTradeV101Uri;
	}
	/**
	 * 获取 T4006 电子合同签署接口 ufx.uri.electronic.contract.sign.trade.<br>  POF_INTERFACE_PROPERTIES_KEY_ELECTRONIC_CONTRACT_SIGN_TRADE_URI
	 * @return the electronicContractSignTradeUri
	 */
	public String getElectronicContractSignTradeUri() {
		return electronicContractSignTradeUri;
	}
	/**
	 * 获取 T5001 交易密码修改接口 ufx.uri.tradepassword.mod.acct.<br>  POF_INTERFACE_PROPERTIES_KEY_TRADEPASSWORD_MOD_ACCT_URI
	 * @return the tradepasswordModAcctUri
	 */
	public String getTradepasswordModAcctUri() {
		return tradepasswordModAcctUri;
	}
	/**
	 * 获取 T5002 登录身份验证接口 ufx.uri.login.acct.<br>  POF_INTERFACE_PROPERTIES_KEY_LOGIN_ACCT_URI
	 * @return the loginAcctUri
	 */
	public String getLoginAcctV101Uri() {
		return loginAcctV101Uri;
	}
	/**
	 * 获取 T5003 交易帐号销户接口 ufx.uri.transaccount.close.acct.<br>  POF_INTERFACE_PROPERTIES_KEY_TRANSACCOUNT_CLOSE_ACCT_URI
	 * @return the transaccountCloseAcctUri
	 */
	public String getTransaccountCloseAcctUri() {
		return transaccountCloseAcctUri;
	}
	/**
	 * 获取 T5004 开户接口 ufx.uri.fundacct.direct.open.acct.V101.<br>  POF_INTERFACE_PROPERTIES_KEY_FUNDACCT_DIRECT_OPEN_ACCT_V101_URI
	 * @return the fundacctDirectOpenAcctV101Uri
	 */
	public String getFundacctDirectOpenAcctV101Uri() {
		return fundacctDirectOpenAcctV101Uri;
	}
	/**
	 * 获取 T5005 增开交易账号接口 ufx.uri.tradeaccount.add.acct.V101.<br>  POF_INTERFACE_PROPERTIES_KEY_TRADEACCOUNT_ADD_ACCT_V101_URI
	 * @return the tradeaccountAddAcctV101Uri
	 */
	public String getTradeaccountAddAcctV101Uri() {
		return tradeaccountAddAcctV101Uri;
	}
	/**
	 * 获取 T5006 问卷调查内容增加接口 ufx.uri.paperinfo.add.acct.<br>  POF_INTERFACE_PROPERTIES_KEY_PAPERINFO_ADD_ACCT_URI
	 * @return the paperinfoAddAcctUri
	 */
	public String getPaperinfoAddAcctUri() {
		return paperinfoAddAcctUri;
	}
	/**
	 * 获取 T5007 问卷调查内容查询接口 ufx.uri.paperinfo.qry.acct.<br>  POF_INTERFACE_PROPERTIES_KEY_PAPERINFO_QRY_ACCT_URI
	 * @return the paperinfoQryAcctUri
	 */
	public String getPaperinfoQryAcctUri() {
		return paperinfoQryAcctUri;
	}
	/**
	 * 获取 T5008 交易密码清密接口 ufx.uri.tradepassword.clear.acct.<br>  POF_INTERFACE_PROPERTIES_KEY_TRADEPASSWORD_CLEAR_ACCT_URI
	 * @return the tradepasswordClearAcctUri
	 */
	public String getTradepasswordClearAcctUri() {
		return tradepasswordClearAcctUri;
	}
	/**
	 * 获取 T5009 客户资料修改接口 ufx.uri.clientinfo.mod.acct.<br>  POF_INTERFACE_PROPERTIES_KEY_CLIENTINFO_MOD_ACCT_URI
	 * @return the clientinfoModAcctUri
	 */
	public String getClientinfoModAcctUri() {
		return clientinfoModAcctUri;
	}
	/**
	 * 获取 T5010 开户接口 ufx.uri.fundacct.direct.open.acct.<br>  POF_INTERFACE_PROPERTIES_KEY_FUNDACCT_DIRECT_OPEN_ACCT_URI
	 * @return the fundacctDirectOpenAcctUri
	 */
	public String getFundacctDirectOpenAcctUri() {
		return fundacctDirectOpenAcctUri;
	}
	/**
	 * 获取 P6002 身份认证接口(银联鉴权第一步) ufx.uri.pay.identity.auth.<br>  POF_INTERFACE_PROPERTIES_KEY_PAY_IDENTITY_AUTH_URI
	 * @return the payIdentityAuthUri
	 */
	public String getPayIdentityAuthUri() {
		return payIdentityAuthUri;
	}
	/**
	 * 获取 P6003 身份认证后处理接口(银联鉴权第二步) ufx.uri.pay.identify.auth.after.<br>  POF_INTERFACE_PROPERTIES_KEY_PAY_IDENTIFY_AUTH_AFTER_URI
	 * @return the payIdentifyAuthAfterUri
	 */
	public String getPayIdentifyAuthAfterUri() {
		return payIdentifyAuthAfterUri;
	}
	/**
	 * 获取 组合投资 ufx.uri.portfolio.trade.<br>  POF_INTERFACE_PROPERTIES_KEY_PORTFOLIO_TRADE_URI
	 * @return the portfolioTradeUri
	 */
	public String getPortfolioTradeUri() {
		return portfolioTradeUri;
	}
	/**
	 * 获取 组合投资交易查询 ufx.uri.portfolio.summary.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_PORTFOLIO_SUMMARY_QRY_URI
	 * @return the portfolioSummaryQryUri
	 */
	public String getPortfolioSummaryQryUri() {
		return portfolioSummaryQryUri;
	}
	/**
	 * 获取 投资组合查询 ufx.uri.portfolio.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_PORTFOLIO_QRY_URI
	 * @return the portfolioQryUri
	 */
	public String getPortfolioQryUri() {
		return portfolioQryUri;
	}
	/**
	 * 获取 修改分红方式 ufx.uri.dividendmethod.trade.<br>  POF_INTERFACE_PROPERTIES_KEY_DIVIDEND_METHOD_TRADE_URI
	 * @return the dividendMethodTradeUri
	 */
	public String getDividendMethodTradeUri() {
		return dividendMethodTradeUri;
	}
	/**
	 * 获取 解除签约接口 ufx.uri.unwind.contract.<br>  POF_INTERFACE_PROPERTIES_KEY_UNWIND_CONTRACT_URI
	 * @return the unwindContractUri
	 */
	public String getUnwindContractUri() {
		return unwindContractUri;
	}
	/**
	 * 获取 短信签约接口 ufx.uri.pay.sign.contract.sms.<br>  POF_INTERFACE_PROPERTIES_KEY_PAY_SIGN_CONTRACT_SMS_URI
	 * @return the paySignContractSmsUri
	 */
	public String getPaySignContractSmsUri() {
		return paySignContractSmsUri;
	}
	/**
	 * 获取 份额组合编号查询借口 ufx.uri.share.portfolio.code.qry.<br>  POF_INTERFACE_PROPERTIES_KEY_SHARE_PORTFOLIO_CODE_QRY_URI
	 * @return the sharePortfolioCodeQryUri
	 */
	public String getSharePortfolioCodeQryUri() {
		return sharePortfolioCodeQryUri;
	}

	public String getAllotTradeV102Uri() {
		return allotTradeV102Uri;
	}

	public void setAllotTradeV102Uri(String allotTradeV102Uri) {
		this.allotTradeV102Uri = allotTradeV102Uri;
	}

    public String getSubscribeTradeV102Uri() {
        return subscribeTradeV102Uri;
    }

    public void setSubscribeTradeV102Uri(String subscribeTradeV102Uri) {
        this.subscribeTradeV102Uri = subscribeTradeV102Uri;
    }
}
