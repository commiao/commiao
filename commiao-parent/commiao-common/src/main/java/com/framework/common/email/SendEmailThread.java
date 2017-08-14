package com.framework.common.email;

import java.util.concurrent.BlockingQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.framework.common.core.configuration.ConfigUtils;
import com.framework.common.email.MailMessage;

/**
 * 内部线程类，负责发送邮件
 */
public class SendEmailThread extends Thread {
	protected final static Log logger = LogFactory.getLog(SendEmailThread.class);
	
	protected static final long DEFAULT_MAIL_INTERVAL = 1000;//默认两次发送间隔的毫秒数
	protected static final int DEFAULT_MAIL_MAX_SEND_COUNT = 3;//如果发送出现错误，最大的重试次数
	
	private MailUtils mailUtils;//对工具类的引用
	private boolean isrun = true;//是否正在运行
	
	//邮件的信息
    long interval;//两次发送间隔的毫秒数
	int maxRetryCount;//如果发送出现错误，最大的重试次数
	
	BlockingQueue<MailMessage> messages;
	
	public SendEmailThread(MailUtils mailUtils,BlockingQueue<MailMessage> mailMessages){
		this.mailUtils = mailUtils;
		this.messages = mailMessages;
		if(logger.isDebugEnabled()){
			logger.debug("邮件发送线程初始化完成。 MailUtils is " + mailUtils);
			logger.debug("                       mailMessages is " + mailMessages);
		}
	}
	
	public void stopSend(){
		this.isrun = false;
	}
	
	/**
	 * 发送邮件
	 */
	public void run() {
		MailMessage message;
		
		while(mailUtils!=null && isrun){
			
			if(logger.isDebugEnabled()){
				logger.debug("线程启动，开始执行");
			}
			
		    interval = ConfigUtils.getLong("mail.MAIL_INTERVAL", DEFAULT_MAIL_INTERVAL);//两次发送间隔的毫秒数
			maxRetryCount = ConfigUtils.getInt("mail.MAIL_MAX_SEND_COUNT", DEFAULT_MAIL_MAX_SEND_COUNT);//如果发送出现错误，最大的重试次数
			
			//得到一条需要立即发送的邮件发送，取出以后将从待发送列表中删除，注意次放回如果没有内容，会发生阻塞
		    try {
				message = messages.take();
			} catch (InterruptedException e1) {
				message = null;
				if(logger.isDebugEnabled()){
					logger.debug("读取邮件失败！");
				}
			}
		    if(message != null){
		    	if(Email.getInstance().sendMail(message)){
		    		if(logger.isDebugEnabled()){
						logger.debug("发送完成["+message.toString()+"]，休息"+ (1.0*interval/1000)+"秒继续执行");
					}
		    	}
		    	try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
					e.printStackTrace();
					if(logger.isDebugEnabled()){
						logger.debug("线程睡眠失败！");
					}
				}
		    }
		}
	}
	
}
