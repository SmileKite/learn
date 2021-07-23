package com.design.proxy.reflect;

/**
 * 反射类的父类
 * @author lizhenyu
 * @date 2021/6/25
 */
public class Parent {

    private String pri;
    public String pub;
    public static String sta;
    {
        sta = "static";
    }

    public Parent(String pri, String pub) {
        this.pri = pri;
        this.pub = pub;
    }

    public void show(String message) {
        this.show(pri, pub, sta, message);
    }

    private void show(String... messages) {
        for (String message : messages) {
            System.out.print(message+";");
        }
    }

}