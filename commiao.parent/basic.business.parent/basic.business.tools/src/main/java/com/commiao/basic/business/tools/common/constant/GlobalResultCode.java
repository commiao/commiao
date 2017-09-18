package com.commiao.basic.business.tools.common.constant;

/**
 * 所有返回的状态码
 * @author jannal
 */
public class GlobalResultCode {
    
    /**
     * 
     * 银联实名认证返回错误码
     *
     */
    public static class UnionResultCode{
    	
    	/**身份认证失败*/
    	public static final String UNION_RET_FALURE = "UF0001";
    	/**身份认证后修改用户状态失败*/
    	public static final String UNION_UPDATE_FALURE = "UF0002";
    	/**手机验证码不正确*/
    	public static final String UNION_SMS_FALURE = "UF0003";
    	/**当前认证信息和以前认证信息不一致*/
    	public static final String LOCAL_RET_FALURE = "UF0004";
    	/**未实名认证，前台要求，与私募返回错误码一致CA0004*/
    	public static final String UNION_IS_NOT = "CA0004";
    }
    
    /**
     * 
     * 用户
     *
     */
    public static class UserResultCode{
        
        /**修改密码 密码错误*/
        public static final String MODIFYPWD_PWD_ERROR = "CF0001";
        /**修改密码 密码锁定*/
        public static final String MODIFYPWD_PWD_LOCKED = "CF0002";
        /**修改密码 修改失败*/
        public static final String MODIFYPWD_FALURE = "CF0003";
        /**修改联系人手机 手机号格式错误*/
        public static final String MODIFYPHONE_PHONE_ERROR = "CF0007";
        /**修改联系人手机 验证码不正确*/
        public static final String MODIFYPHONE_VERIFY_ERROR = "CF0005";
        /**发送短信验证码 手机号格式错误*/
        public static final String MSGSEND_PHONE_ERROR = "CF0006";
        /**未风险评测，前台要求，与私募返回错误码一致RE0004*/
        public static final String RISK_IS_NOT = "RE0004";
        /**没有现金宝账户CA0001*/
        public static final String CASH_TREASURE_IS_NOT_OPEN = "CA0001";
    }
    
    /**
     * 理财师
     */
    public static class FinancialPlannerCode{
    	/**查询理财师信息错误--没有指定理财师*/
        public static final String NO_FINANCIAL_PLANNER_ERROR_001 = "FP0001";
        /**查询理财师信息错误--理财师已离职*/
        public static final String DIMISSION_FINANCIAL_PLANNER_ERROR_002 = "FP0002";
        /**指定理财师错误--用户已有指定理财师*/
        public static final String HAVE_FINANCIAL_PLANNER_ERROR_003 = "FP0003";
        /**指定理财师信息错误--理财师已被锁定*/
        public static final String DIMISSION_FINANCIAL_PLANNER_ERROR_004 = "FP0004";
        /**指定理财师信息错误--无法指定恒天财富员工*/
        public static final String DIMISSION_FINANCIAL_PLANNER_ERROR_005 = "FP0005";
    }
    
    
    /** 
     * CreateDate:2016年11月21日下午2:01:13 
     * @Description: 支付校验 
     * @author:jingmiao
     * @version V1.0   
     */
    public static class PaymentResultCode{
    	/**
    	 * 校验支付方式-不支持在线支付. 
    	 */
    	public static final String PAYMENT_ONLINE_FALURE = "PF0001";
    	
    	/**
    	 * 校验支付方式-不支持汇款支付. 
    	 */
    	public static final String PAYMENT_OFFLINE_FALURE = "PF0002";
    }
    
    public static class CommonResultCode{
        
        /**
        * 操作成功
        */
       public static final String OPERATION_SUCCESS ="CS0000";
       
       /**
        * 操作失败
        */
       public static final String OPERATION_FAILED ="CF0001";
       
       /**
        * 参数解析错误
        */
       public static final String PARAMS_RESOLVE_ERROR = "CF0002";
       
       /**
        * 图形验证码错误
        */
       public static final String VALIDATE_CODE_ERROR ="CF0003";
       
       /**
        * 重新登录
        */
       public static final String NEED_LOGIN = "CF0004";
       
       /**
        * 地址不存在
        */
       public static final String PAGE_NO_EXISTS = "CF0005";
       
       /**
        * 参数非法
        */
       public static final String PARAMS_ILLEGAL="CF0008";
       
       /**
        * 系统维护中
        */
       public static final String SYSTEM_BUILDING = "CF0009";
       
       /**
        * 数据库查询无记录
        */
       public static final String QUERY_NO_RESULT = "CF0010";
       /**
        * 数据库查询异常
        */
       public static final String QUERY_FAILED = "CF0011";
       
       /**
        * 手机验证码不正确
        */
       public static final String VALIDATE_PHONE_CODE_ERROR = "CF0012";
       
       /**
        * 短信验证码验证失败
        */
       public static final String SMS_CODE_FAILED = "CF0012";
       
       /**
        * 未风险评测
        */
       public static final String NEED_APPRAISAL = "RE0004";
       /**
        * 未实名认证
        */
       public static final String NEED_CERTIFICATION = "CA0004";
       /**
        * 实名认证信息未补全
        */
       public static final String NEED_COMPLEMENT = "CP0004";
       /**
        * 未获得投资者分类标签
        */
       public static final String NEED_INVESTORCLASSIFY = "IC0004";
       /**
        * 统一编码
        */
       public static final String COMMON_ENCODING = "UTF-8";
       
   }
    /**
	 * 
	 * CreateDate:2016年9月28日下午11:57:28 
	 * @Description: http请求响应状态
	 * @author:yuzhao
	 * @version V1.0
	 */
	public class ResponseStatus {
		public static final int RESPONSE_STATUS_200 = 200;
		public static final int RESPONSE_STATUS_302 = 302;
		public static final int RESPONSE_STATUS_400 = 400;
		public static final int RESPONSE_STATUS_404 = 404;
		public static final int RESPOSNE_STATUS_500 = 500;
	}
	
	
	public class OauthCode{
	    public static final String ACCESSTOKEN_INVALID = "AC0000";
	}
}
