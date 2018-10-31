package back.practise.practise0816.course_thread;

public class ObjectA extends Thread{
    private MyObject object;

    public ObjectA(MyObject object) {
        this.object=object;
    }

    @Override
    public void run(){
        super.run();
        object.methodA();
    }

}
