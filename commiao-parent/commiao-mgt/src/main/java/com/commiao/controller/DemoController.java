package com.commiao.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.framework.common.core.controller.SpringControllerSupport;

/**
 * 一些Demo用例的测试controller
 * @author zhengjinping
 * 2015-12-28 下午6:06:05
 *
 */
@Controller
@RequestMapping("/demo")
public class DemoController extends SpringControllerSupport{

	private static final Logger logger = Logger.getLogger(DemoController.class);
	/**
	 * 进入jquery easy ui 组合combo方式
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/combo")
	public String combo(Model model) {
		logger.info("进入jquery easy ui 组合combo方式");
		return "demo/combo";
	}
	
	/**
	 * 进入jquery easy ui demo 默认页！
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Model model) {
		logger.info("进入jquery easy ui demo 默认页！");
		return "demo/index";
	}
	
	/**
	 * 进入jquery easy ui comboGrid 组件！
	 * @param model
	 * @return
	 */
	@RequestMapping("/comboGrid")
	public String comboGrid(Model model) {
		logger.info("进入jquery easy ui comboGrid 组件！");
		return "demo/comboGrid";
	}
	
	/**
	 * 进入jquery easy ui comboTree 组件！
	 * @param model
	 * @return
	 */
	@RequestMapping("/comboTree")
	public String comboTree(Model model) {
		logger.info("进入jquery easy ui comboTree 组件！");
		return "demo/comboTree";
	}
	
	/**
	 * 进入jquery easy ui dataGrid 组件！
	 * @param model
	 * @return
	 */
	@RequestMapping("/dataGrid")
	public String dataGrid(Model model) {
		logger.info("进入jquery easy ui dataGrid 组件！");
		return "demo/dataGrid";
	}
}