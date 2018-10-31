package back.practise.practise0809.domain;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("职位："+designation);
        System.out.println("工资："+salary);
    }

    private static double sal;
    public static final String DEPARTMENT="程序员";

    public static void main(String[] args) {
        sal=1250.50;
        System.out.println(DEPARTMENT+"\t基本工资为："+sal+"元");
    }
}
