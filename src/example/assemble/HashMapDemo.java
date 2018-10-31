package example.assemble;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * HashMap循环遍历
 * 使用 Collection 类的 iterator() 方法来遍历集合
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap< String, String> hMap = new HashMap< String, String>();
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");
        Collection collection=hMap.values();
        Iterator iterator=collection.iterator();
        while(iterator.hasNext()){
            System.out.println("循环元素："+iterator.next());
        }


    }

}
