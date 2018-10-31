package example.assemble;

import java.util.TreeMap;

/**
 * 集合输出显示
 */
public class OutputSet {
    public static void main(String[] args) {
        TreeMap tMap = new TreeMap();
        tMap.put(1, "Sunday");
        tMap.put(2, "Monday");
        tMap.put(3, "Tuesday");
        tMap.put(4, "Wednesday");
        tMap.put(5, "Thursday");
        tMap.put(6, "Friday");
        tMap.put(7, "Saturday");
        System.out.println("TreeMap 所属键："+tMap.keySet()+"\t\t对应值："+tMap.values());
        System.out.println("键为 5 的值为：" +tMap.get(5));
        System.out.println("第1个键的键和值分别为："+tMap.firstKey()+"\t\t"+tMap.get(1));
        System.out.println("最后1个键的键和值分别是："+tMap.lastKey()+"\t\t"+tMap.get(tMap.size()));

    }

}
