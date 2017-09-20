package com.commiao.controller.truck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.commiao.controller.common.simple.controller.SpringControllerSupport;


/**
 * 前台首页
 * @author jingmiao
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController extends SpringControllerSupport{

	/**
	 * 前台首页
	 * @param model
	 * @return
	 */
	@RequestMapping("/front")
	public String front(Model model) {
		LOG.info("启动到前台首页！");
		LOG.info("返回路径："+getViewNamedPath("front"));
		model.addAttribute("menu_flag", 1);
		return getViewPath("index");
	}
	@RequestMapping("/about")
	public String about(Model model){
		LOG.info("启动到关于页面！");
		model.addAttribute("menu_flag", 2);
		return getViewPath("about");
	}
	@RequestMapping("/services")
	public String services(Model model){
		LOG.info("启动到服务页面！");
		model.addAttribute("menu_flag", 3);
		return getViewPath("services");
	}
	@RequestMapping("/blog")
	public String blog(Model model){
		LOG.info("启动到博客页面！");
		model.addAttribute("menu_flag", 4);
		return getViewPath("blog");
	}
	@RequestMapping("/mail")
	public String mail(Model model){
		LOG.info("启动到联系我们页面！");
		model.addAttribute("menu_flag", 5);
		return getViewPath("mail");
	}
	@RequestMapping("/single")
	public String single(Model model){
		LOG.info("启动到single页面！");
		model.addAttribute("menu_flag", 6);
		return getViewPath("single");
	}
	
	
}
