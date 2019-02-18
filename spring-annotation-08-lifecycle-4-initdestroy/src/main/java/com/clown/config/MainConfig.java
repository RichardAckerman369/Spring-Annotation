package com.clown.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 *
 * BeanPostProcessor : bean的后置处理器 在bean的初始化前后进行一些处理工作
 *
 *  postProcessBeforeInitialization : 初始化之前工作
 *  postProcessAfterInitialization:   初始化之后工作
 *
 **/
@Configuration
@ComponentScan("com.clown")
public class MainConfig {}
