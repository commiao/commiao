package com.commiao.basic.business.tools.common;

import org.apache.commons.lang3.StringUtils;

/**
 * 身份证、银行卡加解密工具类
 * @author xiaodong.chen
 *
 */
public class IdCardEncryUtil {
	/**秘钥*/
	private static final String IDCARDKEY = "VMFQ-49OJ-4Y62-OYH3-02VK";
	
	/**
	 * 身份证加密
	 * @param IdCard
	 *         身份证号
	 * @return idcardEN
	 *         加密后身份证号
	 */
	public static String idCardEncry(String idCard){
		String idcardEN="";    //加密后身份证号
		String idcardkey = IdCardEncryUtil.IDCARDKEY;   //身份证加密秘钥
		idcardEN = RC4.encry_RC4_string(idCard, idcardkey);   //获得加密后身份证号
		return idcardEN;
	}
	
	/**
	 * 身份证解密
	 * @param idCard
	 *          身份证号
	 * @return  idCardDE
	 *           解密后身份证号
	 */
	public static String idCardDecry(String idCard){
		String idCardDE = "";
		String idcardkey = IdCardEncryUtil.IDCARDKEY;   //身份证解密秘钥
		idCardDE = RC4.decry_RC4(idCard, idcardkey);  //解密身份证号
		return idCardDE;
	}
	
	/**
	 * 银行卡加密
	 * @param bankCard
	 *         银行卡号
	 * @return bankcardEN
	 *         加密后银行卡号
	 */
	public static String bankCardEncry(String bankCard){
		String bankcardEN="";    //加密后银行卡号
		String bankcardkey = IdCardEncryUtil.IDCARDKEY;   //银行卡加密秘钥
		bankcardEN = RC4.encry_RC4_string(bankCard, bankcardkey);   //获得加密后身份证号
		return bankcardEN;
	}
	
	/**
	 * 银行卡解密
	 * @param bankCard 
	 *           银行卡号
	 * @return bankCardDE
	 *           解密后银行卡号
	 */
	public static String bankCardDecry(String bankCard){
		String bankCardDE = "";
		String bankcardkey = IdCardEncryUtil.IDCARDKEY;   //银行卡解密秘钥
		bankCardDE = RC4.decry_RC4(bankCard, bankcardkey);  //解密银行卡号
		return bankCardDE;
	}
	
	/**
	 * 获取身份证掩码
	 * @param idCard
	 *        身份证号
	 * @return idCardMark
	 *        身份证掩码
	 */
	public static String idCardMark(String idCard){
		if(StringUtils.isBlank(idCard)){
			return null;
		}
		StringBuffer idCardMark = new StringBuffer();
		for(int i=0;i<idCard.length();i++){
			if(i<4){
				idCardMark.append(idCard.charAt(i));
			}else if(i>idCard.length()-5){
				idCardMark.append(idCard.charAt(i));
			}else{
				idCardMark.append("*");
			}
		}
		return idCardMark.toString();
	}
	
	/**
	 * 获取银行卡掩码
	 * @param bankCard
	 *         银行卡
	 * @return bankCardMark
	 *         银行卡掩码
	 */
	public static String bankCardMark(String bankCard){
		if(StringUtils.isBlank(bankCard)){
			return null;
		}
		StringBuffer bankCardMark = new StringBuffer();
		for(int i=0;i<bankCard.length();i++){
			if(i<4){
				bankCardMark.append(bankCard.charAt(i));
				
			}else if(i>bankCard.length()-5){
				bankCardMark.append(bankCard.charAt(i));
			}else{
				bankCardMark.append("*");
			}
		}
		return bankCardMark.toString();
	}
	
	/**
	 * 手机号码加密
	 * @param phoneNo
	 *         手机号码
	 * @return phoneEN
	 *         加密后手机号码
	 */
	public static String phoneEncry(String phoneNo){
		String phoneEN="";    //加密后身份证号
		String idcardkey = IdCardEncryUtil.IDCARDKEY;   //身份证加密秘钥
		phoneEN = RC4.encry_RC4_string(phoneNo, idcardkey);   //获得加密后身份证号
		return phoneEN;
	}
	
	/**
	 * 手机号码解密
	 * @param phoneNo
	 *          
	 * @return  idCardDE
	 *           解密后手机号码
	 */
	public static String phoneDecry(String phoneNo){
		String phoneDE = "";
		String idcardkey = IdCardEncryUtil.IDCARDKEY;   //身份证解密秘钥
		phoneDE = RC4.decry_RC4(phoneNo, idcardkey);  //解密身份证号
		return phoneDE;
	}
	
	public static void main(String agrs[]){
		String idcarden = IdCardEncryUtil.idCardMark("6225881013711444");
		System.out.println(idcarden);
		
		String bankNo = IdCardEncryUtil.bankCardMark("6228480248126994479");
		
		System.out.println(bankNo);
		
		String idCode = IdCardEncryUtil.bankCardEncry("6228480248126994479");
		System.out.println(idCode);
		
		System.out.println(IdCardEncryUtil.bankCardDecry(idCode));
	}
}
