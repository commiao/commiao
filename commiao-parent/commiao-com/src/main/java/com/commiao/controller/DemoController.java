package com.commiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.framework.common.core.controller.SpringControllerSupport;

@Controller
@RequestMapping("/demo")
public class DemoController extends SpringControllerSupport{
	@RequestMapping("/index")
	public String front(Model model) {
		LOG.info("启动到demo首页！");
		return getViewPath("index");
	}
}
