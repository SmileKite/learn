package com.design.builder;

import java.util.Date;

/**
 * 建造者模式
 * 假设对象有以下属性：
 *      name--不可为空
 *      attr1、attr2、attr3要么都为空，要么都不为空
 *      date1、date2可为空
 *      num1、num2不能为负数，不能相等
 *      ...
 * @author lizhenyu
 * @date 2021/6/19
 */
public class BuilderDemo {

    private String name;
    private String attr1;
    private String attr2;
    private String attr3;
    private Date date1;
    private Date date2;
    private int num1;
    private int num2;
    public BuilderDemo(Builder builder) {
        this.name = builder.name;
        this.attr1 = builder.attr1;
        this.attr2 = builder.attr2;
        this.attr3 = builder.attr3;
        this.date1 = builder.date1;
        this.date1 = builder.date2;
        this.num1 = builder.num1;
        this.num2 = builder.num2;
    }

    public static class Builder {
        private String name;
        private String attr1;
        private String attr2;
        private String attr3;
        private Date date1;
        private Date date2;
        private int num1;
        private int num2;
        public BuilderDemo build() {
            boolean attr = attr1 == null && attr2 == null && attr3 == null
                    || attr1 != null && attr2 != null && attr3 != null;
            if (!attr) {
                throw new IllegalArgumentException("attr字段要么都为空，要么都不为空！");
            }
            if (num1 == num2) {
                throw new IllegalArgumentException("num1与num2不能相同！");
            }
            return new BuilderDemo(this);
        }
        public Builder setName(String name) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("名称不能为空！");
            }
            this.name = name;
            return this;
        }
        public Builder setAttr1(String attr1) {
            this.attr1 = attr1;
            return this;
        }
        public Builder setAttr2(String attr2) {
            this.attr2 = attr2;
            return this;
        }
        public Builder setAttr3(String attr3) {
            this.attr3 = attr3;
            return this;
        }
        public Builder setDate1(Date date1) {
            this.date1 = date1;
            return this;
        }
        public Builder setDate2(Date date2) {
            this.date2 = date2;
            return this;
        }
        public Builder setNum1(int num1) {
            if (num1 < 0) {
                throw new IllegalArgumentException("num1不能为负数！");
            }
            this.num1 = num1;
            return this;
        }
        public Builder setNum2(int num2) {
            if (num2 < 0) {
                throw new IllegalArgumentException("num1不能为负数！");
            }
            this.num2 = num2;
            return this;
        }
    }

}
