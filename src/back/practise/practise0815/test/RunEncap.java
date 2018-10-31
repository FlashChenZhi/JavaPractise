package back.practise.practise0815.test;

public class RunEncap {

    public static void main(String[] args) {
        EncapTest et = new EncapTest();
        et.setName("Klose");
        et.setAge(40);
        et.setIdNum("DE10");
        System.out.println("姓名："+et.getName()+"\t"+"编号："+et.getIdNum()+"\t"+"年龄："+et.getAge());
    }


}
