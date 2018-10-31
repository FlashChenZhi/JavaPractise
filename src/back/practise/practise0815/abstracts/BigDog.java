package back.practise.practise0815.abstracts;

public class BigDog extends Dog{

    public BigDog(int age) {
        super(age);
        System.out.println("初始化BigDog");
    }

    public static void main(String[] args) {
        BigDog bg=new BigDog(20);
        bg.move();
        System.out.println("BigDog类的主方法");
    }

}
