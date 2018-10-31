package back.practise.practise0813.test;

import java.util.Date;

public class SleepDemo {

    public static void main(String[] args) {
        try {
            System.out.println(new Date()+"\n");
            Thread.sleep(3000);
            System.out.println(new Date()+"\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
