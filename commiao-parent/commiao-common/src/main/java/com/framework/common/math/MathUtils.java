package com.framework.common.math;

import java.math.BigDecimal;

public class MathUtils {
        
	/**
	 * 四舍五入
	 * @param d
	 * @return
	 */
	public static double roundHalfUp (double d) { 
	     BigDecimal bd = new BigDecimal(d); 
	     BigDecimal bd1 = bd.setScale(2, BigDecimal.ROUND_HALF_UP); 
	     d= bd1.doubleValue(); 
	     return d; 
	}
	/**
	 * 四舍五入
	 * @param d
	 * @return
	 */
	public static Long roundHalfUp (double d,int i) { 
	     BigDecimal bd = new BigDecimal(d); 
	     BigDecimal bd1 = bd.setScale(i, BigDecimal.ROUND_HALF_UP); 
	     Long l= bd1.longValue(); 
	     return l; 
	} 
   
	/**
	 * 计算以base为底，value的对数
	 * @param value
	 * @param base 对数底
	 * @return
	 */
	public static double log(double value,double base){
		return Math.log(value)/Math.log(base);
	}
	
	/**
	 * 计算以e为底，value的对象
	 * @param value
	 * @return
	 */
	public static double log(double value){
		return Math.log(value);
	}
	
	public static void main(String[] args) {
		System.out.println(Math.log10(100)+"#"+log(100,10));
	}
}
