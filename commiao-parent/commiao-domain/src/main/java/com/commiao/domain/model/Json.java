package com.commiao.domain.model;

/**
 * JSON模型
 * 
 * Author ningzhitao 
 * Date   15/12/19
 * 
 */
public class Json implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private boolean success = false;// 是否成功
	private String msg = "";// 提示信息
	private Object obj = null;// 其他信息

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public Json() { }
	private Json(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}
	private Json(boolean success, Object obj) {
		this.success = success;
		this.obj = obj;
	}
	private Json(boolean success, String msg, Object obj) {
		this.success = success;
		this.msg = msg;
		this.obj = obj;
	}

	/**
	 * 返回正确Json
	 * @param msg
	 * @param obj
	 * @return
	 */
	public static Json SUCCESS(String msg,Object obj){
		return new Json(true,msg,obj);
	}
	/**
	 * 返回错误Json
	 * @param msg
	 * @param obj
	 * @return
	 */
	public static Json FAIL(String msg,Object obj){
		return new Json(false,msg,obj);
	}
	/**
	 * 返回正确的json提示信息
	 * @param msg
	 * @return
	 */
	public static Json SUCCESS(String msg){
		return new Json(true,msg);
	}
	/**
	 * 返回错误的json提示信息
	 * @param msg
	 * @return
	 */
	public static Json FAIL(String msg){
		return new Json(false,msg);
	}
	/**
	 * 返回正确的json和对象
	 * @param obj
	 * @return
	 */
	public static Json SUCCESS(Object obj){
		return new Json(true,obj);
	}
	/**
	 * 返回错误的json和对象
	 * @param obj
	 * @return
	 */
	public static Json FAIL(Object obj){
		return new Json(false,obj);
	}
}
