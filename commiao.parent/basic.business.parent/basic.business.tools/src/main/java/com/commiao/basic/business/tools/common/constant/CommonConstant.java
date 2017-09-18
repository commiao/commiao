/**
 * @file CommonConstant.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年5月28日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年5月28日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.commiao.basic.business.tools.common.constant;

/**
 * @brief 公用常量
 *
 * 公用常量
 * 
 * @author
 *    - 2016年5月28日  申贺龙  创建初始版本
 *
 */
public class CommonConstant {
	
	/**
	 * 成功
	 */
	public static final String SUCCESS = "0000";
	
	/**
	 * 失败
	 */
	public static final String FALURE = "9999"; 
	/**
	 * 图文验证码错误
	 */
	public static final String FAILED_IMG_CODE = "SF9998";
	/**
	 * 恒生接口-客户类型 1.个人
	 */
	public static final String HS_CUST_TYPE_NATURE_PERSON = "1";
	
	/**
	 * 恒生接口-客户类型 0.机构
	 */
	public static final String HS_CUST_TYPE_ORGAN = "0";
	
	/**
	 * 
	 * @brief 绑卡认证常量
	 *
	 * 绑卡认证常量
	 * 
	 * @author
	 *    - 2016年6月7日  申贺龙  创建初始版本
	 *
	 */
	public static class UnionConstant{
		/**潜客前缀*/
		public static final String PREFIX_POTENTIAL = "200";
		
		/**银联证件类型：身份证01*/
		public static final String UNION_CERT_TYPE_IDCARD = "01";
		/**银联证件类型：军官证02*/
		public static final String UNION_CERT_TYPE_OFFICER = "02";
		/**银联证件类型：护照03*/
		public static final String UNION_CERT_TYPE_PASSPORT = "03";
		/**银联证件类型：回乡证04*/
		public static final String UNION_CERT_TYPE_HOMEVISITPERMIT = "04";
		/**银联证件类型：台胞证05*/
		public static final String UNION_CERT_TYPE_TAIWANPERMIT = "05";
		/**银联证件类型：警官证06*/
		public static final String UNION_CERT_TYPE_POLICECARD = "06";
		/**银联证件类型：士兵证07*/
		public static final String UNION_CERT_TYPE_SOLDIERS = "07";
		/**银联证件类型：其他证件99*/
		public static final String UNION_CERT_TYPE_OTHERS = "99";
		
		/**恒生接口证件类型：身份证0*/
		public static final String HS_CERT_IDCARD = "0";
		/**恒生接口证件类型：中国护照1*/
		public static final String HS_CERT_CHINAPASSPORT = "1";
		/**恒生接口证件类型：外国护照6*/
		public static final String HS_CERT_FOREIGNPASSPORT = "6";
		/**恒生接口证件类型：军官证2*/
		public static final String HS_CERT_OFFICER = "2";
		/**恒生接口证件类型：士兵证3*/
		public static final String HS_CERT_SOLDIERS = "3";
		/**恒生接口证件类型：出生证/户口本*/
		public static final String HS_CERT_PERSONBOOK = "5";
		/**恒生接口证件类型：回乡证*/
		public static final String HS_CERT_HOMEVISITPERMIT = "4";
		/**恒生接口证件类型：台胞证*/
		public static final String HS_CERT_TAIWANPERMIT = "D";
		/**恒生接口证件类型：警官证*/
		public static final String HS_CERT_POLICECARD = "9";
		/**恒生接口证件类型：其他证件*/
		public static final String HS_CERT_OTHERS = "7";
		/**恒生接口  是否检测风险评估 1是*/
		public static final String HS_IS_CHECK_RISK_YES = "1";
		/**恒生接口  客户类型 1.个人*/
		public static final String HS_CUST_TYPE_PERSON = "1";
		/**恒生接口  客户类型 0.机构*/
		public static final String HS_CUST_TYPE_ORGAN = "0";
	}
	
