package back.practise.practise0816.course_serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Reyan Ali";
        emp.address="Phokka Kuan, Ambehta Peer";
        emp.SSN=123456;
        emp.number=10010;
        try{
            FileOutputStream fos=new FileOutputStream("D://test/tmp/abc/employee.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.flush();
            oos.close();
            fos.close();
            System.out.println("序列化对象保存成功！");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
