package com.design.composite;

import org.junit.Test;

/**
 * 组合模式测试
 * @author lizhenyu
 * @date 2021/6/27
 */
public class CompositeTest {

    /**
     * 测试组合模式
     */
    @Test
    public void testComposite() {
        CompositeDemo.ParComposite root = new CompositeDemo.ParComposite();

        CompositeDemo.ParComposite par1 = new CompositeDemo.ParComposite();
        CompositeDemo.SubComposite sub1 = new CompositeDemo.SubComposite(15);
        CompositeDemo.SubComposite sub2 = new CompositeDemo.SubComposite(5);
        par1.addComposite(sub1);
        par1.addComposite(sub2);

        CompositeDemo.ParComposite par2 = new CompositeDemo.ParComposite();
        CompositeDemo.SubComposite sub3 = new CompositeDemo.SubComposite(1);
        CompositeDemo.SubComposite sub4 = new CompositeDemo.SubComposite(21);
        par2.addComposite(sub3);
        par2.addComposite(sub4);

        CompositeDemo.SubComposite sub5 = new CompositeDemo.SubComposite(11);
        root.addComposite(par1);
        root.addComposite(par2);
        root.addComposite(sub5);

        System.out.println(root.count()+":"+ root.sum());
    }
}
