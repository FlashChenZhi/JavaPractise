package example.thread;

/**
 * 获取所有线程
 */
public class GetAllThread extends Thread{
    public static void main(String[] args) {
        GetAllThread gt=new GetAllThread();
        gt.setName("线程");
        ThreadGroup threadGroup=Thread.currentThread().getThreadGroup();
        int count=threadGroup.activeCount();
        Thread[] threads=new Thread[count];
        threadGroup.enumerate(threads);
        for(int i=0;i<count;i++){
            System.out.println("线程号：" + i + " = " + threads[i].getName());
        }

    }
}
