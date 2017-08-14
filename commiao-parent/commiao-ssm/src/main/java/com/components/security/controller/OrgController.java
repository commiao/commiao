package com.components.security.controller;

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

import com.components.security.domain.model.Json;
import com.components.security.domain.pojo.Org;
import com.components.security.domain.pojo.Role;
import com.components.security.domain.pojo.SysUser;
import com.components.security.service.OrgService;
import com.components.security.service.RoleService;
import com.framework.common.core.controller.SpringControllerSupport;

/**
 * @author hbl
 * 2016-1-11下午5:04:53
 * 组织机构管理
 */
@Controller
@RequestMapping("/components/security")
public class OrgController extends SpringControllerSupport{
	private static final Logger logger = Logger.getLogger(OrgController.class);
    @Autowired
    private OrgService orgService;
    
    @Autowired
    private RoleService roleService;
    
	/**
	 * 
	 * @param model
	 * @param keyword
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "org/index")
	public String index(final ModelMap model) {
		return "components/security/org/org";
	}

	/**
	 * 获得组织机构datagrid
	 */
	@RequestMapping(value = "org/datagrid")
	public void datagrid(Model model,Org org,HttpServletRequest request,HttpServletResponse response) {
		writeJson(orgService.getTreeGrid(org));
	}
	/**
	 * 保存组织机构信息
	 */
	@RequestMapping(value = "org/save")
	public void save(Model model,Org org,@RequestParam(value = "orgParentId", required = false) final String orgParentId) {
		if(orgParentId.length()>0){
			org.setParentId(Integer.parseInt(orgParentId));
		}
		Json j = new Json();
		try {
			orgService.save(org);
			j.setSuccess(true);
			j.setMsg("添加成功！");
		} catch (Exception e) {
			j.setMsg("组织机构名已存在！");
			logger.error(e.toString());
		}
		writeJson(j);
	}	
	/**
	 * 编辑组织机构信息
	 */
	@RequestMapping(value = "org/edit")
	public void edit(Model model,Org org) {
		Json j = new Json();
		try {
			orgService.update(org);
			j.setSuccess(true);
			j.setMsg("编辑成功！");
		} catch (Exception e) {
			logger.error(e.toString());
			j.setMsg("编辑失败！");
		}
		writeJson(j);
	}
	/**
	 * 查询组织机构信息，回显
	 */
	@RequestMapping(value = "org/showDesc")
	public void showDesc(Model model,Org org) {
		writeJson(orgService.getById(org.getId()));
	}

	/**
	 * 删除一个或多个组织机构
	 */
	@RequestMapping(value = "org/delete")
	public void delete(Model model,Org org) {
		Json j = new Json();
		try {
			/**删除组织机构相关表数据**/
			orgService.deleteRelatedByIds(org.getIds());
			/**删除组织机构主表**/
			orgService.deleteByIds(org.getIds());
			j.setSuccess(true);
			j.setMsg("删除成功！");
		} catch (Exception e) {
			logger.error(e.toString());
			j.setMsg("删除失败！");
		}
		writeJson(j);
	}
	
	/**
	 * 组织机构角色列表
	 */
	@RequestMapping(value = "org/orgRoleDatagrid")
	public void orgRoleDatagrid(Model model,Org org,Role role,
			@RequestParam(value = "orgid", required = false) final String orgid,
			HttpServletRequest request) {
		writeJson(roleService.getDataGrid(role));
	}
	
