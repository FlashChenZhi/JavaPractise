package back.practise.practise0816.course_data;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties prop=new Properties();
        Set set;
        String str;
        //以键值对保存元素
        prop.put("London","England");
        prop.put("BeiJing","Chinese");
        prop.put("California","American");
        //将属性保存到集合
        set=prop.keySet();
        //创建迭代器
        Iterator iterator=set.iterator();
        int count=0;
       while(iterator.hasNext()){
            str=(String) iterator.next();
            count++;
            System.out.println("迭代循环元素"+count+"："+str+" 来自于："+prop.getProperty(str));
        }
        System.out.println();
        str=prop.getProperty("Florida","\t没找到！");
        System.out.println("元素 Florida"+str);

    }
}
