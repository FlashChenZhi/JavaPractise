package back.practise.practise0814.object;

public class SubClass extends SuperClass {
    private int n;

    SubClass() {
        super(3000);
        System.out.println("子类继承父类无参构造器");
    }

    public SubClass(int n) {
        System.out.println("子类有参构造器");
        this.n = n;
    }

}
