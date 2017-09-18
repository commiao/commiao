package com.chtwm.mall.sdk.controller.wap.account.result;

import java.io.Serializable;

public class TotalAssetResult implements Serializable {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -2504385558320392561L;
	
	private String code;//返回错误码
    private String message;//返回信息
    private String investDirection;//产品投向
    private String totalShare;//总份额
    private String totalAssets;//总资产
    private String totalAssetsNoformat;//总资产（非格式化）
    
	
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
	public String getTotalAssetsNoformat() {
		return totalAssetsNoformat;
	}
	public void setTotalAssetsNoformat(String totalAssetsNoformat) {
		this.totalAssetsNoformat = totalAssetsNoformat;
	}
	
}
