package com.design.di.frame.exception;

/**
 * beanDefinition未定义错误
 * @author lizhenyu
 * @date 2021/6/19
 */
public class NoSuchBeanDefinitionException extends RuntimeException {

    public NoSuchBeanDefinitionException(String message) {
        super(message);
    }

}
