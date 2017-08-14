package com.components.security.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.components.security.domain.model.Json;
import com.components.security.domain.pojo.Org;
import com.components.security.domain.pojo.SysUser;
import com.components.security.service.MenuService;
import com.components.security.service.OrgService;
import com.components.security.service.SysUserService;
import com.framework.common.core.controller.SpringControllerSupport;

/**
 * @author hbl
 * 2016-1-7上午11:31:53
 * 用户管理
 */
@Controller
@RequestMapping("/components/security")
public class SysUserController extends SpringControllerSupport{
	private static final Logger logger = Logger.getLogger(SysUserController.class);
    @Autowired
    private SysUserService sysUserService;
    
    @Autowired
    private OrgService orgService;
    
    @Autowired
    MenuService menuService;
    
	/**
	 * 用户管理首页
	 */
	@RequestMapping(value = "sysuser/index")
	public String index(final ModelMap model) {
		return "components/security/sysuser/sysuser";
	}

	/**
	 * 获取用户datagrid
	 */
	@RequestMapping(value = "sysuser/datagrid")
	public void datagrid(Model model,SysUser user,HttpServletRequest request,HttpServletResponse response) {
		writeJson(sysUserService.getDataGrid(user));
	}
	
	/**
	 * 保存用户信息
	 */
	@RequestMapping(value = "sysuser/save")
	public void save(Model model,SysUser user,
			@RequestParam(value = "user_OrgId", required = false) final String user_OrgId,
			@RequestParam(value = "user_RoleId", required = false) final String user_RoleId
			) {
		Json j = new Json();
		try {
			/**保存数据存入用户表**/
			sysUserService.save(user);
			
			/**保存新增用户的同时保存用户与组织机构和角色菜单的关系**/
			if(user_OrgId.length()>0 && user_RoleId.length()>0 && user.getId()!=null){
				orgService.saveSysUserOrgRole(user_OrgId,user_RoleId,user.getId());
			}
			j.setSuccess(true);
			j.setMsg("添加成功！");
		} catch (Exception e) {
			j.setMsg("用户名已存在！");
			logger.error(e.toString());
		}
		writeJson(j);
	}	
	/**
	 * 编辑用户信息
	 */
	@RequestMapping(value = "sysuser/edit")
	public void edit(Model model,SysUser user) {
		Json j = new Json();
		try {
			sysUserService.update(user);
			j.setSuccess(true);
			j.setMsg("编辑成功！");
		} catch (Exception e) {
			logger.error(e.toString());
			j.setMsg("编辑失败！");
		}
		writeJson(j);
	}
	/**
	 * 查询用户信息，回显
	 */
	@RequestMapping(value = "sysuser/showDesc")
	public void showDesc(Model model,SysUser user) {
		writeJson(sysUserService.getById(user.getId()));
	}

	/**
	 * 删除一个或多个用户
	 */
	@RequestMapping(value = "sysuser/delete")
	public void delete(Model model,SysUser user) {
		Json j = new Json();
		try {
			sysUserService.deleteByIds(user.getIds());
			j.setSuccess(true);
			j.setMsg("删除成功！");
		} catch (Exception e) {
			logger.error(e.toString());
			j.setMsg("删除失败！");
		}
		writeJson(j);
	}
	
	/**
	 * 获取组织机构下拉树
	 */
	@RequestMapping(value = "sysuser/getOrgTree")
	public void getOrgTree(Model model,SysUser user,Org org,
			@RequestParam(value = "orgid", required = false) final String orgid
			) {
		writeJson(orgService.getTreeNode(Integer.parseInt(orgid)));
	}
	
	/**
	 * 获取组织机构角色下拉树
	 */
	@RequestMapping(value = "sysuser/getOrgRoleTree")
	public void getOrgRoleTree(Model model,SysUser user,Org org,
			@RequestParam(value = "orgid", required = false) final String orgid
			) {
		writeJson(orgService.getOrgRoleNode(Integer.parseInt(orgid)));
	}
}
