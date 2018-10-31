package example.thread;

import java.util.concurrent.Semaphore;

public class UnLockTest {
    public static String obj1="变量X";
    public static String obj2="变量Y";
    public static final Semaphore a1=new Semaphore(1);
    public static final Semaphore a2=new Semaphore(1);

    public static void main(String[] args) {
        UnLockA ua=new UnLockA();
        new Thread(ua).start();

        UnLockB ub=new UnLockB();
        new Thread(ub).start();

    }

}
