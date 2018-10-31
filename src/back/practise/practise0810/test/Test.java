package back.practise.practise0810.test;

/**
 * 位运算符
 *  &    如果相对应位都是1，则结果为1，否则为0
 * |     如果相对应位都是0，则结果为0，否则为1
 * ^     如果相对应位值相同，则结果为0，否则为1
 * ~     按位取反运算符翻转操作数的每一位，即0变成1，1变成0
 *<<     按位左移运算符。左操作数按位左移右操作数指定的位数
 *>>     按位右移运算符。左操作数按位右移右操作数指定的位数
 *>>>    按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充
 *
 * 步骤1：先将变量值转换成二进制数据
 * 步骤2：将二进制数据，根据运算符按位比对
 * 步骤3：得到新的二进制数据后转换成十进制数据
 *
 */
public class Test {
    public static void main(String[] args) {

        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b;       /*  00001100=1*2^2+1*2^3=12  */
        System.out.println("a & b = " + c );

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );


        boolean i = true;
        boolean j = false;
        System.out.println("i && i = " + (i&&j));
        System.out.println("i || j = " + (i||j) );
        System.out.println("!(i && j) = " + !(i && j));
    }

}
