package com.clown.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/13
 *
 * 判断是否是Windows系统
 *
 **/
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //4.获取当前环境信息
        Environment environment = context.getEnvironment();
        String systemName = environment.getProperty("os.name");
        if (systemName.contains("Windows")) {
            return true;
        }
        return false;
    }
}
