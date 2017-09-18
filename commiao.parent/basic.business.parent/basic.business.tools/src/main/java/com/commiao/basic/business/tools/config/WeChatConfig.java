package com.commiao.basic.business.tools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WeChatConfig {

	@Value("${clientId}")
	private String clientId;
	@Value("${clientToken}")
	private String clientToken;
	@Value("${nonce}")
	private String nonce;
	/**登录有效时间RedisLiveTime*/
	@Value("${liveTime}")
	private String liveTime;
	@Value("${token}")
	private String token;
	/**图片查看路径*/
	@Value("${htmall.image.view.path}")
	private String htmallImageViewPath;
	@Value("${appId}")
	private String appId;
	@Value("${appSecret}")
	private String appSecret;
	@Value("${scope}")
	private String scope;
	@Value("${user-login-url}")
	private String userLoginUrl;
	@Value("${user-login-acco_type}")
	private String userLoginAccoType;
	@Value("${user-login-busin_flag}")
	private String userLoginBusinFlag;
	@Value("${user-login-operator_from}")
	private String userLoginOperatorFrom;
	@Value("${user-total-assert-url}")
	private String userTotalAssertUrl;
	@Value("${user-total-assert-url2}")
	private String userTotalAssertUrl2;
	@Value("${user-account-url}")
	private String userAccountUrl;
	@Value("${potential-user-account-url}")
	private String potentialUserAccountUrl;
	@Value("${JFSC_url}")
	private String jfscUrl;
	@Value("${JFSC_aeskey}")
	private String jfscAeskey;
	

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientToken() {
		return clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getLiveTime() {
		return liveTime;
	}

	public void setLiveTime(String liveTime) {
		this.liveTime = liveTime;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getHtmallImageViewPath() {
		return htmallImageViewPath;
	}

	public void setHtmallImageViewPath(String htmallImageViewPath) {
		this.htmallImageViewPath = htmallImageViewPath;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getUserLoginUrl() {
		return userLoginUrl;
	}

	public void setUserLoginUrl(String userLoginUrl) {
		this.userLoginUrl = userLoginUrl;
	}

	public String getUserLoginAccoType() {
		return userLoginAccoType;
	}

	public void setUserLoginAccoType(String userLoginAccoType) {
		this.userLoginAccoType = userLoginAccoType;
	}

	public String getUserLoginBusinFlag() {
		return userLoginBusinFlag;
	}

	public void setUserLoginBusinFlag(String userLoginBusinFlag) {
		this.userLoginBusinFlag = userLoginBusinFlag;
	}

	public String getUserLoginOperatorFrom() {
		return userLoginOperatorFrom;
	}

	public void setUserLoginOperatorFrom(String userLoginOperatorFrom) {
		this.userLoginOperatorFrom = userLoginOperatorFrom;
	}

	public String getUserTotalAssertUrl() {
		return userTotalAssertUrl;
	}

	public void setUserTotalAssertUrl(String userTotalAssertUrl) {
		this.userTotalAssertUrl = userTotalAssertUrl;
	}

	public String getUserTotalAssertUrl2() {
		return userTotalAssertUrl2;
	}

	public void setUserTotalAssertUrl2(String userTotalAssertUrl2) {
		this.userTotalAssertUrl2 = userTotalAssertUrl2;
	}

	public String getUserAccountUrl() {
		return userAccountUrl;
	}

	public void setUserAccountUrl(String userAccountUrl) {
		this.userAccountUrl = userAccountUrl;
	}

	public String getPotentialUserAccountUrl() {
		return potentialUserAccountUrl;
	}

	public void setPotentialUserAccountUrl(String potentialUserAccountUrl) {
		this.potentialUserAccountUrl = potentialUserAccountUrl;
	}

	public String getJfscUrl() {
		return jfscUrl;
	}

	public String getJfscAeskey() {
		return jfscAeskey;
	}

}
