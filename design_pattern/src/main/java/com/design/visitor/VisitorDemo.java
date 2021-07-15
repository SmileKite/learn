package com.design.visitor;

/**
 * 访问者模式
 * @author lizhenyu
 * @date 2021/7/15
 */
public class VisitorDemo {

    interface IVisitable {
        void accept(IVisitor visitor);
    }
    static class VisitableA implements IVisitable {
        @Override
        public void accept(IVisitor visitor) {
            visitor.visit(this);
        }
    }
    static class VisitableB implements IVisitable {
        @Override
        public void accept(IVisitor visitor) {
            visitor.visit(this);
        }
    }
    static class VisitableC implements IVisitable {
        @Override
        public void accept(IVisitor visitor) {
            visitor.visit(this);
        }
    }

    interface IVisitor {
        void visit(VisitableA visitable);
        void visit(VisitableB visitable);
        void visit(VisitableC visitable);
    }
    static class VisitorA implements IVisitor {
        @Override
        public void visit(VisitableA visitable) {
            System.out.println("访问者A访问VisitableA");
        }
        @Override
        public void visit(VisitableB visitable) {
            System.out.println("访问者A访问VisitableB");
        }
        @Override
        public void visit(VisitableC visitable) {
            System.out.println("访问者A访问VisitableC");
        }
    }
    static class VisitorB implements IVisitor {
        @Override
        public void visit(VisitableA visitable) {
            System.out.println("访问者B访问VisitableA");
        }
        @Override
        public void visit(VisitableB visitable) {
            System.out.println("访问者B访问VisitableB");
        }
        @Override
        public void visit(VisitableC visitable) {
            System.out.println("访问者B访问VisitableC");
        }
    }
}
