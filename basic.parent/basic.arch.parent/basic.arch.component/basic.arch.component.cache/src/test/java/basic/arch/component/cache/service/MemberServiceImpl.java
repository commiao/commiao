package basic.arch.component.cache.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import basic.arch.component.cache.annotation.EnableCache;
import basic.arch.component.cache.annotation.EnableCache.ExceptionStrategy;
import basic.arch.component.cache.annotation.EnableCache.KeyStrategy;
import basic.arch.component.cache.redis.bean.Food;
import basic.arch.component.cache.redis.bean.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    /**
     * 数据缓存，模拟数据库
     */
    public  ConcurrentHashMap<String, Member> dataMap = new ConcurrentHashMap<String, Member>();
    
    {
        for(long j =0;j<100;j++){
            Member member = new Member();
            List<Food> list = new ArrayList<Food>();
            Food food = null;
            for(long i = j ;i<j+10;i++){
                food = new Food();
                food.setName("食物名称"+i);
                food.setSource("食物来源"+i);
                food.setWeight(10*i);
                list.add(food);
            }
            member.setId(j);
            member.setAge(10);
            member.setFoods(list);
            member.setUsername(j+"");  
            dataMap.put(j+"", member);
        }
       
        
    }

    /**
     * 增加或者修改，增加或者修改完毕，必须返回需要缓存的对象
     */
    @EnableCache(key="'member:'+#member.id",
            /*value=basic.arch.component.cache.redis.bean.Member.class,*/
            operationStrategy=KeyStrategy.SAVE_OR_UPDATE)
    public Member  saveOrUpdateMember(Member member){
        logger.info("开始存入数据库");
        Member memberExist = dataMap.get(member.getId()+"");
        if(memberExist==null){
            dataMap.put(member.getId()+"",member);
        }else{
            dataMap.put(member.getId()+"", member);
        }
        return member;
       
    }
    
    @EnableCache(key="'member:'+#member.id",
            /*value=basic.arch.component.cache.redis.bean.Member.class,*/
            operationStrategy=KeyStrategy.SAVE_OR_UPDATE,
            timeOut=20L)
    public Member  saveOrUpdateMemberTimeOut(Member member){
        logger.info("开始存入数据库");
        Member memberExist = dataMap.get(member.getId()+"");
        if(memberExist==null){
            dataMap.put(member.getId()+"",member);
        }else{
            dataMap.put(member.getId()+"", member);
        }
        return member;
    }
    @EnableCache(key="'member:'+#member.id",
           /* value=basic.arch.component.cache.redis.bean.Member.class,*/
            exceptionStrategy=ExceptionStrategy.TRY_CATCH,
            operationStrategy=KeyStrategy.SAVE_OR_UPDATE,
            retryTimes=2)
    public Member  saveOrUpdateMemberThrowException(Member member){
        logger.info("开始存入数据库");
        Member memberExist = dataMap.get(member.getId()+"");
        if(memberExist==null){
            dataMap.put(member.getId()+"",member);
        }else{
            dataMap.put(member.getId()+"", member);
        }
        return member;
    }
    
    
    
    
    
    
    
    
    
    
    /**
     * 通过Id查询Member
     */
    @EnableCache(key="'member:'+#memberId",
            value=basic.arch.component.cache.redis.bean.Member.class)
    public Member findById(Long memberId){
        logger.debug("通过memberId开始查询数据库.....");
        Member memberExist = dataMap.get(memberId+"");
        return memberExist;
    }
    
    public Member findByIdNoAnnotation(Long memberId){
        logger.debug("通过memberId开始查询数据库.....");
        Member memberExist = dataMap.get(memberId+"");
        return memberExist;
    }

    /**
     * 通过MemberId删除
     */
    @EnableCache(key="'member:'+#memberId",operationStrategy=KeyStrategy.DELETE)
    @Override
    public void delete(Long memberId) {
        dataMap.remove(memberId+"");
    }
    
    
    
    
}