	/**
	 * 
	 * @brief 电子合同常量
	 *
	 * 电子合同常量
	 * 
	 * @author
	 *    - 2016年8月8日  申贺龙  创建初始版本
	 *
	 */
	public static class EleContractConstant{
		/**电子合同  身份证00*/
		public static final String ELE_CERT_IDCARD = "00";
		/**电子合同 护照01*/
		public static final String ELE_CERT_PASSPORT = "01";
		/**电子合同 港澳通行证04*/
		public static final String ELE_CERT_HOMEVISITPERMIT = "04";
		/**电子合同 军官证02*/
		public static final String ELE_CERT_OFFICER = "02";
		/**电子合同 士兵证03*/
		public static final String ELE_CERT_SOLDIERS = "03";
		/**电子合同 警官证09*/
		public static final String ELE_CERT_POLICECARD = "09";
		/**电子合同 台胞证0A*/
		public static final String ELE_CERT_TAIWANPERMIT = "0A";
		/**电子合同 其他证件07*/
		public static final String ELE_CERT_ORTHERS = "07";
		/**电子合同 外国护照06*/
		public static final String ELE_CERT_FOREIGNPASSPORT = "06";
		/**是否实名认证 0.已认证*/
		public static final String ELE_IS_CERTIFICATION_YES = "0";
		/**是否实名认证 1.未认证*/
		public static final String ELE_IS_CERTIFICATION_NO = "1";
		/**是否签署电子合同 2.是*/
		public static final String ELE_IS_SIGN_YES = "2";
		/**合格投资者类型 默认值-1*/
		public static final String ELE_QUALIFIED_TYPE = "-1";
	}
	
	/**
	 * 
	 * @brief 文件上传常量
	 *
	 * 文件上传常量
	 * 
	 * @author
	 *    - 2016年6月7日  申贺龙  创建初始版本
	 *
	 */
	public static class UploadFilesConstant{
		/**审核状态：1 待审核*/
		public static final String UPLOAD_FILE_AUDIT_STATUS_NOCHECK = "1";
		/**附件组编号 默认为1*/
		public static final Integer UPLOAD_FILE_FILEGROUPNO = 1;
		
		/**上传来源 PC*/
		public static final String UPLOAD_FILE_SOURCE_PC = "PC";
		/**上传来源 APP*/
		public static final String UPLOAD_FILE_SOURCE_APP = "APP";
		/**上传文件  判断session为空*/
		public static final String UPLOAD_FILE_SESSION_ISNULL = "UF9999";
		/**上传文件 格式有误**/
		public static final String UPLOAD_FILE_TYPE_ERROR = "UF9901";
		/**上传文件 2.收入证明*/
		public static final String UPLOAD_FILE_TYPE_INCOME = "2";
	}
	
	/**
	 * 
	 * @brief 合格投资者认定常量
	 *
	 * 合格投资者认定常量
	 * 
	 * @author
	 *    - 2016年6月17日  申贺龙  创建初始版本
	 *
	 */
	public static class QualifyInvestorConstant{
		/**当前默认页*/
		public static final Integer HS_CURR_PAGE = 1;
		
		/**每页记录数*/
		public static final Integer HS_SHOW_DATAROW = 20;
		
		/**是否合格投资者 1.是*/
		public static final String HS_QUALIFY_FLAG_YES = "1";
		/**是否合格投资者 0.否*/
		public static final String HS_QUALIFY_FLAG_NO = "0";
		/**合格投资者认定查询 2.审核通过*/
		public static final String HS_QUALIFY_STATUS_PASS = "2";
		/**合格投资者认定 系统来源1*/
		public static final String QUALIFY_INVESTOR_SYSTEM_FROM = "1";
		/**已认定 98*/
		public static final String HS_QUALIFY_STATUS_HASQUALIFY = "98";
		/**未认定 99*/
		public static final String HS_QUALIFY_STATUS_NOQUALIFY = "99";
		/**合格投资者认定状态  5.资料已过期*/
		public static final String HS_QUALIFY_STATUS_OUT_TIME = "5";
	    /**跳过合格投资者判断的投资底线（万元） */
        public static final Integer HS_QUALIFY_MINORDERBALANCE = 300;
        /**用户已为合格投资者，无需再次上传-97*/
        public static final String JF_QUALIFY_STATUS_REPETITION = "-97";   
        /**新增合格投资者失败-99*/
        public static final String JF_QUALIFY_STATUS_ADD_ERROR = "-99";
        /**修改合格投资者失败-98*/
        public static final String JF_QUALIFY_STATUS_UPDATE_ERROR = "-98";
        /**文件格式或大小不合法-95*/
        public static final String JF_QUALIFY_STATUS_FILE_ERROR = "-95";
        /**其他异常-94*/
        public static final String JF_QUALIFY_STATUS_OTHER_ERROR = "-94";
        
	}
	
