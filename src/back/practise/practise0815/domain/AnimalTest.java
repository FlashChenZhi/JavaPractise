package back.practise.practise0815.domain;

public class AnimalTest {

    public static void main(String[] args) {
            show(new Cat());
            show(new Dog());
            Animal animal=new Cat();    // 向上转型
            animal.eat();
            Dog dog= new Dog();
            dog.work();
    }

    public static void show(Animal animal){
        animal.eat();
        if(animal instanceof Dog){
            Dog dog= (Dog) animal;
            dog.work();
        }else if(animal instanceof  Cat){
            Cat cat=(Cat) animal;
            cat.work();
        }else{

        }
    }


}
