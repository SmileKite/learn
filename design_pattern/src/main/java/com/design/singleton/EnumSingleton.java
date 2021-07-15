package com.design.singleton;

/**
 * 枚举实现单例
 * @author lizhenyu
 * @date 2021/6/14
 */
public class EnumSingleton {

    private static EnumSingleton instance;
    private EnumSingleton(){}
    public static EnumSingleton getInstance() {
        return EnumHolder.INSTANCE.getInstance();
    }

    enum EnumHolder {
        INSTANCE;
        private EnumHolder(){
            instance = new EnumSingleton();
        }
        public EnumSingleton getInstance() {
            return instance;
        }
    }

}