	public static class AppointFundQueryConstant{
		/**排队中*/
		public static final String HS_ORDER_STATUS_QUEUEING = "0";
		
		/**排队成功*/
		public static final String HS_ORDER_STATUS_QUEUED = "7";
		/**待确认*/
		public static final String HS_ORDER_STATUS_DETERMINED = "f";
		
		/**是否取消1.否*/
		public static final String IS_CANCEL_NO = "1";
		/**是否取消2.是*/
		public static final String IS_CANCEL_YES = "2";
		
	}
	
	/**
	 * 
	 * @brief 产品信息常量
	 *
	 * 产品信息常量
	 * 
	 * @author
	 *    - 2016年7月6日  申贺龙  创建初始版本
	 *
	 */
	public static class ProductListConstant{
		/**营销项目状态 2.发行中*/
		public static final String HS_SALS_PRO_STATUS = "2";
		/**产品可预约来源  2.网站**/
		public static final String HS_NET_OPEN_WEB = "2";
		/**产品可预约来源  5.APP**/
		public static final String HS_NET_OPEN_APP = "5";
		/**2.固收*/
		public static final String HS_BONUS_TYPE_PERMANENT = "2";
		/**3.浮收*/
		public static final String HS_BONUS_TYPE_FLOAT = "3";
		/**持仓产品 分组条件0010001*/
		public static final String HS_GROUP_LIST = "0010001";
		/**持仓产品 分组条件0000001 按产品类型分*/
		public static final String HS_GROUP_LIST_TYPE = "0000001";
		/**持仓产品 分组条件0000000 所有资产汇总*/
		public static final String HS_GROUP_LIST_TOTAL_TYPE = "0000000";
	}
	
	/**
     * 
     * @brief 风险评估常量
     *
     * 风险评估常量
     * 
     * @author
     *    - 2016年7月6日  程珑  创建初始版本
     *
     */
    public static class QuestionQueryConstant{
        /***/
        public static final String HS_OBJECT_TYPE_CUST = "1";
        
        /**理顾在职状态-正常*/
        public static final String HS_CAREER_STATUS_NORMAL = "0";
    }
    
	public class KeyConstant {
		/**
		 * cookie中username的key
		 */
		public static final String KEY_COOKIE_LOGIN_USERNAME = "u";
		/**
		 * cookie中accoNo的key
		 */
		public static final String KEY_COOKIE_LOGIN_ACCONO = "a";
		/**
		 * SSO默认properties文件名
		 */
		public static final String SSO_PROPERTIES_DEFAULT = "/conf/auth.properties";
		/**
		 * OAuth2默认properties文件名
		 */
		public static final String OAUTH2_PROPERTIES_DEFAULT = "/conf/auth.properties";
		
		/** 验证码key	*/
		public static final String REGISTER_VALIDATE_CODE = "validateCode";
		/** 非第一次登陆  校验验证码   */
		public final static String LOGIN_SECOND_IMG_CODE = "LOGIN_SECOND_IMG_CODE";
	}
	
	/**
	 * 系统名称
	 * @author wrx
	 *
	 */
	public class SystemName{
		public static final String SYSTEM_WAP = "WAP";
		public static final String SYSTEM_APP = "APP";
		public static final String SYSTEM_PC = "PC";

	}
	
	   /**
     * 注册来源说明
     * @author wrx
     *
     */
    public class registerRemark{
        public static final String REGISTERREMARK_WAP = "WAP";
        public static final String REGISTERREMARK_WAP_OLDNEW = "WAP_OLD_NEW";
        public static final String REGISTERREMARK_APP = "APP";
        public static final String REGISTERREMARK_PC = "PC";

    }
    
}
