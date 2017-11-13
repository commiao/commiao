package basic.arch.component.cache.aop;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import basic.arch.component.cache.redis.bean.Food;
import basic.arch.component.cache.redis.bean.Member;
import basic.arch.component.cache.redis.impl.RedisMqService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-all.xml" })
public class RedisMqServiceTest {

	@Autowired
	private RedisMqService redisMqService;
	
	String key = "test20171113";
	
	@Before
	public void start(){
		System.out.println("单元测试开始");
	}
	
	@Test
	public void testPushFromLeft(){
		Member member = new Member();
        List<Food> list = new ArrayList<Food>();
        Food food = null;
        for (long i = 100; i < 110; i++) {
            food = new Food();
            food.setName("食物名称" + i);
            food.setSource("食物来源" + i);
            food.setWeight(10 * i);
            list.add(food);
        }
        member.setId(1006L);
        member.setAge(10);
        member.setFoods(list);
        member.setUsername("jannal");
        redisMqService.pushFromLeft(key, member);
	}
	@Test
	public void testPushFromRight(){
		Member member = new Member();
		List<Food> list = new ArrayList<Food>();
		Food food = null;
		for (long i = 100; i < 110; i++) {
			food = new Food();
			food.setName("食物名称" + i);
			food.setSource("食物来源" + i);
			food.setWeight(10 * i);
			list.add(food);
		}
		member.setId(1007L);
		member.setAge(10);
		member.setFoods(list);
		member.setUsername("jannal");
		redisMqService.pushFromRight(key, member);
	}
	
	@Test
	public void testRemoveFromRight(){
		Member member = redisMqService.removeFromRight(key, Member.class);
		System.out.println(member.getId());
		System.out.println(member.getAge());
		System.out.println(member.getUsername());
		for(Food f:member.getFoods()){
			System.out.println(JSON.toJSONString(f));
		}
	}
	
	@Test
	public void testRemoveFromLeft(){
		Member member = redisMqService.removeFromLeft(key, Member.class);
		System.out.println(member.getId());
		System.out.println(member.getAge());
		System.out.println(member.getUsername());
		for(Food f:member.getFoods()){
			System.out.println(JSON.toJSONString(f));
		}
	}
	
	@After
	public void end(){
		System.out.println("单元测试结束");
	}
}
