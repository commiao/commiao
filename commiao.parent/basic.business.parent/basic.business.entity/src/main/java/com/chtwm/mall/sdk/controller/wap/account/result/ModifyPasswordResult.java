package com.chtwm.mall.sdk.controller.wap.account.result;

/*
{
    data: 
        {
         modify_result:””,//修改结果(修改结果-0:成功;1:密码错误;2:密码主动锁定;4:密码无效;5:密码不符合设定的规则;6:密码被动锁定)
         message:””//返回错误信息(0:成功;1:系统级错误;2:应用级错误;3:业务逻辑错误)
		}
    ,
    hmac:"", //预留字段
    msg: "success",
    status: "0"
}
 */
public class ModifyPasswordResult {

	private String modify_result;
	
	private String message;

	public String getModify_result() {
		return modify_result;
	}

	public void setModify_result(String modify_result) {
		this.modify_result = modify_result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
