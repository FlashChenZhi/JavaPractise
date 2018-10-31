package example.thread;

/**
 * 获取当前线程名称
 * 通过继承 Thread 类并使用 getName() 方法来获取当前线程名称
 */
public class TwoThreadGetName extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            printMsg();
        }
    }

    public void printMsg(){
        Thread thread=Thread.currentThread();
        System.out.println("线程名："+thread.getName());
    }

    public static void main(String[] args) {
        TwoThreadGetName ttg=new TwoThreadGetName();
        ttg.start();
        for(int i=0;i<10;i++){
            ttg.printMsg();
        }


    }
}
