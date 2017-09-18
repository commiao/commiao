package com.chtwm.mall.sdk.controller.wap.account.result;

import java.io.Serializable;

public class CustDetailAssetQueryResult implements Serializable {
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5023160130109975883L;
	
	private String code;//返回错误码
    private String message;//返回信息
    private String investDirection;//产品投向
    private String fundName;//产品名称
    private String fundCode;//产品代码
    private String totalShare;//总份额
    private String totalAssets;//总资产
    private String setupDate;//成立日期
    private String isAllowRedemption;//是否可以赎回 1.否 2.是
    private String allowRedemptionShare;//可赎回份额
    private String isAllowAppend;//可追加 1.否 2.是
	
	public String getIsAllowAppend() {
        return isAllowAppend;
    }
    public void setIsAllowAppend(String isAllowAppend) {
        this.isAllowAppend = isAllowAppend;
    }
    public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getInvestDirection() {
		return investDirection;
	}
	public void setInvestDirection(String investDirection) {
		this.investDirection = investDirection;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public String getTotalShare() {
		return totalShare;
	}
	public void setTotalShare(String totalShare) {
		this.totalShare = totalShare;
	}
	public String getTotalAssets() {
		return totalAssets;
	}
	public void setTotalAssets(String totalAssets) {
		this.totalAssets = totalAssets;
	}
	public String getSetupDate() {
		return setupDate;
	}
	public void setSetupDate(String setupDate) {
		this.setupDate = setupDate;
	}
	public String getIsAllowRedemption() {
		return isAllowRedemption;
	}
	public void setIsAllowRedemption(String isAllowRedemption) {
		this.isAllowRedemption = isAllowRedemption;
	}
	public String getAllowRedemptionShare() {
		return allowRedemptionShare;
	}
	public void setAllowRedemptionShare(String allowRedemptionShare) {
		this.allowRedemptionShare = allowRedemptionShare;
	}
	
}
