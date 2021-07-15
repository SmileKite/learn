package com.design.visitor.visitor.impl;

import com.design.visitor.visitable.impl.VisitableA;
import com.design.visitor.visitable.impl.VisitableB;
import com.design.visitor.visitable.impl.VisitableC;
import com.design.visitor.visitor.IVisitor;

/**
 * 访问者A
 * @author lizhenyu
 * @date 2021/7/15
 */
public class VisitorA implements IVisitor {
    @Override
    public void visit(VisitableA visitable) {
        System.out.println("访问者A访问被访问者A，执行相关逻辑");
    }

    @Override
    public void visit(VisitableB visitable) {
        System.out.println("访问者A访问被访问者B，执行相关逻辑");
    }

    @Override
    public void visit(VisitableC visitable) {
        System.out.println("访问者A访问被访问者C，执行相关逻辑");
    }
}
