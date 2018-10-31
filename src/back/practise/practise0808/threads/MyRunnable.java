package back.practise.practise0808.threads;

public class MyRunnable implements Runnable {
    private  volatile boolean active;

    @Override
    public void run() {
        active=true;
        while(active){
            int i=0;
            i++;
            System.out.println("显示局部变量："+i);
        }
    }

    public void stop(){
        active=false;
    }
}
