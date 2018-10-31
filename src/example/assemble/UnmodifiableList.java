package example.assemble;

import java.util.*;

/**
 *  只读集合
 *  使用 Collection 类的 Collections.unmodifiableList() 方法来设置集合为只读：
 */
public class UnmodifiableList {
    public static void main(String[] args) throws Exception{
        List stuff= Arrays.asList(new String[]{"a","b"});
        List list=new ArrayList(stuff);
        //List集合设置只读属性
        list= Collections.unmodifiableList(list);
        try{
            list.add(0,"newValue");
        }catch (UnsupportedOperationException  e){
        }
        //Set集合设置只读属性
        Set set=new HashSet(stuff);
        set = Collections.unmodifiableSet(set);
        //Map集合设置只读属性
        Map map=new HashMap();
        map=Collections.unmodifiableMap(map);
        System.out.println("集合现在是只读");

    }

}
