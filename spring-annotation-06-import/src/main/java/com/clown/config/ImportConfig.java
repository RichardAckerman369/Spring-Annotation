package com.clown.config;

import com.clown.model.Person;
import com.clown.model.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 *
 * 在容器中注册组建
 *      1:包扫描：带用注解的组建(@Controller、@Service、@Repotitory...)
 *      2:bean注解导入组建【导入第三方包里的组建】
 *      3:@Import快速向容器中导入组建
 *          1.@Import(需要导入的组建)；容器中会自动注册组建，默认id是全类名
 *          2.ImportSelector返回需要导入的组建全类名数组，不可以自定义组建id，全类名
 *          3.ImportBeanDefinitionRegistrar：手动注册bean到容器中，可以自定义组建的id
 *          4:自己定义一个类实现FactoryBean接口，实现其方法，指定要注册到容器中的bean
 **/
@Configuration
@Import({Teacher.class, MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class ImportConfig {

    @Bean("person")
    public Person person(){
        return new Person("clown",12);
    }
}
