package com.chtwm.mall.pojo.pofCertification;


/** 
 * @Description: 校验是否实名认证-结果集
 * @author:wrx
 * @version V1.0   
 */
public class IdentityCertificationPofResult{
    private String clientId;//公募客户编号
    private String riskRank; //公募风险等级
    private String riskRankName;//风险等级对应中文
    private String riskRankDesc; //风险等级描述
    private String pofIsAllRound;//公募风险测评是否过期
	private String pofExpired;//公募用户信息是否完整
    public String getRiskRankName() {
        return riskRankName;
    }
    public void setRiskRankName(String riskRankName) {
        this.riskRankName = riskRankName;
    }
    public String getRiskRankDesc() {
        return riskRankDesc;
    }
    public void setRiskRankDesc(String riskRankDesc) {
        this.riskRankDesc = riskRankDesc;
    }
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getRiskRank() {
        return riskRank;
    }
    public void setRiskRank(String riskRank) {
        this.riskRank = riskRank;
    }    public String getPofIsAllRound() {
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
}
