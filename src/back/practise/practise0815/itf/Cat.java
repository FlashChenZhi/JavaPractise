package back.practise.practise0815.itf;

public class Cat implements AnimalInterface {

    @Override
    public void eat() {
        System.out.println("小猫在吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("小猫在睡觉");
    }
}
