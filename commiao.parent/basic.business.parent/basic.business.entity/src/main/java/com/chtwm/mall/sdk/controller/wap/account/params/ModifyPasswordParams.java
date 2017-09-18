package com.chtwm.mall.sdk.controller.wap.account.params;

/**
 * 
 * @author seven
 *
 */
/*
{
    hmac:"", //预留的加密信息
    params:
		{//请求的参数信息
          new_password:””,//新密码1(密码明文最大长度12位（为了兼容之前的版本,约定： 如果该字段填写字符*,则不判断该字段,新密码取字段"新密码2",不再读取"新密码1" 如果该字段填写其他字符,则判断该字段,新密码取本字段"新密码1",不再读取"新密码2"）)
          new_password2:””,//新密码2
          old_password:””,//旧密码1(密码明文最大长度12位（为了兼容之前的版本,约定： 如果该字段填写字符*,则不判断该字段,旧密码取字段"旧密码2",不再读取"旧密码1" 如果该字段填写其他字符,则判断该字段,旧密码取本字段"旧密码1",不再读取"旧密码2"）)
          old_password2:””,//旧密码2
          operator_from:””//操作来源
          
        }
}
 */
public class ModifyPasswordParams {

	private String new_password;
	
	private String new_password2;
	
	private String old_password;
	
	private String old_password2;
	
	private String operator_from;

	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}

	public String getNew_password2() {
		return new_password2;
	}

	public void setNew_password2(String new_password2) {
		this.new_password2 = new_password2;
	}

	public String getOld_password() {
		return old_password;
	}

	public void setOld_password(String old_password) {
		this.old_password = old_password;
	}

	public String getOld_password2() {
		return old_password2;
	}

	public void setOld_password2(String old_password2) {
		this.old_password2 = old_password2;
	}

	public String getOperator_from() {
		return operator_from;
	}

	public void setOperator_from(String operator_from) {
		this.operator_from = operator_from;
	}
	
}
