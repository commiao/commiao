package com.commiao.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.framework.common.core.controller.SpringControllerSupport;
import com.components.security.domain.model.TreeNode;
import com.components.security.service.MenuService;

@Controller
@RequestMapping("")
public class IndexController extends SpringControllerSupport{
	
	@Autowired
    private MenuService menuService;
	
	@RequestMapping("")
    public String init(){        
		return getViewPath("back/index");
    }
	@RequestMapping("/index")
    public String index(){
		List<TreeNode> menus = menuService.getRoleMenu((long) 2);//模拟一个角色id
		session.setAttribute("menus",menus);
//		LOG.info(getLoginInfo().getUserId().toString());
		return getViewPath("back/index");
    }
}
