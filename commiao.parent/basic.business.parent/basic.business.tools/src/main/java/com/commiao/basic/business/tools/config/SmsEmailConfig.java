package com.commiao.basic.business.tools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SmsEmailConfig {

	@Value("${common.sms.url}")
	private String commonSmsUrl;
	@Value("${sms.validation.minus}")
	private String smsValidationMinus;
	@Value("${common.email.url}")
	private String commonEmailUrl;
	@Value("${site_domain}")
	private String siteDomain;
	@Value("${mail.validation.minus}")
	private String mailValidationMinus;
	
	

	public String getCommonSmsUrl() {
		return commonSmsUrl;
	}

	public void setCommonSmsUrl(String commonSmsUrl) {
		this.commonSmsUrl = commonSmsUrl;
	}

	public String getSmsValidationMinus() {
		return smsValidationMinus;
	}

	public void setSmsValidationMinus(String smsValidationMinus) {
		this.smsValidationMinus = smsValidationMinus;
	}

	public String getCommonEmailUrl() {
		return commonEmailUrl;
	}

	public void setCommonEmailUrl(String commonEmailUrl) {
		this.commonEmailUrl = commonEmailUrl;
	}

	public String getSiteDomain() {
		return siteDomain;
	}

	public void setSiteDomain(String siteDomain) {
		this.siteDomain = siteDomain;
	}

	public String getMailValidationMinus() {
		return mailValidationMinus;
	}

	public void setMailValidationMinus(String mailValidationMinus) {
		this.mailValidationMinus = mailValidationMinus;
	}
	
	
	
}
