package com.clown.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 *
 *
 *
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * AnnotationMetadata : 当前类的注解信息
     * BeanDefinitionRegistry : 注册类 把所有需要添加到容器中的bean,调用BeanDefinitionRegistry.register方法注册到容器中
     *
     *
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println("当前容器中定义的bean的数量: " + registry.getBeanDefinitionCount());
        System.out.println("根据beanName获取容器中的bean: " + registry.getBeanDefinition("person"));
        System.out.println("判断容器中是否有student的定义: " + registry.containsBeanDefinition("com.clown.model.Student"));

        //获取容器中bean名
        String[] names = registry.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("bean的名字: "+name);
        }

        //如果IOC中有Teacher与Classmate组件,就注入Rainbow组件,一定是全类名com.clown.model.Teacher
        boolean b1 = registry.containsBeanDefinition("com.clown.model.Teacher");
        boolean b2 = registry.containsBeanDefinition("com.clown.model.Classmate");
        if (b1 && b2) {
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition("com.clown.model.Rainbow");
            //注册一个bean 指定一个bean名称为rainbow
            registry.registerBeanDefinition("rainbow",rootBeanDefinition);
        }

    }
}
