package com.design.proxy.reflect;

/**
 * 反射类
 * @author lizhenyu
 * @date 2021/6/26
 */
public class Children extends Parent {
    private String subPri;
    public String subPub;
    public static String subSta;
    {
        sta = "static";
    }

    public Children(String pri, String pub) {
        super(pri, pub);
        this.subPri = pri;
        this.subPub = pub;
    }

    public void subShow(String message) {
        this.subShow(subPri, subPub, subSta, message);
    }

    private void subShow(String... messages) {
        for (String message : messages) {
            System.out.print(message+";");
        }
    }
}
