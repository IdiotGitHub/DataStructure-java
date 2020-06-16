import java.util.Arrays;

/**
 * @author xmj65
 */
public class ArrayQueue {
    public static void main(String[] args) {

    }
}

class ArrayQueueDemo {
    /**
     * 声明数组最大长度
     */
    public int maxSize;
    /**
     * 数组入队指针
     */
    public int rear;
    /**
     * 数组出队指针
     */
    public int front;
    /**
     * 数组
     */
    public int[] array;

    public ArrayQueueDemo(int maxSize) {
        this.maxSize = maxSize;
        this.front = -1;
        this.rear = -1;
        this.array = new int[maxSize];
    }

    /**
     * 判断队列满
     *
     * @return true 队列已满， false 队列未满
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 判断队列是否为空
     *
     * @return true 队列为空，false 队列未空
     */
    public boolean isEmpty() {
        return front == front;
    }

    public void addData(int n) throws Exception {
        //先判断是否已满
        if (isFull()) {
            throw new Exception("队列已满，无法继续入队");
        }
        rear++;
        array[rear] = n;
    }

    /**
     * 从队列去数据
     *
     * @return 取出的数据
     * @throws Exception 队列为空时的异常
     */
    public int outData() throws Exception {
        //先判断是否是空队列
        if (isEmpty()) {
            throw new Exception("队列未空，无法取出数据");
        }
        front++;
        return array[front];
    }

    /**
     * 显示队列数据
     */
    public void showQueue() {
        System.out.println(Arrays.toString(array));
    }

    /**
     * 显示队列头
     * @return 返回队列头
     * @throws Exception 队列未空时报异常
     */
    public int headQueue() throws Exception {
        if (isEmpty()) {
            throw new Exception("队列为空，无队列头");
        }
        return array[front + 1];
    }

    @Override
    public String toString() {
        return "ArrayQueueDemo{" +
                "maxSize=" + maxSize +
                ", rear=" + rear +
                ", front=" + front +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}