package back.practise.practise0816.course_generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TypeParameterTest {
    //第一种声明：简单，灵活性低
    public static <T extends Comparable<T>> void mySort1(List<T> list){
        Collections.sort(list);
    }

    //第二种声明：复杂，灵活性高
    public static  <T extends Comparable<? super T>> void mySort2(List<T> list){
        Collections.sort(list);
    }

    public static void main(String[] args) {
        // 创建一个 Colour List
        List<Colour> colours=new ArrayList<Colour>();
        colours.add(new Colour(36));
        colours.add(new Green(5));
        colours.add(new Red(10));

        List<Green> greens=new ArrayList<Green>();
        greens.add(new Green(5));
        greens.add(new Green(3));

        List<Red> reds=new ArrayList<Red>();
        reds.add(new Red(10));
        reds.add(new Red(8));

        // 测试  mySort1() 方法
        mySort1(colours);            //mySort1() 方法的类型参数是 <T extends Comparable<T>> ，它要求的类型参数是类型为 T 的Comparable
//        mySort1(greens);            //没有 implements Comparable<Colour> ，它只是从 Colour 继承了一个Comparable<Colour>

        // 测试  mySort2() 方法
        mySort2(colours);
        mySort2(greens);
        mySort2(reds);

    }

}
