package com.design.di.frame.define;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * bean定义实体
 * @author lizhenyu
 * @date 2021/6/14
 */
@ToString
public class BeanDefinition {
    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;

    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public String getId() {
        return id;
    }
    public String getClassName() {
        return className;
    }
    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }
    public void setConstructorArgs(List<ConstructorArg> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }
    public boolean isSingleton() {
        return Scope.SINGLETON.equals(this.scope);
    }
    public boolean isLazyInit() {
        return lazyInit;
    }
    public void setScope(Scope scope) {
        this.scope = scope;
    }
    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public static enum Scope {
        /** 单例 */
        SINGLETON,
        /** 非单例 */
        PROTOTYPE;
    }

    public static class ConstructorArg {
        private boolean isRef;
        private Class type;
        private Object arg;
        public ConstructorArg(Builder build) {
            this.isRef = build.isRef;
            this.type = build.type;
            this.arg = build.arg;
        }
        public boolean isRef() {
            return isRef;
        }
        public Class getType() {
            return type;
        }
        public Object getArg() {
            return arg;
        }
        public static class Builder {
            private boolean isRef;
            private Class type;
            private Object arg;
            public Builder setRef(boolean isRef) {
                this.isRef = isRef;
                return this;
            }
            public Builder setType(Class type) {
                this.type = type;
                return this;
            }
            public Builder setArg(Object arg) {
                this.arg = arg;
                return this;
            }
            public ConstructorArg build() {
                if (this.isRef) {
                    if (this.type != null) {
                        throw new IllegalArgumentException("引用类型不需要设置type");
                    }
                    if (!(this.arg instanceof String)) {
                        throw new IllegalArgumentException("请设置引用id");
                    }
                } else if (this.type == null || this.arg == null) {
                    throw new IllegalArgumentException("参数为非引用类型时，type与arg都为必输项");
                }
                return new ConstructorArg(this);
            }
        }
    }
}
