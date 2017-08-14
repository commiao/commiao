package com.commiao.domain.utils;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class SendMail extends Thread { 
	  public static void SendEmailTest(String userAccount,String copyLink,String userEmail) { 
	        Properties props = new Properties(); 
	        props.put("mail.smtp.host", "smtp.163.com"); 
	        props.put("mail.smtp.auth", "true"); // 允许smtp校验 
	        Session sendMailSession = Session.getInstance(props, null); 
	 
	        try { 
	        	
	            Transport transport = sendMailSession.getTransport("smtp"); 
	            // 连接你的发送邮箱，注意用户名和密码必须填写正确，否则权限得不到 
	            transport.connect("smtp.163.com", "13120367192@163.com", "hx123456"); 
	            Message newMessage = new MimeMessage(sendMailSession); 
	 
	            // 设置mail主题 
	            String mail_subject = "【慧信金安】注册用户"+userAccount+"账户激活邮件"; 
	            newMessage.setSubject(mail_subject); 
	 
	            // 设置发信人地址 
	            String strFrom = "13120367192@163.com"; 
	            strFrom = new String(strFrom.getBytes(), "iso-8859-1"); 
	            newMessage.setFrom(new InternetAddress(strFrom)); 
	
	            Address addressTo[] = { new InternetAddress(userEmail) }; 
	            newMessage.setRecipients(Message.RecipientType.TO, addressTo); 
	 
	            // 设置mail正文 
	            newMessage.setSentDate(new java.util.Date()); 
	            String mail_text = "亲爱的用户，您好: \n 您注册的的帐号是  "+userAccount+" 感谢您的注册, 请点击下面的链接完成注册（如果无法点击，可以将其复制到浏览器地址栏中完成注册）。\n 账号激活:"+copyLink; 
	            newMessage.setText(mail_text); 
	 
	            newMessage.saveChanges(); // 保存发送信息 
	            transport.sendMessage(newMessage, newMessage 
	                    .getRecipients(Message.RecipientType.TO)); // 发送邮件 
	 
	            transport.close(); 
	           // Transport.send(newMessage); 
	        } catch (Exception e) { 
	        	e.printStackTrace();
	        } 	 
	    } 
	  
	  /**
	   * 用户忘记密码使用
	   * @param userAccount
	   * @param password
	   * @param userEmail
	   */
	  public static void SendEmail(String userAccount,String password,String userEmail) { 
	        Properties props = new Properties(); 
	        props.put("mail.smtp.host", "smtp.163.com"); 
	        props.put("mail.smtp.auth", "true"); // 允许smtp校验 
	        Session sendMailSession = Session.getInstance(props, null); 
	        try { 
	        	
	            Transport transport = sendMailSession.getTransport("smtp"); 
	            // 连接你的发件邮箱，注意用户名和密码必须填写正确，否则权限得不到 
	            transport.connect("smtp.163.com", "13120367192@163.com", "hx123456"); 
	            Message newMessage = new MimeMessage(sendMailSession); 
	 
	            // 设置mail主题 
	            String mail_subject = "【慧信金安】用户密码服务"+userAccount+"账户密码生成"; 
	            newMessage.setSubject(mail_subject); 
	 
	            // 设置发信人地址 
	            String strFrom = "13120367192@163.com"; 
	            strFrom = new String(strFrom.getBytes(), "iso-8859-1"); 
	            newMessage.setFrom(new InternetAddress(strFrom)); 
	
	            Address addressTo[] = { new InternetAddress(userEmail) }; 
	            newMessage.setRecipients(Message.RecipientType.TO, addressTo); 
	 
	            // 设置mail正文 
	            newMessage.setSentDate(new java.util.Date()); 
	            String mail_text = "亲爱的用户，您好: \n 您的的帐号  "+userAccount+" 的最新密码为:"+ password; 
	            newMessage.setText(mail_text); 
	 
	            newMessage.saveChanges(); // 保存发送信息 
	            transport.sendMessage(newMessage, newMessage 
	                    .getRecipients(Message.RecipientType.TO)); // 发送邮件 
	 
	            transport.close(); 
	           // Transport.send(newMessage); 
	        } catch (Exception e) { 
	        	e.printStackTrace();
	        } 	 
	    } 
} 

