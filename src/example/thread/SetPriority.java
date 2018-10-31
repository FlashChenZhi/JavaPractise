package example.thread;

/**
 *  线程优先级设置
 *  通过setPriority() 方法来设置线程的优先级
 */
public class SetPriority extends Thread{
    private int countDown=5;
    private volatile  double d=0;

    public SetPriority(int priority) {
        setPriority(priority);
        start();
    }

    @Override
    public String toString() {
        return super.toString()+" ："+ countDown;
    }

    @Override
    public void run(){
        while(true){
            for(int i=0;i<10000;i++){
                d=d+(Math.PI+Math.E)/(double)i;
                System.out.println(this);
                if(--countDown==0){
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new SetPriority(Thread.MAX_PRIORITY);
        for(int i=0;i<5;i++){
        new SetPriority(Thread.MIN_PRIORITY);
        }
    }

}
