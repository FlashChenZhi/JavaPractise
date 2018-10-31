package example.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 数组并集：使用 union ()方法来计算两个数组的并集
 */
public class ArrayUnion {
    public static void main(String[] args) {
        String[] arr1 = { "1", "2", "3" };
        String[] arr2 = { "4", "5", "6" };
        String[] union=union(arr1,arr2);
        System.out.println("并集的结果如下：");
        for(String str:union){
            System.out.print(str+"\t");
        }
    }

    //求两个字符串数组的并集，利用set的元素唯一性
    public static String[] union(String[] arr1,String[] arr2){
        Set<String> set=new HashSet<String>();
        //向Set集合中循环添加两个数组元素
        for(String str:arr1){
            set.add(str);
        }
        for(String str:arr2){
            set.add(str);
        }
        String[] result={};
        return set.toArray(result);


    }


}
