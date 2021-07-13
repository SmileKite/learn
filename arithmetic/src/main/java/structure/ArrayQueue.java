package structure;

/**
 * 基于数组实现的队列
 * @author lizhenyu
 * @date 2021/7/12
 */
public class ArrayQueue<T> {

    /** 数组 */
    private Object[] items;
    /** 队列头下标 */
    private int head;
    /** 队列尾下标*/
    private int tail;
    /** 栈大小 */
    private int size;

    public ArrayQueue(int size) {
        this.size = size;
        this.items = new Object[this.size];
    }

    /**
     * 入队操作
     * @param t 入队元素
     * @return 操作是否成功
     */
    public boolean enqueue(T t) {
        // 队列已满
        if (tail == size) {
            if (head == 0) {
                return false;
            }
            for (int i = head; i < size; i++) {
                items[i-head] = items[i];
            }
            tail -= head;
            head = 0;
        }
        items[tail++] = t;
        return true;
    }

    /**
     * 出队操作
     * @return 出队元素
     */
    public T dequeue() {
        // 队列已空
        if (head == tail) {
            return null;
        }
        return (T) items[head++];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = head; i < tail; i++) {
            builder.append(", ").append(this.items[i].toString());
        }
        return builder.append("]").toString().replaceFirst(", ", "");
    }
}
