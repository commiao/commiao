package com.commiao.service.impl.user;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.commiao.domain.pojo.user.User;
import com.commiao.domain.pojo.user.UserEmail;
import com.commiao.domain.utils.SendMail;
import com.commiao.service.user.PortalUserService;
import com.commiao.service.user.UserService;

@Repository("portalUserService")
public class PortalUserServiceImpl  implements PortalUserService {
	private final static Logger logger = Logger.getLogger(PortalUserServiceImpl.class);
	
	
	@Autowired
	private UserService userService;
	
	
	public void saveNewUser(User user,UserEmail mailAuthen) {
		logger.info("用户注册start");
		logger.info("=================用户提交的表单信息=================");
		logger.info("|          nickname=" + user.getNickname()
				+ "                      |");
		logger.info("|          email=" + user.getEmail()
				+ "                      |");
		logger.info("|          password=" + user.getPassword()
				+ "                      |");
		logger.info("=================表单信息结束=======================");

		// 邮箱合法性验证
		String check = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";

		Pattern regex = Pattern.compile(check);
		Matcher matcher = regex.matcher(user.getEmail());
		boolean isMatched = matcher.matches();
		if (!isMatched) {
			String message = "邮箱不合法";
			logger.info(message + user.getEmail());
		}
		user.setCreateTime(new Date());
		
		// 开始向临时表写入新用户数据
		try {
			user.setUserEmail(mailAuthen);
			userService.save(user);
			logger.info("用户昵称: " + user.getNickname() + "注册成功后返回的uerserid： " + user.getUserId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * 发送邮件
	 */
	public void sendEmail(User user, UserEmail mailAuthen,String registRand,
			HttpServletRequest request) {
		if (user.getUserId() > 0 && mailAuthen.getEmailId() > 0) {
			String host_port_path;
			if ("80".equals(request.getServerPort())) {
				host_port_path = request.getServerName() + ""
						+ request.getContextPath();
			} else {
				host_port_path = request.getServerName() + ":"
						+ request.getServerPort() + ""
						+ request.getContextPath();
			}
			String url = "<a href=http://" + host_port_path
					+ "/userRegist/registerActive?mailAuthenid=" + mailAuthen.getEmailId() + "&tempUserId="
					+ user.getUserId() + "&validteCde="
					+ registRand + "><font color='#DA722B'>立即激活账户</front></a>";
			logger.info(url);
			String copyLink = "http://" + host_port_path
					+ "/userRegist/registerActive?mailAuthenid=" + mailAuthen.getEmailId() + "&validteCde="
					+ registRand + "&tempUserId="
					+ user.getUserId();
			
			SendMail.SendEmailTest(user.getNickname(), copyLink, mailAuthen.getEmail());
		}
	}



}
