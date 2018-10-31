package example.dataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 *  1.获取向量元素的索引值
 *    使用 Collections 类的 sort() 方法对向量进行排序并使用 binarySearch() 方法来获取向量元素的索引值
 *  2.获取向量的最大元素
 *  使用 Vector 类的 v.add() 方法及 Collection 类的 Collections.max() 来获取向量的最大元素
 *  3.旋转向量
 *  使用 swap() 函数来旋转向量
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("M");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        v.add("F");
        Collections.sort(v);        //排序
        System.out.println(v);
        int index=Collections.binarySearch(v,"F");
        System.out.println(" 获取向量元素M 的索引值为："+index);

        Object object= Collections.max(v);
        System.out.println("获取向量的最大元素："+object);

        //旋转向量：将首尾元素调换
        Collections.swap(v,0,5);
        System.out.println("旋转后的向量元素："+v);

    }


}
