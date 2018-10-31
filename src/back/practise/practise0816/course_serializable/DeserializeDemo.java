package back.practise.practise0816.course_serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        Employee emp=null;
        try {
            FileInputStream fis=new FileInputStream("D://test/tmp/abc/employee.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            emp=(Employee) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("反序列化对象成功！");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }catch (ClassNotFoundException e){
            System.out.println("Employee 类对象未找到异常");
            e.printStackTrace();
            return;
        }
        System.out.println("编号："+emp.number);
        System.out.println("姓名："+emp.name);
        System.out.println("地址："+emp.address);
        System.out.println("SSN:"+emp.SSN);
    }
}
