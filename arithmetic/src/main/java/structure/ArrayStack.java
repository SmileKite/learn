package structure;

/**
 * 基于数组实现的栈
 * @author lizhenyu
 * @date 2021/7/11
 */
public class ArrayStack<T> {

    /** 数组 */
    private Object[] items;
    /** 栈中元素的个数 */
    private int count;
    /** 栈大小 */
    private int size;

    public ArrayStack(int size) {
        this.items = new Object[size];
        this.size = size;
        this.count = 0;
    }

    /**
     * 获取栈大小
     * @return 栈的大小
     */
    public int size() {
        return this.size;
    }

    /**
     * 入栈操作
     * @param t 入栈元素
     * @return 操作是否成功
     */
    public boolean push(T t) {
        // 实现数组扩容，如果不支持扩容，应当返回false
        if (count == size) {
            this.size *= 2;
            Object[] temp = new Object[this.size];
            if (count >= 0) {
                System.arraycopy(items, 0, temp, 0, count);
            }
            this.items = temp;
        }
        this.items[count++] = t;
        return true;
    }

    /**
     * 出栈操作
     * @return 出栈元素
     */
    public T pop() {
        if (count == 0) {
            return null;
        }
        return (T) this.items[--count];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            builder.append(", ").append(this.items[i].toString());
        }
        return builder.append("]").toString().replaceFirst(", ", "");
    }
}
