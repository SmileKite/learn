package com.design.prototype;

import org.junit.Test;

import java.io.IOException;

/**
 * 原型模式测试
 * @author lizhenyu
 * @date 2021/6/20
 */
public class PrototypeTest {

    /**
     * 浅拷贝测试
     * @throws CloneNotSupportedException
     */
    @Test
    public void testShallowClone() throws CloneNotSupportedException {
        ShallowClone.Address address = new ShallowClone.Address();
        address.setProvince("山西");
        address.setCity("忻州");
        address.setTown("砂河");
        ShallowClone demo = new ShallowClone();
        demo.setId(1);
        demo.setName("张三");
        demo.setAge(5);
        demo.setAddress(address);

        ShallowClone clone = (ShallowClone) demo.clone();
        clone.setId(2);
        clone.setName("李四");

        System.out.println(demo.toString());
        System.out.println(clone.toString());
    }

    /**
     * 深拷贝测试
     * @throws CloneNotSupportedException
     */
    @Test
    public void testDeepClone() throws CloneNotSupportedException {
        DeepClone.Address address = new DeepClone.Address();
        address.setProvince("山西");
        address.setCity("忻州");
        address.setTown("砂河");
        DeepClone demo = new DeepClone();
        demo.setId(1);
        demo.setName("张三");
        demo.setAge(5);
        demo.setAddress(address);

        DeepClone clone = (DeepClone) demo.clone();
        clone.setId(2);
        clone.setName("李四");

        System.out.println(demo.toString());
        System.out.println(clone.toString());
    }

    @Test
    public void testDeepCopy() throws IOException, ClassNotFoundException {
        DeepCopy.Address address = new DeepCopy.Address();
        address.setProvince("山西");
        address.setCity("忻州");
        address.setTown("砂河");
        DeepCopy demo = new DeepCopy();
        demo.setId(1);
        demo.setName("张三");
        demo.setAge(5);
        demo.setAddress(address);

        DeepCopy clone = (DeepCopy) demo.deepCopy();

        System.out.println(demo.toString());
        System.out.println(clone.toString());
    }

}
