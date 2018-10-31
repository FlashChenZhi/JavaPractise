package back.practise.practise0815.itf;

public class Dog implements  AnimalInterface{
    @Override
    public void eat() {
        System.out.println("小狗在啃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("小狗在午休");
    }
}
