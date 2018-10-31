package example.thread;

import java.beans.Customizer;

/**
 * 生产者和消费者
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        CubbyHole ch=new CubbyHole();
        Producer pd=new Producer(ch,1);
        Consumer cm=new Consumer(ch,1);
        pd.start();
        cm.start();
    }

}
