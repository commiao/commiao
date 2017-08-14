package com.commiao.service.impl.message;

import org.springframework.stereotype.Repository;

import com.commiao.service.message.MessageService;

/**
 * @author jingmiao
 * 发送信息实现类
 */
@Repository("messageService")
public class MessageServiceImpl implements MessageService{

	@Override
	public void bidSubject(Long loanId, Long userId, String sendType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void killSubject(Long loanId, Long userId, String sendType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fullLoan(Long loanId, Long userId, String sendType) {
		// TODO Auto-generated method stub
		
	}

}
