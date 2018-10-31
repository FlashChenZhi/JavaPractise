package example.thread;

import java.util.Date;

public class LockB implements Runnable {

    @Override
    public void run() {
        try{
            System.out.println(new Date().toString() + " LockB 开始执行");
            synchronized (LockTest.obj1){
                System.out.println("元素obj1 被锁住时间："+new Date().toString() + " LockB 锁住 obj1");
                Thread.sleep(3000);
                synchronized (LockTest.obj3){
                    System.out.println("元素obj3 被锁住时间："+new Date().toString() + " LockB 锁住 obj3");
                    Thread.sleep(60 * 1000); // 为测试，占用了就不放
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
