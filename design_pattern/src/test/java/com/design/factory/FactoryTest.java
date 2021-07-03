package com.design.factory;

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
        boolean c1 = SimpleFactoryDemo.createChildren("children1") instanceof SimpleFactoryDemo.Children1;
        boolean c2 = SimpleFactoryDemo.createChildren("children2") instanceof SimpleFactoryDemo.Children2;
        boolean c3 = SimpleFactoryDemo.createChildren("children3") instanceof SimpleFactoryDemo.Children3;
        System.out.println(c1+","+c2+","+c3+".");
    }

    /**
     * 工厂方法测试
     */
    @Test
    public void testMethod() {
        boolean c1 = MethodFactoryDemo.createFactory("children1").create() instanceof MethodFactoryDemo.Children1;
        boolean c2 = MethodFactoryDemo.createFactory("children2").create() instanceof MethodFactoryDemo.Children2;
        boolean c3 = MethodFactoryDemo.createFactory("children3").create() instanceof MethodFactoryDemo.Children3;
        System.out.println(c1+","+c2+","+c3+".");
    }

    /**
     * 抽象工厂测试
     */
    @Test
    public void testAbstract() {
        boolean c11 = AbstractFactoryDemo.createFactory("children1").create1() instanceof AbstractFactoryDemo.Children11;
        boolean c12 = AbstractFactoryDemo.createFactory("children2").create1() instanceof AbstractFactoryDemo.Children12;
        boolean c13 = AbstractFactoryDemo.createFactory("children3").create1() instanceof AbstractFactoryDemo.Children13;
        boolean c21 = AbstractFactoryDemo.createFactory("children1").create2() instanceof AbstractFactoryDemo.Children21;
        boolean c22 = AbstractFactoryDemo.createFactory("children2").create2() instanceof AbstractFactoryDemo.Children22;
        boolean c23 = AbstractFactoryDemo.createFactory("children3").create2() instanceof AbstractFactoryDemo.Children23;
        System.out.println(c11+","+c12+","+c13+";"+c21+","+c22+","+c23+".");
    }
}
