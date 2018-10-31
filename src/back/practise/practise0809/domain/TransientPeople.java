package back.practise.practise0809.domain;

import java.io.*;

public class TransientPeople {

    public static void main(String[] args) throws FileNotFoundException,ClassNotFoundException,IOException{
        People people=new People("小明",12);
        System.out.println(people);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d://people.txt"));
        oos.writeObject(people);
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d://people.txt"));
        people= (People) ois.readObject();
        System.out.println(people);
        ois.close();

    }

}
