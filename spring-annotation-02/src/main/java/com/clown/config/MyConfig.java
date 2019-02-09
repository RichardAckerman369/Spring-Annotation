package com.clown.config;

import com.clown.model.Book;
import org.springframework.context.annotation.*;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/9
 * 配置类 == 配置文件
 * @Configuration: 表示这十一个 配置类
 * @ComponentScan(value = "com.clown"): 指定要扫描的包
 *
 * 扫描com.clown下的所有包但排除带有@Controller,@Service注解的类,IOC容器中就没有BOOKController,BookService组件,只有bookmapper,Book组件
 * @ComponentScan(value = "com.clown",excludeFilters = {
 *         @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})})
 *
 * 只扫描带有@Controller注解的类,并将其放入IOC容器中,但是要将@ComponentScan的默认过滤规则禁用掉useDefaultFilters = false
 * @ComponentScan(value = "com.clown",includeFilters = {
 *         @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class })})
 *
 * @ComponentScan是个重复注解,可以重复使用指定不同的策略 JDK1.8可用
 *
 * 不是JDK1.8可以使用下面的注解进行多个扫描策略
 * @ComponentScans(
 *         value = {
 *                 @ComponentScan(value = "com.clown",includeFilters = {
 *                         @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})},useDefaultFilters = false)})
 *
 * 几种过滤方法
 * FilterType.ANNOTATION: 根据注解进行过滤
 * FilterType.ASSIGNABLE_TYPE: 按照给定的类型进行注入
 * FilterType.ASPECTJ: 不常用
 * FilterType.CUSTOM: 使用自定义规则
 *
 **/
@Configuration
//@ComponentScan(value = "com.clown")
//@ComponentScan(value = "com.clown",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})})
//@ComponentScan(value = "com.clown",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {
//                Controller.class
//        })
//},useDefaultFilters = false)
//@ComponentScans(
//        value = {
//                @ComponentScan(value = "com.clown",includeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {
//                                Controller.class
//                        })
//                },useDefaultFilters = false)
//        }
//)
@ComponentScans(
        value = {
                @ComponentScan(value = "com.clown",includeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
//                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookServiceImpl.class}),
                        //@ComponentScan.Filter(type = FilterType.ASPECTJ)
                        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
                })
        }
)
public class MyConfig {

    //给容器中注册一个Bean 类型为返回值的类型.id为方法名
    @Bean("book")
    public Book book(){
        return new Book("红楼梦","脂砚斋");
    }
}
