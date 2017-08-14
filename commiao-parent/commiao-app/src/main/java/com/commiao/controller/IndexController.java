package com.commiao.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前台首页
 * @author jingmiao
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController{

	private final static Logger logger = Logger.getLogger(IndexController.class);
	
	/**
	 * 前台首页
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Model model) {
		logger.info("启动到前台首页！");
		return "index/index";
	}
	
}
