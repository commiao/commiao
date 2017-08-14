package com.commiao.controller.common;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.commiao.controller.BaseController;
import com.commiao.controller.IndexController;
import com.commiao.domain.pojo.user.User;

/**
 * @author hbl
 * 2016-2-22下午4:07:59
 * TODO
 */
@Controller
@RequestMapping("/common")
public class CommonController extends BaseController{

	private final static Logger logger = Logger.getLogger(IndexController.class);
	
	/**
	 * 新手指引
	 * @param model
	 * @return
	 */
	@RequestMapping("/beginners")
	public String beginners(Model model) {
		logger.info("进入新手指引页面！");
		return "common/beginners";
	}
	
	/**
	 * 联系我们&&关于我们
	 * @param model
	 * @return
	 */
	@RequestMapping("/toAboutPage")
	public String toAboutPage(Model model,@RequestParam(value = "aboutType", required = false) final int aboutType) {
		logger.info("进入联系我们页面！");
		
		switch (aboutType) {
		case 0:
			return "front/introductions/introductions";
		case 1:
			return "front/introductions/partners";
		case 2:
			return "front/introductions/careers";
		case 3:
			return "front/introductions/media";
		case 4:
			return "front/introductions/news";
		case 5:
			return "front/introductions/contact";
		default:
			return "front/introductions/introductions";
		}
	}
	
	/**
	 * 帮助中心
	 * @param model
	 * @return
	 */
	@RequestMapping("/toHelpPage")
	public String toHelpPage(Model model){
		return "common/toHelpPage";
	}
	
	/**
	 * 我的账户
	 * @param model
	 * @return
	 */
	@RequestMapping("/myAccount")
	public String myAccount(Model model){
		//判断用户时投资者还是融资者
		User user = (User) request.getSession().getAttribute("loginUser");
		Boolean bol = false;
		if(user !=null){
			if(bol){
				return "common/myaccount_profilerz";//融资者
			}else{
				return "common/myaccount_profiletz";//投资者
			}
		}else{
			//return "index/index"; 
			return "common/myaccount_profiletz"; //为方便测试 默认投资者 
		}
	}
	
	
	/**
	 *投资记录
	 */
	@RequestMapping("/tzRecord")
	public String tzRecord(Model model){
		return "common/myaccount_borrowrecord";
	}
	
	/**
	 *投资账户
	 */
	@RequestMapping("/tzAccount")
	public String tzAccount(Model model){
		return "common/myaccount_profiletz";
	}
}
