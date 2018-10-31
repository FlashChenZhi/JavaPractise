package example.thread;

/**
 * 查看线程优先级：使用 getThreadId() 方法获取线程id
 */
public class ShowThreadPriority extends Object{
    private static  Runnable makeRunable(){
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    Thread t=Thread.currentThread();
                    System.out.println("run()方法中的线程优先级："+t.getPriority()+"\t\t对应线程名："+t.getName());
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        System.out.println("线程中断异常"+e);
                        e.printStackTrace();
                    }
                }
            }
        };
        return runnable;
    }


    public static void main(String[] args) {
        System.out.println("main()方法中当前线程优先级："+Thread.currentThread().getPriority()+"\t\t当前线程名："+Thread.currentThread().getName());
        Thread threadA=new Thread(makeRunable(),"threadA");
        threadA.start();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("main()方法中线程A 优先级"+threadA.getPriority()+"\t\t线程A 名称："+threadA.getName());
    }
}
