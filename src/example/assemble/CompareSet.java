package example.assemble;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**     集合比较
 *  使用 Collection 类的 Collection.min() 和 Collection.max() 来比较集合中的元素
 */
public class CompareSet {
    public static void main(String[] args) {
        String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
        Set<String> stringSet=new TreeSet<>();
        for(int i=0;i<coins.length;i++){
            stringSet.add(coins[i]);
        }
        //获取集合中的最小值
        System.out.println("获取集合中的最小值："+Collections.min(stringSet));
        System.out.println(Collections.min(stringSet, String.CASE_INSENSITIVE_ORDER));
        for(int i=0;i<10;i++){
            System.out.print("\t*");
        }
        System.out.println("+");
        System.out.println("获取集合中的最大值："+Collections.max(stringSet));
        System.out.println(Collections.max(stringSet, String.CASE_INSENSITIVE_ORDER));


    }

}
