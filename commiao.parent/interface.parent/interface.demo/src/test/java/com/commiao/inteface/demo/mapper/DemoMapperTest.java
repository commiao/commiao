package com.commiao.inteface.demo.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.inteface.demo.entities.DemoEntity;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-all.xml")
public class DemoMapperTest {

	@Autowired
	private DemoMapper demoMapper;
	
	@Test
	public void testTest() {
		List<DemoEntity> test1 = demoMapper.testByPage(new PageBounds(1, 2));
		System.out.println(">>>>>>>>>>>>>>>>>>第一页<<<<<<<<<<<<<<<<<<<<");
		for(int i = 0, size = test1.size(); i < size; i++) {
			System.out.println(test1.get(i).getId());
		}
		
		List<DemoEntity> test2 = demoMapper.testByPage(new PageBounds(2, 2));
		System.out.println(">>>>>>>>>>>>>>>>>>第二页<<<<<<<<<<<<<<<<<<<<");
		for(int i = 0, size = test2.size(); i < size; i++) {
			System.out.println(test2.get(i).getId());
		}
		
		List<DemoEntity> test3 = demoMapper.testByPage(new PageBounds(3, 2));
		System.out.println(">>>>>>>>>>>>>>>>>>第三页<<<<<<<<<<<<<<<<<<<<");
		for(int i = 0, size = test3.size(); i < size; i++) {
			System.out.println(test3.get(i).getId());
		}
	}
	
}
