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
import com.components.security.domain.pojo.Menu;
import com.components.security.service.MenuService;
import com.framework.common.core.controller.SpringControllerSupport;

/**
 * @author hbl
 * 2016-1-7下午6:04:01
 * 菜单管理
 */
@Controller
@RequestMapping("/components/security")
public class MenuController extends SpringControllerSupport{
	private static final Logger logger = Logger.getLogger(MenuController.class);
    @Autowired
    private MenuService menuService;
	
    /**
     * 系统菜单树型展现
     */
	@RequestMapping(value = "menu/getAllTreeNode")
	public void getAllTreeNode(final ModelMap model) {
		writeJson(menuService.getAllTreeNode());
	}

	/**
	 * 菜单管理列表
	 */
	@RequestMapping(value = "menu/index")
	public String index(final ModelMap model) {
		return "components/security/menu/menu";
	}
	
	/**
	 * 获得菜单列表以treegrid显示
	 */
	@RequestMapping(value = "menu/treeGrid")
	public void treeGrid(Model model,Menu menu,HttpServletRequest request,HttpServletResponse response) {
		writeJson(menuService.getTreeGrid());
	}
	
	/**
	 * 保存菜单信息
	 */
	@RequestMapping(value = "menu/save")
	public void save(Model model,Menu menu,@RequestParam(value = "menuParentId", required = false) final String menuParentId) {
		if(menuParentId.length()>0){
			menu.setParentId((long) Integer.parseInt(menuParentId));
		}
		Json j = new Json();
		try {
			menuService.save(menu);
			j.setSuccess(true);
			j.setMsg("添加成功！");
		} catch (Exception e) {
			j.setMsg("添加失败！");
			logger.error(e.toString());
		}
		writeJson(j);
	}	
	/**
	 * 编辑菜单信息
	 */
	@RequestMapping(value = "menu/edit")
	public void edit(Model model,Menu menu) {
		Json j = new Json();
		try {
			menuService.update(menu);
			j.setSuccess(true);
			j.setMsg("编辑成功！");
		} catch (Exception e) {
			logger.error(e.toString());
			j.setMsg("编辑失败！");
		}
		writeJson(j);
	}
	/**
	 * 查询菜单信息，回显
	 */
	@RequestMapping(value = "menu/showDesc")
	public void showDesc(Model model,Menu menu) {
		writeJson(menuService.getById(menu.getId()));
	}

	/**
	 * 删除一个或多个菜单
	 */
	@RequestMapping(value = "menu/delete")
	public void delete(Model model,Menu menu) {
		Json j = new Json();
		try {
			/**先把菜单关联表中的数据删除**/
			menuService.deleteRelatedByIds(menu.getIds());
			
			menuService.deleteByIds(menu.getIds());
			j.setSuccess(true);
			j.setMsg("删除成功！");
		} catch (Exception e) {
			logger.error(e.toString());
			j.setMsg("删除失败失败！");
		}
		writeJson(j);
	}
	
}
