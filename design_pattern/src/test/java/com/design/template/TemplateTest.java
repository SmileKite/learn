package com.design.template;

import org.junit.Test;

/**
 * 模板方法测试
 * @author lizhenyu
 * @date 2021/7/3
 */
public class TemplateTest {

    /**
     * 测试模板方法
     */
    @Test
    public void testTemplate() {
        AbstractTemplate template1 = new TemplateA();
        AbstractTemplate template2 = new TemplateB();
        template1.run();
        template2.run();
    }
}
