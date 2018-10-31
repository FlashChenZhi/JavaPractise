package back.practise.practise0816.course_setframe;

import java.util.HashMap;
import java.util.Map;

/** 遍历Map集合的四种不同方法
 *  1.普遍使用，二次取值：使用Map.keySet遍历Key和Value
 *  2.使用迭代器遍历：通过Map.entrySet使用iterator遍历key和value
 *  3.通过Map.entrySet遍历：推荐使用，特别适合数据量大的情况下
 *  4.通过Map.values()遍历：可获取所有Map中的值  (不能遍历键Key)
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("ZS","张三");
        map.put("LS","李四");
        map.put("WW","王五");
        map.put("ZL","赵六");
        map.put("TQ","田七");
        map.put("XB","肖八");

        //第一种：普遍使用，二次取值
//        System.out.println("通过Map.keySet遍历Key和Value：");
//        for(String key:map.keySet()){
//            System.out.println("所属键："+key+"\t对应值："+map.get(key));
//        }

        //第二种：使用迭代器遍历Map
//        System.out.println("使用迭代器遍历Map遍历key和value：");
//        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String,String> entry=iterator.next();
//            System.out.println("Map迭代器获取元素："+iterator.next());
//            System.out.println("Map所属键："+entry.getKey()+"\t对应值："+entry.getValue());
//        }

        //第三种：推荐Map.entrySet    （尤其是数据量大时）
        System.out.println("通过Map.entrySet遍历key和value");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("键Key："+entry.getKey()+"\t\t值Value："+entry.getValue());
        }

//        //第四种：通过Map.values()遍历所有Map中的值  (不能遍历键Key)
//        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
//        for(String str:map.values()){
//            System.out.println("循环获取Map集合所有值："+str);
//        }

    }
}
