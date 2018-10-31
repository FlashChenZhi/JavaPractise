package back.practise.practise0816.course_thread;

public class RunnableDemo implements Runnable {
    private Thread thread;
    private String threadName;

    public RunnableDemo(String name) {
        this.threadName = name;
        System.out.println("创建线程："+name);
    }

    @Override
    public void run() {
        System.out.println("运行线程："+threadName);
        try{
            for(int i=0;i<10;i++){
                if(i<5){
                    Thread.sleep(3000);
                }
                System.out.println(threadName+"--元素："+i);
            }

        }catch (InterruptedException  i){
            System.out.println("Interrupted "+threadName+" Exception ");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start(){
        System.out.println("开启"+threadName+"线程");
        if(thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}
