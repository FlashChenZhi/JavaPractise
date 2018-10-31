package back.practise.practise0810.test;

/**
 * Number & Math 类方法
 *  1.xxxValue()： 将 Number 对象转换为xxx数据类型的值并返回
 *  2.compareTo()：将number对象与参数比较
 *  3.equals()：   判断number对象是否与参数相等
 *  4.valueOf()：  返回一个 Number 对象指定的内置数据类型
 *  5.toString()： 以字符串形式返回值
 *  6.parseInt()： 将字符串解析为int类型
 *  7.abs()：      返回参数的绝对值
 *  8.ceil()：     返回大于等于( >= )给定参数的的最小整数
 *  9. 	floor()：  返回小于等于（<=）给定参数的最大整数
 *  10. rint()：   返回与参数最接近的整数。返回类型为double
 *  11.round()：   它表示四舍五入，算法为 Math.floor(x+0.5)，即将原来的数字加上 0.5 后再向下取整
 *  12. pow()：    返回第一个参数的第二个参数次方
 *  13.sqrt()：    求参数的算术平方根
 *  14.toDegrees():将参数转化为角度
 *  15.toRadians():将角度转换为弧度
 *  16.random()：  返回一个随机数
 */
public class Incasement {
    public static void main(String[] args) {
//        Integer i=12;
//        i=i+1;
//        System.out.println(i);

//        System.out.println("90°正弦值："+Math.sin(Math.PI/2));
//        System.out.println("60°正弦值："+Math.tan(Math.PI/3));
//        System.out.println("0°余弦值："+Math.cos(0));
//
//        System.out.println("1的反正切值： " + Math.atan(1));
//        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
//        System.out.println("π的值："+Math.PI);

        double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
        for(double num:nums){
            System.out.println(" 返回小于等于（<=）给定参数的最大整数(" + num + ")=" + Math.floor(num));
            System.out.println("返回大于等于( >= )给定参数的的最小整数(" + num + ")=" + Math.ceil(num));
            System.out.println("四舍五入(" + num + ")=" + Math.round(num));
            System.out.println("返回第一个参数的第二个参数次方(" + num + ")=" + Math.pow(num,2));
            System.out.println("返回参数的绝对值(" + num + ")=" + Math.abs(num));
            System.out.println("返回与参数最接近的整数(" + num + ")=" + Math.rint(num));
        }


    }
}
