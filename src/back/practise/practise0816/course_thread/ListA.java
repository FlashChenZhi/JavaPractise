package back.practise.practise0816.course_thread;

public class ListA  extends Thread{
    private MyList list;

    public ListA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run(){
        try{
            for(int i=0;i<6;i++){
                list.add();
                System.out.println("向list集合中循环添加元素："+i);
                System.out.println("添加了 "+(i+1)+" 个元素！");
                Thread.sleep(1000);
            }
        }catch (InterruptedException  e){
            e.printStackTrace();
        }
    }
}
