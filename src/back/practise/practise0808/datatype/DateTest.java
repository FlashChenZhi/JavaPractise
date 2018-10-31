package back.practise.practise0808.datatype;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        //获取日期对象
        Date date=new Date();
        //如果希望得到YYYYMMDD的格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //字符串接收日期时间
        String str=sdf.format(date);
        System.out.println("当前日期时间："+str);
        //通过Date对象分别获取时间
        System.out.println(date.getHours()+"时："+date.getMinutes()+"分："+date.getSeconds()+"秒");

    }
}
