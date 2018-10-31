package back.practise.practise0815.abstracts;

public abstract class Animal {
    private int age=10;

    public Animal(){
        System.out.println("初始化Animal");
    }

//    public Animal(int age){
//        System.out.println("超类的变量："+age);
//    }

    public void move(){
        System.out.println("跑步数："+this.age);
    }

}
