package back.practise.practise0814.object;


public class Animal {
    private  String name;
    private  int id;

    public Animal(String myName, int myId) {
        this.name = myName;
        this.id = myId;
    }

    public void introduction(){
        System.out.println("大家好！我是"+id+"号，我的名字叫做："+name);
    }

    public void eat(){
        System.out.println(name+"正在吃东西");
    }

    public void sleep(){
        System.out.println(name+"正在睡懒觉");
    }

//    public void move(){ System.out.println("动物在移动");}
}
