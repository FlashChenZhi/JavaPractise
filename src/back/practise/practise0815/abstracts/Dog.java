package back.practise.practise0815.abstracts;

public abstract class Dog  extends Animal{
    public Dog(int age) {
        super();
        System.out.println("初始化Dog");
        System.out.println("小狗的年龄："+age);
    }
}
