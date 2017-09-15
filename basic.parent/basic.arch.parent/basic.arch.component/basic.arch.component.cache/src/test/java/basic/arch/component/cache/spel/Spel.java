package basic.arch.component.cache.spel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.expression.Expression;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import basic.arch.component.cache.redis.bean.Member;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-all.xml"})
public class Spel {


    /**
     * 模板变量替换
     */
    @Test
    public  void test2() {
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Member member = new Member();
        member.setAge(11);
        member.setId(1L);
        member.setUsername("asdfasfasfa");
        Expression exp2 = spelExpressionParser.parseExpression("#{age}",new TemplateParserContext());
        Expression exp3 = spelExpressionParser.parseExpression("AAA:#{age}",new TemplateParserContext());
        System.out.println("age的结果是"+exp2.getValue(member));
        System.out.println("age的结果是"+exp3.getValue(member));
    }

    /**
     * 普通解析
     */
    @Test
    public  void test1() {
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
       // Expression exp = spelExpressionParser.parseExpression("'Hello World'");
        StandardEvaluationContext standardEvaluationContext = new StandardEvaluationContext();
        Member member = new Member();
        member.setAge(11);
        member.setId(1L);
        member.setUsername("asdfasfasfa");
        //standardEvaluationContext.setRootObject(member);
        standardEvaluationContext.setVariable("age", member.getAge());
        standardEvaluationContext.setVariable("member", member);
        Expression exp2 = spelExpressionParser.parseExpression("#age");
        Expression exp3 = spelExpressionParser.parseExpression("#age+'AAA'");
        Expression exp4 = spelExpressionParser.parseExpression("'AAA'+#age");
        Expression exp5 = spelExpressionParser.parseExpression("'AAA'");
        
        //System.out.println("'Hello World'的结果是"+exp.getValue());
        System.out.println("age的结果是"+exp2.getValue(standardEvaluationContext,Integer.class));
        System.out.println("age的结果是"+exp3.getValue(standardEvaluationContext,String.class));
        System.out.println("age的结果是"+exp4.getValue(standardEvaluationContext,String.class));
        System.out.println("age的结果是"+exp5.getValue(standardEvaluationContext,String.class));
    }
}
