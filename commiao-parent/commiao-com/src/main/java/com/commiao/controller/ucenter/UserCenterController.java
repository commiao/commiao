package com.commiao.controller.ucenter;
import com.commiao.service.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.framework.common.core.controller.SpringControllerSupport;

@Controller
@RequestMapping("/ucenter")
public class UserCenterController extends SpringControllerSupport {

    @Autowired
    private UserService userService;
    
	@RequestMapping("/login")
	public String index(Model model){
		System.out.println(getViewNamedPath("login"));
		return getViewNamedPath("login");
	}
	
}
