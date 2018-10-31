package example.array;

import java.util.*;

/**
 * 数组获取最大值和最小值
 *      通过Collections.max() 和 Collections.min() 方法来查找数组中的最大和最小值
 */
public class SizeValue {
    public static void main(String[] args) {
        Integer[] number={16,25,20,18,36,12,58,72,60,86,90,68};
        int min=Collections.min(Arrays.asList(number));
        int max=Collections.max(Arrays.asList(number));

        System.out.println("该数组中最大值为："+max);
        System.out.println("该数组中最小值为："+min);

    }

    //Collections.min(）参数要求含有迭代器方法的集合
    public static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll) {
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (next.compareTo(candidate) < 0)
                candidate = next;
        }
        return candidate;
    }

}
