package back.practise.practise0808.object;

/**
 *1.在创建一个对象的时候，至少要调用一个构造方法;
 *  构造方法的名称必须与类同名;
 *  一个类可以有多个构造方法
 *
 *  2.创建对象需要以下三步：
 *  声明：声明一个对象，包括对象名称和对象类型;
 *  实例化：使用关键字new来创建一个对象;
 *  初始化：使用new创建对象时，会调用构造方法初始化对象
 */
public class Puppy {

    public Puppy() {
    }
    public Puppy(String str) {
        System.out.println("小狗的名字是："+str);
    }
    public Puppy(int i,String str) {
    }

    public static void main(String[] args) {
        Puppy puppy=new Puppy("Tommy");
    }

}
