package com.commiao.domain.utils;

import java.math.BigDecimal;

public class BigDecimalUtils {
	
	final public static BigDecimal ONE = BigDecimal.ONE;
	final public static BigDecimal ZERO = BigDecimal.ZERO;
	/**
	 * 除法运算默认为四舍五入运算
	 */
	final public static int ROUNDING_MODE = BigDecimal.ROUND_HALF_UP;
	/**
	 * 默认除法精确位数 20
	 */
	final private static int SCALE_DEFAULT = 20; 
	/**
	 * 默认百分率精确位数 20
	 */
	final private static int SCALE_RATE = 20;
	
	/**
	 * x/365 (年利率->日利率)
	 * <br>默认精确至二十位小数 四舍五入
	 * @param x
	 * @return
	 */
	public static BigDecimal getOneOfYear(BigDecimal x){
		return div(x, BigDecimal.valueOf(365), SCALE_RATE);
	}
	
	/**
	 * x/12 (年利率->月利率)
	 * <br>默认精确至二十位小数 四舍五入
	 * @return
	 */
	public static BigDecimal getOneTwelfth(BigDecimal x){
		return div(x, BigDecimal.valueOf(12), SCALE_RATE);
	}
	
	/**
	 * 除法运算(计算过程中保留最大位数20位)
	 * <br>默认精确至二十位小数 四舍五入
	 * @param v1 被除数
	 * @param v2 除数
	 * @return
	 */
	public static BigDecimal div_20(BigDecimal v1,BigDecimal v2){
		return div(v1, v2, SCALE_DEFAULT);
	}
	
	/**
	 * 除法运算(计算结果保留位数2位)
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static BigDecimal div_2(BigDecimal v1,BigDecimal v2){
		return div(v1, v2, 2);
	} 
	
	/**
	 * 除法运算
	 * <br>默认四舍五入
	 * @param v1 被除数
	 * @param v2 除数
	 * @param scale 设定 精确位数
	 * @return
	 */
	public static BigDecimal div(BigDecimal v1,BigDecimal v2,int scale){
		return v1.divide(v2, scale, ROUNDING_MODE);
	}
	
}
