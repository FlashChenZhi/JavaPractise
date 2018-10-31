package back.practise.practise0814.object;

public class DerivedTest {

    public static void main(String[] args) {
//        System.out.println("============子类无参============");
        Derived no = new Derived();
//        System.out.println("============子类有参============");
        Derived have = new Derived(33);
//        System.out.println("============子类有参============");
        Derived have2 = new Derived(33, 55);
    }
}
