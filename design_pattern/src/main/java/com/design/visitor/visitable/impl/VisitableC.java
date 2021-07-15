package com.design.visitor.visitable.impl;

import com.design.visitor.visitable.IVisitable;
import com.design.visitor.visitor.IVisitor;

/**
 * 被访问者C
 * @author lizhenyu
 * @date 2021/7/15
 */
public class VisitableC implements IVisitable {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
