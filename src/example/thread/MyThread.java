package example.thread;

/**
 * 线程状态检测
 * 通过继承 Thread 类并使用 currentThread.getName() 方法来监测线程的状态
 */
public class MyThread extends Thread{
    boolean waiting= true;
    boolean ready= false;

    public MyThread() {
    }

    @Override
    public void run(){
        String  threadName=Thread.currentThread().getName();
        System.out.println(threadName+"开始启动...");
        while(waiting);
        System.out.println("处于等待状态："+waiting);
        System.out.println("waiting...");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println("线程："+threadName+" 被阻断！");
        }
    }

    public synchronized void startWait(){
        try{
            while(!ready)
                wait();
        }catch (InterruptedException  e){
            System.out.println(" wait()方法被阻断！");
        }
    }
    public synchronized void notice(){
        if(ready=true){
            notify();
        }
    }

    public static void showThreadStatus(Thread thread){
        System.out.println("显示线程名称："+thread.getName()+"\t\t是否存活状态："+(thread.isAlive() ? "存活" : "死亡")+"\t\t当前状态："+thread.getState());
    }

    public static void main(String[] args)  throws Exception{
        MyThread  myThread=new MyThread();
        showThreadStatus(myThread);
        myThread.setName("FLASH");
        myThread.start();
        Thread.sleep(2800);
        System.out.println("===========================================================================================");
        showThreadStatus(myThread);
        myThread.waiting=false;
        Thread.sleep(2800);
        System.out.println("*******************************************************************************************");
        showThreadStatus(myThread);
        myThread.notice();
        Thread.sleep(2800);
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        showThreadStatus(myThread);
//        while(myThread.isAlive()){
//            System.out.println("快乐活着！");
//            showThreadStatus(myThread);
//        }

    }

}
