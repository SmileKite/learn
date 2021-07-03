package com.design.proxy;

/**
 * 静态代理--组合方式
 * @author lizhenyu
 * @date 2021/6/24
 */
public class CombinedStaticProxyDemo {

    interface IStaticProxy {
        void a();
        void b();
    }

    /**
     * 原始类
     */
    public static class StaticProxyImpl implements IStaticProxy {
        @Override
        public void a() {
            System.out.println("a方法执行");
        }
        @Override
        public void b() {
            System.out.println("b方法执行");
        }
    }

    /**
     * 代理类
     */
    public static class StaticProxy implements IStaticProxy {
        public StaticProxyImpl staticImpl;
        public StaticProxy(StaticProxyImpl staticImpl) {
            this.staticImpl = staticImpl;
        }

        @Override
        public void a() {
            System.out.println("a方法执行前操作");
            staticImpl.a();
            System.out.println("a方法执后前操作");
        }
        @Override
        public void b() {
            System.out.println("b方法执行前操作");
            staticImpl.b();
            System.out.println("b方法执后前操作");
        }
    }

}
