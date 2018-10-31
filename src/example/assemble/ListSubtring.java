package example.assemble;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** 集合中元素的截取
 *  使用 Collections 类的 indexOfSubList() 和 lastIndexOfSubList() 方法
 */
public class ListSubtring {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four one ".split(" "));
        System.out.println("集合中的元素有："+list);
        List sublist=Arrays.asList("three Four".split(" "));
        System.out.println("子列表 ："+sublist);
        System.out.println("截取字符1："+(Collections.indexOfSubList(list,sublist)));
        System.out.println("截取字符2："+(Collections.lastIndexOfSubList(list,sublist)));

    }
}
