package com.commiao.basic.business.tools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PefHSCongfig {

	@Value("${hs_ws_url}")
	private String hsWsUrl;
	/**
	 * 营销项目列表接口URL
	 */
	@Value("${market_project_url}")
	private String marketProjectUrl;

	@Value("${interface_baseurl}")
	private String interfaceBaseurl;
	@Value("${public_fund}")
	private String publicFund;
	@Value("${small_fund}")
	private String smallFund;

	/** D401 /query/dccustinfoquery */
	@Value("${custInfoQuery}")
	private String custInfoQuery;
	/** D403 /query/dcreguserquery */
	@Value("${regUserQuery}")
	private String regUserQuery;
	/** D407 /query/dcsharequery */
	@Value("${query_share}")
	private String queryShare;
	/** D412 /query/dcfundinfoquery */
	@Value("${fundQuery}")
	private String fundQuery;
	/** D413 /query/dcprofitclassquery */
	@Value("${profitClassQuery}")
	private String profitClassQuery;
	/** D416 /query/dctrustcontractquery */
	@Value("${trustContract}")
	private String trustContract;
	/** D419 /query/dchisnetvaluequery */
	@Value("${fundNetValueQuery}")
	private String fundNetValueQuery;
	/** D420 /query/dcnetvaluequery */
	@Value("${product_net_val_newest}")
	private String productNetValNewest;
	/** D422 /query/dcreserveflowquery */
	@Value("${appoint_fund_query}")
	private String appointFundQuery;
	/** D427 /query/dccustdetailassertquery */
	@Value("${cust_detail_asset}")
	private String custDetailAsset;
	/** D432 /query/dcattachmentinfoquery */
	@Value("${resource_query_url}")
	private String resourceQueryUrl;
	/** D440 /query/dcdatadictionaryquery */
	@Value("${DictQuery}")
	private String DictQuery;
	/** D443 /query/dcfinancemanagerinfoquery */
	@Value("${financialAdvisor}")
	private String financialAdvisor;
	/** D444 /query/dccustomerbrokerrelationquery */
	@Value("${custBroRelQuery}")
	private String custBroRelQuery;
	/** D449 /query/dcquestiontopicquery */
	@Value("${questionTopicQuery_pc}")
	private String questionTopicQueryPc;
	/** D452 /query/dcquestioninfoquery */
	@Value("${questionnaireInfoQuery_pc}")
	private String questionnaireInfoQueryPc;
	/** D453 /query/dcquestionoptionquery */
	@Value("${questionOptionQuery_pc}")
	private String questionOptionQueryPc;
	/** D454 /query/dcattachmentinfoforhtquery */
	@Value("${resourceListQuery}")
	private String resourceListQuery;
	/** D455 /query/dcquestionresultquery */
	@Value("${dcquestionresultquery}")
	private String dcquestionresultquery;
	/** D458 /query/dcquerybankcardquery */
	@Value("${bankcard_query_pc}")
	private String bankcardQueryPc;
	/** D464 /query/dcsystemdatequery */
	@Value("${query_system_date}")
	private String querySystemDate;
	/** D465 /query/dcworkdayquery */
	@Value("${query_work_date}")
	private String queryWorkDate;
	/** D466 /query/dcredeemrequestquery */
	@Value("${query_redemption_request}")
	private String queryRedemptionRequest;

	/** F401 /account/dcalterclientinfo */
	@Value("${change_cust_user}")
	private String changeCustUser;
	/** F402 /account/dclogincheck */
	@Value("${loginCheck}")
	private String loginCheck;
	/** F403 /account/dcmodifypassword */
	@Value("${modifyPassword}")
	private String modifyPassword;
	/** F405 /account/dcpotentialcustregist */
	@Value("${user_registration}")
	private String userRegistration;
	/** F409 /account/dcresetpassword */
	@Value("${reset_pwd}")
	private String resetPwd;
	/** F410 /account/dcmodifyregisterinfo */
	@Value("${change_reg_user}")
	private String changeRegUser;
	/** F411 /account/dcconvertreguser */
	@Value("${user_registration_confirmation}")
	private String userRegistrationConfirmation;
	/** F414 /account/dccustomerbrokerservice */
	@Value("${customerBrokerMaintenance}")
	private String customerBrokerMaintenance;
	/** F415 /account/dcanswerquestion */
	@Value("${questionAnswerSubmit}")
	private String questionAnswerSubmit;
	/** F416 /account/dcqueryquestionscore */
	@Value("${questionScoreQuery}")
	private String questionScoreQuery;
	/** F418 /account/dcrealnameregistedandbindbankcard */
	@Value("${certification_bind_bankcard}")
	private String certificationBindBankcard;

	/** G402 /trade/dcproductreserve */
	@Value("${productReserve}")
	private String productReserve;
	/** G403 /trade/dccancelreserve */
	@Value("${productCancelReserve}")
	private String productCancelReserve;
	/** G412 /trade/dcredeemrequestadd */
	@Value("${add_redemption_request}")
	private String addRedemptionRequest;
	@Value("${user_productok_pc}")
	private String userProductokPc;
	@Value("${user_login_pc}")
	private String userLoginPc;
	@Value("${localjump_pc}")
	private String localjumpPc;
	@Value("${user_certificate_pc}")
	private String userCertificatePc;
	@Value("${user_survey_pc_ori}")
	private String userSurveyPcPri;

	/** /query/custmessagequery */
	@Value("${myMessage}")
	private String myMessage;
	/**新增普通专业投资者申请(F431)*/
	@Value("{add_invest_classify_application}")
	private String addInvestClassifyApplication;
	/**修改普通专业投资者申请(F432)*/
	@Value("{update_invest_classify_application}")
	private String updateInvestClassifyApplication;
	/**查询普通专业投资者申请(F434)*/
	@Value("{query_invest_classify_application}")
	private String queryInvestClassifyApplication;
	/**新增投资者转换申请(F435)*/
	@Value("{add_invest_transform_application}")
	private String addInvestTransformApplication;
	/**更新投资者转换申请(F436)*/
	@Value("{update_invest_transform_application}")
	private String updateInvestTransformApplication;
	/**查询投资者转换申请(F438)*/
	@Value("{query_invest_transform_application}")
	private String queryInvestTransformApplication;
	
	public String getHsWsUrl() {
		return hsWsUrl;
	}

	public String getQueryInvestTransformApplication() {
		return queryInvestTransformApplication;
	}

	public void setHsWsUrl(String hsWsUrl) {
		this.hsWsUrl = hsWsUrl;
	}

	public String getMarketProjectUrl() {
		return marketProjectUrl;
	}

	public String getInterfaceBaseurl() {
		return interfaceBaseurl;
	}

	public String getPublicFund() {
		return publicFund;
	}

	public String getSmallFund() {
		return smallFund;
	}

	public String getCustInfoQuery() {
		return custInfoQuery;
	}

	public String getRegUserQuery() {
		return regUserQuery;
	}

	public String getQueryShare() {
		return queryShare;
	}

	public String getFundQuery() {
		return fundQuery;
	}

	public String getProfitClassQuery() {
		return profitClassQuery;
	}

	public String getTrustContract() {
		return trustContract;
	}

	public String getFundNetValueQuery() {
		return fundNetValueQuery;
	}

	public String getProductNetValNewest() {
		return productNetValNewest;
	}

	public String getAppointFundQuery() {
		return appointFundQuery;
	}

	public String getCustDetailAsset() {
		return custDetailAsset;
	}

	public String getResourceQueryUrl() {
		return resourceQueryUrl;
	}

	public String getDictQuery() {
		return DictQuery;
	}

	public String getFinancialAdvisor() {
		return financialAdvisor;
	}

	public String getCustBroRelQuery() {
		return custBroRelQuery;
	}

	public String getQuestionTopicQueryPc() {
		return questionTopicQueryPc;
	}

	public String getQuestionnaireInfoQueryPc() {
		return questionnaireInfoQueryPc;
	}

	public String getQuestionOptionQueryPc() {
		return questionOptionQueryPc;
	}

	public String getResourceListQuery() {
		return resourceListQuery;
	}

	public String getDcquestionresultquery() {
		return dcquestionresultquery;
	}

	public String getBankcardQueryPc() {
		return bankcardQueryPc;
	}

	public String getQuerySystemDate() {
		return querySystemDate;
	}

	public String getQueryWorkDate() {
		return queryWorkDate;
	}

	public String getQueryRedemptionRequest() {
		return queryRedemptionRequest;
	}

	public String getChangeCustUser() {
		return changeCustUser;
	}

	public String getLoginCheck() {
		return loginCheck;
	}

	public String getModifyPassword() {
		return modifyPassword;
	}

	public String getUserRegistration() {
		return userRegistration;
	}

	public String getResetPwd() {
		return resetPwd;
	}

	public String getChangeRegUser() {
		return changeRegUser;
	}

	public String getUserRegistrationConfirmation() {
		return userRegistrationConfirmation;
	}

	public String getCustomerBrokerMaintenance() {
		return customerBrokerMaintenance;
	}

	public String getQuestionAnswerSubmit() {
		return questionAnswerSubmit;
	}

	public String getQuestionScoreQuery() {
		return questionScoreQuery;
	}

	public String getCertificationBindBankcard() {
		return certificationBindBankcard;
	}

	public String getProductReserve() {
		return productReserve;
	}

	public String getProductCancelReserve() {
		return productCancelReserve;
	}

	public String getAddRedemptionRequest() {
		return addRedemptionRequest;
	}

	public String getMyMessage() {
		return myMessage;
	}

	public String getUserProductokPc() {
		return userProductokPc;
	}

	public void setUserProductokPc(String userProductokPc) {
		this.userProductokPc = userProductokPc;
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

	public String getUserCertificatePc() {
		return userCertificatePc;
	}

	public void setUserCertificatePc(String userCertificatePc) {
		this.userCertificatePc = userCertificatePc;
	}

	public String getUserSurveyPcPri() {
		return userSurveyPcPri;
	}

	public void setUserSurveyPcPri(String userSurveyPcPri) {
		this.userSurveyPcPri = userSurveyPcPri;
	}

	public void setMarketProjectUrl(String marketProjectUrl) {
		this.marketProjectUrl = marketProjectUrl;
	}

	public void setInterfaceBaseurl(String interfaceBaseurl) {
		this.interfaceBaseurl = interfaceBaseurl;
	}

	public void setPublicFund(String publicFund) {
		this.publicFund = publicFund;
	}

	public void setSmallFund(String smallFund) {
		this.smallFund = smallFund;
	}

	public void setCustInfoQuery(String custInfoQuery) {
		this.custInfoQuery = custInfoQuery;
	}

	public void setRegUserQuery(String regUserQuery) {
		this.regUserQuery = regUserQuery;
	}

	public void setQueryShare(String queryShare) {
		this.queryShare = queryShare;
	}

	public void setFundQuery(String fundQuery) {
		this.fundQuery = fundQuery;
	}

	public void setProfitClassQuery(String profitClassQuery) {
		this.profitClassQuery = profitClassQuery;
	}

	public void setTrustContract(String trustContract) {
		this.trustContract = trustContract;
	}

	public void setFundNetValueQuery(String fundNetValueQuery) {
		this.fundNetValueQuery = fundNetValueQuery;
	}

	public void setProductNetValNewest(String productNetValNewest) {
		this.productNetValNewest = productNetValNewest;
	}

	public void setAppointFundQuery(String appointFundQuery) {
		this.appointFundQuery = appointFundQuery;
	}

	public void setCustDetailAsset(String custDetailAsset) {
		this.custDetailAsset = custDetailAsset;
	}

	public void setResourceQueryUrl(String resourceQueryUrl) {
		this.resourceQueryUrl = resourceQueryUrl;
	}

	public void setDictQuery(String dictQuery) {
		DictQuery = dictQuery;
	}

	public void setFinancialAdvisor(String financialAdvisor) {
		this.financialAdvisor = financialAdvisor;
	}

	public void setCustBroRelQuery(String custBroRelQuery) {
		this.custBroRelQuery = custBroRelQuery;
	}

	public void setQuestionTopicQueryPc(String questionTopicQueryPc) {
		this.questionTopicQueryPc = questionTopicQueryPc;
	}

	public void setQuestionnaireInfoQueryPc(String questionnaireInfoQueryPc) {
		this.questionnaireInfoQueryPc = questionnaireInfoQueryPc;
	}

	public void setQuestionOptionQueryPc(String questionOptionQueryPc) {
		this.questionOptionQueryPc = questionOptionQueryPc;
	}

	public void setResourceListQuery(String resourceListQuery) {
		this.resourceListQuery = resourceListQuery;
	}

	public void setDcquestionresultquery(String dcquestionresultquery) {
		this.dcquestionresultquery = dcquestionresultquery;
	}

	public void setBankcardQueryPc(String bankcardQueryPc) {
		this.bankcardQueryPc = bankcardQueryPc;
	}

	public void setQuerySystemDate(String querySystemDate) {
		this.querySystemDate = querySystemDate;
	}

	public void setQueryWorkDate(String queryWorkDate) {
		this.queryWorkDate = queryWorkDate;
	}

	public void setQueryRedemptionRequest(String queryRedemptionRequest) {
		this.queryRedemptionRequest = queryRedemptionRequest;
	}

	public void setChangeCustUser(String changeCustUser) {
		this.changeCustUser = changeCustUser;
	}

	public void setLoginCheck(String loginCheck) {
		this.loginCheck = loginCheck;
	}

	public void setModifyPassword(String modifyPassword) {
		this.modifyPassword = modifyPassword;
	}

	public void setUserRegistration(String userRegistration) {
		this.userRegistration = userRegistration;
	}

	public void setResetPwd(String resetPwd) {
		this.resetPwd = resetPwd;
	}

	public void setChangeRegUser(String changeRegUser) {
		this.changeRegUser = changeRegUser;
	}

	public void setUserRegistrationConfirmation(String userRegistrationConfirmation) {
		this.userRegistrationConfirmation = userRegistrationConfirmation;
	}

	public void setCustomerBrokerMaintenance(String customerBrokerMaintenance) {
		this.customerBrokerMaintenance = customerBrokerMaintenance;
	}

	public void setQuestionAnswerSubmit(String questionAnswerSubmit) {
		this.questionAnswerSubmit = questionAnswerSubmit;
	}

	public void setQuestionScoreQuery(String questionScoreQuery) {
		this.questionScoreQuery = questionScoreQuery;
	}

	public void setCertificationBindBankcard(String certificationBindBankcard) {
		this.certificationBindBankcard = certificationBindBankcard;
	}

	public void setProductReserve(String productReserve) {
		this.productReserve = productReserve;
	}

	public void setProductCancelReserve(String productCancelReserve) {
		this.productCancelReserve = productCancelReserve;
	}

	public void setAddRedemptionRequest(String addRedemptionRequest) {
		this.addRedemptionRequest = addRedemptionRequest;
	}

	public void setMyMessage(String myMessage) {
		this.myMessage = myMessage;
	}

	public String getAddInvestClassifyApplication() {
		return addInvestClassifyApplication;
	}

	public String getUpdateInvestClassifyApplication() {
		return updateInvestClassifyApplication;
	}

	public String getQueryInvestClassifyApplication() {
		return queryInvestClassifyApplication;
	}

	public String getAddInvestTransformApplication() {
		return addInvestTransformApplication;
	}

	public String getUpdateInvestTransformApplication() {
		return updateInvestTransformApplication;
	}

}
