package com.commiao.service.message;

/**
 * @author jingmiao
 * 发送信息接口
 */
public interface MessageService {
	/**
	 * 登记标的发送信息
	 * @param loanId
	 * @param userId
	 * @param sendType 发送类型（短信、邮件、站内信）
	 */
	public void bidSubject(Long loanId,Long userId,String sendType);
	
	/**
	 * 流放标的发送信息
	 * @param loanId
	 * @param userId
	 * @param sendType 发送类型（短信、邮件、站内信）
	 */
	public void killSubject(Long loanId,Long userId,String sendType);
	
	/**
	 * 满标放款发送信息
	 * @param loanId
	 * @param userId
	 * @param sendType
	 */
	public void fullLoan(Long loanId,Long userId,String sendType);
}
