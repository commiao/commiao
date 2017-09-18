package com.commiao.basic.business.tools.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
/**
 * CreateDate:2016年9月22日上午10:17:14 
 * @Description: 校验工具类
 * @author:jannal
 * @version V1.0
 */
public class ValidateUtils {
    private ValidateUtils(){};

    /**
	 * 校验是否为手机号码 add by jannal 2014-12-02
	 * 
	 * @param str
	 *            手机号码
	 * @return
	 */
	public static boolean isMobile(String str) {
		return isMatcher(str, "^[1][3,4,5,8,7][0-9]{9}$");
	}
	public static boolean isMobile(String[] strs) {
		for(int i = 0;i<strs.length;i++){
			if(!isMobile(strs[i])){
				return false;
			}
		}
		return true;
	}
	
	

	/***
	 * @param mail
	 * @return add by jannal 2014年12月9日
	 */
	public static boolean isValidMail(String mail) {
		if (StringUtils.isEmpty(mail)) {
			return false;
		}
		String email_regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return isMatcher(mail, email_regex);
	}
	
	
	/**
     * 校验密码长度以及有效性 用户输入的密码必须length位以上，并包含数字，字母，符号中的两种
     * 
     * @param password
     * @param length 密码要求的长度
     * @return 2016年01月08日 
     */
    public static boolean isValidPassword(String password,int length) {
        int count = 0;
        if (StringUtils.isEmpty(password) || password.length() <= length) {
            return false;
        }
        if (findMatcher(password, "[a-zA-Z]")) {
            count++;
        }
        if (findMatcher(password, "[0-9]")) {
            count++;
        }
        if (findMatcher(password, "[\\u0020-\\u002F\\u003A-\\u0040\\u005B-\\u0060\\u007B-\\u007E]")) {// 特殊字符
            count++;
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }
	
	
	
	
	
	
	/**
	 * add by jannal
	 * 
	 * @param str
	 *            需要验证的匹配字符串
	 * @param reg
	 *            正则表达式
	 * @return
	 */
	public static boolean isMatcher(String str, String reg) {
		if (StringUtils.isEmpty(str)) {
			return false;
		}
		Pattern p = null;
		Matcher m = null;
		boolean b = false;
		p = Pattern.compile(reg);
		m = p.matcher(str);
		b = m.matches();
		return b;
	}
	
	
	   /**
     * add by jannal
     * 
     * @param str
     *            字符串
     * @param reg
     *            正则
     * @return 2014年12月4日 下午5:04:33
     */
    public static boolean findMatcher(String str, String reg) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile(reg);
        m = p.matcher(str);
        b = m.find();
        return b;
    }
	
}
