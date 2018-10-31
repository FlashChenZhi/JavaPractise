package example.method;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * instanceof 关键词用法
 */
public class Instanceof {
    public static void main(String[] args) {
        Object obj=new ArrayList<>();
        Object object=new Fibonacci();
        displayObjectClass(obj);
        displayObjectClass(object.getClass());

    }

    public static void displayObjectClass(Object object){
        if(object instanceof Vector){
            System.out.println("这是一个Vector集合");
        }else if(object instanceof ArrayList){
            System.out.println("这是一个ArrayList集合");
        }else if(object instanceof  Class){
            System.out.println("这是一个类对象！");
        }
    }
}
