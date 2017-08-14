package com.commiao.controller.{POJO_BAG};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huixin.common.core.controller.SpringControllerSupport;
import com.huixinjinan.domain.pojo.{POJO_BAG}.{CLASS_TITLE};
import com.huixinjinan.service.{CLASS_TITLE}Service;

@Controller
@RequestMapping("/{POJO_BAG}/{VIEW_BAG}")
public class {CLASS_TITLE}Controller extends SpringControllerSupport{
	@Autowired
	private {CLASS_TITLE}Service {CLASS_NAME}Service;
	/**
	 * 主页
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Model model){
		LOG.info("进入index页面");
		return getViewNamedPath("index");
	}
	/**
	 * 列表
	 * @param {CLASS_NAME}
	 */
	@RequestMapping("/datagrid")
	public void datagrid({CLASS_TITLE} {CLASS_NAME}) {
		writeJson({CLASS_NAME}Service.getDatagrid({CLASS_NAME}));
	}
	
}
