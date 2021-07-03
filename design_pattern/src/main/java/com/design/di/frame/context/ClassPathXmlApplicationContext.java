package com.design.di.frame.context;

import com.design.di.frame.factory.BeanFactory;
import com.design.di.frame.define.BeanDefinition;
import com.design.di.frame.parser.BeanConfigParser;
import com.design.di.frame.parser.XmlBeanConfigParser;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * xml资源文件应用上下文
 * @author lizhenyu
 * @date 2021/6/15
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {
    /** bean工厂 */
    private BeanFactory factory;
    /** 配置文件解析对象 */
    private BeanConfigParser parser;

    public ClassPathXmlApplicationContext(String configPath) {
        this.factory = new BeanFactory();
        this.parser = new XmlBeanConfigParser();
        loadBeanDefinitions(configPath);
    }

    /**
     * 根据配置文件路径，读取beanDefinition到factory中
     * @param configPath 配置文件路径
     */
    private void loadBeanDefinitions(String configPath) {
        // 1、读取配置文件，获取流
        try(InputStream inputStream = this.getClass().getResourceAsStream(configPath)) {
            if (inputStream == null) {
                throw new RuntimeException("Can not find config file: "+configPath);
            }
            // 2、通过beanDefinition解析器解析输入流，获取beanDefinition集合对象
            List<BeanDefinition> beanDefinitions = parser.parse(inputStream);
            // 3、bean工厂添加beanDefinition集合
            factory.addBeanDefinitions(beanDefinitions);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanId) {
        return factory.getBean(beanId);
    }
}
