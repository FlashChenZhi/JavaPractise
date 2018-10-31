package example.thread;

/**
 *  获取线程id
 *  使用 getThreadId() 方法获取线程id
 */
public class GetThreadID extends Object implements  Runnable{
    private ThreadID ti;

    public GetThreadID(ThreadID ti) {
        this.ti = ti;
    }

    @Override
    public void run() {
        try{
            print("第1次打印信息："+ti.getThreadID());
            Thread.sleep(2000);
            print("第2次打印信息："+ti.getThreadID());
        }catch (InterruptedException  ie){
            ie.printStackTrace();
        }
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println("名字："+name + " 消息： " + msg);
    }


    public static void main(String[] args) {
        ThreadID ti=new ThreadID();
        GetThreadID gt=new GetThreadID(ti);
        try{
            Thread thread1=new Thread(gt,"线程一");
            thread1.start();
            Thread.sleep(500);

            Thread threadB = new Thread(gt, "线程二");
            threadB.start();
            Thread.sleep(500);

        }catch (InterruptedException  e){
            e.printStackTrace();
        }

    }

}
