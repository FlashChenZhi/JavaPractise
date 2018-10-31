package back.practise.practise0815.test;

import back.practise.practise0815.domain.Employee;
import back.practise.practise0815.domain.Salary;

public class VirtualDemo {

    public static void main(String[] args) {
        Salary salary=new Salary("中国移动","北京市朝阳区",10086,200000);
        Employee employee=new Salary("中国联通","北京市中关村",10010,350000);
        System.out.println("调用Salary类的方法：");
        salary.mailCheck();
        System.out.println("\n调用Employee类的方法：");
        employee.mailCheck();
    }

}
