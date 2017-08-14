package com.components.controller.security;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.commiao.domain.model.Json;
import com.components.domain.pojo.security.Menu;
import com.components.domain.pojo.security.Role;
import com.components.service.security.MenuService;
import com.components.service.security.RoleService;
import com.framework.common.core.controller.SpringControllerSupport;

/**
 * @author hbl
 * 2016-1-11上午11:12:19
 * 角色管理
 */
@Controller
@RequestMapping("/components/security")
public class RoleController extends SpringControllerSupport{
	private static final Logger logger = Logger.getLogger(RoleController.class);
    @Autowired
    private RoleService roleService;
    
    @Autowired
    private MenuService menuService;
    
	/**
	 * 跳转至角色列表页面
	 */
	@RequestMapping(value = "role/index")
	public String index(final ModelMap model) {
		return "components/security/role/role";
	}

	/**
	 * 获得角色datagrid
	 */
	@RequestMapping(value = "role/datagrid")
	public void datagrid(Model model,Role role,HttpServletRequest request,HttpServletResponse response) {
		writeJson(roleService.getDataGrid(role));
	}
	/**
	 * 保存角色信息
	 */
	@RequestMapping(value = "role/save")
	public void save(Model model,Role role) {
		Json j = new Json();
		try {
			roleService.save(role);
			j.setSuccess(true);
			j.setMsg("添加成功！");
		} catch (Exception e) {
			j.setMsg("角色名已存在！");
			logger.error(e.toString());
		}
		writeJson(j);
	}	
	/**
	 * 编辑角色信息
	 */
	@RequestMapping(value = "role/edit")
	public void edit(Model model,Role role) {
		Json j = new Json();
		try {
			roleService.update(role);
			j.setSuccess(true);
			j.setMsg("编辑成功！");
		} catch (Exception e) {
			logger.error(e.toString());
			j.setMsg("编辑失败！");
		}
		writeJson(j);
	}
	/**
	 * 查询角色信息，回显
	 */
	@RequestMapping(value = "role/showDesc")
	public void showDesc(Model model,Role role) {
		writeJson(roleService.getById(role.getId()));
	}

	/**
	 * 删除一个或多个角色
	 */
	@RequestMapping(value = "role/delete")
	public void delete(Model model,Role role) {
		Json j = new Json();
		try {
			roleService.deleteByIds(role.getIds());
			j.setSuccess(true);
			j.setMsg("删除成功！");
		} catch (Exception e) {
			logger.error(e.toString());
			j.setMsg("删除失败！");
		}
		writeJson(j);
	}
	
	
	/**
	 * 角色菜单列表
	 */
	@RequestMapping(value = "role/roleMenuTree")
	public void roleMenuTree(Model model,Role role,
			@RequestParam(value = "roleid", required = false) final String roleid
			) {
		writeJson(menuService.getRoleMenu(Long.parseLong(roleid)));
	}
	
	/**
	 * 保存角色对应菜单
	 */
	@RequestMapping(value = "role/saveRoleMenu")
	public void saveRoleMenu(Model model,Menu menu,
			@RequestParam(value = "roleid", required = false) final String roleid,
			@RequestParam(value = "menuids", required = false) final String menuids
			) {
		
		Json j = new Json();
		
		try {
			/**为保证数据准确性先查询出组织用户角色表中涉及该角色的相关用户ids**/
			List<Long> userids = roleService.getORUUserIds(Long.parseLong(roleid));
			
			/**保存对应的角色菜单之前先把数据库已有的数据以及用户权限表相关数据清除**/
			roleService.deleteRoleMenus(Long.parseLong(roleid));
			
			/**保存新匹配的角色菜单以及更新用户权限表**/
			if(menuids.length()>0){
				roleService.saveRoleMenu(roleid,menuids,userids);
			}
			j.setSuccess(true);
			j.setMsg("添加成功！");
		} catch (Exception e) {
			j.setMsg("角色名已存在！");
			logger.error(e.toString());
		}
		writeJson(j);
	}	
}
