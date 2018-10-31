package example.thread;

/**
 * 获取线程状态
 */
public class GetThreadStatus extends Thread{
    boolean waiting= true;
    boolean ready= false;

    public GetThreadStatus() {
    }

    @Override
    public void run(){
        String threadName=Thread.currentThread().getName();
        System.out.println(threadName + " 启动");
        while(waiting){
            System.out.println("等待："+waiting);
            System.out.println("等待...");
            startWait();
        }
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e+"\t\t线程中断...");
        }
            System.out.println("线程结束！");
    }

    public synchronized  void  startWait(){
        try{
            while(!ready){
                wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized  void notice(){
        ready=true;
        notify();
    }

    static void showThreadStatus(Thread thrd) {
        System.out.println(thrd.getName()+" 存活:" +thrd.isAlive()+" 状态:" + thrd.getState() );
    }

    public static void main(String[] args) throws  Exception{
        GetThreadStatus thrd=new GetThreadStatus();
        thrd.setName("MyThread #1");
        showThreadStatus(thrd);
        thrd.start();
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.notice();
        Thread.sleep(50);
        showThreadStatus(thrd);
        while(thrd.isAlive()) {
            System.out.println("存活状态");
        }
        showThreadStatus(thrd);
    }
}
