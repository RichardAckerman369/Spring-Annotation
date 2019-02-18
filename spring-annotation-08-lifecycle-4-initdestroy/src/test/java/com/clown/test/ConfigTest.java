package com.clown.test;

import com.clown.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 **/
public class ConfigTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC容器创建完成...");

        //IOC容器关闭时,bean销毁
        System.out.println("IOC容器关闭...");
        ap.close();
    }
}
