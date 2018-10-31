package example.array;

import java.util.ArrayList;

/**
 * 删除数组中的元素：使用 remove () 方法来删除数组元素
 */
public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        list.clear();
        list.add(0,"中国");
        list.add(1,"湖南省");
        list.add(2,"长沙市");
        list.add(3,"天心区");
        list.add(4,"青园");
        System.out.println("删除元素前有：");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"\t");
        }
        list.remove(4);
        System.out.println("\n删除元素后有：");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"\t");
        }

    }
}
