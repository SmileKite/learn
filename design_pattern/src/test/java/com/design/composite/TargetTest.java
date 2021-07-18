package com.design.composite;

import org.junit.Test;

/**
 * 组合模式测试
 * @author lizhenyu
 * @date 2021/6/27
 */
public class TargetTest {

    /**
     * 测试组合模式
     */
    @Test
    public void testComposite() {
        CompositeTarget com1 = new CompositeTarget();
        BaseTarget base1 = new BaseTarget(5);
        BaseTarget base2 = new BaseTarget(15);
        CompositeTarget com2 = new CompositeTarget();
        BaseTarget base3 = new BaseTarget(2);
        BaseTarget base4 = new BaseTarget(6);
        com2.add(base3);
        com2.add(base4);
        com1.add(base1);
        com1.add(base2);
        com1.add(com2);

        System.out.println("count="+com1.count());
        System.out.println("size="+com1.size());
    }
}
