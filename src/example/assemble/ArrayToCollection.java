package example.assemble;

import back.practise.practise0814.object.Animal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**     数组转集合
 * 使用 Java Util 类的 Arrays.asList(name) 方法将数组转换为集合
 *      集合转数组
 * 使用 Java Util 类的 list.add() 和 list.toArray() 方法将集合转为数组
 */
public class ArrayToCollection {
    public static void main(String[] args) throws IOException{
            //数组转集合
//            int n=5;
//            String[] name=new String[n];
//            for(int i=0;i<n;i++){
//               name[i]=String.valueOf(i);
//            }
//            List<String> list= Arrays.asList(name);
//            System.out.println();
//            for(String str:list){
//                System.out.println("元素："+str);
//            }
        //集合转数组
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");
        String[] array=list.toArray(new String[0]);

        for(int i=0;i<array.length;i++){
            System.out.print("循环元素："+array[i]);
        }
    }
}
