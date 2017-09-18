package com.commiao.basic.business.tools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PofConfig {

    /**公募服务器地址*/
    @Value("${htmall.gongmu.path}")
    private String gongmuBaseUrl;
    /**远程调用公募银行信息查询接口URL*/
    @Value("${htmall.gongmu.bank.path}")
    private String queryBankinfoUrl;
    /**远程调用公募银行分支机构查询接口URL*/
    @Value("${htmall.gongmu.branch.path}")
    private String queryBranchinfoUrl;
    
	@Value("${htmall.special.domain.path}")
	private String domainPath;
	/**
	 * 公募服务器地址
	 */
	@Value("${htmall.gongmu.path}")
	private String pofPath;
	/**
	 * 向公募服务推送用户信息URL
	 */
	@Value("${htmall.pushuserinfo.pof.url}")
	private String pushUserInfoPofUrl;
	/**
	 * 公募用户信息修改
	 */
	@Value("${htmall.updatepofinfo.pof.url}")
	private String updatePofInfoUrl;

	/**
	 * 公募开户URL
	 */
	@Value("${htmall.openaccount.pof.url}")
	private String openAccountPofUrl;
	/**
	 * 校验公募是否开户(实名认证)URL
	 */
	@Value("${htmall.identitycertification.pof.url}")
	private String identityPofUrl;
	/**银行信息查询接口URL*/
	@Value("${htmall.gongmu.bank.path}")
	private String gongmuBankPath;
	/**远程调用公募银行分支机构查询接口URL*/
	@Value("${htmall.gongmu.branch.path}")
	private String gongmuBranchPath;
	/**公募基金查询接口url*/
	@Value("${htmall.gongmu.publicfundquery}")
	private String publicFundQuery;
	/**远程调用公募资产信息查询接口URL*/
	@Value("${htmall.myAssetsOverview.pof.url}")
	private String queryAssertInfoUrl;
	/**公募 账户申请查询接口*/
	@Value("${ufx.uri.account.apply.qry}")
	private String accountApplyQry;
	/**
	 * 获取短信验证码长度
	 */
	@Value("${sms.code.length}")
	private String smsCodeLength;
	/**
	 * 短信发送URL
	 */
	@Value("${sms.url}")
	private String smsUrl;
	/**
	 * 短信接口用户名
	 */
	@Value("${sms.username}")
	private String smsUsername;
	/**
	 * 短信接口密码
	 */
	@Value("${sms.password}")
	private String smsPassword;
	/**
	 * 短信通道状态 0=close 1=open
	 */
	@Value("${sms.status}")
	private String smsStatus;
	/**
	 * 银行账户类型
	 */
	@Value("${bank.account.type}")
	private String bankAccountType;
	/**
	 * 商户名称
	 */
	@Value("${merchant.name}")
	private String merchantName;
	/**
	 * 获取短信来源名称
	 */
	@Value("${sms.sourceName}")
	private String smsSourceName;
	/**
	 * 银联鉴权超时时间（单位：秒）
	 */
	@Value("${unionpay.auth.wait.time}")
	private String unionpayAuthWaitTime;
	/**
	 * 银联鉴权循环检查间隔时间（单位：秒）
	 */
	@Value("${unionpay.auth.check.wait.time}")
	private String unionpayCheckAuthWaitTime;
	/**
	 * 交易委托方式配置.
	 */
	@Value("${ufx.trust.way}")
	private String ufxTrustWay;
	/**
	 * 明细资金方式配置
	 */
	@Value("${ufx.detail.fund.way}")
	private String  ufxDetailFundWay;
	/**
	 * 交易来源配置
	 */
	@Value("${ufx.trade.source}")
	private String ufxTradeSource;
	
	/**
	 * 现金宝配置-基金代码 003075
	 */
	@Value("${pof.cash.treasure.code}")
	private String cashTreasureCode;
	/**
	 * 现金宝配置-基金名称 恒添宝
	 */
	@Value("${pof.cash.treasure.name}")
	private String cashTreasureName;
	/**
	 * 汇款协议号配置(是否签约汇款
	 */
	@Value("${ufx.remit.tance.no}")
	private String ufxRemittanceNo;
	/**
	 * 接口类型配置
	 */
	@Value("${ufx.fund.interface.type}")
	private String fundInterfaceType;
	/**
	 * (优先汇款支付渠道-1是柜台 K是网下委托)
	 */
	@Value("${ufx.trade.capitalMode.offline}")
	private String ufxTradeCapitalModeOffline;
	/**
	 * (优先在线支付渠道-M是通联 3是银联).
	 */
	@Value("${ufx.trade.capitalMode.online}")
	private String ufxTradeCapitalModeOnline;
	/**
	 * service调用超时时间配置
	 */
	@Value("${ufx.default.taNo}")
	private String defaultTaNo;
	
	public String getUfxRemittanceNo() {
		return ufxRemittanceNo;
	}
	public String getFundInterfaceType() {
		return fundInterfaceType;
	}
	public String getUfxTradeCapitalModeOffline() {
		return ufxTradeCapitalModeOffline;
	}
	public String getUfxTradeCapitalModeOnline() {
		return ufxTradeCapitalModeOnline;
	}
	public String getDefaultTaNo() {
		return defaultTaNo;
	}
	
	public String getCashTreasureCode() {
		return cashTreasureCode;
	}
	public String getCashTreasureName() {
		return cashTreasureName;
	}
	public boolean checkIsNull(String target){
		if(target==null||"".equals(target)){
			return true;
		}else{
			return false;
		}
	}
	public int getUnionpayAuthWaitTime() {
		if(!checkIsNull(unionpayAuthWaitTime)){
			return Integer.parseInt(unionpayAuthWaitTime);
		}else{
			return 30;
		}
		
	}
	public String getUpdatePofInfoUrl() {
		return updatePofInfoUrl;
	}
	public int getUnionpayCheckAuthWaitTime() {
		if(!checkIsNull(unionpayCheckAuthWaitTime)){
			return Integer.parseInt(unionpayCheckAuthWaitTime);
		}else{
			return 3;
		}
	}
	
	public String getAccountApplyQry() {
		return accountApplyQry;
	}
	public String getUfxTrustWay() {
		return ufxTrustWay;
	}
	public String getUfxDetailFundWay() {
		return ufxDetailFundWay;
	}
	public String getUfxTradeSource() {
		return ufxTradeSource;
	}
	public String getSmsSourceName() {
		return smsSourceName;
	}
	public int getSmsCodeLength() {
		if(!checkIsNull(smsCodeLength)){
			return Integer.parseInt(smsCodeLength);
		}else{
			return 6;
		}
	}
	public String getMerchantName() {
		return merchantName;
	}
	public String getSmsUrl() {
		return smsUrl;
	}
	public String getSmsUsername() {
		return smsUsername;
	}
	public String getSmsPassword() {
		return smsPassword;
	}
	public int getSmsStatus() {
		if(!checkIsNull(smsStatus)){
			return Integer.parseInt(smsStatus);
		}else{
			return 1;
		}
//		return smsStatus;
	}
	public String getBankAccountType() {
		return bankAccountType;
	}
	public String getDomainPath() {
		return domainPath;
	}
	public String getPofPath() {
		return pofPath;
	}
	public String getPushUserInfoPofUrl() {
		return pushUserInfoPofUrl;
	}
	public String getOpenAccountPofUrl() {
		return openAccountPofUrl;
	}
	public String getIdentityPofUrl() {
		return identityPofUrl;
	}
	public String getGongmuBankPath() {
		return gongmuBankPath;
	}
	public String getGongmuBranchPath() {
		return gongmuBranchPath;
	}
	public String getPublicFundQuery() {
		return publicFundQuery;
	}
	public String getQueryAssertInfoUrl() {
		return queryAssertInfoUrl;
	}
    public String getGongmuBaseUrl() {
        return gongmuBaseUrl;
    }
    public String getQueryBankinfoUrl() {
        return queryBankinfoUrl;
    }
    public String getQueryBranchinfoUrl() {
        return queryBranchinfoUrl;
    }
	
}
