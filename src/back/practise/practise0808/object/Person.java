package back.practise.practise0808.object;

public class Person {
    public static void prt(String s) {
        System.out.println(s);
    }

    public Person() {
        prt("父类·无参数构造方法： A Person ");
    }

    public Person(String name){
        prt("父类·含一个参数的构造方法： A person's name is" + name);
    }

}
