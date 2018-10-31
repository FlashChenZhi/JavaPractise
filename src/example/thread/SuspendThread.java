package example.thread;

/**
 * 中断线程
 */
public class SuspendThread extends Object implements Runnable {
    @Override
    public void run() {
        try{
            System.out.println("即将运行work()1方法");
            work1();
            System.out.println("运行work()2方法返回");

//            System.out.println("即将运行work()2方法");
//            work2();
//            System.out.println("运行work()2方法返回");
        }catch (InterruptedException  e){
            System.out.println("线程中断work1()方法");
//            System.out.println("线程中断work2()方法");
            e.printStackTrace();
        }
        System.out.println("run()方法 - 休眠后执行");
        System.out.println("run()方法 - 正常离开");
    }

    public void work2() throws InterruptedException {
        while (true) {
            //判断当前线程是否中断
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("1 是否线程中断：" + (Thread.currentThread().isInterrupted() ? "是" : "否"));
                Thread.sleep(2000);
                System.out.println("2 线程中断" + (Thread.currentThread().isInterrupted() ? "是" : "否"));
            }
        }
    }
    public void work1() throws InterruptedException {
        while (true) {
            for (int i = 0; i < 5; i++) {
                int j = i * 2;
            }
            System.out.println("A isInterrupted()=" + Thread.currentThread().isInterrupted());
            if (Thread.interrupted()) {
                System.out.println("B isInterrupted()=" + Thread.currentThread().isInterrupted());
                throw new InterruptedException();
            }
        }
    }


    public static void main(String[] args) {
        SuspendThread st=new SuspendThread();
        Thread thread=new Thread(st);
        thread.start();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("main()方法中 - 中断其他线程");
        thread.interrupt();
        System.out.println("结束 main()方法后离开");
    }

}