	/**
	 * 获取组织机构角色ids
	 */
	@RequestMapping(value = "org/getRoleIds")
	public void getRoleIds(Model model,Org org,Role role,
			@RequestParam(value = "orgid", required = false) final String orgid,
			HttpServletRequest request) {
		/**根据orgid查询当前组织机构拥有的角色roleids**/
		List<Long> roleids =  orgService.getRoleIds(orgid);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0 ; i<roleids.size() ; i++){ sb.append(roleids.get(i)+",");}
		writeJson(sb);
	}
	
	
	/**
	 * 保存组织机构角色
	 * @param model
	 * @param org
	 * @param orgid
	 */
	@RequestMapping(value = "org/saveOrgRole")
	public void saveOrgRole(Model model,Org org,
			@RequestParam(value = "orgid", required = false) final String orgid,
			@RequestParam(value = "roleids", required = false) final String roleids
			) {
		Json j = new Json();
		try {
			/**先确定要删除的roleids**/
			
			List<Long> delroleIds = orgService.getDelRoleIds(orgid,roleids);
			
			/**第一步先更新用户权限表数据**/
			if(delroleIds.size()>0){
				orgService.updateURM(delroleIds);
			}
			
			/**第二步更新组织机构用户角色表数据**/
			if(delroleIds.size()>0){
				orgService.updateOUR(delroleIds);
			}
			
			/**删除组织机构角色表旧数据**/
			orgService.deleteOrgRoles(Integer.parseInt(orgid));
			
			
			/**保存现有的组织机构角色**/
			if(roleids.length()>0){
				orgService.saveOrgRoles(orgid,roleids);
			}
			
			j.setSuccess(true);
			j.setMsg("保存成功！");
		} catch (Exception e) {
			j.setMsg("操作失败！");
			logger.error(e.toString());
		}
		writeJson(j);
	}
	
	/**
	 * 组织机构用户操作
	 */
	@RequestMapping(value = "org/orgSysUserDatagrid")
	public void orgSysUserDatagrid(Model model,Org org,SysUser user,
			@RequestParam(value = "orgid", required = false) final String orgid
			) {
		Json j = new Json();
		/**查询组织机构的用户列表**/
		writeJson(orgService.getOrgSysUsers(Integer.parseInt(orgid)));
		j.setSuccess(true);
		writeJson(j);
	}
	
	/**
	 * 查询不在当前组织机构的用户列表
	 * @param model
	 * @param org
	 * @param user
	 * @param orgid
	 */
	@RequestMapping(value = "org/addOrgSysUserDatagrid")
	public void addOrgSysUserDatagrid(Model model,Org org,SysUser user,
			@RequestParam(value = "orgid", required = false) final String orgid
			) {
		Json j = new Json();
		/**查询不在当前组织机构的用户列表**/
		writeJson(orgService.getAbsentOrgSysUsers(Integer.parseInt(orgid)));
		j.setSuccess(true);
		writeJson(j);
	}
	
	/**
	 * 保存组织机构的用户
	 * @param model
	 * @param user
	 * @param orgid
	 */
	@RequestMapping(value = "org/saveOrgSysUser")
	public void saveOrgSysUser(Model model,Org org,
			@RequestParam(value = "orgid", required = false) final String orgid,
			@RequestParam(value = "userids", required = false) final String userids,
			@RequestParam(value = "addOrgSysUserRoleIds", required = false) final String addOrgSysUserRoleIds
			) {
		Json j = new Json();
		try {
			/**保存组织机构用户**/
			if(userids.length()>0 && addOrgSysUserRoleIds.length() ==0 ){
				/**此情况时表示添加组织机构用户没有选择添加组织机构角色**/
				orgService.saveOrgSysUser(Long.parseLong(orgid),userids);
			}else if(addOrgSysUserRoleIds.length()>0 && userids.length()>0){
				/**保存用户角色、用户权限**/
				String[] userIds = userids.split(",");
				for(int i=0; i< userIds.length; i++){
					orgService.saveSysUserOrgRole(orgid,addOrgSysUserRoleIds,Long.parseLong(userIds[i]));
				}
			}
			
			j.setSuccess(true);
			j.setMsg("保存成功！");
		} catch (Exception e) {
			j.setMsg("操作失败！");
			logger.error(e.toString());
		}
		writeJson(j);
	}
	
	/**
	 * 删除组织机构用户
	 */
	@RequestMapping(value = "org/deleteOrgSysUsers")
	public void deleteOrgSysUsers(Model model,Org org,
			@RequestParam(value = "orgid", required = false) final String orgid,
			@RequestParam(value = "userids", required = false) final String userids
			) {
		
		Json j = new Json();
		try {
			/**删除用户权限表相关数据**/
			orgService.deleteRelated(Long.parseLong(orgid),userids);
			
			orgService.deleteOrgSysUsersByIds(Integer.parseInt(orgid),userids);
			
			j.setSuccess(true);
			j.setMsg("删除成功！");
		} catch (Exception e) {
			j.setMsg("删除失败！");
			logger.error(e.toString());
		}
		writeJson(j);
	}
}
