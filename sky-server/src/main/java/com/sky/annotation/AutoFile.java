package com.sky.annotation;

/**
 * @Author lzy
 * @CreateTime 2024/6/5 13:47
 */

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * 用于标识某个方法需要进行字段自动填充处理
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFile {
    //数据库操作类型：UPDATE和INSERT
    OperationType value();
}
