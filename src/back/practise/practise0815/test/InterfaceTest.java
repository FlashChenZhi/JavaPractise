package back.practise.practise0815.test;

import back.practise.practise0815.itf.Cat;
import back.practise.practise0815.itf.Dog;

public class InterfaceTest {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
        cat.sleep();

        Dog dog=new Dog();
        dog.sleep();
        dog.eat();

    }

}
