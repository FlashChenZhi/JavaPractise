package back.practise.practise0809.domain;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1=new Employee("菜鸟");
        Employee emp2=new Employee("高手");

        emp1.setSalary(6600);
        emp1.setAge(21);
        emp1.setDesignation("Web工程师");
        emp1.printEmployee();
        System.out.println("\n");
        emp2.setSalary(12580);
        emp2.setAge(26);
        emp2.setDesignation("Java工程师");
        emp2.printEmployee();

    }


}
