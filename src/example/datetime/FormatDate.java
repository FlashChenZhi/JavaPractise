package example.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式化时间：使用 SimpleDateFormat 类的 format(date) 方法来格式化时间
 */
public class FormatDate {
    public static void main(String[] args) {
        Date date=new Date();
        String format="yyyy年MM月dd日 HH时mm分ss秒";
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("第1种格式化时间："+simpleDateFormat.format(date));
        System.out.println("第2种格式化时间："+sdf.format(date));
    }

}
