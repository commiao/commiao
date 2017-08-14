package com.commiao.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.commiao.domain.constants.UserConstants;
import com.commiao.domain.model.Json;
import com.commiao.domain.pojo.user.User;
import com.commiao.service.user.UserService;
import com.framework.common.core.controller.SpringControllerSupport;
import com.framework.common.encrypt.MD5Helper;

@Controller
@RequestMapping("/commiao/user")
public class UserController extends SpringControllerSupport{
    @Autowired
    private UserService userService;
	/**
	 * 用户管理首页
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String index(final ModelMap model) {
		return getViewNamedPath("index");
	}

	@RequestMapping("/datagrid")
	public void datagrid(User user) {
		writeJson(userService.getDatagrid(user));
	}

	@RequestMapping(value = "/edit")
	public void edit(@RequestParam("id") String id) {
		writeJson(userService.getById(Long.parseLong(id)));
	}

	@RequestMapping("/save")
	public void save(User user) {
		Json j = new Json();
		try {
			if(user.isNew()){
				user.setPassword(MD5Helper.MD5Encode(user.getPassword()));
				user.setUserStatus(UserConstants.USER_STATUS_NEW);
				userService.save(user);
			}else{
				userService.update(user);
			}
			j.setSuccess(true);
			j.setMsg("保存成功！");
		} catch (Exception e) {
			j.setSuccess(false);
			j.setMsg("保存错误！");
			LOG.info(e.toString());
		}
		writeJson(j);
	}
	
	@RequestMapping("/delete")
	public void deleteOne(@RequestParam("ids") String[] ids) {
		Json j = new Json();
		try {
			int i;
			for(i=0;i<ids.length;i++){
				userService.delete(Long.parseLong(ids[i]));
			}
			j.setSuccess(true);
			j.setMsg("成功删除"+i+"条！");
		} catch (Exception e) {
			LOG.error(e.toString());
			j.setMsg("删除失败！");
		}
		writeJson(j);
	}	
}
