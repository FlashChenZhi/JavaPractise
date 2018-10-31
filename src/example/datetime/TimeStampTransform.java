package example.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间戳转换：使用 SimpleDateFormat 类的 format() 方法将时间戳转换成时间
 */
public class TimeStampTransform {
    public static void main(String[] args) {
        long timestamp=System.currentTimeMillis();      //获取当前时间戳
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=sdf.format(timestamp);
        String currentTime=sdf.format(new Date(timestamp));
        String today=sdf.format(Long.parseLong(String.valueOf(timestamp)));
        String datetime=sdf.format(new Date(Long.parseLong(String.valueOf(timestamp))));

        System.out.println("1.当前时间(直接格式化)："+str);
        System.out.println("2.当前时间(实例化Date)："+currentTime);
        System.out.println("3.当前时间(long转String再转Long)："+today);
        System.out.println("4.当前时间(同上)："+datetime);
    }
}
