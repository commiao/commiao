package com.chtwm.mall.pojo.userMessage;

import java.io.Serializable;

/** 
 * CreateDate:2016年9月22日下午1:46:25 
 * @Description: 账户中心-用户信息结果bean  
 * @author:shl
 * @version V1.0   
 */
public class UserInfoForAccountResult implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 8143695555738953090L;
	
	/**
	 * 登录手机号
	 */
	private String loginPhone;
	
	/**
	 * 用户名
	 */
	private String maskName;
	/**
	 * 客户类型
	 */
	private String custType;
	/**
	 * 是否实名认证
	 */
	private String isCertification;
	/**
	 * 是否绑定手机号
	 */
	private String isBindPhone;
	
	/**
	 * 是否风险测评
	 */
	private String isRiskAppraisal;
	/**
	 * 证件类型
	 */
	private String certType;
	/**
     * 证件类型描述
     */
    private String certTypeDesc;
	/**
	 * 证件号掩码
	 */
	private String maskCertNo;
	
	/**
	 * 邮箱地址
	 */
	private String email;
	/**
	 * 联系手机号
	 */
	private String linkPhone;
	/**
	 * 联系地址
	 */
	private String linkAddress;
	/**
	 * 投资偏好
	 */
	private String investFavour;
	
	/**
	 * 机构联系人
	 */
	private String organLinkMan;
	
	//公募客户编号--多金查出
	private String clientId;
	//公私募是否合并
	private String mergeStatus;
	//私募跳转公募解密口令
	private String ticket; 
	
	//公募风险等级
    private String riskRank;
    
    //基本信息是否完善
    private String infoTotallyStatus;
    
    //投资者分类
    private String investorClassify;
    
    //公募风险评测是否过期
    private String pofIsAllRound;
    //公募用户信息是否完善
    private String pofExpired;
    
	public String getPofIsAllRound() {
		return pofIsAllRound;
	}
	public void setPofIsAllRound(String pofIsAllRound) {
		this.pofIsAllRound = pofIsAllRound;
	}
	public String getPofExpired() {
		return pofExpired;
	}
	public void setPofExpired(String pofExpired) {
		this.pofExpired = pofExpired;
	}
	public String getInfoTotallyStatus() {
		return infoTotallyStatus;
	}
	public void setInfoTotallyStatus(String infoTotallyStatus) {
		this.infoTotallyStatus = infoTotallyStatus;
	}
	public String getInvestorClassify() {
		return investorClassify;
	}
	public void setInvestorClassify(String investorClassify) {
		this.investorClassify = investorClassify;
	}
	public String getRiskRank() {
		return riskRank;
	}
	public void setRiskRank(String riskRank) {
		this.riskRank = riskRank;
	}
	public String getLoginPhone() {
		return loginPhone;
	}
	public void setLoginPhone(String loginPhone) {
		this.loginPhone = loginPhone;
	}
	public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getMergeStatus() {
        return mergeStatus;
    }
    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }
    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    public String getMaskName() {
		return maskName;
	}
	public void setMaskName(String maskName) {
		this.maskName = maskName;
	}
	public String getIsCertification() {
		return isCertification;
	}
	public void setIsCertification(String isCertification) {
		this.isCertification = isCertification;
	}
	public String getIsBindPhone() {
		return isBindPhone;
	}
	public void setIsBindPhone(String isBindPhone) {
		this.isBindPhone = isBindPhone;
	}
	public String getIsRiskAppraisal() {
		return isRiskAppraisal;
	}
	public void setIsRiskAppraisal(String isRiskAppraisal) {
		this.isRiskAppraisal = isRiskAppraisal;
	}
	public String getMaskCertNo() {
		return maskCertNo;
	}
	public void setMaskCertNo(String maskCertNo) {
		this.maskCertNo = maskCertNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLinkPhone() {
		return linkPhone;
	}
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	public String getLinkAddress() {
		return linkAddress;
	}
	public void setLinkAddress(String linkAddress) {
		this.linkAddress = linkAddress;
	}
	public String getInvestFavour() {
		return investFavour;
	}
	public void setInvestFavour(String investFavour) {
		this.investFavour = investFavour;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
    public String getCertTypeDesc() {
        return certTypeDesc;
    }
    public void setCertTypeDesc(String certTypeDesc) {
        this.certTypeDesc = certTypeDesc;
    }
    public String getOrganLinkMan() {
		return organLinkMan;
	}
	public void setOrganLinkMan(String organLinkMan) {
		this.organLinkMan = organLinkMan;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

}
