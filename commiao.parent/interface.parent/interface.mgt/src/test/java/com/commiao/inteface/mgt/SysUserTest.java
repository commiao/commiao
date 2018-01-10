package com.commiao.inteface.mgt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.inteface.mgt.security.mapper.SysUserMapper;

import core.entity.security.SysUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-all.xml")
public class SysUserTest{
 
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Test
	public void test(){
		SysUser user = new SysUser();
		System.out.println(sysUserMapper.findSysUsers(user));
	}
}
