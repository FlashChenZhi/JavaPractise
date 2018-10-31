package example.thread;

/**
 * 线程ID 类 extends ThreadLocal
 */
public class ThreadID extends ThreadLocal{
    private  int nextID;

    //构造方法赋初始值
    public ThreadID() {
        nextID =10001;
    }

    //同步方法获取线程ID
    private  synchronized  Integer getNewID(){
        Integer id=new Integer(nextID);
        nextID++;
        return id;
    }

    //受保护的获取初始值方法
    protected Object  initialValue(){
        print("获取初始值");
        return getNewID();
    }

    //获取线程ID
   public int getThreadID(){
        Integer integer=(Integer) get();
        return integer.intValue();
   }

   //打印线程名称和信息的方法
   public static void print(String msg){
      String  threadname = Thread.currentThread().getName();
      System.out.println("线程名称："+threadname+"\t\t信息："+msg);

   }

}
