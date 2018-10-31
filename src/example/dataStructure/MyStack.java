package example.dataStructure;

/**
 *  栈的实现
 *  通过创建用于插入元素的自定义函数 push() 方法和用于弹出元素的 pop() 方法来实现栈
 */
public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    //构造方法
    public MyStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    //向栈中压入元素
    public void push(long j) {
        stackArray[++top] = j;
    }
    //向栈中移出元素
    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }
    //对栈中元素进行判空处理
    public boolean isEmpty() {
        return (top == -1);
    }
    //检测栈中元素是否满栈
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        MyStack theStack = new MyStack(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print("移出元素："+value);
            System.out.print("\t");
        }
        System.out.println("");
    }
}
