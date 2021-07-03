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
        ShallowCloneDemo.Address address = new ShallowCloneDemo.Address();
        address.setProvince("山西");
        address.setCity("忻州");
        address.setTown("砂河");
        ShallowCloneDemo demo = new ShallowCloneDemo();
        demo.setId(1);
        demo.setName("张三");
        demo.setAge(5);
        demo.setAddress(address);

        ShallowCloneDemo clone = (ShallowCloneDemo) demo.clone();
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
        DeepCloneDemo.Address address = new DeepCloneDemo.Address();
        address.setProvince("山西");
        address.setCity("忻州");
        address.setTown("砂河");
        DeepCloneDemo demo = new DeepCloneDemo();
        demo.setId(1);
        demo.setName("张三");
        demo.setAge(5);
        demo.setAddress(address);

        DeepCloneDemo clone = (DeepCloneDemo) demo.clone();
        clone.setId(2);
        clone.setName("李四");

        System.out.println(demo.toString());
        System.out.println(clone.toString());
    }

    @Test
    public void testDeepCopy() throws IOException, ClassNotFoundException {
        DeepCopyDemo.Address address = new DeepCopyDemo.Address();
        address.setProvince("山西");
        address.setCity("忻州");
        address.setTown("砂河");
        DeepCopyDemo demo = new DeepCopyDemo();
        demo.setId(1);
        demo.setName("张三");
        demo.setAge(5);
        demo.setAddress(address);

        DeepCopyDemo clone = (DeepCopyDemo) demo.deepCopy();

        System.out.println(demo.toString());
        System.out.println(clone.toString());
    }

}
