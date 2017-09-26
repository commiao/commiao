package com.commiao.controller.network.controller;

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
		return getViewNamedPath("front");
	}
	
}
