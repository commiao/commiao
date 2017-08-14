package com.components.service.impl.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.components.dao.security.SysUserDao;
import com.commiao.domain.model.DataGrid;
import com.components.domain.pojo.security.SysUser;
import com.components.service.security.SysUserService;
/**
 * Author ningzhitao 
 * Date   15/12/29.
 */
@Repository("sysUserService")
public class SysUserServiceImpl implements SysUserService {
	@Autowired
    private SysUserDao sysUserDao;
	
	public DataGrid getDataGrid(SysUser sysuser){
		DataGrid dg = new DataGrid();
		dg.setTotal(sysUserDao.getSysUserCount(sysuser));
		dg.setRows(sysUserDao.findSysUser(sysuser));
		return dg;
	}
	
	public void save(SysUser sysuser) {
		sysUserDao.insert(sysuser);
	}
	
    public void update(SysUser sysuser){
		sysUserDao.update(sysuser);
	}
    
    public void delete(SysUser sysuser){
		sysUserDao.delete(sysuser.getId());
	}
    public void deleteByIds(String ids){
    	if (ids != null) {
    		ArrayList<Long> idList = new ArrayList<Long>();
			for (String id : ids.split(",")) {
				idList.add(Long.parseLong(id));
				
				/**删除用户相关表 组织机构用户、用户角色菜单**/
				sysUserDao.deleteOrgSysUser(Long.parseLong(id));
				
				sysUserDao.deleteSysUserRoleMenu(Long.parseLong(id));
			}
			sysUserDao.deleteByIds(idList);
			
		}
	}
    
	public SysUser getById(Long id) {
		return sysUserDao.getById(id);
	}
    
    public void setSysUserDao(SysUserDao sysUserDao) {
        this.sysUserDao = sysUserDao;
    }
}
