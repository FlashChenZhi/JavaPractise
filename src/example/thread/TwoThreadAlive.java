package example.thread;

/**
 *  查看线程是否存活
 *  通过继承 Thread 类并使用 isAlive() 方法来检测一个线程是否存活
 */
public class TwoThreadAlive extends Thread{
    @Override
    public void run(){
        //循环获取线程
        for(int i=0;i<10;i++){
            printMsg();
        }
    }

    //获取线程名称
    public void printMsg(){
        Thread thread=Thread.currentThread();
        System.out.println("当前线程名称："+thread.getName());
    }

    public static void main(String[] args) {
        TwoThreadAlive tta=new TwoThreadAlive();
        tta.setName("Thread");
        System.out.println("线程处于就绪状态前："+tta.isAlive());
        tta.start();
        System.out.println("线程处于就绪状态后："+tta.isAlive());
        for(int i=0;i<10;i++){
            tta.printMsg();
        }
        System.out.println("主方法结束后："+tta.isAlive());
    }

}
