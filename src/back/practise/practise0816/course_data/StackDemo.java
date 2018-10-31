package back.practise.practise0816.course_data;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

    public static void showpush(Stack<Integer> st, int a){
        st.push(new Integer(a));
        System.out.println("向栈中压入元素："+a);
        System.out.println("当前栈："+st);
    }

    public static void showpop(Stack<Integer> st){
        Integer a=st.pop();
        System.out.println("从栈中取出元素："+a);
//        System.out.println("当前栈："+st);
    }

    public static void main(String[] args) {
        try {
            Stack<Integer> st=new Stack<>();
            showpush(st,12);
            showpush(st,18);
            showpush(st,36);
            showpush(st,20);
            showpush(st,25);

            showpop(st);
            showpop(st);
//            showpop(st);
//            showpop(st);
//            showpop(st);
//            showpop(st);
            System.out.println("栈中剩余元素："+st);
        } catch (EmptyStackException e) {
            System.out.println("发生空栈异常！");
            e.printStackTrace();
        }
    }

}
