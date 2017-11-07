package core.entity;

import java.io.Serializable;

/**
 * 
 * CreateDate:2016年9月27日上午9:55:18 
 * @Description: 接口响应结果泛型类父类  
 * @author:yuzhao
 * @version V1.0
 */
public class ResponseGenericity implements Serializable{

	private static final long serialVersionUID = 6762893941427891948L;

	/**
	 * 错误码
	 */
	private String errorCode;
	/**
	 * 错误信息
	 */
	private String errorInfo;

	/**
	 * 
	 * @Description::错误码 <br/> 
	 * @author yuzhao
	 * @return
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * 
	 * @Description::错误码 <br/> 
	 * @author yuzhao
	 * @return
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 
	 * @Description::错误信息 <br/> 
	 * @author yuzhao
	 * @return
	 */
	public String getErrorInfo() {
		return errorInfo;
	}

	/**
	 * 
	 * @Description::错误信息 <br/> 
	 * @author yuzhao
	 * @return
	 */
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

}
