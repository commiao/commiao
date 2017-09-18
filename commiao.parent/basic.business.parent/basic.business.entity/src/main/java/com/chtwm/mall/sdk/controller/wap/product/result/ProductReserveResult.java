package com.chtwm.mall.sdk.controller.wap.product.result;

/**
 * 
 * @author seven
 *
 */
/*
{
    data: 
	{
        code:””,//返回错误码(0000成功)
          message:””//返回错误信息
     }

    ,
    hmac:"", //预留字段
    msg: "success",
    status: "0"
}
 */
public class ProductReserveResult {

	private String code;
	
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
