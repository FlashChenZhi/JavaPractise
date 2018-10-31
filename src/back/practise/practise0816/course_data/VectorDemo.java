package back.practise.practise0816.course_data;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //指定大小的向量，并且增量用incr指定. 增量表示向量每次增加的元素数目
        Vector vector=new Vector(3,2);
        System.out.println("此向量集合长度："+vector.size());
        System.out.println("此向量集合当前容量："+vector.capacity());
        //向集合中添加元素的方法
        vector.add(new Integer(1));
        vector.add(new Integer(2));
        vector.add(new Integer(3));
        //获取集合中当前容量
        System.out.println("第一次显示容量："+vector.capacity());
        vector.add(new Double(3.1415926));
        System.out.println("第二次显示容量："+vector.capacity());
        vector.add(new Integer(4));
        vector.add(new Integer(5));
        vector.add(new Integer(6));
        vector.add(new Float(520.1));
        vector.add(new Double(21.9999));
        System.out.println("第三次显示容量："+vector.capacity());
        //访问首位和末位元素方法
        System.out.println("集合中第1个元素："+vector.firstElement());
        System.out.println("集合中最后1个元素："+vector.lastElement());
        //查找集合中是否包含指定元素
        if(vector.contains(new Integer(3))){
            System.out.println("集合中包含元素"+3);
        }
        //将向量集合中的元素添加到枚举类中保存
        Enumeration enumeration=vector.elements();
        System.out.println();
        //测试此枚举是否包含更多的元素
        while(enumeration.hasMoreElements()){
            System.out.println("枚举类中下一个元素值："+enumeration.nextElement());
        }
    }

}
