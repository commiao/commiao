package com.commiao.basic.business.tools.common;

/** 
 * CreateDate:2016年12月21日上午11:56:07 
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author:shl
 * @version V1.0   
 */
public class EnumerateUtils {
	
	/**
	 * 
	 * CreateDate:2016年12月21日下午12:17:09 
	 * @Description: 赎回申请状态枚举 
	 * @author:shl
	 * @version V1.0
	 */
	public static enum RedemptionStatusEnum{
		DRAFT("0", "草稿"), PENDING("1", "待审核"), PASS("2", "审核通过"),
		NOPASS("3", "审核不通过"), REVOCATION("4", "已撤销"), EXPORTED("5", "已导出"),
		CONFIRMED("6", "已确认"), EXPORTING("7", "导出中");
		
		private String code;
		private String dic;
		RedemptionStatusEnum(String code, String dic){
			this.code = code;
			this.dic = dic;
		}
		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDic() {
			return dic;
		}

		public void setDic(String dic) {
			this.dic = dic;
		}
	}
	
	/**
	 * 
	 * @Description:根据code获取赎回申请状态转义值
	 * @author shl
	 * @param code
	 * @return
	 */
	public static String getRdpStatusDicByCode(String code){
		for(RedemptionStatusEnum rdpStatusEnum : RedemptionStatusEnum.values()){
			if(rdpStatusEnum.getCode().equals(code)){
				return rdpStatusEnum.getDic();
			}
		}
		return "";
	}
	
	/**
	 * 
	 * CreateDate:2017年4月27日下午5:13:14 
	 * @Description: 手机验证码枚举
	 * @author:shl
	 * @version V1.0
	 */
	public static enum PhoneCodeTypeEnum{
		MODIFY_PHONE("1", "修改手机号"), 
		REGISTER("10", "用户注册"),
		FIND_PWD("11", "找回密码"),
		EMAIL("13", "邮箱认证"),
		CERTIFICATION("14", "实名认证"),
		REDEMPTION("15", "产品赎回");
		private String type;
		private String dic;
		PhoneCodeTypeEnum(String type, String dic){
			this.type = type;
			this.dic = dic;
		}
		public String getType() {
			return type;
		}
		public String getDic() {
			return dic;
		}
	}
	/**
	 * 
	 * @Description:获取手机验证码转义值
	 * @author shl
	 * @param type
	 * @return
	 */
	public static String getCodeDicByType(String type){
		for(PhoneCodeTypeEnum phoneCodeTypeEnum : PhoneCodeTypeEnum.values()){
			if(phoneCodeTypeEnum.getType().equals(type)){
				return phoneCodeTypeEnum.getDic();
			}
		}
		return "";
	}
}
