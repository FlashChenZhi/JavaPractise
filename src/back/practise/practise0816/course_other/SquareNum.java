package back.practise.practise0816.course_other;

import org.omg.CORBA_2_3.portable.InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**     该类用于演示Java 文档注释
 * @author      作者
 * @version     版本
 */
public class SquareNum {
    /**
     *
     * @param num
     * @return
     */
    //定义一个有返回值的方法
    public double square(double num){
        return num * num;
    }

    /**
     *
     * @return
     * @throws IOException  On input error
     * @see IOException
     */
    public int getNumber() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String  str=br.readLine();
        return  new Integer(str).intValue();
    }

    /**
     *
     * @param args
     * @throws IOException
     * @see   IOException
     */
    public static void main(String[] args) throws IOException {
        SquareNum sn=new SquareNum();
        double d=6.0;
        d=sn.getNumber();
        System.out.println("显示输出值："+d);
        d=sn.square(d);
        System.out.println("求平方值："+d);
    }
}
