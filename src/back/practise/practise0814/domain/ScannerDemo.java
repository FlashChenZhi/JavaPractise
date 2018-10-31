package back.practise.practise0814.domain;

import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * next() 与 nextLine() 区别
 *  next()
 * 1、一定要读取到有效字符后才可以结束输入
 * 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉
 * 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符
 * 4、next() 不能得到带有空格的字符串
 * nextLine()
 * 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符
 * 2、可以获得空白
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //1. next方式接收字符串
//        System.out.println("next方式接收：");
//        if(scanner.hasNext()){
//            String str=scanner.next();
//            System.out.println("输出的数据为："+str);
//        }
        //2. nextLine方式接收字符串
//        System.out.println("nextLine方式接收：");
//        if(scanner.hasNextLine()){
//            String s=scanner.nextLine();
//            System.out.println("获取字符串为："+s);
//        }
//            scanner.close();

        //3. 判断输入数据类型
//        int i=0;
//        float f=0.0f;
//        String s=null;
//        System.out.println("请您输入数据：");
//        if(scanner.hasNextInt()){
//            i=scanner.nextInt();
//            System.out.println("获取整型数据："+i);
//        }else if(scanner.hasNextFloat()){
//            f=scanner.nextFloat();
//            System.out.println("获取浮点型数据："+f);
//        }else{
//            s=scanner.nextLine();
//            System.out.println("获取字符串数据："+s);
//        }
//        scanner.close();

        //4. 求所有数据之和与平均数
//        double sum = 0;
//        int m = 0;
//        System.out.println("请输入需要计算的数据 (回车继续,非数字键退出)：");
//        while(scanner.hasNextDouble()){
//            double i=scanner.nextDouble();
//            m=m+1;
//            sum=sum+i;
//        }
//        System.out.println("求和个数为："+m);
//        System.out.println("所有数字总和为："+sum);
//        System.out.println("所有数字平均数为："+sum/m);
//        scanner.close();

        //5. Scanner类不适合从控制台读取密码
        //安全起见，返回的密码存放在一维字符数组中，而非字符串中；在对密码进行处理之后，马上用一个填充值覆盖数组元素
        Console console=System.console();
//        String userName=console.readLine("用户名：");
//        char [] chs=console.readPassword("密码：");


    }

}
