package com.design.builder;

import org.junit.Test;

import java.util.Date;

/**
 * 建造者模式测试
 * @author lizhenyu
 * @date 2021/6/19
 */
public class BuilderTest {

    /**
     * 测试正常使用的builder
     */
    @Test
    public void testCorrect() {
        BuilderDesign demo = new BuilderDesign.Builder()
                .setName("zhang")
                .setAttr1("1")
                .setAttr2("2")
                .setAttr3("3")
                .setDate1(null)
                .setDate2(new Date())
                .setNum1(1)
                .setNum2(2)
                .build();
        System.out.println(demo.toString());
    }

    /**
     * 测试姓名为空的builder校验
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNameNullError() {
        BuilderDesign demo = new BuilderDesign.Builder()
                .setName("")
                .setAttr1("1")
                .setAttr2("2")
                .setAttr3("3")
                .setDate1(null)
                .setDate2(new Date())
                .setNum1(1)
                .setNum2(2)
                .build();
        System.out.println(demo.toString());
    }

    /**
     * 测试attr限制的builder校验
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAttrConformityError() {
        BuilderDesign demo = new BuilderDesign.Builder()
                .setName("zhang")
                .setAttr1("1")
                .setAttr2(null)
                .setAttr3("3")
                .setDate1(null)
                .setDate2(new Date())
                .setNum1(1)
                .setNum2(2)
                .build();
        System.out.println(demo.toString());
    }

    /**
     * 测试num非负的builder校验
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumNegativeError() {
        BuilderDesign demo = new BuilderDesign.Builder()
                .setName("zhang")
                .setAttr1("1")
                .setAttr2("2")
                .setAttr3("3")
                .setDate1(null)
                .setDate2(new Date())
                .setNum1(-1)
                .setNum2(2)
                .build();
        System.out.println(demo.toString());
    }

    /**
     * 测试num不能相等的builder校验
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumSameError() {
        BuilderDesign demo = new BuilderDesign.Builder()
                .setName("zhang")
                .setAttr1("1")
                .setAttr2("2")
                .setAttr3("3")
                .setDate1(null)
                .setDate2(new Date())
                .setNum1(2)
                .setNum2(2)
                .build();
        System.out.println(demo.toString());
    }

}
