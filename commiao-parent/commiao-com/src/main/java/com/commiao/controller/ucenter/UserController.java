package com.commiao.controller.ucenter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.commiao.domain.pojo.user.User;
import com.commiao.service.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.framework.common.core.controller.SpringControllerSupport;
import com.framework.common.core.domain.model.LoginInfo;
import com.framework.common.core.domain.model.json.MessageJson;
import com.framework.common.encrypt.MD5Helper;

@Controller
@RequestMapping("/ucenter/user")
public class UserController extends SpringControllerSupport {

    @Autowired
    private UserService userService;

    
	@RequestMapping("/index")
	public String index(Model model){
		return getViewNamedPath("index");
	}
	
	@RequestMapping("/list")
	public String list(){
		return getViewNamedPath("list");
	}
	
	@RequestMapping("/input")
	public String create(@ModelAttribute User user,Model model){
		return getViewNamedPath("input");
	}
	
	@RequestMapping("/input/{id}")
	public String edit(@PathVariable("id") Long id, Model model){
		User user = userService.getById(id);
		model.addAttribute(user);
		return getViewNamedPath("input");
	}
	
	@RequestMapping("/save")
	public @ResponseBody MessageJson save(@ModelAttribute User user,HttpServletRequest request){
//		LoginInfo loginInfo = getLoginInfo();
//		User loginUser = userService.getById(loginInfo.getUserId());
		//校验
		validateSave(user);
		if(user.isNew()){
//			user.setUpdateUser(loginUser);
			user.setUpdateTime(new Date());
//			user.setCreateUser(loginUser);
			user.setCreateTime(new Date());
			userService.save(user);
		}else{
			User _user = userService.getById(user.getId());
			_user.setEmail(user.getEmail());
			_user.setStatus(user.getStatus());
//			_user.setUpdateUser(loginUser);
			_user.setUpdateTime(new Date());
			userService.update(_user);
		}
		return MessageJson.information("保存成功");
	}
	/**
	 * 数据校验
	 **/
	private void validateSave(User user){
		//必填项校验
//		if(Utils.LongUtils.isNull(user.getId())&&Utils.StringUtils.isNull(user.getLoginName())){
//			throw new ValidationException("登录名不能为空");
//		}
//		if(Utils.LongUtils.isNull(user.getId())&&Utils.StringUtils.isNull(user.getPassword())){
//			throw new ValidationException("密码不能为空");
//		}
//		if(Utils.StringUtils.isNull(user.getEmail())){
//			throw new ValidationException("电子邮箱不能为空");
//		}
	}
	
	
	@RequestMapping("/delete/{id}")
	public @ResponseBody MessageJson delete(@PathVariable("id") Long id){
//		if(userService.isDeletable(id)){
//			userService.delete(id);
//		}
		return MessageJson.information("成功删除1条");
	}
	
	@RequestMapping("/delete")
	public @ResponseBody MessageJson delete(@RequestParam("ids") Long[] ids){
		if(ids == null || ids.length == 0){
			return MessageJson.error("没有删除");
		}
//		for(Long id : ids){
//			if(userService.isDeletable(id)){
//				userService.delete(id);
//			}
//		}
		return MessageJson.information("成功删除"+ids.length+"条");
	}
	
	/**
	 * 修改个人信息
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/modify")
	public String modify(Model model, HttpServletRequest request){
		LoginInfo loginInfo = getLoginInfo();
		User user = userService.getById(loginInfo.getUserId());
		model.addAttribute("user", user);	
		return getViewNamedPath("modify");
	}
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	@RequestMapping("/update")
	public @ResponseBody MessageJson update(@ModelAttribute User user){
		//校验
		validateSave(user);
		User _user = userService.getById(user.getId());
		_user.setEmail(user.getEmail());
		userService.update(_user);
		return MessageJson.information("保存成功");
	}
	
	/**
	 * 修改密码
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/modifyPwdPre")
	public String modifyPwdPre(Model model, HttpServletRequest request){
		LoginInfo loginInfo = getLoginInfo();
		User user = userService.getById(loginInfo.getUserId());
		model.addAttribute("user", user);	
		return getViewNamedPath("modifyPwd");
	}
	
	/**
	 * 更新新密码
	 * @param xin
	 * @param userId
	 * @return
	 */
	@RequestMapping("/updatePwd")
	public @ResponseBody MessageJson updatePwd(@RequestParam("xin") String xin,
												@RequestParam("yuan") String yuan,
												 @RequestParam("userId") Long userId){
//		if(null==userId || userId<0){
//			throw new ValidationException("获取登录用户信息异常");
//		}
//		if(Utils.StringUtils.isNull(xin)){
//			throw new ValidationException("获取新密码出现异常");
//		}
//		User _user = userService.getById(userId);
//		
//		if(!_user.getPassword().equals(EncryptUtils.MD5Encode(yuan))){
//			return MessageJson.error("原密码输入不正确");
//		}
//		
//		_user.setPassword(EncryptUtils.MD5Encode(xin));
//		userService.update(_user);
		
		return MessageJson.information("保存成功");
	}
	
	/**
	 * 初始化密码
	 * @param userId
	 * @return
	 */
	@RequestMapping("/pwdInit/{id}")
	public @ResponseBody MessageJson pwdInit(@PathVariable("id") Long id){
//		LoginInfo loginInfo = getLoginInfo();
		User _user = userService.getById(id);
		_user.setPassword(MD5Helper.MD5Encode("123456"));
//		_user.setUpdateUser(userService.getById(loginInfo.getUserId()));
		_user.setUpdateTime(new Date());
		userService.update(_user);
		
		MessageJson json = MessageJson.message(MessageJson.MessageResult.success, MessageJson.MessageType.information, "success");
		json.setMessage("初始化成功");
		return json;
	}
}
