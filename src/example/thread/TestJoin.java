package example.thread;

/**
 * 测试线程Join()方法
 */
public class TestJoin extends Thread{
    @Override
    public void run(){
        //线程循环10次输出
        for(int i=1;i<=10;i++){
            System.out.println("线程第"+i+"次运行...");
        }
            System.out.println("线程运行结束！");
    }

    public static void main(String[] args) {
        System.out.println("主线程开始运行...");
        TestJoin tj=new TestJoin();
        tj.setName("Thread A");
        try{
            long startTime=System.nanoTime();       //开始运行时间
            tj.start();
            tj.join();
            long endTime=System.nanoTime();
            System.out.println("耗时"+(endTime-startTime)/1000000+" 毫秒");

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("主线程运行结束!!!");
    }

}
