package com.chtwm.mall.pojo.integration;


/**
 *请求参数
 * @author xuliang
 *
 */
public class PointsFlowResult {

	private String count;
	private String operate;
	private String changeDate;
    private String desceiption;
	private String endDate;
	private String currentAvailablePoints;
	public String getChangeDate() {
	    return changeDate;
	}
	public void setChangeDate(String changeDate) {
	    this.changeDate = changeDate;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getOperate() {
		return operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getDesceiption() {
		return desceiption;
	}
	public void setDesceiption(String desceiption) {
		this.desceiption = desceiption;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getCurrentAvailablePoints() {
		return currentAvailablePoints;
	}
	public void setCurrentAvailablePoints(String currentAvailablePoints) {
		this.currentAvailablePoints = currentAvailablePoints;
	}
	
	
	
	
	
	
}
