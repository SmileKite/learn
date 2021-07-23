package com.design.proxy;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lizhenyu
 * @date 2021/6/24
 */
public class ReflectTest {

    @Test
    public void testReflect() {
        try {
            // 获取类的Class对象（一共有三种获取方式，Class.forName、对象.getClass、类.class）
            Class<?> clz = Class.forName("com.design.proxy.reflect.Children");

            // 获取类的构造对象
            Constructor<?> constructor = clz.getConstructor(String.class, String.class);

            // 获取反射类的对象（也可以通过Class.newInstance获取，但是只能获取无参对象）
            Object o = constructor.newInstance("这是个私有属性", "这是个公有属性");

            // 获取类的所有方法（反射类与父类的所有public方法）
            Method[] methods = clz.getMethods();
            System.out.println("===============================getMethods方法展示start===============================");
            for (Method method : methods) {
                System.out.print(method.getName()+"[");
                // 获取方法的参数类型
                Class<?>[] types = method.getParameterTypes();
                for (Class type : types) {
                    System.out.print(type.getName());
                }
                System.out.println("]");
            }
            System.out.println("===============================getMethods方法展示end===============================");

            System.out.println("===============================getFields方法展示start===============================");
            // 获取类的所有参数（反射类与父类的所有public参数）
            Field[] fields = clz.getFields();
            for (Field field : fields) {
                System.out.println(field.getName()+"="+field);
            }
            System.out.println("===============================getFields方法展示end===============================");

            System.out.println("===========================getDeclaredMethods方法展示start===========================");
            // 获取类的所有方法（反射类的所有方法，包括私有）
            methods = clz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.print(method.getName()+"[");
                // 获取方法的参数类型
                Class<?>[] types = method.getParameterTypes();
                for (Class type : types) {
                    System.out.print(type.getName());
                }
                System.out.println("]");
            }
            System.out.println("===========================getDeclaredMethods方法展示end===========================");

            System.out.println("===========================getDeclaredFields方法展示start===========================");
            // 获取类的所有参数（反射类的所有方法，包括私有）
            fields = clz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName()+"="+field);
            }
            System.out.println("===========================getDeclaredFields方法展示end===========================");

            // 获取类的某个方法(getMethod与getDeclaredMethod的区别与上面获取类的所有方法区别一致)
            Method show = clz.getMethod("show", String.class);

            // 执行方法
            show.invoke(o, "这是传入的参数");
        } catch (ClassNotFoundException | NoSuchMethodException
                | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
