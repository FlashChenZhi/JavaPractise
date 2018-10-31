package back.practise.practise0816.course_thread;

public class ObjectB extends Thread{
    private MyObject object;

    public ObjectB(MyObject object) {
        this.object=object;
    }

    @Override
    public void run(){
        super.run();
        object.methodB();
    }

}
