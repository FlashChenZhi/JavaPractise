package back.practise.practise0816.course_thread;

public class ListTest {
    public static void main(String[] args) {
        MyList myList=new MyList();
        ListA a=new ListA(myList);
        a.setName("A");
        a.start();
        ListB b=new ListB(myList);
        b.setName("B");
        b.start();

    }

}
