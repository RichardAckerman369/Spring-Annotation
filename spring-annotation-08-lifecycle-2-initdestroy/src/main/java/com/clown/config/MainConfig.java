package com.clown.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 *
 * 初始化: 通过让bean实现InitializingBean接口定义初始化
 * 销毁:  通过让bean实现DisposableBean接口实现销毁
 *
 **/
@Configuration
@ComponentScan("com.clown.model")
public class MainConfig {
}
