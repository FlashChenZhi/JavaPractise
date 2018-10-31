package back.practise.practise0816.course_thread;

public class MyObjectTest {

    public static void main(String[] args) {
        MyObject object = new MyObject();

        //线程A与线程B 持有的是同一个对象:object
        ObjectA threadA=new ObjectA(object);
        ObjectB threadB=new ObjectB(object);
        threadA.start();
        threadB.start();
    }

}
