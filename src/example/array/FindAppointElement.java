package example.array;

import java.util.ArrayList;

/**
 * 查找数组中的指定元素：使用 contains () 方法来查找数组中的指定元素，返回布尔值
 */
public class FindAppointElement {
    public static void main(String[] args) {
        ArrayList objArray1 = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"元素0");
        objArray2.add(1,"元素1");
        objArray2.add(2,"元素2");
        objArray2.add(3,"元素3");
        objArray1.add(0,"元素0");
        objArray1.add(1,"元素1");
        objArray1.add(2,"元素A");
        System.out.println("array1 的元素：" +objArray1);
        System.out.println("array2 的元素：" +objArray2);
        System.out.println("array1集合中是否包含元素："+(objArray1.contains("元素A") ? "包含":"不包含"));
        System.out.println("array2集合中是否包含元素："+(objArray2.contains("元素A") ? "包含":"不包含"));
    }
}
