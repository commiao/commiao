package com.chtwm.mall.pojo.details;

public class DealFundQueryResult {

    private String fundCode; // 产品代码
    private String fundName; // 产品名称
    private String fundNameShort; // 产品简称
    private String tradeStatus; // 状态
    private String tradeStatusName; // 状态名称
    private String clientId; // 客户编号
    private String expectedProfit; // 预期收益
    private String prodTerm; // 产品期限
    private String issueScale; // 产品规模
    private String bonusType; // 收益类型
    private String riskLevel; // 风险等级

    private String confirmBalance; // 确认金额
    private String confirmDate; // 确认日期
    private String confirmType;// 确认份额
    private String shareType;
    private String shareTypeName;

    private String businName;
    private String businFlag;
    
    private String netValue;//确认净值（成交净值）
    
    public String getNetValue() {
        return netValue;
    }

    public void setNetValue(String netValue) {
        this.netValue = netValue;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundNameShort() {
        return fundNameShort;
    }

    public void setFundNameShort(String fundNameShort) {
        this.fundNameShort = fundNameShort;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getTradeStatusName() {
        return tradeStatusName;
    }

    public void setTradeStatusName(String tradeStatusName) {
        this.tradeStatusName = tradeStatusName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getExpectedProfit() {
        return expectedProfit;
    }

    public void setExpectedProfit(String expectedProfit) {
        this.expectedProfit = expectedProfit;
    }

    public String getProdTerm() {
        return prodTerm;
    }

    public void setProdTerm(String prodTerm) {
        this.prodTerm = prodTerm;
    }

    public String getIssueScale() {
        return issueScale;
    }

    public void setIssueScale(String issueScale) {
        this.issueScale = issueScale;
    }

    public String getBonusType() {
        return bonusType;
    }

    public void setBonusType(String bonusType) {
        this.bonusType = bonusType;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getConfirmBalance() {
        return confirmBalance;
    }

    public void setConfirmBalance(String confirmBalance) {
        this.confirmBalance = confirmBalance;
    }

    public String getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(String confirmType) {
        this.confirmType = confirmType;
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public String getShareTypeName() {
        return shareTypeName;
    }

    public void setShareTypeName(String shareTypeName) {
        this.shareTypeName = shareTypeName;
    }

    public String getBusinName() {
        return businName;
    }

    public void setBusinName(String businName) {
        this.businName = businName;
    }

    public String getBusinFlag() {
        return businFlag;
    }

    public void setBusinFlag(String businFlag) {
        this.businFlag = businFlag;
    }



}
