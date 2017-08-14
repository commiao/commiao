package com.components.service.security;

import com.commiao.domain.model.DataGrid;
import com.components.domain.pojo.security.SysUser;
/**
 * @author hbl
 * 2016-2-17上午10:45:59
 * TODO
 */
public interface SysUserService {
    /**
     * 获取用户集合，返回以easyUI识别的DataGrid形式
     * @param sysuser
     * @return 
     */
    public DataGrid getDataGrid(SysUser sysuser);
	/**
	 * 保存用户信息
	 * @param sysuser
	 */
    public void save(SysUser sysuser);
	/**
	 * 修改用户信息
	 * @param sysuser
	 */
    public void update(SysUser sysuser);
	/**
	 * 删除用户信息
	 * @param sysuser
	 */
    public void delete(SysUser sysuser);
	/**
	 * 批量删除用户信息
	 * @param sysuser
	 */
    public void deleteByIds(String ids);
	/**
	 * 根据ID获取用户信息
	 * @param sysuser
	 */
    public SysUser getById(Long id);

}
