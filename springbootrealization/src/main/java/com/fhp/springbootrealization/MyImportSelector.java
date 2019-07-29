package com.fhp.springbootrealization;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ImportSelector这个接口返回需要导入到Spring容器的类的全限定名数组
 *
 * Spring Boot中的@EnableAutoConfiguration就是借助@Import(AutoConfigurationImportSelector.class)来实现的
 *
 * AutoConfigurationImportSelector会通过类加载器扫描所有jar包的Meta-INF/spring.factories中的全限定名
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.fhp.springbootrealization.User"};
    }
}
