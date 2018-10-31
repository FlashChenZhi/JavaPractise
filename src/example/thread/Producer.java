package example.thread;

/**
 *  Producer 生产者类：生产者向空间里存放数据
 */
public class Producer extends Thread {
    private CubbyHole cubbyhole;
    private int number;

    public Producer(CubbyHole cubbyhole, int number) {
        this.cubbyhole = cubbyhole;
        this.number = number;
    }

    public void run() {
        int values;
        for(int i=0;i<10;i++){
            cubbyhole.put(i);
            System.out.println("生产者 #" + this.number + " put: " + i);
            try{
                sleep((int)Math.random()*100);
            }catch (InterruptedException  e){
                e.printStackTrace();
            }
        }
    }

}
