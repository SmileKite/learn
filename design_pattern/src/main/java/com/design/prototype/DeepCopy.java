package com.design.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

/**
 * 深拷贝
 * @author lizhenyu
 * @date 2021/6/21
 */
@Getter
@Setter
@ToString
public class DeepCopy implements Serializable {

    private long id;
    private String name;
    private int age;
    private Address address;

    @Getter
    @Setter
    public static class Address implements Serializable {
        private String province;
        private String city;
        private String town;
    }

    /**
     * 深拷贝
     * @return 拷贝后的对象
     */
    public Object deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();
    }
}
