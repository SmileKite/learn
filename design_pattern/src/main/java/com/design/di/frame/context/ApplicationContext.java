package com.design.di.frame.context;

/**
 * 应用上下文接口
 * @author lizhenyu
 * @date 2021/6/15
 */
public interface ApplicationContext {
    /**
     * 根据beanid获取bean对象
     * @param beanId
     * @return
     */
    Object getBean(String beanId);
}
