package example.thread;

/**
 * CubbyHole 类：生产者和消费者在同一时间段内共用同一个存储空间，类似于商场里面的货架
 */
public class CubbyHole {
    private int contents;
    private boolean available=false;

    //同步方法
    public synchronized  int get(){
        while(available==false){
            try{
                wait();
            }catch (InterruptedException  e){
                e.printStackTrace();
            }
        }
        available=false;
        notifyAll();
        return contents;
    }

    public synchronized  void put(int value){
        while(available==true){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        contents=value;
        available=true;
        notifyAll();
    }

}
