package com.angus.aop.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    /**
     * 目标代理类的范围
     */
//    Class<? extends Annotation> target();
    /**
     * 切点表达式
     */
    String pointcut() default "";
}
