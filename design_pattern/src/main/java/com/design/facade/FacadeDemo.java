package com.design.facade;

/**
 * 门面模式
 * @author lizhenyu
 * @date 2021/6/27
 */
public class FacadeDemo {
    interface IFacadeOut {
        void showAddToConsole(int a, int b);
        void showDivideToDatasource(int a, int b);
        void showComplexToMail(int a, int b, int c);
    }
    static class FacadeOutImpl implements IFacadeOut {
        private final ICalculate calculate = new CalculateImpl();
        private final IShow show = new ShowImpl();
        @Override
        public void showAddToConsole(int a, int b) {
            show.showToConsole(calculate.add(a, b));
        }
        @Override
        public void showDivideToDatasource(int a, int b) {
            show.showToDatasource(calculate.divide(a, b));
        }
        @Override
        public void showComplexToMail(int a, int b, int c) {
            show.showToMail(calculate.multiply(a, calculate.subtract(b, c)));
        }
    }
    interface ICalculate {
        int add(int a, int b);
        int subtract(int a, int b);
        int multiply(int a, int b);
        int divide(int a, int b);
    }
    static class CalculateImpl implements ICalculate {
        @Override
        public int add(int a, int b) {
            return a+b;
        }
        @Override
        public int subtract(int a, int b) {
            return a-b;
        }
        @Override
        public int multiply(int a, int b) {
            return a*b;
        }
        @Override
        public int divide(int a, int b) {
            return a/b;
        }
    }
    interface IShow {
        void showToConsole(int result);
        void showToMail(int result);
        void showToDatasource(int result);
    }
    static class ShowImpl implements IShow {
        @Override
        public void showToConsole(int result) {
            System.out.println("控制台展示:"+result);
        }
        @Override
        public void showToMail(int result) {
            System.out.println("邮件展示:"+result);
        }
        @Override
        public void showToDatasource(int result) {
            System.out.println("数据库展示:"+result);
        }
    }
}
