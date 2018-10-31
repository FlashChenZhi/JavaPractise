package back.practise.practise0816.course_thread;

public class GuessANumber extends Thread{
    private int number;
    private  String name;

    public GuessANumber(String name, int number) {
        this.number = number;
        this.name=name;
    }
    @Override
    public void run(){
        int counter=0;
        int guess=0;
        do{
            guess= (int) (Math.random()*100+1);
            System.out.println(this.getName()+"<<<"+"随机数："+guess);
            counter++;
        }while(guess<=99);
        System.out.println(this.getName()+"出现的随机数有："+guess+"\t 所有数字共出现"+counter+" 次！");
    }

}
