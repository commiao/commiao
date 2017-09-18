package com.chtwm.mall.pojo.product;

import java.io.Serializable;

/** 
 * CreateDate:2016年9月22日上午11:35:17 
 * @Description: (基金列表基本信息)  
 * @author:jingmiao
 * @version V1.0   
 */
public class FundListInfo implements Serializable{

	private static final long serialVersionUID = 2075571232792648838L;
    /**
	 * secuSht:(基金名称). 
	 */
	private String secuSht;					
	/**
	 * trdCode:(基金编号). 
	 */
	private String trdCode;					
	/**
	 * unitNav:(最新单位净值). 
	 */
	private String unitNav;
	/**
	 * trdDt:(最新净值更新日期). 
	 */
	private String trdDt;
	/**
	 * trdDtFmt:(最新净值更新日期).
	 */
	private String trdDtFmt;
	/**
	 * oneMonthGains:(近一个月涨幅). 
	 */
	private String oneMonthGains;			 
	/**
	 * threeMonthGains:(近三个月涨幅). 
	 */
	private String threeMonthGains;			
	/**
	 * sixMonthGains:(近六个月涨幅). 
	 */
	private String sixMonthGains;			
	/**
	 * oneYearGains:(近一年涨幅). 
	 */
	private String oneYearGains;				
	/**
	 * sinceThisYearGains:(今年以来涨幅). 
	 */
	private String sinceThisYearGains;		
	/**
	 * sevenDayYield:(七日年化收益率 （针对于货币型基金）). 
	 */
	private String sevenDayYield;			
	/**
	 * tenThousandEarnings:(万份收益). 
	 */
	private String tenThousandEarnings;
	
	/**
	 * invTypCom:基金类型. 
	 */
	private String invTypCom;
	/**
	 * fmcComId:基金公司. 
	 */
	private String fmcComId;
	/**
	 * chgRat1d:日涨幅（收益率%）. 
	 */
	private String oneDayGains;
	
/*************************** 非持久化字段 **********************************************/	
	
	private String publicFundsKeyWords;//产品检索关键字（简称、代码）非必填项
	private String sortColumn;//排序字段名(以该字段进行排序)非必填项
	private String sortType;//排序类型(ASC,DESC)非必填项
	
	/**
	 * 获取 secuSht:(基金名称).
	 * @return the secuSht
	 */
	public String getSecuSht() {
		return secuSht;
	}
	/**
	 * 设置 secuSht:(基金名称).
	 * @param secuSht the secuSht to set
	 */
	public void setSecuSht(String secuSht) {
		this.secuSht = secuSht;
	}
	/**
	 * 获取 trdCode:(基金编号).
	 * @return the trdCode
	 */
	public String getTrdCode() {
		return trdCode;
	}
	/**
	 * 设置 trdCode:(基金编号).
	 * @param trdCode the trdCode to set
	 */
	public void setTrdCode(String trdCode) {
		this.trdCode = trdCode;
	}
	/**
	 * 获取 unitNav:(最新单位净值).
	 * @return the unitNav
	 */
	public String getUnitNav() {
		return unitNav;
	}
	/**
	 * 设置 unitNav:(最新单位净值).
	 * @param unitNav the unitNav to set
	 */
	public void setUnitNav(String unitNav) {
		this.unitNav = unitNav;
	}
	/**
	 * 获取 trdDt:(最新净值更新日期).
	 * @return the trdDt
	 */
	public String getTrdDt() {
		return trdDt;
	}
	/**
	 * 设置 trdDt:(最新净值更新日期).
	 * @param trdDt the trdDt to set
	 */
	public void setTrdDt(String trdDt) {
		this.trdDt = trdDt;
	}
	/**
	 * 获取 trdDtFmt:(最新净值更新日期).
	 * @return the trdDtFmt
	 */
	public String getTrdDtFmt() {
		return trdDtFmt;
	}
	/**
	 * 设置 trdDtFmt:(最新净值更新日期).
	 * @param trdDtFmt the trdDtFmt to set
	 */
	public void setTrdDtFmt(String trdDtFmt) {
		this.trdDtFmt = trdDtFmt;
	}
	/**
	 * 获取 oneMonthGains:(近一个月涨幅).
	 * @return the oneMonthGains
	 */
	public String getOneMonthGains() {
		return oneMonthGains;
	}
	/**
	 * 设置 oneMonthGains:(近一个月涨幅).
	 * @param oneMonthGains the oneMonthGains to set
	 */
	public void setOneMonthGains(String oneMonthGains) {
		this.oneMonthGains = oneMonthGains;
	}
	/**
	 * 获取 threeMonthGains:(近三个月涨幅).
	 * @return the threeMonthGains
	 */
	public String getThreeMonthGains() {
		return threeMonthGains;
	}
	/**
	 * 设置 threeMonthGains:(近三个月涨幅).
	 * @param threeMonthGains the threeMonthGains to set
	 */
	public void setThreeMonthGains(String threeMonthGains) {
		this.threeMonthGains = threeMonthGains;
	}
	/**
	 * 获取 sixMonthGains:(近六个月涨幅).
	 * @return the sixMonthGains
	 */
	public String getSixMonthGains() {
		return sixMonthGains;
	}
	/**
	 * 设置 sixMonthGains:(近六个月涨幅).
	 * @param sixMonthGains the sixMonthGains to set
	 */
	public void setSixMonthGains(String sixMonthGains) {
		this.sixMonthGains = sixMonthGains;
	}
	/**
	 * 获取 oneYearGains:(近一年涨幅).
	 * @return the oneYearGains
	 */
	public String getOneYearGains() {
		return oneYearGains;
	}
	/**
	 * 设置 oneYearGains:(近一年涨幅).
	 * @param oneYearGains the oneYearGains to set
	 */
	public void setOneYearGains(String oneYearGains) {
		this.oneYearGains = oneYearGains;
	}
	/**
	 * 获取 sinceThisYearGains:(今年以来涨幅).
	 * @return the sinceThisYearGains
	 */
	public String getSinceThisYearGains() {
		return sinceThisYearGains;
	}
	/**
	 * 设置 sinceThisYearGains:(今年以来涨幅).
	 * @param sinceThisYearGains the sinceThisYearGains to set
	 */
	public void setSinceThisYearGains(String sinceThisYearGains) {
		this.sinceThisYearGains = sinceThisYearGains;
	}
	/**
	 * 获取 sevenDayYield:(七日年化收益率 （针对于货币型基金）).
	 * @return the sevenDayYield
	 */
	public String getSevenDayYield() {
		return sevenDayYield;
	}
	/**
	 * 设置 sevenDayYield:(七日年化收益率 （针对于货币型基金）).
	 * @param sevenDayYield the sevenDayYield to set
	 */
	public void setSevenDayYield(String sevenDayYield) {
		this.sevenDayYield = sevenDayYield;
	}
	/**
	 * 获取 tenThousandEarnings:(万份收益).
	 * @return the tenThousandEarnings
	 */
	public String getTenThousandEarnings() {
		return tenThousandEarnings;
	}
	/**
	 * 设置 tenThousandEarnings:(万份收益).
	 * @param tenThousandEarnings the tenThousandEarnings to set
	 */
	public void setTenThousandEarnings(String tenThousandEarnings) {
		this.tenThousandEarnings = tenThousandEarnings;
	}
	
