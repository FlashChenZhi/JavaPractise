package example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  数组合并
 *  通过 List 类的 Arrays.toString () 方法和 List 类的 list.Addall(array1.asList(array2) 方法将两个数组合并
 */
public class ArrayMerge {
    public static void main(String[] args) {
        String [] str1={"I"};
        String [] str2={"L","O","V","E"};
        String [] str3={"Y","O","U"};

        //1.将一组数组转成集合保存到集合对象
        List list=new ArrayList(Arrays.asList(str1));
        //2.另一组或多组数组转成集合添加到上述集合对象
        list.addAll(Arrays.asList(str2));
        list.addAll(Arrays.asList(str3));
        //3.将集合对象转成数组
        Object[] obj=list.toArray();
        //4.合并后的数组转成字符串打印
        System.out.println(Arrays.toString(obj));
    }
}
