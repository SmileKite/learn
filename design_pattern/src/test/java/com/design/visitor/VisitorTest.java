package com.design.visitor;

import org.junit.Test;

/**
 * 访问者模式测试类
 * @author lizhenyu
 * @date 2021/7/15
 */
public class VisitorTest {

    /**
     * 测试访问者模式
     */
    @Test
    public void testVisitor() {
        VisitorDemo.IVisitable visitableA = new VisitorDemo.VisitableA();
        VisitorDemo.IVisitable visitableB = new VisitorDemo.VisitableB();
        VisitorDemo.IVisitable visitableC = new VisitorDemo.VisitableC();

        visitableA.accept(new VisitorDemo.VisitorA());
        visitableA.accept(new VisitorDemo.VisitorB());
        visitableB.accept(new VisitorDemo.VisitorA());
        visitableC.accept(new VisitorDemo.VisitorB());
    }
}
