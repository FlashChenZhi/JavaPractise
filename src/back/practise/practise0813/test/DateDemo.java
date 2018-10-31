package back.practise.practise0813.test;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        Date date=new Date();
        // 使用 toString() 函数显示日期时间
//        System.out.println(date);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(sdf.format(date)+"\t"+ft.format(date));
        //输出所有信息(星期/月份/日期时间/时段/时区)
//        System.out.printf("全部日期和时间信息：%tc%n",date);
//        System.out.printf("年-月-日格式：%tF%n",date);
//        System.out.printf("月/日/年格式：%tD%n",date);
//        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
//        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
//        System.out.printf("HH:MM格式（24时制）：%tR",date);
        // 使用toString()显示日期和时间
        //索引必须紧跟在%后面，而且必须以$结束
        System.out.printf("%1$s %2$tB %2$td, %2$tY","当前日期：", date);
        System.out.printf("\n");
        // 显示格式化时间
        //使用 < 标志,它表明先前被格式化的参数要被再次使用
        System.out.printf("%s %tB %<te, %<tY", "当前日期：", date);

        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String input=args.length==0 ? "18181111" : args[0];
        System.out.println("\n输出值："+input);
        Date t;
//        try{
//                t=dateFormat.parse(input);
//                System.out.print("抓取异常："+t);
//            } catch (java.text.ParseException e) {
//            System.out.println("Unparseable using " + dateFormat);
//        }

        }

    }

