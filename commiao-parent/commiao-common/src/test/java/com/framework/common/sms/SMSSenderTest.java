package com.framework.common.sms;

import org.junit.Before;
//import org.junit.Test;

public class SMSSenderTest {
	
	String postUrl;
	String account;
	String password;
	String key;
	String userId;
	String sendTime;
	String extno;
	String tail;
	String mobile;
	String content;
	
	@Before
	public void setUp() throws Exception {
//      新新农人短信通道的信息		
//		System.out.println("方法启动之前执行的,进行和信通测试!");
//		postUrl = "http://123.57.51.191:8888/sms.aspx";
//		account = "xinxinnongren";
//		password = "xxnr201505";
//		key = null;
//		userId = "617";
//		sendTime = null;
//		extno = null;
//		tail = "【测试】";
//		mobile = "18649715732";
//		content = "尊敬的郑金平用户，您好，新农金融平台在测试！";
		
//      泽一贷短信通道的信息		
		System.out.println("方法启动之前执行的,进行企信通测试!");
		postUrl = "http://211.151.85.133:8080/sendsms.asp";
		account = "HXJAH";
		password = "b9ea73d320df9d0f";
		key = "泽一贷";
		userId = "";
		sendTime = null;
		extno = null;
		tail = "";
		mobile = "18649715732";
		content = "尊敬的郑金平用户，您好，泽一贷平台在测试！";
	}
	
	/**
	 * 和信通的发送测试
	 */
	public void testSendHxt() {
		SMSSender smsSender = new SMSSender(postUrl, account, password);
		smsSender.send_before(key, userId, sendTime, extno, tail);
		int result =  smsSender.send_hxt(mobile, content);
		System.out.println("和信通发送短信，短信目的地："+mobile+",短信内容:"+content+",发送短信结局:"+result);
	}
	
	//@Test
	public void testSendQxt() {
		SMSSender smsSender = new SMSSender(postUrl, account, password);
		smsSender.send_before(key, userId, sendTime, extno, tail);
		int result = smsSender.send_qxt(mobile, content);
		System.out.println("企信通发送短信，短信目的地："+mobile+",短信内容:"+content+",发送短信结局:"+result);
	}
}
