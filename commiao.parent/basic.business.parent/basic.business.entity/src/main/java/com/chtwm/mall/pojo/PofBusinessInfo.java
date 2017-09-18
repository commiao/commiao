package com.chtwm.mall.pojo;

/**
 * 公募业务字段
 * @author wrx
 *
 */
public class PofBusinessInfo {
	private String pofIsAllRound = "";// 公募风险测评是否过期
	private String pofExpired = "";// 公募用户信息是否完整0是1否
	private String riskRank = ""; // 公募客户风险等级
	private String riskRankName = ""; // 公募风险等级对应中文
	private String mergeStatus = "";// 公私募账号是否合并
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
	public String getRiskRank() {
		return riskRank;
	}
	public void setRiskRank(String riskRank) {
		this.riskRank = riskRank;
	}
	public String getRiskRankName() {
		return riskRankName;
	}
	public void setRiskRankName(String riskRankName) {
		this.riskRankName = riskRankName;
	}
	public String getMergeStatus() {
		return mergeStatus;
	}
	public void setMergeStatus(String mergeStatus) {
		this.mergeStatus = mergeStatus;
	}
	@Override
	public String toString() {
		return "PofBusinessInfo [pofIsAllRound=" + pofIsAllRound
				+ ", pofExpired=" + pofExpired + ", riskRank=" + riskRank
				+ ", riskRankName=" + riskRankName + ", mergeStatus="
				+ mergeStatus + "]";
	}
	
}
