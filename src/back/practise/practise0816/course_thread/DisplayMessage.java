package back.practise.practise0816.course_thread;

public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        do{
            System.out.println("信息："+message);
        }while(false);
    }

}