	/**
	 * 获取 invTypCom:基金类型.
	 * @return the invTypCom
	 */
	public String getInvTypCom() {
		return invTypCom;
	}
	/**
	 * 设置 invTypCom:基金类型.
	 * @param invTypCom the invTypCom to set
	 */
	public void setInvTypCom(String invTypCom) {
		this.invTypCom = invTypCom;
	}
	/**
	 * 获取 fmcComId:基金公司.
	 * @return the fmcComId
	 */
	public String getFmcComId() {
		return fmcComId;
	}
	/**
	 * 设置 fmcComId:基金公司.
	 * @param fmcComId the fmcComId to set
	 */
	public void setFmcComId(String fmcComId) {
		this.fmcComId = fmcComId;
	}
	/**
	 * 获取 chgRat1d:日涨幅（收益率%）.
	 * @return the oneDayGains
	 */
	public String getOneDayGains() {
		return oneDayGains;
	}
	/**
	 * 设置 chgRat1d:日涨幅（收益率%）.
	 * @param oneDayGains the oneDayGains to set
	 */
	public void setOneDayGains(String oneDayGains) {
		this.oneDayGains = oneDayGains;
	}
	/**
	 * 获取 关键字搜索
	 * @return the publicFundsKeyWords
	 */
	public String getPublicFundsKeyWords() {
		return publicFundsKeyWords;
	}
	/**
	 * 设置 关键字搜索
	 * @param publicFundsKeyWords the publicFundsKeyWords to set
	 */
	public void setPublicFundsKeyWords(String publicFundsKeyWords) {
		this.publicFundsKeyWords = publicFundsKeyWords;
	}
	public String getSortColumn() {
		return sortColumn;
	}
	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}
	public String getSortType() {
		return sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("首页基金列表基本信息：[");
		sb.append("基金名称:").append(secuSht);
		sb.append("、基金编号:").append(trdCode);
		sb.append("、最新单位净值:").append(unitNav);
		sb.append("、最新更新日期:").append(trdDt);
		sb.append("、最新更新日期str:").append(trdDtFmt);
		sb.append("、近一个月涨幅:").append(oneMonthGains);
		sb.append("、近三个月涨幅:").append(threeMonthGains);
		sb.append("、近六个月涨幅:").append(sixMonthGains);
		sb.append("、近一年涨幅:").append(oneYearGains);
		sb.append("、今年以来涨幅:").append(sinceThisYearGains);
		sb.append("、七日年化收益率:").append(sevenDayYield);
		sb.append("、万份收益:").append(tenThousandEarnings);
		sb.append("、基金类型:").append(invTypCom);
		sb.append("、日涨幅:").append(oneDayGains);
		sb.append("]");
		return sb.toString();
	}
}
