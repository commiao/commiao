package com.commiao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.commiao.domain.pojo.user.User;
import com.components.domain.model.TreeNode;
import com.components.service.security.MenuService;
import com.commiao.service.user.UserService;
import com.framework.common.core.CommonConstants;
import com.framework.common.core.controller.SpringControllerSupport;
import com.framework.common.core.domain.model.LoginInfo;
import com.framework.common.encrypt.MD5Helper;
import com.framework.common.utils.StringUtils;

/**
 * 登录控制类的添加
 * @author zhengjinping
 * 2016-1-6 下午1:56:33
 *
 */
@Controller
@RequestMapping("")
public class IndexController extends SpringControllerSupport{

	@Autowired
    private MenuService menuService;
	@Autowired
	private UserService userService;
	
	/**
	 * 登录页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Model model) {
		LOG.info("启动到登录页面来了！");
		return "index/index";
	}
	
	private String validate(String username,String password,String checkcode){
		if(StringUtils.isBlank(username)){
			return "用户名不能为空！";
		}
		if(StringUtils.isBlank(password)){
			return "密码不能为空！";
		}
		if(StringUtils.isBlank(checkcode)){
			return "验证码不能为空！";
		}
		String realcode = (String) request.getSession().getAttribute("rCode");
		LOG.info("【输入的验证码为："+checkcode+"】【session中存储的验证码："+realcode+"】");
		if(!checkcode.equals(realcode)) {
			return "验证码输入错误！";
		}
		return null;
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String nickname,
							@RequestParam String password,
							@RequestParam String checkcode,
							Model model) {
		String errorMsg = validate(nickname, password, checkcode);
		if(!StringUtils.isBlank(errorMsg)){
			model.addAttribute("errorMsg", errorMsg);
			model.addAttribute("nickname", nickname);
			model.addAttribute("password", password);
			return "index/index";
		}
		User user = userService.validationUser(nickname, MD5Helper.MD5Encode(password));
		if(user==null){
			model.addAttribute("errorMsg", "用户名与密码不匹配！");
			model.addAttribute("nickname", nickname);
			model.addAttribute("password", password);
			return "index/index";
		}
		LoginInfo loginInfo = new LoginInfo(user.getId(), nickname, nickname);
		request.getSession().setAttribute(CommonConstants.SESSION_LOGININFO_KEY, loginInfo);
		
		List<TreeNode> menus = menuService.getRoleMenu((long) 2);//模拟一个角色id
		session.setAttribute("menus",menus);
		LOG.info(getLoginInfo().getUserId().toString());
		
		return "back/index";
	}
	
	@RequestMapping("/logout")
	public String logout(){
		LOG.info("退出系统！");
		request.getSession().removeAttribute(CommonConstants.SESSION_LOGININFO_KEY);
		return "redirect:/index";
	}
}
