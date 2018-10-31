package back.practise.practise0816.course_thread;

public class ThreadDemo extends Thread {
    private Thread thread;
    private  String threadName;

    public ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("创建继承Thread线程："+name);
    }

    @Override
    public void run(){
        System.out.println("开始运行："+threadName);
        try{
            for(int i=0;i<10;i++){
                System.out.println(threadName+"当中的元素："+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException  e){
            System.out.println("Interrupted "+threadName+" Exception ");
            return;
        }
            System.out.println(threadName+" 运行结束！");
    }


    public void start(){
        System.out.println(threadName+"准备就绪！");
        if(thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }

}
