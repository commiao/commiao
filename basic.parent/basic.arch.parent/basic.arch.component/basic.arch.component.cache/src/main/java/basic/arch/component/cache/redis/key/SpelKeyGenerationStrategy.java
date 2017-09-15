package basic.arch.component.cache.redis.key;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import basic.arch.component.cache.utils.ReflectionDefineUtils;
/**
 * Spel表达式解析
 * @author jannal
 */
public class SpelKeyGenerationStrategy implements KeyGenerationStrategy {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * @param targetClass
     *            目标类的Class对象
     * @param key
     *            方法上的带有变量的redis key
     * @param argsValue
     *            具体的参数值
     * @param method
     *            Method对象
     * @param args
     *            各个参数类型的Class对象
     * @return
     * @throws NoSuchMethodException
     */
    public String generateKey(Class<? extends Object> targetClass, String key, Object[] argsValue, Method method, Class<?>[] args) throws NoSuchMethodException {
        String[] parameterNames =ReflectionDefineUtils.getMethodParameterNames(targetClass, args, method);
        if (logger.isDebugEnabled()) {
            logger.debug("获取参数本地变量名:{}", Arrays.toString(parameterNames));
        }

        // 使用Spel表达式解析
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        StandardEvaluationContext standardEvaluationContext = new StandardEvaluationContext();

        for (int i = 0; i < parameterNames.length; i++) {
            standardEvaluationContext.setVariable(parameterNames[i], argsValue[i]);
            if (logger.isDebugEnabled()) {
                logger.debug("key:" + parameterNames[i] + "=====value:" + argsValue[i]);
            }
        }
        Expression exp = spelExpressionParser.parseExpression(key);
        String value = exp.getValue(standardEvaluationContext, String.class);
        if (logger.isDebugEnabled()) {
            logger.debug("解析后的key值:{}", value);
        }
        return value;
    }
}
