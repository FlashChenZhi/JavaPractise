package example.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  队列的用法
 *  获取首元素的方法：queue.poll() / queue.element() /  queue.peek()
 */
public class QueueTest {
    public static void main(String[] args) {
        //add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<String> queue=new LinkedList<>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q:queue){
            System.out.println("输出元素："+q);
        }
        System.out.println("===");
        //返回第一个元素，并在队列中删除
        System.out.println("//返回首元素并删除："+queue.poll());
        for(String s:queue){
            System.out.println("删除首元素之后显示："+s);
        }
        System.out.println("===");
        System.out.println("返回第一个元素 ："+queue.element());
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }
    }


}
