package back.practise.practise0809.domain;

public class Variable {
    /**
     * 成员变量：在类内部且方法外部定义的变量
     * 1.类变量：   被关键词static修饰的成员变量
     * 2.实例变量： 没有被关键词static修饰的成员变量
     */

    //静态变量
    static int i;
    //实例变量
    int a;

    void Test(){
        //局部变量
        int a;
    }

}
