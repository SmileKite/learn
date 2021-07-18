package com.design.facade;

import com.design.facade.impl.Facade;
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
        IFacade facade = new Facade();
        facade.runA();
        System.out.println("============================");
        facade.runB();
        System.out.println("============================");
        facade.runC();
        System.out.println("============================");
    }
}
