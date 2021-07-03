package com.design.proxy;

/**
 * 静态代理--继承方式
 * @author lizhenyu
 * @date 2021/6/24
 */
public class ExtendStaticProxyDemo {

    /**
     * 原始类
     */
    public static class Static {
        public void a() {
            System.out.println("执行方法a");
        }
        public void b() {
            System.out.println("执行方法b");
        }
    }

    /**
     * 代理类
     */
    public static class StaticProxy extends Static {
        @Override
        public void a() {
            System.out.println("a方法执行前操作");
            super.a();
            System.out.println("a方法执行后操作");
        }
        @Override
        public void b() {
            System.out.println("b方法执行前操作");
            super.b();
            System.out.println("b方法执行后操作");
        }
    }
}
