package basic.arch.component.mongo;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import basic.arch.component.mongo.entity.UserInfo;
import basic.arch.component.mongo.service.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-all.xml")
public class BaseMongoTest {
	@Autowired
	private UserDao userDao;
	
	@Before
	public void start(){
		System.out.println("单元测试开始");
	}
	
	@Test
	public void save(){
		UserInfo user = new UserInfo("test333", "test"); 
		userDao.insertUser(user);
	}
	
	@Test
	public void test(){
		List<UserInfo> str = userDao.findForRequery("test");
		for(UserInfo user:str){
			System.out.println("用户："+user.getUserName()+"&&密码："+user.getPassword());
		}
	}
	
	@After
	public void end(){
		System.out.println("单元测试结束");
	}
}
