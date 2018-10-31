package example.assemble;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**   List 元素替换
 *    使用 Collections 类的 replaceAll() 来替换List中所有的指定元素
 */
public class ListReplaceAll {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four one ".split(" "));
        System.out.println("替换元素前的集合："+list);
        Collections.replaceAll(list,"one","Alex");
        System.out.println("替换元素后的集合："+list);

    }
}
