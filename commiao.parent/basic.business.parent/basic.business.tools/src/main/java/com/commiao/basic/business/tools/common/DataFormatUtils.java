/**
 * @file DataFormatUtils.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年5月26日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年5月26日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.commiao.basic.business.tools.common;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.apache.commons.lang.StringUtils;

/**
 * @brief 数据格式化工具类
 *
 * 数据格式化工具类
 * 
 * @author
 *    - 2016年5月26日  申贺龙  创建初始版本
 *
 */
public class DataFormatUtils {
	
	/***
	 * 
	 * @brief 格式化小数、百分比含%（四舍五入，保留两位小数）
	 *
	 *	例如：0.2258格式化后为0.23;
	 *       0.2258%格式化后为0.23%;
	 *       0.2235%格式化后为0.22%;
	 * @author
	 *    - 2016年5月26日  申贺龙  创建初始版本
	 *
	 * @param data
	 * @return
	 */
//	public static String dataFormatByRoundHalfUp(String data){
//		String retData = null;
//		if(StringUtils.isNotEmpty(data)){
//			int strIndex = data.indexOf("%");
//			if(strIndex > 0){
//				data = data.substring(0, strIndex);
//			}
//			BigDecimal bigDecimal = new BigDecimal(Double.parseDouble(data));
//			Double doubleData = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
//			retData = (strIndex > 0)?doubleData.toString()+"%":doubleData.toString();
//		}
//		return retData;
//	}
	
	public static String dataFormatByRoundHalfUp(String data) {
		String retData = null;
		if(StringUtils.isNotEmpty(data)){
			int strIndex = data.indexOf("%");
			if(strIndex > 0){
				data = data.substring(0, strIndex);
			}
			BigDecimal bigDecimal = new BigDecimal(Double.parseDouble(data));
			Double doubleData = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
			String dst = formatNum(doubleData);
			retData = (strIndex > 0)?dst+"%":dst;
		}
		return retData;
	}
	
	public static String formatNum(double value) {
		DecimalFormat df = new DecimalFormat("######0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		return df.format(value);
	}
	
	public static void main(String[] args) {
		String s = "0.7";
		System.out.println(dataFormatByRoundHalfUp(s));
	}
	
}
