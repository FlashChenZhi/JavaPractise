package example.thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnLockA implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println("A线程显示时间：" +new Date().toString()+" UnLockA 开始执行");
            while(true){
                if(UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)){
                    System.out.println(new Date().toString() + " UnLockA 锁住 obj1");
                    if(UnLockTest.a2.tryAcquire(1,TimeUnit.SECONDS)){
                        System.out.println(new Date().toString() + " UnLockA 锁住 obj2");
                        Thread.sleep(60 * 1000); // do something
                    }else{
                        System.out.println(new Date().toString() + " UnLockA 锁 obj2 失败");
                    }
                }else{
                    System.out.println(new Date().toString() + "UnLockA 锁 obj1 失败");
                }
                UnLockTest.a1.release();         // 释放
                UnLockTest.a2.release();
                Thread.sleep(1000);      //马上进行尝试，现实情况下do something是不确定的
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
