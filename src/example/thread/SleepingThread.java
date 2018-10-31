package example.thread;

/**
 * 线程挂起
 */
public class SleepingThread extends Thread{
    private int countDown=5;
    private static int threadcout=0;

    //构造方法
    public SleepingThread() {
        super(" "+ ++threadcout);
        start();
    }

    @Override
    public String toString() {
        return "线程名："+getName()+" 剩余次数："+countDown;
    }

    @Override
    public void run(){
        while(true){
            System.out.println(this);
            if(--countDown==0){
                return;
            }
            try{
                sleep(1000);
            }catch (InterruptedException  e){
               throw  new  RuntimeException();
            }
        }
    }

    public static void main(String[] args)  throws InterruptedException{
            for(int i=0;i<3;i++){
                new SleepingThread().join();
                System.out.println("线程已被挂起！");
            }
    }
}
