package com.commiao.domain.utils;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	/**
	 * 将字符串转换为String[]
	 * @param ids
	 * @return
	 */
	public static String[] getArryByIds(String ids){
		if(isNull(ids))return null;
		String[] arry = ids.split(",", 0);
		return arry;
	}
	
	/**
	 * 将字符串转换为Integer[]
	 * @param ids
	 * @return
	 */
	public static Integer[] getArrayByIds(String ids){
		String[] str = getArryByIds(ids);
		if(isNull(str))return null;
		Integer[] arry = new Integer[str.length];
		for(int i=0;i<arry.length;i++){
			arry[i]=str[i]==null?0:Integer.parseInt(str[i]);
		}
		return arry;
	}
	
	/**
	 * 将字符串转换为数组，并将第一个元素转换为Integer类型
	 * @param ids
	 * @return
	 */
	public static Integer getArrayFirstByIds(String ids){
		Integer[] ints = getArrayByIds(ids);
		if(isNull(ints)||ints.length==0||isNull(ints[0]))return null;
		return ints[0];
	}
	
	/**
	 * object转换为integer
	 * @param obj
	 * @return
	 */
	public static Integer objToInteger(final Object obj){
		Integer integer = null;
		String str = objToString(obj);
		if(str == null){
			return null;
		}
		try {
			integer = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return null;
		}
		return integer;
	}
	
	/**
	 * object转换为string
	 * @param obj
	 * @return
	 */
	public static String objToString(final Object obj){
		String str = null;
		if(isNull(obj)){
			return null;
		}
		try {
			str = String.valueOf(obj);
		} catch (NumberFormatException e) {
			return null;
		}
		return str;
	}

	@SuppressWarnings("rawtypes")
	public static boolean isNull(final Object xxx) {
		if (xxx == null) {
			return true;
		}
		if ("".equals(xxx.toString())) {
			return true;
		}
		if (xxx instanceof Collection) {
			if (((Collection) xxx).size() == 0) {
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("rawtypes")
	public static String setToString(final Set st) {
		if (st == null) {
			return "[]";
		}
		String re = "";
		for (final Object obj : st) {
			re = re + "," + obj;
		}
		re = re.substring(0, re.lastIndexOf(","));
		return "[" + re + "]";
	}

	@SuppressWarnings("rawtypes")
	public static String collectionToString(final Collection clt) {
		if (clt == null) {
			return "[]";
		}
		String re = "";
		for (final Object obj : clt) {
			re = re + "," + obj;
		}
		re = re.substring(0, re.lastIndexOf(","));
		return "[" + re + "]";
	}

	public static boolean isNotNull(final Object xxx) {
		return !isNull(xxx);
	}

	/**
	 * 获取几位随机数字
	 * 
	 * @param num
	 * @return
	 */
	public static String getRandomNum(final int num) {
		String result = "";
		final Random random = new Random();
		for (int i = 0; i < num; i++) {
			result = result + random.nextInt(10);
		}
		return result;
	}

	/**
	 * gbk转化为utf8
	 * 
	 * @param num
	 * @return
	 */
	public static String gbkToUtf8(final String Str) {
		try {
			return new String(Str.getBytes("utf-8"), "gbk");
		} catch (final UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static boolean isImage(final String name) {
		final String imageArr[] = { "jpg", "jpeg", "bmp", "png", "gif" };
		if (name == null || name.lastIndexOf(".") == -1) {
			return false;
		}
		final String ext = name.substring(name.lastIndexOf(".") + 1,
				name.length()).toLowerCase();
		for (final String xxx : imageArr) {
			if (xxx.equals(ext)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 获取文件扩展名
	 * 
	 * @param name
	 * @return
	 */
	public static String getFileExt(final String name) {
		return name.substring(name.lastIndexOf(".") + 1, name.length())
				.toLowerCase();
	}

	public static String GBToUnicode(final String inStr) {
		// 将要转换的字符串拆成字符数组
		final char[] myBuffer = inStr.toCharArray();

		// 要返回的unicode字符。
		String unicodeStr = "";

		// 循环取出每个字符的unicode
		for (int i = 0; i < inStr.length(); i++) {

			// 得到汉字内码
			final short s = (short) myBuffer[i];
			final int j = new Integer("" + s).intValue();

			String unicode = Integer.toHexString(j);

			// 拼接unicode字符。
			if (unicode.indexOf("ffff") != -1) {
				unicode = unicode.substring(0, unicode.indexOf("ffff"))
						+ unicode.substring(unicode.indexOf("ffff") + 4);
			}

			unicodeStr += "&#x" + unicode + ";";
		}

		// 返回
		return unicodeStr;
	}

	/**
	 * 判断手机号码合法性
	 * 
	 * @return
	 */
	public static boolean isMobileNO(String mobiles) {

		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");

		Matcher m = p.matcher(mobiles);

		return m.matches();

	}

	public static void main(String[] args) {
		System.out.println(isMobileNO("18332563515"));
	}
}