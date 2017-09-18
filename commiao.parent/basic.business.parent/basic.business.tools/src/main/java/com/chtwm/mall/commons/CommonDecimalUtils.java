package com.chtwm.mall.commons;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * CreateDate:2016年11月3日下午5:10:55
 * 
 * @Description: 数字处理工具类
 * @author:hehch
 * @version V1.0
 */
public class CommonDecimalUtils {

	/**
	 * @Description::将数字对象转换为pattern类型的字符串. <br/>
	 * @author hehch
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String convertDecimalToStr(Double num, String pattern) {
		if (num == null) {
			return "0.00";
		}
		DecimalFormat sdf = new DecimalFormat(pattern);
		return sdf.format(num);
	}

	/**
	 * @Description::将数字对象转换为pattern类型的字符串，unit为输出数据的单位. <br/>
	 * @author hehch
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String convertDecimalToStr(Double num, String pattern, double unit) {
		if (num == null) {
			return "0.00";
		}
		DecimalFormat sdf = new DecimalFormat(pattern);
		return sdf.format(num / unit);
	}

	/**
	 * @Description::将数字字符串转换为pattern类型的字符串. <br/>
	 * @author hehch
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String convertDecimalToStr(String num, String pattern) {
		Double doubleNum = null;
		try {
			doubleNum = Double.parseDouble(num);
		} catch (Exception e) {
		}
		return convertDecimalToStr(doubleNum, pattern);
	}

	/**
	 * @Description::将数字字符串转换为pattern类型的字符串，unit为输出数据的单位. <br/>
	 * @author hehch
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String convertDecimalToStr(String num, String pattern, double unit) {
		Double doubleNum = null;
		try {
			doubleNum = Double.parseDouble(num) / unit;
		} catch (Exception e) {
		}
		return convertDecimalToStr(doubleNum, pattern);
	}

	/**
	 * @Description::将数字字符串转换为long型数据，若转换失败，则返回0. <br/>
	 * @author hehch
	 * @param str
	 * @return
	 */
	public static long parseLong(String str) {
		try {
			return Long.parseLong(str);
		} catch (Exception e) {
			return 0L;
		}
	}

	/**
	 * @Description::将数字字符串转换为Double型数据，若转换失败，则返回0. <br/>
	 * @author hehch
	 * @param str
	 * @return
	 */
	public static double parseDouble(String str) {
		try {
			return Double.parseDouble(str);
		} catch (Exception e) {
			return 0L;
		}
	}
	
	/**
	 * 字符串转double类型，用decimal
	 * @param str
	 * @param pattern
	 * @return
	 * @throws ParseException
	 */
	public static double decimalDoubleToStr(String str,String pattern) throws ParseException{
	    double num=0;
        DecimalFormat format = new DecimalFormat(pattern);
        num= format.parse(str).doubleValue();
        return num;
	}
}
