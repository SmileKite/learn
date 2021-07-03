package com.design.singleton;

/**
 * 枚举实现单例
 * @author lizhenyu
 * @date 2021/6/14
 */
public class EnumSingletonDemo {

    private static EnumSingletonDemo instance;
    private EnumSingletonDemo(){}
    public static EnumSingletonDemo getInstance() {
        return EnumHolder.INSTANCE.getInstance();
    }

    enum EnumHolder {
        INSTANCE;
        private EnumHolder(){
            instance = new EnumSingletonDemo();
        }
        public EnumSingletonDemo getInstance() {
            return instance;
        }
    }

}
