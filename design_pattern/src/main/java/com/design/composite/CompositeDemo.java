package com.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 * @author lizhenyu
 * @date 2021/6/27
 */
public class CompositeDemo {
    static abstract class AbstractComposite {
        abstract int count();
        abstract int sum();
    }
    static class ParComposite extends AbstractComposite {
        private List<AbstractComposite> composites = new ArrayList<>();
        public void addComposite(AbstractComposite composite) {
            composites.add(composite);
        }
        @Override
        int count() {
            int count = 0;
            for (AbstractComposite composite : composites) {
                count += composite.count();
            }
            return count;
        }
        @Override
        int sum() {
            int sum = 0;
            for (AbstractComposite composite : composites) {
                sum += composite.sum();
            }
            return sum;
        }
    }
    static class SubComposite extends AbstractComposite {
        private int sum;
        public SubComposite(int sum) {
            this.sum = sum;
        }
        @Override
        int count() {
            return 1;
        }
        @Override
        int sum() {
            return this.sum;
        }
    }
}
