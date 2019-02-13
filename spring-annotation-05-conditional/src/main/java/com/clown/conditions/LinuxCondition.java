package com.clown.conditions;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/13
 *
 * 判断是否是linux系统条件
 *
 **/
public class LinuxCondition implements Condition {

    /**
     *
     * ConditionContext: 判断条件使用的上下文(环境)
     * AnnotatedTypeMetadata: 注释信息
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //判断是否是Linux系统
        //1.获取IOCbeanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //2.获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //3.获取到bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();
        //4.获取当前环境信息
        Environment environment = context.getEnvironment();
        String systemName = environment.getProperty("os.name");
        if (systemName.contains("Linux")) {
            return true;
        }
        return false;
    }
}
