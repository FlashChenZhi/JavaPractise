package back.practise.practise0816.course_thread;

public class TestThread {
    public static void main(String[] args) {
//        RunnableDemo thread1=new RunnableDemo("线程1");
//        thread1.start();
//        RunnableDemo thread2=new RunnableDemo("线程2");
//        thread2.start();

        ThreadDemo td1=new ThreadDemo("线程A");
        td1.start();
        ThreadDemo td2=new ThreadDemo("线程B");
        td2.start();
    }

}
