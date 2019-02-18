package com.clown.config;

import com.clown.model.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 *
 * 自己定义一个类实现FactoryBean接口，实现其方法，指定要注册到容器中的bean
 *
 **/
public class StudentFactory implements FactoryBean<Student> {

    //返回Student对象,并添加到IOC容器中
    @Override
    public Student getObject() throws Exception {
        return new Student("clown",12);
    }

    //对象类型
    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    /**
     * 是否单例
     *
     * true :单例:IOC容器中只有一份
     * false: 多例:获取时创建一个新的对象
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
