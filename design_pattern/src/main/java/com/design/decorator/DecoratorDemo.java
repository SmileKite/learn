package com.design.decorator;

/**
 * 装饰器模式
 * @author lizhenyu
 * @date 2021/6/26
 */
public class DecoratorDemo {

    abstract static class Decorator {
        abstract void say(String message);
    }

    static class RichDecorator extends Decorator {
        protected Decorator decorator;
        public RichDecorator(Decorator decorator) {
            this.decorator = decorator;
        }
        @Override
        void say(String message) {
            System.out.println(message);
        }
    }

    static class RepeatDecorator extends RichDecorator {
        private static final int count = 5;
        public RepeatDecorator(Decorator decorator) {
            super(decorator);
        }
        @Override
        public void say(String message) {
            for (int i = 0; i < count; i++) {
                decorator.say("第"+i+"次打印："+message);
            }
        }
    }

    static class SurroundDecorator extends RichDecorator {
        public SurroundDecorator(Decorator decorator) {
            super(decorator);
        }
        @Override
        public void say(String message) {
            System.out.println("开始打印===========");
            decorator.say(message);
            System.out.println("结束打印===========");
        }
    }
}
