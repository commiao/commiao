package com.framework.common.email;

import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.framework.common.core.configuration.ConfigUtils;

public class Email {
	protected final static Log logger = LogFactory.getLog(Email.class);
	protected final static String port = ConfigUtils.get("mail.MAIL_PORT", "");
	protected final static String server = ConfigUtils.get("mail.MAIL_SERVER", "");//邮件服务器
	protected final static String from = ConfigUtils.get("mail.MAIL_FROM", "");//发送者
	protected final static String user = ConfigUtils.get("mail.MAIL_USER", "");//发送者地址
	protected final static String password = ConfigUtils.get("mail.MAIL_PASSWORD", "");//密码
	protected final static Boolean istls = ConfigUtils.getBoolean("mail.MAIL_TLS", false);//默认不启用tls加密
	private static Email instance = null;
	private Email(){};
	public static final Email getInstance(){
		if(instance==null){
			instance = new Email();
		}
    	return instance;
    }
	/**
	 * TLS加密设置
	 * @param usingTLS
	 */
	private static Properties setTLS(Properties props) {
    	if(istls){
    		//设置tls加密
	        props.put("mail.smtp.starttls.enable", "true");  
	        //不做服务器证书校验  
	        props.put("mail.smtp.ssl.checkserveridentity", "false");  
	        //添加信任的服务器地址，多个地址之间用空格分开  
	        props.put("mail.smtp.ssl.trust", server);
    	}else{
    		props.remove("mail.smtp.starttls.enable");
            props.remove("mail.smtp.ssl.checkserveridentity");
            props.remove("mail.smtp.ssl.trust");
    	}
    	return props;
	}
	
	public boolean sendMail(MailMessage message){
		String msgSuject="";
		try {
			Properties props = new Properties();
            props.put("mail.smtp.host", server);
            props.put("mail.smtp.port", port);
            props.put("mail.smtp.auth", "true");
            //props.put( "mail.smtp.quitwait ", "false"); 
            props = setTLS(props);//设置tls加密
            Transport transport = null;
            Session session = Session.getInstance(props, null);
            transport = session.getTransport("smtp");
            transport.connect(server, user, password);
			MimeMessage msg = message.getMimeMessage(session, from);
            transport.sendMessage(msg, msg.getAllRecipients());
            
            msgSuject=msg.getSubject();
            if(logger.isDebugEnabled()){
				logger.debug("邮件发送成功"+msgSuject);
			}
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if(logger.isDebugEnabled()){
				logger.debug("邮件发送失败！"+msgSuject);
			}
        }
        return false;
	}
}
