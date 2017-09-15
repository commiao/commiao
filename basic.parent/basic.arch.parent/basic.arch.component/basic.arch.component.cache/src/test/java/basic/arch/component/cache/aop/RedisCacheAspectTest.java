package basic.arch.component.cache.aop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.sourceforge.groboutils.junit.v1.MultiThreadedTestRunner;
import net.sourceforge.groboutils.junit.v1.TestRunnable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import basic.arch.component.cache.redis.bean.Food;
import basic.arch.component.cache.redis.bean.Member;
import basic.arch.component.cache.redis.impl.RedisCacheService;
import basic.arch.component.cache.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-all.xml" })
public class RedisCacheAspectTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MemberService memberService;
    
    @Autowired
    private RedisCacheService redisCacheService;
    
    @Test
    public void aaaaaa(){
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
        member.setId(1001L);
        member.setAge(10);
        member.setFoods(list);
        member.setUsername("jannal");
        redisCacheService.saveOrUpdateNoTimeOut("member:3000", member);
//        redisCacheService.hashSetSaveOrUpdateNoTimeOut("member", member);
    }

    /**
     * 测试存储redis字符串类型
     * 
     * @author jannal
     */
    @Test
    public void testSaveOrUpdate() {
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
        member.setId(1001L);
        member.setAge(10);
        member.setFoods(list);
        member.setUsername("jannal");
        Member member2 = memberService.saveOrUpdateMember(member);
        if (member2 == null) {
            logger.debug("member不存在");
        } else {
            logger.debug("member数据:{}", member2.toString());
        }
    }

    /**
     * @Description::测试超时<br/> 
     * @author jannal
     */
    @Test
    public void testSaveOrUpdateMemberTimeOut() {
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
        member.setId(1002L);
        member.setAge(10);
        member.setFoods(list);
        member.setUsername("jannal");
        Member member2 = memberService.saveOrUpdateMemberTimeOut(member);
        if (member2 == null) {
            logger.debug("member不存在");
        } else {
            logger.debug("member数据:{}", member2.toString());
        }
    }

    /**
     * 
     * @Description:测试捕获异常重试<br/> 
     * @author jannal
     * @throws Throwable
     */
    @Test
    public void testSaveOrUpdateMemberThrowException() throws Throwable {
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
        member.setId(1003L);
        member.setAge(10);
        member.setFoods(list);
        member.setUsername("jannal");

        TestRunnable runner = new TestRunnable() {
            @Override
            public void runTest() throws Throwable {
                Random rand = new Random();
                int nextInt = rand.nextInt();
                member.setAge(nextInt);
                Member member2 = memberService.saveOrUpdateMemberThrowException(member);
                if (member2 == null) {
                    logger.debug("member不存在");
                } else {
                    logger.debug("member数据:{}", member2.toString());
                }
            }
        };
        int runnerCount = 10;
        // Rnner数组，想当于并发多少个。
        TestRunnable[] trs = new TestRunnable[runnerCount];
        for (int i = 0; i < runnerCount; i++) {
            trs[i] = runner;
        }
        // 用于执行多线程测试用例的Runner，将前面定义的单个Runner组成的数组传入
        MultiThreadedTestRunner mttr = new MultiThreadedTestRunner(trs);
        // 开发并发执行数组里定义的内容
        mttr.runTestRunnables();

    }
    @Test
    public void testSaveOrUpdateMemberTryCatchException() throws Throwable{
        TestRunnable runner = new TestRunnable() {
            @Override
            public void runTest() throws Throwable {
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
                member.setId(1001L);
                member.setAge(10);
                member.setFoods(list);
                member.setUsername("jannal");
                Random rand = new Random(1000000);
                int nextInt = rand.nextInt();
                member.setAge(nextInt);
                Member member2 = memberService.saveOrUpdateMember(member);
                if (member2 == null) {
                    logger.debug("member不存在");
                } else {
                    logger.debug("member数据:{}", member2.toString());
                }
            }
        };
        TestRunnable runner2 = new TestRunnable() {
            @Override
            public void runTest() throws Throwable {
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
                member.setId(1001L);
                member.setAge(10);
                member.setFoods(list);
                member.setUsername("jannal");
                Random rand = new Random(200000);
                int nextInt = rand.nextInt();
                member.setAge(nextInt);
                Member member2 = memberService.saveOrUpdateMember(member);
                if (member2 == null) {
                    logger.debug("member不存在");
                } else {
                    logger.debug("member数据:{}", member2.toString());
                }
            }
        };
        int runnerCount = 30;
        // Rnner数组，想当于并发多少个。
        TestRunnable[] trs = new TestRunnable[runnerCount];
        for (int i = 0; i < runnerCount; i++) {
            if(i%2==0){
                trs[i] = runner; 
            }else{
                trs[i] = runner2;
            }
            
        }
        // 用于执行多线程测试用例的Runner，将前面定义的单个Runner组成的数组传入
        MultiThreadedTestRunner mttr = new MultiThreadedTestRunner(trs);
        // 开发并发执行数组里定义的内容
        mttr.runTestRunnables();
        Thread.sleep(10000);
    }
    
    

    @Test
    public void testFindById() {
        Member member = memberService.findById(1001L);
        if (member == null) {
            logger.debug("member不存在");
        } else {
            logger.debug("member数据:{}", member.toString());
        }
    }

    @Test
    public void testFindByIdNoAnnotation() {
        Member member = memberService.findByIdNoAnnotation(1001L);
        if (member == null) {
            logger.debug("member不存在");
        } else {
            logger.debug("member数据:{}", member.toString());
        }

    }

    @Test
    public void testDelete() {
        memberService.delete(0L);
    }

}
