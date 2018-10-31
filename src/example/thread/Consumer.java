package example.thread;

/**
 *  Consumer 消费者类：消费者取用数据
 */
public class Consumer extends Thread{
    private CubbyHole cubby;
    private int number;

    public Consumer(CubbyHole cubby, int number) {
        this.cubby = cubby;
        this.number = number;
    }

    @Override
    public void run(){
        int value=0;
        for(int i=0;i<10;i++){
            value=cubby.get();
            System.out.println("消费者 #" + this.number+ " got: " + value);
        }
    }

}
