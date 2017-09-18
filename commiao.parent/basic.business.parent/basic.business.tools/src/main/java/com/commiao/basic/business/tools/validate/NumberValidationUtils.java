package com.commiao.basic.business.tools.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/**
 * @author jannal
 * 1. 对于正整数而言，可以带+号，第一个数字不能为0

   2. 对于负整数而言，必须带负号，第一个数字也不能为0

   3. 对于整数而言，实际是由0，正整数和负整数组成的，所以偷个懒用前两个方法一起判断

   4. 对于正小数而言，可以考带+号，并考虑两种情况，第一个数字为0和第一个数字不为0，第一个数字为0时，则小数点后面应该不为0，第一个数字不为0时，小数点后可以为任意数字

   5. 对于负小数而言，必须带负号，其余都同上

   6. 对于小数，可以带正负号，并且带小数点就行了，但是至少保证小数点有一边不为空，所以这里还是分左边不为空和右边不为空的情况

   7. 实数比较简单，，要么是整数，要么是小数
 */
public class NumberValidationUtils {
    private static boolean isMatch(String regex, String orginal){
        if (orginal == null || orginal.trim().equals("")) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher isNum = pattern.matcher(orginal);
        return isNum.matches();
    }

    /**
     * 是否是正数
     * @param orginal
     * @return
     */
    public static boolean isPositiveInteger(String orginal) {
        return isMatch("^\\+{0,1}[1-9]\\d*", orginal);
    }
    /**
     * 是否是负数
     * @param orginal
     * @return
     */
    public static boolean isNegativeInteger(String orginal) {
        return isMatch("^-[1-9]\\d*", orginal);
    }
    /**
     * 是否是整数
     * @param orginal
     * @return
     */
    public static boolean isWholeNumber(String orginal) {
        return isMatch("[+-]{0,1}0", orginal) || isPositiveInteger(orginal) || isNegativeInteger(orginal);
    }
    /**
     * 是否是正小数
     * @param orginal
     * @return
     */
    public static boolean isPositiveDecimal(String orginal){
        return isMatch("\\+{0,1}[0]\\.[1-9]*|\\+{0,1}[1-9]\\d*\\.\\d*", orginal);
    }
    /**
     * 是否是负小数
     * @param orginal
     * @return
     */
    public static boolean isNegativeDecimal(String orginal){
        return isMatch("^-[0]\\.[1-9]*|^-[1-9]\\d*\\.\\d*", orginal);
    }
    /**
     * 是否是小数
     * @param orginal
     * @return
     */
    public static boolean isDecimal(String orginal){
        return isMatch("[-+]{0,1}\\d+\\.\\d*|[-+]{0,1}\\d*\\.\\d+", orginal);
    }
    /**
     * 是否是数字
     * @param orginal
     * @return
     */
    public static boolean isRealNumber(String orginal){
        return isWholeNumber(orginal) || isDecimal(orginal);
    }
    
    /**
     * 是否是偶数
     */
    public static boolean isEvenNumber(String orginal){
    	return isMatch("^\\d*[02468]$",orginal);
    }
    /**
     * 是否是奇数
     */
    public static boolean isOddNumber(String orginal){
    	return !isMatch("^\\d*[02468]$",orginal);
    }
    
    /**
     * 验证一个字符串是否全部为数字
     * 
     * @param str
     * @return add by jannal 2014年12月10日
     */
    public static boolean isLongNumeric(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        for (int i = str.length(); --i >= 0;) {
            int chr = str.charAt(i);
            if (chr < 48 || chr > 57)
                return false;
        }
        return true;
    }
    
}
