package com.commiao.controller.user;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.commiao.controller.BaseController;
import com.commiao.domain.pojo.user.User;
import com.commiao.domain.pojo.user.UserEmail;
import com.commiao.domain.pojo.user.UserIdCard;
import com.commiao.domain.pojo.user.UserMobile;
import com.commiao.service.user.PortalUserService;
import com.commiao.service.user.UserEmailService;
import com.commiao.service.user.UserIdCardService;
import com.commiao.service.user.UserMobileService;
import com.commiao.service.user.UserService;
import com.commiao.util.MobileVerifyCode;

/**
 * @author hbl
 * 2016-2-26下午5:21:08
 * 门户用户管理
 */
@Controller
@RequestMapping("/portaluser")
public class PortalUserController extends BaseController{

	@Autowired
	private UserIdCardService userIdCardService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserMobileService userMobileService;
	
	@Autowired
	private UserEmailService userEmailService;
	
	@Autowired
	private PortalUserService portalUserService;
	/**
	 * 手机认证
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/verifyMobile")
	public void verifyMobile(Model model ,final HttpSession session,
			@RequestParam(value = "mobilePhone", required = true) final String mobilePhone,
			@RequestParam(value = "userid", required = true) final String userid,
			@RequestParam(value = "verifycode", required = false) final String verifycode) {
		if(verifycode.length() ==0){
			//获取手机验证码并存入手机信息
			UserMobile um =  userMobileService.getByMobilPhone(mobilePhone);
			if(um != null){
				writeJson("该手机号已注册");
			}else{
				String registRand = MobileVerifyCode.MobileVfCode(); // 注册后生成六位数验证码
				User user = userService.getById(Long.parseLong(userid));
				UserMobile userMobile = new UserMobile();
				
				userMobile.setActiveCode(registRand);
				userMobile.setMobilePhone(mobilePhone);
				userMobile.setUserId(Long.parseLong(userid));
				userMobile.setMobileStatus(1);
				userMobile.setStatus(10000000);
				userMobileService.save(userMobile);  //保存新手机信息
				
				user.setUserMobile(userMobile);
				userService.updateUserMobile(user);
				writeJson("请您把接收的六位数验证码输入后重新提交:   "+registRand);
			}
		}else{
			//认证手机
			if(userid != null){
				User user = userService.getById(Long.parseLong(userid));
				if(user.getUserMobile().getMobileId() != null){
					UserMobile userMobile = userMobileService.getById(user.getUserMobile().getMobileId());
					
					if(verifycode.equals(userMobile.getActiveCode())){
						userMobile.setStatus(10000001);
						//激活手机认证
						userMobileService.active(userMobile);
						writeJson("认证成功");
					}else{
						writeJson("输入的验证码不正确，认证失败");
					}
				}else{
					writeJson("该手机未与用户绑定！认证失败");
				}
			}else {
				writeJson("验证码不正确,请重新输入");
			}
		}
	}
	
	
	/**
	 * 身份证认证
	 */
	@RequestMapping("/IdCardVerify")
	public void IdCardVerify(Model model,
			@RequestParam(value = "cardNumber", required = false) final String cardNumber,
			@RequestParam(value = "userid", required = true) final String userid,
			@RequestParam(value = "realName", required = false) final String realName) {
		if(cardNumber.length()>0 && realName.length()>0){
			UserIdCard userIdCard = new UserIdCard();
			userIdCard.setCardNumber(cardNumber);
			userIdCard.setRealName(realName);
			userIdCard.setUserId(Long.parseLong(userid));
			userIdCard.setIdCardStatus(1);
			userIdCard.setStatus(10000001);
			/**存入数据库**/
			userIdCardService.save(userIdCard);
			
			User user = userService.getById(Long.parseLong(userid));
			user.setCardNumber(cardNumber);
			user.setRealName(realName);
			user.setUserIdCard(userIdCard);
			/**更新用户**/
			userService.updateUserIdCard(user);
			
			writeJson("认证成功");
		}else{
			writeJson("身份证号和姓名不能为空！认证失败");
		}
	}
	
	/**
	 * 邮箱认证
	 */
	@RequestMapping("/emailVerify")
	public void emailVerify(Model model,
			@RequestParam(value = "userid", required = true) final String userid,
			@RequestParam(value = "email", required = false) final String email) {
		if(email.length()>0){
			String registRand = MobileVerifyCode.MobileVfCode(); // 注册后生成六位数验证码
			User user = userService.getById(Long.parseLong(userid));
			UserEmail userEmail = new UserEmail();
			
			userEmail.setEmail(email);
			userEmail.setUserId(Long.parseLong(userid));
			userEmail.setCreateTime(new Date());
			userEmail.setActiveCode(registRand);
			userEmail.setStatus(10000001);
			userEmail.setCreateUserId(Integer.parseInt(userid));
			userEmail.setEmailStatus(0);
			/**存入数据库（一般为手机注册用户时会用）**/
			userEmailService.save(userEmail);

			user.setUserEmail(userEmail);
			/**更新用户**/
			userService.updateUserEmail(user);
			
			portalUserService.sendEmail(user, userEmail, registRand, request);
			
			model.addAttribute("loginUser", user);
			writeJson("已发送邮件到您邮箱,请登录激活!");
		}else{
			writeJson("请先填入邮箱");
		}
	}
	
}
