package example.dataStructure;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.LinkedList;

/**
 *  1.在链表（LinkedList）的开头和结尾添加元素
 *  2.获取链表（LinkedList）的第一个和最后一个元素
 *  3.删除链表中的元素：使用 clear() 方法来删除链表中的元素
 *  4.获取链表的元素：使用 top() 和 pop() 方法来获取链表的元素
 *  5.链表元素查找：使用 linkedlistname.indexof(element) 和 linkedlistname.Lastindexof(elementname) 方法在链表中获取元素第一次和最后一次出现的位置
 *  6.链表修改 ：使用 listname.add() 和 listname.set() 方法来修改链接中的元素
 *
 *
 */
public class LinkedListTest {
    private LinkedList list=new LinkedList();

    //向链表中压入添加元素
    public void push(Object object){
        list.addFirst(object);
    }

    //获取链表中首个元素
    public Object top(){
        return  list.getFirst();
    }

    //移出链表中的单个元素
    public Object pop(){
        return list.removeFirst();
    }


    public static void main(String[] args) {
//        LinkedList<String> linkedList=new LinkedList<String>();
//        linkedList.add("1");
//        linkedList.add("2");
//        linkedList.add("3");
//        linkedList.add("4");
//        linkedList.add("5");
//        System.out.println("第一次显示："+linkedList);
//        linkedList.addFirst("0");
//        System.out.println("添加首元素后显示："+linkedList);
//        linkedList.add("6");
//        System.out.println("再次添加后显示："+linkedList);
//
//        System.out.println("链表的第一个元素是：" +linkedList.getFirst());
//        System.out.println("链表的最后一个元素是：" + linkedList.getLast());

        //删除链表中指定位置的元素(下例：索引从0开始，直到指定位置-1结束)
//        linkedList.subList(0,4).clear();
//        System.out.println("删除指定位置元素后显示所有元素："+linkedList);

        //获取链表的元素
//        LinkedListTest llt=new LinkedListTest();
//        for(int i=0;i<10;i++) {
//            llt.push(new Integer(i));
//        }
//            System.out.println("获取链表中首个元素："+llt.top());
//            System.out.println("移出链表中单个元素1："+llt.pop());
//            System.out.println("移出链表中单个元素2："+llt.pop());
//            System.out.println("移出链表中单个元素3："+llt.pop());

        //链表元素的查找
//        LinkedList<String> linkedList=new LinkedList<String>();
//        linkedList.add("1");
//        linkedList.add("2");
//        linkedList.add("3");
//        linkedList.add("4");
//        linkedList.add("5");
//        linkedList.add("2");
//        linkedList.add("6");
//        System.out.println("元素 2 第一次出现的位置：" + linkedList.indexOf("2"));
//        System.out.println("元素 2 最后一次出现的位置："+ linkedList.lastIndexOf("2"));

        //链表修改
        LinkedList officers = new LinkedList();
        officers.add("B");
        officers.add("B");
        officers.add("T");
        officers.add("H");
        officers.add("P");
        System.out.println("链表中元素有："+officers);
        officers.set(0,"A");
        System.out.println(officers);

    }
}
