package com.design.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 深拷贝(clone)
 * @author lizhenyu
 * @date 2021/6/21
 */
@Getter
@Setter
@ToString
public class DeepCloneDemo implements Cloneable {
    private long id;
    private String name;
    private int age;
    private Address address;

    @Getter
    @Setter
    public static class Address implements Cloneable {
        private String province;
        private String city;
        private String town;

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepCloneDemo deepCloneDemo = (DeepCloneDemo) super.clone();
        Address address = (Address) deepCloneDemo.address.clone();
        deepCloneDemo.setAddress(address);
        return deepCloneDemo;
    }
}
