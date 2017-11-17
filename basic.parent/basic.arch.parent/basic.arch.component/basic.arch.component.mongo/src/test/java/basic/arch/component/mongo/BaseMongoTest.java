package basic.arch.component.mongo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mongodb.util.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-all.xml")
public class BaseMongoTest {
	@Autowired
	private BaseMongo mongo;
	
	@Test
	public void start(){
		System.out.println("单元测试开始");
	}
	
	@Test
	public void test(){
		Object str = mongo.findById("5a012b16f06cd7cf933cdd75");
		System.out.println("测试结果========================="+JSON.serialize(str));
	}
	
	@Test
	public void end(){
		System.out.println("单元测试结束");
	}
}
