package example.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 数组输出
 */
public class ArrayOutput {
    public static void main(String[] args) {
        //1.普通for循环输出
//        String[] runoob=new String[3];
//        runoob[0]="www";
//        runoob[1]="runoob";
//        runoob[2]="com";
//        for(int i=0;i<runoob.length;i++) {
//            System.out.println("输出结果："+runoob[i]);
//        }
        //2.加强for循环输出
//        String[] runoobs = new String[3];
//        runoobs[0] = "菜鸟教程";
//        runoobs[1] = "菜鸟工具";
//        runoobs[2] = "菜鸟笔记";
//        for(String str:runoobs){
//            System.out.print(str+"\t");
//        }
        //3.数组列表进行迭代遍历  (两种不同的写法)
        List<String> list=new ArrayList<>();
        list.add("中国");
        list.add("湖南");
        list.add("长沙");
        //第一种写法
//        Iterator iterator=list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        //第二种写法
        for(Iterator<String> iterator=list.iterator();iterator.hasNext();System.out.println("显示循环元素："+iterator.next())){
        }

    }

}
