package com.clown.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 *
 * 自定义规则,筛选需要导入的组件
 *
 **/
public class MyImportSelector implements ImportSelector {

    /**
     *  返回值: 就是要导入到容器中的组件全类名
     *
     *  AnnotationMetadata : 当前标注@Import 注解的类的所有注解的信息
     *
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.clown.model.Student","com.clown.model.Classmate"};
    }
}
