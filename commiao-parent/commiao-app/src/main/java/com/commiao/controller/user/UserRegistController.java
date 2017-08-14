package com.commiao.controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

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
import com.commiao.service.user.PortalUserService;
import com.commiao.service.user.UserEmailService;
import com.commiao.service.user.UserMobileService;
import com.commiao.service.user.UserService;
import com.commiao.util.MobileVerifyCode;

/**
 * @author hbl
 * 2016-2-25上午10:22:49
 * 门户页面新用户注册
 */
@Controller
@RequestMapping("/userRegist")
public class UserRegistController extends BaseController{

	private final static Logger logger = Logger.getLogger(IndexController.class);
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserEmailService userEmailService;
	
	@Autowired
	private PortalUserService portalUserService;
	
	@Autowired
	private UserMobileService userMobileService;
	
	/**
	 * 新用户注册-手机注册
	 * @param model
	 * @return
	 */
	@RequestMapping("/mobileRegist")
	public String mobileRegist(Model model,User user,
			@RequestParam(value = "mobileId", required = true) final Long mobileId) {
		logger.info("手机注册页面跳转到后台！");
		try {
			if(mobileId !=null){
				userService.save(user); //把现有信息存入用户表
				
				UserMobile userMobile = userMobileService.getById(mobileId); //根据前台传过来的mobileId查询
				if(userMobile !=null){
					userMobile.setUserId(user.getUserId());
					userMobile.setMobileStatus(1);
					//userMobile.setStatus(10000001);     //此时手机表与用户表关联
					userMobileService.activeMobileUser(userMobile);//把相关用户信息存入用户手机表
					
					user.setUserMobile(userMobile);
					userService.updateUserMobile(user);
					
					request.setAttribute("nickname", user.getNickname());
					return "user/user-registSuccess";
				}
				return "errors/error";
			}else{
				return "errors/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "errors/error";
		}
	}
	
	/**手机注册用户时的获取手机验证码**/
	@RequestMapping("/verifyMobile")
	public void verifyMobile(Model model , UserMobile userMobile,@RequestParam(value = "mobilePhone", required = true) String mobilePhone) {
		String registRand = MobileVerifyCode.MobileVfCode(); // 注册后生成六位数验证码
		Map <String, Object> map = new HashMap <String, Object>();
		UserMobile um = userMobileService.getByMobilPhone(mobilePhone);
		if(um != null){
			map.put("error", "该手机号已存在！");
			writeJson(map);
		}else{
			userMobile.setMobilePhone(mobilePhone);
			userMobile.setActiveCode(registRand);  //手机验证码
			userMobile.setMobileStatus(0);		   //是否已绑定（0：否，1：是）
			userMobile.setStatus(10000001);        //使用状态（10000000 否，10000001 是）
			userMobileService.save(userMobile);
			
			//把存入数据库的记录的主键id返回
			map.put("msg", "请您把接收的六位数验证码输入对应的位置:  "+registRand);
			map.put("mobileId",userMobile.getMobileId());
			map.put("registRand",registRand);
			writeJson(map);
		}
	}
	
	/**
	 * 新用户注册-邮箱注册
	 * @param model
	 * @return
	 */
	@RequestMapping("/emailRegist")
	public String emailRegist(Model model,User user) {
		logger.info("邮箱注册页面跳转到后台！");
		
		String registRand = MobileVerifyCode.MobileVfCode(); // 注册后生成六位数验证码
		UserEmail mailAuthen = new UserEmail();
		
		userEmailService.save(mailAuthen,registRand,user);//保存用户注册邮箱
		portalUserService.saveNewUser(user,mailAuthen);//保存用户基本信息
		
		mailAuthen.setUserId(user.getUserId());
		userEmailService.updateUserId(mailAuthen);//更新对应的用户id
		// 注册成功后向用户发送一封邮件
		portalUserService.sendEmail(user,mailAuthen,registRand,request);
		
		request.setAttribute("mailId", mailAuthen.getEmailId());
		request.setAttribute("email", user.getEmail());
		request.setAttribute("nickname", user.getNickname());
		return "user/user-registReturn";
	}
	
	
	/**
	 * 注册用户邮箱激活
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/registerActive")
	public String registerActive(Model model ,final HttpSession session) {
		Long UserId = Long.parseLong(request.getParameter("tempUserId")); // 获得用户注册后tempUserId
		String vcode = request.getParameter("validteCde"); // 获得用户注册后六位数验证码
		Long mailAuthenId = Long.parseLong(request.getParameter("mailAuthenid")); // 用户注册后添加的mailAuthenId
		
		User user = userService.getById(UserId);
		UserEmail userEmail = userEmailService.getUserEmailById(mailAuthenId);
		if(user!=null && userEmail!=null){
			if(userEmail.getActiveCode().equals(vcode)){
				user.setStatus(10000001);   //状态改为可用，为了测试方便默认已经是可用状态
				userService.active(user);//用户状态更新可用
				
				userEmail.setStatus(10000001); //状态改为可用，为了测试方便默认已经是可用状态
				userEmail.setEmailStatus(1);     //是否已激活（0：否，1：是）
				userEmailService.active(userEmail);//用户邮箱可用
				session.setAttribute("nickname", user.getNickname());
				return "user/user-registSuccess";
			}
		}
		return "user/user-registFailed";
	}
	
	
	/**
	 * 检验新注册邮箱是否存在
	 */
	@RequestMapping("/isEmailExists")
	public void isEmailExists(Model model,@RequestParam(value = "email", required = false) String email) {
		boolean markemail = userEmailService.isEmailExists(email);
		if(markemail == true){
			String message = "邮箱已经存在";
			writeJson(message);
		}else{
			writeJson(false);
		}
	}
	
}
