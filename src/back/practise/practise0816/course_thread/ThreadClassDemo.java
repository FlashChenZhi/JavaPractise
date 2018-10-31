package back.practise.practise0816.course_thread;

public class ThreadClassDemo {

    public static void main(String[] args) {
        Runnable runnable=new DisplayMessage("Hello");
        Thread   thread1  =new Thread(runnable);
        thread1.setDaemon(true);
        thread1.setName("你好");
        System.out.println("开启"+thread1.getName()+" 线程>>>");
        thread1.start();

        Runnable bye=new DisplayMessage("Goodbye");
        Thread   thread2=new Thread(bye);
        thread2.setDaemon(true);
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("开启 线程2 😀");
        thread2.start();

        System.out.println("开启线程：GuessANumber");
        Thread thread3=new GuessANumber("我爱你",520);
        thread3.setName("I-Love-You");
        thread3.start();


    }

}
