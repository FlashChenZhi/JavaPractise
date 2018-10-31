package example.assemble;

import java.util.*;

/**
 *  List 循环移动元素
 *  使用 Collections 类的 rotate() 来循环移动元素，方法第二个参数指定了移动的起始位置
 *
 *  查询集合中最大值和最小值
 *  使用 Collections 类的 max() 和 min() 方法来获取List中最大最小值
 *
 *  Enumeration 遍历 HashTable
 *  使用 Enumeration 类的 hasMoreElements 和 nextElement 方法来遍历输出 HashTable
 */
public class ListMoveElement {
    public static void main(String[] args) {
        //循环移动元素
//        List list = Arrays.asList("one Two three Four five six".split(" "));
//        System.out.println("集合元素："+list);
//        Collections.rotate(list,3);
//        System.out.println("循环移动后："+list);
//        System.out.println("最大值: " + Collections.max(list));
//        System.out.println("最小值: " + Collections.min(list));

        //循环遍历HashTable：使用 Enumeration 遍历 HashTable
        Hashtable ht=new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        Enumeration e=ht.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement()+"\t");
        }



    }
}
