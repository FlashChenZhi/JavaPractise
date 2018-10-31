package back.practise.practise0816.course_serializable;

import java.io.Serializable;

public class Employee implements Serializable {
    public  String name;
    public  int number;
    public  String address;
    public  transient int SSN;

    public void mailCheck(){
        System.out.println("显示信息--姓名："+name+"\t地址："+address);
    }



}
