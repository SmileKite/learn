package com.design.di.frame.factory;

import com.design.di.frame.exception.NoSuchBeanDefinitionException;
import com.design.di.frame.define.BeanDefinition;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lizhenyu
 * @date 2021/6/14
 */
public class BeanFactory {
    /** 单例对象缓存 */
    private Map<String, Object> singletonObjects = new ConcurrentHashMap<>();
    /** beanDefinition */
    private Map<String, BeanDefinition> beanDefinitions = new ConcurrentHashMap<>();

    /**
     * 添加beanDefinition集合对象
     * @param beanDefinitions beanDefinition集合
     */
    public void addBeanDefinitions(List<BeanDefinition> beanDefinitions) {
        for (BeanDefinition beanDefinition : beanDefinitions) {
            this.beanDefinitions.putIfAbsent(beanDefinition.getId(), beanDefinition);
        }
        for (BeanDefinition beanDefinition : beanDefinitions) {
            // 初始化生成非懒汉加载单例对象
            if (!beanDefinition.isLazyInit() && beanDefinition.isSingleton()) {
                createBean(beanDefinition);
            }
        }
    }

    /**
     * 根据beanId获取bean对象
     * @param beanId beanId
     * @return bean对象
     */
    public Object getBean(String beanId) {
        if (!beanDefinitions.containsKey(beanId)) {
            throw new NoSuchBeanDefinitionException("Bean is not defined:"+beanId);
        }
        return createBean(beanDefinitions.get(beanId));
    }

    /**
     * 创建bean对象
     * @param beanDefinition beanDefinition
     * @return bean对象
     */
    private Object createBean(BeanDefinition beanDefinition) {
        // 若是单例对象，且已经创建，直接从单例缓存中获取对象
        if (beanDefinition.isSingleton() && singletonObjects.containsKey(beanDefinition.getId())) {
            return singletonObjects.get(beanDefinition.getId());
        }

        // 通过反射创建bean对象
        Object bean = null;
        try {
            // 1、通过反射获取类
            Class beanClass = Class.forName(beanDefinition.getClassName());
            // 2、若存在初始化参数，要先执行初始化
            List<BeanDefinition.ConstructorArg> args = beanDefinition.getConstructorArgs();
            if (args.size() == 0) {
                // 不存在初始化参数，直接创建对象
                bean = beanClass.newInstance();
            } else {
                // 存在初始化参数，初始化后创建对象
                int len = args.size();
                Class[] argClasses = new Class[len];
                Object[] argObjects = new Object[len];
                for (int i = 0; i < len; i++) {
                    BeanDefinition.ConstructorArg arg = args.get(i);
                    if (!arg.isRef()) {
                        argClasses[i] = arg.getType();
                        argObjects[i] = arg.getArg();
                    } else {
                        BeanDefinition refBeanDefinition = beanDefinitions.get(arg.getArg());
                        if (refBeanDefinition == null) {
                            throw new NoSuchBeanDefinitionException("Bean is not defined:"+arg.getArg());
                        }
                        argClasses[i] = Class.forName(refBeanDefinition.getClassName());
                        argObjects[i] = createBean(refBeanDefinition);
                    }
                }
                bean = beanClass.getConstructor(argClasses).newInstance(argObjects);
            }
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        // 若是单例对象，加入单例缓存中
        if (bean != null && beanDefinition.isSingleton()) {
            singletonObjects.putIfAbsent(beanDefinition.getId(), bean);
            return singletonObjects.get(beanDefinition.getId());
        }
        return bean;
    }
}
