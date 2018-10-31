package example.thread;

/**
 *  死锁及解决方案
 */
public class LockTest {
    public static String obj1="obj1";
    public static String obj2="obj2";
    public static String obj3="obj3";

    public static void main(String[] args) {
        LockA a=new LockA();
        new Thread(a).start();

        LockB b=new LockB();
        new Thread(b).start();

    }

}
