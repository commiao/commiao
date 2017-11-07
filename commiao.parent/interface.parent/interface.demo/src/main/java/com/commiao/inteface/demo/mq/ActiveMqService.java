package com.commiao.inteface.demo.mq;

public interface ActiveMqService {
	
	void sendMessage(String disname);
	
	String getMessage(String disname);
}
