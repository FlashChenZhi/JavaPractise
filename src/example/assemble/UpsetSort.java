package example.assemble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合打乱排序：使用 Collections 类 Collections.shuffle() 方法来打乱集合元素的顺序
 */
public class UpsetSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list.add(new Integer(i));
        }
        System.out.println("打乱前:\t");
        System.out.println(list);
        for(int i=0;i<6;i++){
            System.out.println("第" + i + "次打乱：\t");
            Collections.shuffle(list);
            System.out.println(list+"\t");
        }


    }

}
