package com.commiao.basic.business.tools.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUtil {
	// 判断电话
    public static boolean isTelephone(String phonenumber) {
        String phone = "0\\d{2,3}-\\d{7,8}";
        Pattern p = Pattern.compile(phone);
        Matcher m = p.matcher(phonenumber);
        return m.matches();
    }
    // 判断手机号
    public static boolean isMobileNO(String mobiles) {// 增加17号段手机号
    	if(null == mobiles || "".equals(mobiles)){
    		return false;
    	}
        //Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,1,2,3,5-9])|(14[0,1,2,3,7,5-9])|(17[0-9]))\\d{8}$");
        //Pattern p = Pattern.compile("^1(3[0-9]|4[57]|5[0-35-9]|8[0-9]|70)\\d{8}$");
    	// ^[1][3,4,5,7,8][0-9]{9}$
    	Pattern p = Pattern.compile("^1(3[0-9]|4[57]|5[0-35-9]|8[0-9]|7[0-9])\\d{8}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }

    // 判断邮箱
    public static boolean isEmail(String email) {
        String str = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(email);
        return m.matches();
    }
    // 判断日期格式:yyyy-mm-dd
    public static boolean isValidDate(String sDate) {
        String datePattern1 = "\\d{4}-\\d{2}-\\d{2}";
        String datePattern2 = "^((\\d{2}(([02468][048])|([13579][26]))"
                + "[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|"
                + "(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?"
                + "((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?("
                + "(((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?"
                + "((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";
        if ((sDate != null)) {
            Pattern pattern = Pattern.compile(datePattern1);
            Matcher match = pattern.matcher(sDate);
            if (match.matches()) {
                pattern = Pattern.compile(datePattern2);
                match = pattern.matcher(sDate);
                return match.matches();
            } else {
                return false;
            }
        }
        return false;
    }
    //验证金额
    public static boolean isNumber(String str) 
    {	//"^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$"
    	
    	if(null == str || "".equals(str)){
			return false;
		}
    	
        java.util.regex.Pattern pattern=java.util.regex.Pattern.compile("^((\\d*)\\.(\\d*))|(\\d*)$"); // 判断小数点后一位的数字的正则表达式
        java.util.regex.Matcher match=pattern.matcher(str); 
        if(match.matches()==false) 
        { 
           return false; 
        } 
        else 
        { 
           return true; 
        } 
    }
    public static void main(String[] args) {
        System.out.println(isMobileNO("14911195111"));
    }
}
