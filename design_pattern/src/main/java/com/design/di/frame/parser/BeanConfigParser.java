package com.design.di.frame.parser;

import com.design.di.frame.define.BeanDefinition;

import java.io.InputStream;
import java.util.List;

/**
 * 配置文件解析接口
 * @author lizhenyu
 * @date 2021/6/14
 */
public interface BeanConfigParser {
    /**
     * 根据流读取配置文件
     * @param stream 输入流
     * @return beanDefinition集合
     */
    List<BeanDefinition> parse(InputStream stream);

}
