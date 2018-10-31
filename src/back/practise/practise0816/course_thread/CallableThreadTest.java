package back.practise.practise0816.course_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThreadTest implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i=0;
        for(;i<100;i++){
            System.out.println("当前线程名称："+Thread.currentThread().getName()+"\t循环元素值："+i);
        }
        return i;
    }

    public static void main(String[] args) {
        CallableThreadTest ctt=new CallableThreadTest();
        FutureTask ft=new FutureTask(ctt);
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" 线程循环变量"+i+"元素的值："+i);
            if(i==20){
               new Thread(ft,"有返回值的线程").start();
            }
        }
        try{
            System.out.println("子线程的返回值："+ft.get());
        }catch (InterruptedException  e){
                e.printStackTrace();
        }catch (ExecutionException e){
                e.printStackTrace();
        }

    }
}