package back.practise.practise0816.course_setframe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 遍历ArrayList的三种不同方法
 *  1. 加强for循环遍历ArrayList集合
 *  2. 将链表变为数组相关的内容进行遍历
 *  3. 使用迭代器进行相关遍历
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Flash");
        list.add("Alex");
        list.add("Chen");
        System.out.println("list集合长度为："+list.size());

        //1.加强for循环遍历ArrayList集合
//        for(String str:list){
//            System.out.println("循环集合显示元素："+str);
//        }

        //2.将链表变为数组相关的内容进行遍历
        String [] array=new String[list.size()];
        list.toArray(array);
        //第1种写法：
//        for(int i=0;i<array.length;i++){
//            System.out.println("循环数组获取变量(第1种写法)："+array[i]);
//        }
        //第2种写法：
        for(String str:array){
            System.out.println("循环数组获取元素(第2种写法)："+str);
        }

        //3.使用迭代器进行相关遍历
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String str=iterator.next();
            System.out.println("迭代器获取元素："+str);
        }

    }


}
