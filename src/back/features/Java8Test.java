package back.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Test {

    //Java7集合排序的方法
    public static void sortUsingJava7(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    //Java8集合排序的方法
    public static void sortUsingJava8(List<String> list){
        Collections.sort(list,(s1,s2)->s1.compareTo(s2));
    }

    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("Runoob");
        list1.add("Google");
        list1.add("Alibaba");
        list1.add("Tencent");
        list1.add("Baidu ");
        list1.add("Sina ");

        List<String> list2=new ArrayList<>();
        list2.add("Runoob");
        list2.add("Google");
        list2.add("Alibaba");
        list2.add("Tencent");
        list2.add("Baidu ");
        list2.add("Sina ");

        Java8Test j8t=new Java8Test();
        System.out.println("使用Java7集合排序方法：");
        j8t.sortUsingJava7(list1);
        System.out.println(list1);

        System.out.println("使用Java8集合排序方法：");
//        j8t.sortUsingJava8(list2);
        Java8Test.sortUsingJava8(list2);
        System.out.println(list2);
    }

}
