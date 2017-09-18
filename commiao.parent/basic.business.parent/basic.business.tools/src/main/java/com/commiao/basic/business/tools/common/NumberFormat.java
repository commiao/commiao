package com.commiao.basic.business.tools.common;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.apache.commons.lang.StringUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberFormat {
	
	private static Logger logger = LoggerFactory.getLogger(NumberFormat.class);
	public static final String PATTERN_THOUSAND_DECIMAL_6 = "###,##0.000000";
	public static final String PATTERN_THOUSAND_DECIMAL_4 = "###,##0.0000";
	public static final String PATTERN_THOUSAND_DECIMAL_2 = "###,##0.00";
	public static final String PATTERN_THOUSAND_DECIMAL_0 = "###,##0";
	
	public static String formatNum(double num, String pattern) {
		DecimalFormat df = new DecimalFormat(pattern);
		df.setGroupingUsed(true);//或者不写
		return df.format(num);
	}
	
	public static String formatNum(String num, String pattern) {
		if(StringUtils.isBlank(num)) {
			return "0";
		}
		if(Double.valueOf(num) == 0){
			return "0";
		}
		try {
			BigDecimal bd = new BigDecimal(num);
			return formatNum(bd.doubleValue(), pattern);
		} catch (Exception e) {
			logger.error(num + "无法转换成" + BigDecimal.class, e);
			return "0";
		}
	}
	
	/**
	 * 
	 * @Description: num 去除千分位
	 *   例如：123,100.00  转换为 123100.00
	 * @author shl
	 * @param num
	 * @return
	 */
	public static String formatNum(String num){
		String retNum = "0";
		if(StringUtils.isBlank(num)){
			return "0";
		}
		try {
			retNum = String.valueOf(new DecimalFormat().parse(num).doubleValue());
		} catch (Exception e) {
			logger.error("[num去除千分位]-处理异常：", e);
			retNum = "0";
		}
		return retNum;
	}
	
	/**
	 * 
	 * @Description:对整数部分格式化(千分号)
	 * @author shl
	 * @return
	 */
	public static String formatNumForInteger(String num){
		String retNum = "0";
		String[] arrayStr = null;
		if(StringUtils.isNotBlank(num)){
			arrayStr = num.split("\\.");
			if(arrayStr.length > 1){
				retNum = formatNum(arrayStr[0], PATTERN_THOUSAND_DECIMAL_0) 
						+ "." +arrayStr[1];
			}else{
				retNum = formatNum(arrayStr[0], PATTERN_THOUSAND_DECIMAL_0);
			}
		}
		return retNum;
	}
}
