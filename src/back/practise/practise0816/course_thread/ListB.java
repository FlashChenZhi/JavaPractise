package back.practise.practise0816.course_thread;

public class ListB extends Thread {
    private MyList list;

    public ListB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run(){
        try {
            while(true){
                if(list.size()==5){
                    System.out.println("集合长度==5,线程准备退出！");
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException  e){
            e.printStackTrace();
        }
    }

}
