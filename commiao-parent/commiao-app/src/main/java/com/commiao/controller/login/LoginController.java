package com.commiao.controller.login;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.commiao.controller.BaseController;
import com.commiao.controller.IndexController;
import com.commiao.domain.pojo.user.User;
import com.commiao.service.user.UserService;

/**
 * 前台首页
 * @author jingmiao
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{

	private final static Logger logger = Logger.getLogger(IndexController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * 前台登录页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Model model) {
		logger.info("进入前台登录页面！");
		return "login/login-index";
	}
	
	
	/**
	 * 门户用户登录
	 */
	@RequestMapping("/userLogin")
	public String userLogin(Model model,
			@RequestParam(value = "userName", required = true) final String userName,
			@RequestParam(value = "password", required = true) final String password
			) {
		if(userName!=null && password !=null){
			User user = userService.validationUser(userName,password);
			if(user !=null){
				request.getSession().setAttribute("loginUser", user);
				return "user/user-personalCenter";
			}
		}
		return "errors/error";
	}
	
	
	/**
	 * 门户用户退出
	 */
	@RequestMapping("/loginOut")
	public String loginOut(Model model) {
		try {
			request.getSession().removeAttribute("loginUser");
			request.getSession().invalidate();
			logger.info("用户退出,清除session");
		} catch (Exception e) {
			logger.error("登出失败" + e.getMessage());
			return "errors/error";
		}
		return "index/index";
	}
	
	
	/**
	 * 跳至前台用户注册页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/regist")
	public String regist(Model model) {
		logger.info("进入前台注册页面！");
		return "login/login-regist";
	}
	
	/**
	 * 登录个人中心
	 * @param model
	 * @return
	 */
	@RequestMapping("/login")
	public String login(Model model){
		return "login/personal-center";
	}
	
}
