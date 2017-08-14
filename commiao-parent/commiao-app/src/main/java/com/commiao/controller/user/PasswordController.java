package com.commiao.controller.user;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.commiao.controller.BaseController;
import com.commiao.controller.IndexController;
import com.commiao.domain.pojo.user.User;
import com.commiao.domain.pojo.user.UserEmail;
import com.commiao.domain.pojo.user.UserMobile;
import com.commiao.domain.utils.SendMail;
import com.commiao.service.user.UserEmailService;
import com.commiao.service.user.UserMobileService;
import com.commiao.service.user.UserService;
import com.commiao.util.MobileVerifyCode;

/**
 * @author hbl
 * 2016-3-9上午10:10:04
 * 用户密码管理
 */
@Controller
@RequestMapping("/password")
public class PasswordController extends BaseController{

	private final static Logger logger = Logger.getLogger(IndexController.class);
	@Autowired
	private UserService userService;

	@Autowired
	private UserEmailService userEmailService;
	
	@Autowired
	private UserMobileService userMobileService;

	/**
	 * 跳转手机找回密码页面
	 */
	@RequestMapping("/findPwdByMobile")
	public String findPwdByMobile(Model model) {
		logger.info("跳转到手机找回密码页面！");
		return "user/user-findPwdByMobile";
	}
	
	/**
	 *手机获取验证码 
	 */
	@RequestMapping("/getVerifycode")
	public void getVerifycode(Model model,@RequestParam(value = "mobilePhone",required = true) String mobilePhone) {
		logger.info("跳转到手机找回密码页面！");
		String registRand = MobileVerifyCode.MobileVfCode(); // 生成六位数验证码
		if(mobilePhone !=null){
			UserMobile userMobile = userMobileService.getByMobilPhone(mobilePhone);
			if(userMobile != null){
				userMobile.setActiveCode(registRand);
				userMobileService.updateActiveCode(userMobile);
				
				writeJson("请您把接收的六位数验证码填入到对应位置:   "+registRand);
			}else{
				writeJson("您输入的手机号不存在，请核实注册手机号与您输入是否一致！");
			}
		}
	}
	
	/**
	 * 手机重置密码填入验证码后下一步按钮操作
	 */
	@RequestMapping("/resetPwdNext")
	public void resetPwdNext(Model model,@RequestParam("mobilePhone") String mobilePhone,
			@RequestParam("activeCode") String activeCode) {
		logger.info("检验手机号和验证码后跳至重置密码页面！");
		Map<String, Object> conds = new HashMap<String, Object>();
		conds.put("mobilePhone", mobilePhone);
		conds.put("activeCode", activeCode);
		
		UserMobile userMobile = userMobileService.getByPA(conds);
		if( userMobile !=null){
			writeJson(true+ "||" + userMobile.getUserId());
		}else{
			writeJson(false+ "||" + userMobile.getUserId());
		}
	}
	
	
	/**
	 * 跳转默认的手机重置密码页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/newPasswordPhone")
	public String newPasswordPhone(Model model,@RequestParam("userId") Long userId) {
		logger.info("跳转到邮箱找回密码页面！");
		request.getSession().setAttribute("userId", userId);
		return "user/user-newpasswordphone";
	}
	
	
	/**
	 * 更新用户密码
	 * @param model
	 * @param password
	 * @return
	 */
	@RequestMapping("/submitResetPwd")
	public String submitResetPwd(Model model,@RequestParam(value="newPassword",required=true) String password) {
		logger.info("跳转到邮箱找回密码页面！");
		Long userId = (Long) request.getSession().getAttribute("userId");
		if(userId != null){
			User user = userService.getById(userId);
			user.setPassword(password);
			userService.updatePassword(user);
			return "user/user-resetPwdSuccess";
		}
		
		return "errors/error";
	}
	
	
	
	/**
	 * 跳转邮箱找回密码页面
	 */
	@RequestMapping("/findPwdBymail")
	public String findPwdBymail(Model model) {
		logger.info("跳转到邮箱找回密码页面！");
		return "user/user-findPwdByEmail";
	}
	
	
	
	/**
	 *邮箱是否存在 
	 */
	@RequestMapping("/isEmailExist")
	public void isEmailExist(Model model,
			@RequestParam(value = "email", required = false) String email) {
		logger.debug("判断邮箱是否存在");
		response.setCharacterEncoding("utf-8");
		boolean markemail = userEmailService.isEmailExists(email);
		if (markemail == false) {
			String message = "邮箱不存在";
			try {
				response.getWriter().write("" + message);
				response.getWriter().flush();
			} catch (IOException e) {
				logger.error("eamil:" + email + "不存在" + e);
			}
		}
		
		// 如果邮箱存在
		UserEmail userEmail = userEmailService.getByEmail(email.trim()); //目前假设用户邮箱唯一
		
		//使用该邮箱的用户
		if(userEmail != null){
			User user = userService.getById(userEmail.getUserId());
			String password = MobileVerifyCode.MobileVfCode(); // 随机生成6位数密码
			
			user.setPassword(password);
			userService.updatePassword(user);
			//发送邮件
			SendMail.SendEmail(user.getNickname(), password, userEmail.getEmail());
			
			try {
				response.getWriter().write("" + user.getNickname()+ "||" + email);
				response.getWriter().flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 *简单判断邮箱是否存在 
	 */
	@RequestMapping("/emailVerify")
	public void emailVerify(Model model,@RequestParam(value = "email") String email) {
		logger.debug("判断邮箱是否存在");
		boolean markemail = userEmailService.isEmailExists(email);
		
		if (markemail == false) {
			writeJson(false);
		}else{
			UserEmail userEmail = userEmailService.getByEmail(email);
			request.getSession().setAttribute("userId", userEmail.getUserId());
			writeJson(true);
		}
	}
	
	/**
	 *跳至重置密码页面 
	 */
	@RequestMapping("/newPasswordEmail")
	public String newPasswordEmail(Model model) {
		return "user/user-newpasswordemail";
	}
}
