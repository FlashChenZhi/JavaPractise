package example.thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnLockB implements Runnable {

    @Override
    public void run() {
        try{
            System.out.println("B线程显示时间：" +new Date().toString() + " UnLockB 开始执行");
            while(true){
                if(UnLockTest.a1.tryAcquire(1,TimeUnit.SECONDS)){
                    System.out.println(new Date().toString() + " UnLockB 锁住 obj1");
                    if(UnLockTest.a2.tryAcquire(1,TimeUnit.SECONDS)){
                        System.out.println(new Date().toString() + " UnLockB 锁住 obj2");
                        Thread.sleep(60 * 1000);
                    }else{
                        System.out.println(new Date().toString() + " UnLockB 锁住 obj2 失败！");
                    }
                }else{
                        System.out.println(new Date().toString() + " UnLockB 锁住 obj1 失败！");
                }
                UnLockTest.a1.release();            //释放资源
                UnLockTest.a2.release();
                Thread.sleep(1000);     // 这里只是为了演示，所以tryAcquire只用1秒，而且B要给A让出能执行的时间，否则两个永远是死锁
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
