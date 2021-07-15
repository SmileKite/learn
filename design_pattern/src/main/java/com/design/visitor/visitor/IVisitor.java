package com.design.visitor.visitor;

import com.design.visitor.visitable.impl.VisitableA;
import com.design.visitor.visitable.impl.VisitableB;
import com.design.visitor.visitable.impl.VisitableC;

/**
 * 访问者接口
 * @author lizhenyu
 * @date 2021/7/15
 */
public interface IVisitor {
    /**
     * 访问VisitableA
     * @param visitable 被访问者
     */
    void visit(VisitableA visitable);
    /**
     * 访问VisitableB
     * @param visitable 被访问者
     */
    void visit(VisitableB visitable);
    /**
     * 访问VisitableC
     * @param visitable 被访问者
     */
    void visit(VisitableC visitable);
}
