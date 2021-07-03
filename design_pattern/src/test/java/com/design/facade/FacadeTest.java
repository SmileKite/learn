package com.design.facade;

import org.junit.Test;

/**
 * 门面模式测试
 * @author lizhenyu
 * @date 2021/6/27
 */
public class FacadeTest {

    /**
     * 测试门面模式
     */
    @Test
    public void testFacade() {
        FacadeDemo.IFacadeOut out = new FacadeDemo.FacadeOutImpl();
        out.showAddToConsole(1, 5);
        out.showDivideToDatasource(9, 4);
        out.showComplexToMail(2, 5, 3);
    }
}
