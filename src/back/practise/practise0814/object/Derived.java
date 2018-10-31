package back.practise.practise0814.object;

public class Derived extends Base {

    public Derived() {
        System.out.println("Derived--默认构造方法");
    }

    public Derived(int c) {
        // super(); //系统会自动隐式先调用父类的无参构造函数 super(); //必须是第一行，否则不能编译
        System.out.println("Derived--有1个参数构造方法：\t" + c);
    }

    public Derived(int a,int b) {
        super(a);
        // super(); //系统会自动隐式先调用父类的无参构造函数 super(); //必须是第一行，否则不能编译
        System.out.println("Derived--有2个参数构造方法：\t" +"参数1："+a+"参数2："+b);
    }



}
