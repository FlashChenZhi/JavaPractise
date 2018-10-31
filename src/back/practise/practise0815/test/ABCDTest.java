package back.practise.practise0815.test;

import back.practise.practise0815.domain.A;
import back.practise.practise0815.domain.B;
import back.practise.practise0815.domain.C;
import back.practise.practise0815.domain.D;

public class ABCDTest {
    public static void main(String[] args) {
        A a=new A();    //父类对象A
        A b=new B();    //向上转型：对象B
        C c=new C();    //对象C
        D d=new D();    //对象D
        a.move();
        b.move();
        c.move();
        d.move();

        Object aValue=a.age;
        Object bValue=b.age;
        Object cValue=c.age;
        Object dValue=d.age;
        System.out.println(a.age+" 所属类型："+(aValue instanceof Double ? "double" : (aValue instanceof Integer ? "int" : "")));
        System.out.println(b.age+" 所属类型："+(bValue instanceof Double ? "double" : (bValue instanceof Integer ? "int" : "")));
        System.out.println(c.age+" 所属类型："+(cValue instanceof Double ? "double" : (cValue instanceof Integer ? "int" : "")));
        System.out.println(d.age+" 所属类型："+(dValue instanceof Double ? "double" : (dValue instanceof Integer ? "int" : "")));

        System.out.println("小猫的年龄是："+c.age);

    }
}
