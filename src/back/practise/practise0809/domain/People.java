package back.practise.practise0809.domain;

import java.io.Serializable;

public class People implements Serializable{
    String name;
    transient  int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名="+name+"年龄="+age;
    }

}
