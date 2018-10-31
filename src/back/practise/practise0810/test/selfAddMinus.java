package back.practise.practise0810.test;

/**
 * 前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算
 * 后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算
 */
public class selfAddMinus {

    public static void main(String[] args) {
//        int a = 3;//定义一个变量；
//        int b = ++a;//自增运算
//        int c = 3;
//        a=c++;
//        int d = --c;//自减运算
//        System.out.println("b 进行自增运算后的值等于"+b);
//        System.out.println("d 进行自减运算后的值等于"+d);

/*        int a = 5;//定义一个变量；
        int b = 5;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("自增运算符前缀运算后 a="+a+", x="+x);
        System.out.println("自增运算符后缀运算后 b="+b+", y="+y);
*/

        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b) );    //false
        System.out.println("a != b = " + (a != b) );    //true
        System.out.println("a > b = " + (a > b) );      //false
        System.out.println("a < b = " + (a < b) );      //true
        System.out.println("b >= a = " + (b >= a) );    //true
        System.out.println("b <= a = " + (b <= a) );    //false
    }
}
