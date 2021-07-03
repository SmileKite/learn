package com.design.di;

import com.design.di.frame.context.ApplicationContext;
import com.design.di.frame.context.ClassPathXmlApplicationContext;
import com.design.di.frame.parser.XmlBeanConfigParser;
import com.design.di.frame.define.BeanDefinition;
import com.design.di.frame.parser.BeanConfigParser;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * DI最小实现框架测试
 * @author lizhenyu
 * @date 2021/6/15
 */
public class DITest {

    /**
     * 测试xml加载获取beanDefinition
     */
    @Test
    public void testXmlBeanConfigParser() {
        InputStream inputStream = getClass().getResourceAsStream("/beans.xml");
        BeanConfigParser parser = new XmlBeanConfigParser();
        List<BeanDefinition> beanDefinitions = parser.parse(inputStream);
        for (BeanDefinition beanDefinition : beanDefinitions) {
            System.out.println(beanDefinition.toString());
        }
    }

    /**
     * 测试bean获取
     */
    @Test
    public void testBeanCreate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
        RedisService redisService = (RedisService) context.getBean("redisService");
        System.out.println(redisService.toString());
    }

    /**
     * 测试单例对象
     */
    @Test
    public void testSingleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
        DataSource dataSource1 = (DataSource) context.getBean("dataSource");
        DataSource dataSource2 = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource1 == dataSource2);
    }
}
