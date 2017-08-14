package com.framework.common.core.domain.model.json;

import java.io.Serializable;
import java.util.List;

import com.framework.common.core.CommonConstants;
import com.framework.common.utils.StringUtils;

/**
 * Ajax返回消息类，Json格式
 * @author caoxl
 *
 */
public class MessageJson implements Serializable{

	private static final long serialVersionUID = 1L;

	public static enum MessageType {information,warning,question,error};
	public static enum MessageResult {success,fail};
	
	private MessageType type = MessageType.information;
	private String message = "";
	private MessageResult result = MessageResult.success;
	private Object item;
	private List<?> items;
	
	public MessageJson() {
		super();
	}
	/**
	 * @param type 类型
	 * @param result 结果
	 * @param message 内容
	 */
	public MessageJson(MessageResult result, MessageType type, Object... message) {
		super();
		this.setResult(result);
		this.setType(type);
		this.setMessage(message);
	}
	/**
	 * @return 消息类型
	 */
	public String getType() {
		switch(type){
			case information:
				return CommonConstants.MESSAGE_TYPE_INFORMATION;
			case warning:
				return CommonConstants.MESSAGE_TYPE_WARNING;
			case question:
				return CommonConstants.MESSAGE_TYPE_QUESTION;
			case error:
				return CommonConstants.MESSAGE_TYPE_ERROR;
		}
		return CommonConstants.MESSAGE_TYPE_INFORMATION;
	}
	/**
	 * @return 消息结果
	 */
	public String getResult() {
		switch(result){
			case success:
				return CommonConstants.MESSAGE_RESULT_SUCCESS;
			case fail:
				return CommonConstants.MESSAGE_RESULT_FAIL;
		}
		return CommonConstants.MESSAGE_RESULT_SUCCESS;
	}
	/**
	 * 设置消息类型
	 * @param 消息类型
	 */
	public void setType(MessageType type) {
		this.type = type;
	}
	/**
	 * 设置消息结果
	 * @param 消息结果
	 */
	public void setResult(MessageResult result) {
		this.result = result;
	}
	/**
	 * @return 消息内容
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * 设置消息内容
	 * @param 消息内容
	 */
	public void setMessage(Object... message) {
		this.message = StringUtils.join(message);
	}
	
	/**
	 * 返回附加信息
	 * @return 附加信息
	 */
	public Object getItem() {
		return item;
	}
	/**
	 * 设置附加信息
	 * @param item 附加信息
	 */
	public void setItem(Object item) {
		this.item = item;
	}
	/**
	 * 返回附加信息集合
	 * @return 附加信息集合
	 */
	public List<?> getItems() {
		return items;
	}
	/**
	 * 设置附加信息集合
	 * @param items 附加信息集合
	 */
	public void setItems(List<?> items) {
		this.items = items;
	}
	
	/**
	 * 创建消息
	 * @param result 消息结果
	 * @param type 消息类型
	 * @param message 消息内容
	 * @return 消息
	 */
	public static MessageJson message(MessageResult result,MessageType type, Object... message){
		return new MessageJson(MessageResult.success,MessageType.information, message);
	}
	
	/**
	 * 创建消息，消息类型：information，消息结果：success
	 * @param message 消息内容
	 * @return 消息
	 */
	public static MessageJson information(Object... message){
		return new MessageJson(MessageResult.success,MessageType.information, message);
	}
	/**
	 * 创建消息，消息类型：warning，消息结果：success
	 * @param message 消息内容
	 * @return 消息
	 */
	public static MessageJson warning(Object... message){
		return new MessageJson(MessageResult.success,MessageType.warning, message);
	}
	/**
	 * 创建消息，消息类型：question，消息结果：success
	 * @param message 消息内容
	 * @return 消息
	 */
	public static MessageJson question(Object... message){
		return new MessageJson(MessageResult.success,MessageType.question, message);
	}
	/**
	 * 创建消息，消息类型：error，消息结果：fail
	 * @param message 消息内容
	 * @return 消息
	 */
	public static MessageJson error(Object... message){
		return new MessageJson(MessageResult.fail,MessageType.error, message);
	}
	/**
	 * 创建消息，消息类型：information，消息结果：success
	 * @param message 消息内容
	 * @return 消息
	 */
	public static MessageJson success(Object... message){
		return new MessageJson(MessageResult.success,MessageType.information, message);
	}
	/**
	 * 创建消息，消息类型：error，消息结果：fail
	 * @param message 消息内容
	 * @return 消息
	 */
	public static MessageJson fail(Object... message){
		return new MessageJson(MessageResult.fail,MessageType.error, message);
	}
}
