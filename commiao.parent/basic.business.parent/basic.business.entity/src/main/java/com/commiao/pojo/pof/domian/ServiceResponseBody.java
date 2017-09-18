package com.commiao.pojo.pof.domian;

import com.commiao.basic.business.tools.common.constant.GlobalResultCode;
import com.commiao.basic.business.tools.common.constant.GlobalResultCode.CommonResultCode;

/**
 * CreateDate:2016年9月22日上午10:01:44 
 * @Description:响应的数据 
 * @author:jannal
 * @version V1.0
 */
public class ServiceResponseBody<T> extends AbstractServiceBody{
    public final static  String SUCCESS_MSG = "success";
    public final static String SUCCESS = "0";// 成功
    public final static String FAILED = "1";// 失败
    /**
     * 密钥(返回的密钥可以不要)
     */
    private String hmac="hmac";
    /**
     * 状态码
     */
    private String status = SUCCESS;
    /**
     * 特殊意义的编码
     */
    private String code = GlobalResultCode.CommonResultCode.OPERATION_SUCCESS;
    /**
     *  消息
     */
    private String msg=SUCCESS_MSG;
    /**
     * 响应数据
     */
    private T data ;
    
    public ServiceResponseBody() {
		
	}

	public ServiceResponseBody(String status, String code, String msg) {
		this.status = status;
		this.code = code;
		this.msg = msg;
	}
    
	/** 
	 * @Description::默认操作失败. <br/> 
	 * @author jingmiao
	 * @param errorMsg
	 * @return
	 */ 
	public ServiceResponseBody<T> DEAFULFAIL(String errorMsg){
    	return CUSTOMFAIL(CommonResultCode.OPERATION_FAILED, errorMsg);
    }
	/** 
	 * @Description::参数解析错误. <br/> 
	 * @author jingmiao
	 * @param errorMsg
	 * @return
	 */ 
	public ServiceResponseBody<T> paramsResolveFail(String errorMsg){
		return CUSTOMFAIL(CommonResultCode.PARAMS_RESOLVE_ERROR, errorMsg);
	}
	/** 
	 * @Description::参数非法错误. <br/> 
	 * @author jingmiao
	 * @param errorMsg
	 * @return
	 */ 
	public ServiceResponseBody<T> paramsIllegalFail(String errorMsg){
		return CUSTOMFAIL(CommonResultCode.PARAMS_ILLEGAL, errorMsg);
	}
	/** 
	 * @Description::数据库查询异常错误. <br/> 
	 * @author jingmiao
	 * @param errorMsg
	 * @return
	 */ 
	public ServiceResponseBody<T> queryFailedFail(String errorMsg){
		return CUSTOMFAIL(CommonResultCode.QUERY_FAILED, errorMsg);
	}
	/** 
	 * @Description::数据库查询无记录错误. <br/> 
	 * @author jingmiao
	 * @param errorMsg
	 * @return
	 */ 
	public ServiceResponseBody<T> queryNoResultFail(String errorMsg){
		return CUSTOMFAIL(CommonResultCode.QUERY_NO_RESULT, errorMsg);
	}
	
	public ServiceResponseBody<T> CUSTOMFAIL(String code,String errorMsg){
		this.status = SUCCESS;
//		this.status = FAILED;
		this.code = code;
		this.msg = errorMsg;
    	return this;
    }
    
	public String getHmac() {
        return hmac;
    }
    public void setHmac(String hmac) {
        this.hmac = hmac;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    
    public static void main(String[] args) {
    	ServiceResponseBody<String> body = new ServiceResponseBody<>();
    	body.setData("test");
    	body.paramsIllegalFail("aa");
    	System.out.println(body.getCode());
    	
	}
}
