package com.design.factory;

import com.design.factory.abs.AbstractFactory;
import com.design.factory.abs.IFactory;
import com.design.factory.method.MethodFactory;
import com.design.factory.simple.SimpleFactory;
import org.junit.Test;

/**
 * 工厂模式测试
 * @author lizhenyu
 * @date 2021/6/14
 */
public class FactoryTest {

    /**
     * 简单工厂测试
     */
    @Test
    public void testSimple() {
        System.out.println(SimpleFactory.createChildren("childrenA"));
        System.out.println(SimpleFactory.createChildren("childrenB"));
        System.out.println(SimpleFactory.createChildren("childrenC"));
    }

    /**
     * 测试简单工厂传入参数为null的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSimpleNullArg() {
        SimpleFactory.createChildren(null);
    }

    /**
     * 测试简单工厂传入参数不存在的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSimpleNotExistArg() {
        SimpleFactory.createChildren("childrenD");
    }

    /**
     * 工厂方法测试
     */
    @Test
    public void testMethod() {
        System.out.println(MethodFactory.createChildren("childrenA"));
        System.out.println(MethodFactory.createChildren("childrenB"));
        System.out.println(MethodFactory.createChildren("childrenC"));
    }

    /**
     * 测试工厂方法传入参数为null的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMethodNullArg() {
        MethodFactory.createChildren(null);
    }

    /**
     * 测试工厂方法传入参数不存在的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMethodNotExistArg() {
        MethodFactory.createChildren("childrenD");
    }

    /**
     * 抽象工厂测试
     */
    @Test
    public void testAbstract() {
        IFactory factoryA = AbstractFactory.createChildren("childrenA");
        IFactory factoryB = AbstractFactory.createChildren("childrenB");
        IFactory factoryC = AbstractFactory.createChildren("childrenC");
        System.out.println(factoryA.createA());
        System.out.println(factoryA.createB());
        System.out.println(factoryB.createA());
        System.out.println(factoryC.createB());
    }

    /**
     * 测试抽象工厂传入参数为null的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAbstractNullArg() {
        AbstractFactory.createChildren(null);
    }

    /**
     * 测试抽象工厂传入参数不存在的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAbstractNotExistArg() {
        AbstractFactory.createChildren("childrenD");
    }
}
