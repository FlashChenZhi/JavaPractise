package back.practise.practise0814.object;

public class SuperClass {
    private int n;

    public SuperClass() {
        System.out.println("父类无参构造器");
    }

    public SuperClass(int n) {
        System.out.println("父类有参构造器");
        this.n = n;
    }

}
