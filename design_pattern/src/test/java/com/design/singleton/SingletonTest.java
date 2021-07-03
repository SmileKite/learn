package com.design.singleton;

import org.junit.Test;

/**
 * 单例模式测试
 * @author lizhenyu
 * @date 2021/6/13
 */
public class SingletonTest {

    /**
     * 测试饿汉式单例
     */
    @Test
    public void testHungry() {
        int len = 5;
        for (int i = 0; i < len; i++) {
            System.out.println(HungrySingletonDemo.getInstance());
        }
    }

    /**
     * 测试懒汉式单例
     */
    @Test
    public void testLazy() {
        int len = 5;
        for (int i = 0; i < len; i++) {
            System.out.println(LazySingletonDemo.getInstance());
        }
    }

    /**
     * 测试双检锁单例
     */
    @Test
    public void testDoubleCheck() {
        int len = 5;
        for (int i = 0; i < len; i++) {
            System.out.println(DoubleCheckSingletonDemo.getInstance());
        }
    }

    /**
     * 测试静态单例
     */
    @Test
    public void testStaticInner() {
        int len = 5;
        for (int i = 0; i < len; i++) {
            System.out.println(StaticInnerSingletonDemo.getInstance());
        }
    }

    /**
     * 测试枚举单例
     */
    @Test
    public void testEnum() {
        int len = 5;
        for (int i = 0; i < len; i++) {
            System.out.println(EnumSingletonDemo.getInstance());
        }
    }

    /**
     * 测试线程唯一单例
     */
    @Test
    public void testThread() {
        int len = 5;
        new Thread(()->{
            for (int j = 0; j < len; j++) {
                System.out.println("thread1:"+ ThreadSingletonDemo.getInstance());
            }
        }).start();
        new Thread(()->{
            for (int j = 0; j < len; j++) {
                System.out.println("thread2:"+ ThreadSingletonDemo.getInstance());
            }
        }).start();
    }

}
