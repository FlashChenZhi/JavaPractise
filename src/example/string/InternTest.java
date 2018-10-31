package example.string;

public class InternTest {
    public static void main(String[] args) {
        String str="abc";
        // 第一次，创建了两个对象，一个是堆中的string对象，一个是常量池中的"abc"
        String a = new String("abc");
        // 第二次，创建一个对象，堆中的另外一个string对象
        String b = new String("abc");

        System.out.println("判断a和b 是否属于常量池中同一对象："+(a.intern()==b.intern()));
        System.out.println("判断a和b 是否属于常量池中同一对象："+(b==a.intern()));
        System.out.println("判断a和b 是否属于常量池中同一对象："+(a==b.intern()));
        System.out.println("判断字符串 str和a以及b是否属于堆中同一元素："+(str==b)+"\t\t"+(str==b)+"\t\t"+(a==b));
    }
}
