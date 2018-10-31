package back.practise.practise0809.domain;

public class StaticTest {
    private static int staticInt=2;
    private int  random=2;

    public StaticTest() {
        staticInt++;
        random++;
        System.out.println("静态值："+staticInt+"\t随机值："+random);
    }

    public static void main(String[] args) {
        StaticTest st1=new StaticTest();
        StaticTest st2=new StaticTest();
        System.out.println("对象st1"+st1.random+st1.staticInt+"\n对象st2"+st2.random+st2.staticInt);

    }



}
