package com.commiao.basic.business.tools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PefConfig {

	@Value("${htmall.image.view.path}")
	private String htmallImageViewPath;
	@Value("${htmall.special.domain.path}")
	private String htmallSpecialDomainPath;
	@Value("${upload.imag.limit}")
	private String uploadImagLimit;
	@Value("${upload.word.limit}")
	private String uploadWordLimit;
	@Value("${htmall.image.storage.path}")
	private String htmallImageStoragePath;
	@Value("${qualified.file.path}")
	private String qualifiedFilePath;
	@Value("${qualified.file.name}")
	private String qualifiedFileName;
	@Value("${qualified.organ.file.name}")
	private String qualifiedOrganFileName;
	/** 允许赎回开始时间 */
	@Value("${redemption.time.limit}")
	private String redemptionTimeLimit;
	/**
	 * adjunct服务器(鉴权服务)地址
	 */
	@Value("${htmall.union.cert.server.url}")
	private String adjunctServerUrl;
	@Value("${encrypt.aes.key}")
	private String encryptAesKey;
	/**
	 * 私募主站站点
	 */
	@Value("${site_domain}")
	private String siteDomain;
	/** 公安部认证接口安全码 */
	@Value("${cert.key}")
	private String certKey;
	/** 公安部认证接口url */
	@Value("${cert.baseurl}")
	private String certBaseurl;
	/** 实名认证服务根url */
	@Value("${htmall.union.cert.server.url}")
	private String htmallUnionCertServerUrl;
	/** 实名认证服务uri */
	@Value("${htmall.union.cert.url}")
	private String htmallUnionCertUrl;
	/** 用户登录 */
	@Value("${user_login_pc}")
	private String userLoginPc;
	/** 跳转页 */
	@Value("${localjump_pc}")
	private String localjumpPc;
	/** 调查问卷个人 */
	@Value("${user_survey_pc_per}")
	private String userSurveyPcPer;
	/** 调查问卷机构 */
	@Value("${user_survey_pc_org}")
	private String userSurveyPcOrg;
	/** 实名认证 */
	@Value("${user_certificate_pc}")
	private String userCertificatePc;
	/**
	 * adjunct鉴权认证URL
	 */
	@Value("${htmall.payidentity.query.url}")
	private String payIdentityUrl;
	
	@Value("${cnzz.site.id}")
	private String cnzzSiteId;
	/**推广站点主页**/
	@Value("${tg.site.main}")
	private String tgSiteMain;
	@Value("${main.site.url}")
	private String mainSiteUrl;
	/**产品材料根路径*/
	@Value("${resourcePath}")
	private String resourcePath;
	
	/**首页指数缓存时间(天)*/
	@Value("${ScalarliveTime}")
	private String scalarliveTime;
	@Value("${excludePath}")
	private String excludePath;
	/**投资者分类附件上传目录*/
	@Value("${htmall.investors.classify.path}")
	private String htmallInvestClassifyPath;
	/**需校验登录的html目录*/
	@Value("${validateLoginHtml}")
	private String validateLoginHtml;
	
	/**理顾宝APP服务器地址*/
    @Value("${lgbapp.base.url}")
    private String lgbappBaseUrl;
    /**注册邀请接口url*/
    @Value("${invite.Resgister.url}")
    private String inviteResgisterUrl;
	
    /**微信APPID*/
    @Value("${appId}")
    private String appId;
    /**微信APPSECRET*/
    @Value("${appSecret}")
    private String appSecret;
    
    /**积分商城链接加密key*/
    @Value("${oauth2_key_jfsc}")
    private String oauth2KeyJfsc;
    
    /**股份account站点域名*/
    @Value("${account_domain_GF}")
    private String accountDomainGF;
    
	public String getValidateLoginHtml() {
		return validateLoginHtml;
	}

	public String getResourcePath() {
		return resourcePath;
	}

	public String getHtmallInvestClassifyPath() {
		return htmallInvestClassifyPath;
	}

	public void setHtmallInvestClassifyPath(String htmallInvestClassifyPath) {
		this.htmallInvestClassifyPath = htmallInvestClassifyPath;
	}

	public String getExcludePath() {
		return excludePath;
	}

	public void setExcludePath(String excludePath) {
		this.excludePath = excludePath;
	}
	
	public String[] getExcludePaths() {
		return excludePath.split(",");
	}

	public String getHtmallImageViewPath() {
		return htmallImageViewPath;
	}

	public void setHtmallImageViewPath(String htmallImageViewPath) {
		this.htmallImageViewPath = htmallImageViewPath;
	}

	public String getHtmallSpecialDomainPath() {
		return htmallSpecialDomainPath;
	}

	public void setHtmallSpecialDomainPath(String htmallSpecialDomainPath) {
		this.htmallSpecialDomainPath = htmallSpecialDomainPath;
	}

	public String getUploadImagLimit() {
		return uploadImagLimit;
	}

	public void setUploadImagLimit(String uploadImagLimit) {
		this.uploadImagLimit = uploadImagLimit;
	}

	public String getUploadWordLimit() {
		return uploadWordLimit;
	}

	public void setUploadWordLimit(String uploadWordLimit) {
		this.uploadWordLimit = uploadWordLimit;
	}

	public String getHtmallImageStoragePath() {
		return htmallImageStoragePath;
	}

	public void setHtmallImageStoragePath(String htmallImageStoragePath) {
		this.htmallImageStoragePath = htmallImageStoragePath;
	}

	public String getQualifiedFilePath() {
		return qualifiedFilePath;
	}

	public void setQualifiedFilePath(String qualifiedFilePath) {
		this.qualifiedFilePath = qualifiedFilePath;
	}

	public String getQualifiedFileName() {
		return qualifiedFileName;
	}

	public void setQualifiedFileName(String qualifiedFileName) {
		this.qualifiedFileName = qualifiedFileName;
	}

	public String getQualifiedOrganFileName() {
		return qualifiedOrganFileName;
	}

	public void setQualifiedOrganFileName(String qualifiedOrganFileName) {
		this.qualifiedOrganFileName = qualifiedOrganFileName;
	}

	public String[] getRedemptionTimeLimits() {
		return redemptionTimeLimit.split(",");
	}

	public void setRedemptionTimeLimit(String redemptionTimeLimit) {
		this.redemptionTimeLimit = redemptionTimeLimit;
	}

	public String getRedemptionTimeLimit() {
		return redemptionTimeLimit;
	}

	public String getAdjunctServerUrl() {
		return adjunctServerUrl;
	}

	public String getEncryptAesKey() {
		return encryptAesKey;
	}

	public String[] getEncryptAesKeys() {
		return encryptAesKey.split(",");
	}

	public void setEncryptAesKey(String encryptAesKey) {
		this.encryptAesKey = encryptAesKey;
	}

	public void setAdjunctServerUrl(String adjunctServerUrl) {
		this.adjunctServerUrl = adjunctServerUrl;
	}

	public String getSiteDomain() {
		return siteDomain;
	}

	public String getCertKey() {
		return certKey;
	}

	public String getCertBaseurl() {
		return certBaseurl;
	}

	public String getHtmallUnionCertServerUrl() {
		return htmallUnionCertServerUrl;
	}

	public String getHtmallUnionCertUrl() {
		return htmallUnionCertUrl;
	}

	public String getPayIdentityUrl() {
		return payIdentityUrl;
	}

	public String getCnzzSiteId() {
		return cnzzSiteId;
	}

	public void setCnzzSiteId(String cnzzSiteId) {
		this.cnzzSiteId = cnzzSiteId;
	}

	public void setSiteDomain(String siteDomain) {
		this.siteDomain = siteDomain;
	}

	public void setCertKey(String certKey) {
		this.certKey = certKey;
	}

	public void setCertBaseurl(String certBaseurl) {
		this.certBaseurl = certBaseurl;
	}

	public void setHtmallUnionCertServerUrl(String htmallUnionCertServerUrl) {
		this.htmallUnionCertServerUrl = htmallUnionCertServerUrl;
	}

	public void setHtmallUnionCertUrl(String htmallUnionCertUrl) {
		this.htmallUnionCertUrl = htmallUnionCertUrl;
	}

	public void setPayIdentityUrl(String payIdentityUrl) {
		this.payIdentityUrl = payIdentityUrl;
	}

	public String getTgSiteMain() {
		return tgSiteMain;
	}

	public void setTgSiteMain(String tgSiteMain) {
		this.tgSiteMain = tgSiteMain;
	}

	public String getMainSiteUrl() {
		return mainSiteUrl;
	}

	public void setMainSiteUrl(String mainSiteUrl) {
		this.mainSiteUrl = mainSiteUrl;
	}

    public String getScalarliveTime() {
        return scalarliveTime;
    }

    public void setScalarliveTime(String scalarliveTime) {
        this.scalarliveTime = scalarliveTime;
    }

    public String getUserLoginPc() {
        return userLoginPc;
    }

    public void setUserLoginPc(String userLoginPc) {
        this.userLoginPc = userLoginPc;
    }

    public String getLocaljumpPc() {
        return localjumpPc;
    }

    public void setLocaljumpPc(String localjumpPc) {
        this.localjumpPc = localjumpPc;
    }

    public String getUserSurveyPcPer() {
        return userSurveyPcPer;
    }

    public void setUserSurveyPcPer(String userSurveyPcPer) {
        this.userSurveyPcPer = userSurveyPcPer;
    }

    public String getUserSurveyPcOrg() {
        return userSurveyPcOrg;
    }

    public void setUserSurveyPcOrg(String userSurveyPcOrg) {
        this.userSurveyPcOrg = userSurveyPcOrg;
    }

    public String getUserCertificatePc() {
        return userCertificatePc;
    }

    public void setUserCertificatePc(String userCertificatePc) {
        this.userCertificatePc = userCertificatePc;
    }

    public String getLgbappBaseUrl() {
        return lgbappBaseUrl;
    }

    public void setLgbappBaseUrl(String lgbappBaseUrl) {
        this.lgbappBaseUrl = lgbappBaseUrl;
    }

    public String getInviteResgisterUrl() {
        return inviteResgisterUrl;
    }

    public void setInviteResgisterUrl(String inviteResgisterUrl) {
        this.inviteResgisterUrl = inviteResgisterUrl;
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

    public String getOauth2KeyJfsc() {
        return oauth2KeyJfsc;
    }

    public void setOauth2KeyJfsc(String oauth2KeyJfsc) {
        this.oauth2KeyJfsc = oauth2KeyJfsc;
    }

    public String getAccountDomainGF() {
        return accountDomainGF;
    }

    public void setAccountDomainGF(String accountDomainGF) {
        this.accountDomainGF = accountDomainGF;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public void setValidateLoginHtml(String validateLoginHtml) {
        this.validateLoginHtml = validateLoginHtml;
    }
}
