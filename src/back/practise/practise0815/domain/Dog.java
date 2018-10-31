package back.practise.practise0815.domain;

public class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("吃骨头！");
    }
    void work(){
        System.out.println("看家");
    }
}
