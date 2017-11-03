package com.commiao.inteface.demo.mapper;

import java.util.List;

import com.commiao.inteface.demo.entities.DemoEntity;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

public interface DemoMapper {
	
	/**
	 * 数据库连接测试方法
	 * @param pb
	 * @return
	 */
	List<DemoEntity> testByPage(PageBounds pb);
	
}
