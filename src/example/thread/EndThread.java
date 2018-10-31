package example.thread;


/**
 * 终止线程：在Thread中提供了stop()方法来终止线程，但这个方法是不安全的，所以一般不建议使用
 * 使用interrupt方法来终端线程可分为两种情况：
 * 1.线程处于阻塞状态，如使用了sleep方法
 * 2.使用while（！isInterrupted（））{……}来判断线程是否被中断
 */
public class EndThread extends Thread{

    @Override
    public  void run(){
        try{
            sleep(5000);
        }catch (InterruptedException  e){
            System.out.println("中断线程信息："+e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws  Exception{
        Thread thread=new EndThread();
        thread.start();
        System.out.println("在5秒内按任意键中止线程运行！");
        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已经退出...");
    }

}
