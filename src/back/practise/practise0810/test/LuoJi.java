package back.practise.practise0810.test;

public class LuoJi extends Test {
    public static void main(String[] args) {
//        int a=5;
//        boolean b=(a<4) && (a++<10);
//        System.out.println("短路逻辑运算符的结果为："+b);
//        System.out.println("变量a="+a);

//        int a = 10;
//        int b = 20;
//        int c = 0;
//        c = a + b;
//        System.out.println("c = a + b = " + c );
//        c += a ;
//        System.out.println("c += a  = " + c );
//        c -= a ;
//        System.out.println("c -= a = " + c );
//        c *= a ;
//        System.out.println("c *= a = " + c );
//
//        a = 10;
//        c = 15;
//        c /= a ;
//        System.out.println("c /= a = " + c );
//        a = 10;
//        c = 15;
//        c %= a ;
//        System.out.println("c %= a  = " + c );
//        c <<= 2 ;
//        System.out.println("c <<= 2 = " + c );
//        c >>= 2 ;
//        System.out.println("c >>= 2 = " + c );
//        c >>= 2 ;
//        System.out.println("c >>= a = " + c );
//        c &= a ;
//        System.out.println("c &= 2  = " + c );
//        c ^= a ;
//        System.out.println("c ^= a   = " + c );
//        c |= a ;
//        System.out.println("c |= a   = " + c );

        int  b1;
        int j = 10;
        // 如果 j 等于 1 成立，则设置 b1 为 20，否则为 30
        b1 = (j == 1) ? 20 : 30;
        System.out.println( "Value of b is : " +  b1 );

        // 如果 j 等于 10 成立，则设置 b1 为 20，否则为 30
        b1 = (j == 10) ? 20 : 30;
        System.out.println( "Value of b is : " + b1 );

        /*  instanceof 运算符  */
        /*  如果运算符左侧变量所指的对象，是操作符右侧类或接口(class/interface)的一个对象，那么结果为真  */
        String name="Klose";
        boolean result=name instanceof String;
        System.out.println(result);

        /*  如果被比较的对象兼容于右侧类型,该运算符仍然返回true    */
        Test luoJi=new LuoJi();
        System.out.println(luoJi  instanceof  Test);


    }

}
