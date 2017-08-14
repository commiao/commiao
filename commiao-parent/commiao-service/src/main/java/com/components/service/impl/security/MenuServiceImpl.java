package com.components.service.impl.security;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.components.dao.security.MenuDao;
import com.components.domain.model.TreeGrid;
import com.components.domain.model.TreeNode;
import com.components.domain.pojo.security.Menu;
import com.components.service.security.MenuService;
/**
 * @author hbl
 * 2016-1-19上午11:44:14
 * 菜单业务实体类
 */
@Repository("menuService")
public class MenuServiceImpl implements MenuService {
	@Autowired
    private MenuDao menuDao;
	
	public List<TreeNode> getAllTreeNode(){
		return menuDao.getAllTreeNode();
	}
	
	public List<TreeGrid> getTreeGrid(){
		return menuDao.findMenusTreeGrid();
	}
	
	/**
	 * 保存菜单到数据库
	 */
	public void save(Menu menu) {
		menuDao.insert(menu);
	}
	
    public void update(Menu menu){
		menuDao.update(menu);
	}
    
    public void delete(Menu menu){
		menuDao.delete(menu.getId());
	}
    public void deleteByIds(String ids){
    	if (ids != null) {
    		ArrayList<Long> idList = new ArrayList<Long>();
			for (String id : ids.split(",")) {
				idList.add(Long.parseLong(id));
			}
			menuDao.deleteByIds(idList);
		}
	}
    
	public Menu getById(Long id) {
		return menuDao.getById(id);
	}
	
	@Override
	public List<TreeNode> getRoleMenu(Long roleid) {
		return menuDao.getRoleMenu(roleid);
	}

	/**
	 * 删除菜单关联表数据
	 */
	public void deleteRelatedByIds(String ids) {
		if (ids != null) {
    		ArrayList<Long> idList = new ArrayList<Long>();
			for (String id : ids.split(",")) {
				idList.add(Long.parseLong(id));
			}
			/**删除角色菜单相关数据**/
			menuDao.deleteRoleMenu(idList);
			/**删除用户角色菜单相关数据**/
			menuDao.deleteUserRoleMenu(idList);
		}
	}
}
