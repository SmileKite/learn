package com.design.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 浅拷贝(clone)
 * @author lizhenyu
 * @date 2021/6/20
 */
@Getter
@Setter
@ToString
public class ShallowCloneDemo implements Cloneable {

    private long id;
    private String name;
    private int age;
    private Address address;

    @Getter
    @Setter
    public static class Address {
        private String province;
        private String city;
        private String town;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
