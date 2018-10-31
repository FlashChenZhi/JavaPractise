package example.datetime;

import java.util.Calendar;

/**
 * 获取年份/月份等：使用 Calendar 类来输出年份、月份等
 */
public class GetCalendar {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);           //获取当前年份
        int month=calendar.get(Calendar.MONTH)+1;       //获取当前月份( 从0开始，需要+1 )
        int day=calendar.get(Calendar.DATE);            //获取当前号
        int dow=calendar.get(Calendar.DAY_OF_WEEK);     //当前为一周的第几天
        int dom=calendar.get(Calendar.DAY_OF_MONTH);    //当前为一月的第几天
        int doy=calendar.get(Calendar.DAY_OF_YEAR);     //当前为一年的第几天

        System.out.println("当前时间："+calendar.getTime());
        System.out.println("年份："+year);
        System.out.println("月份："+month);
        System.out.println("日期："+day);
        System.out.println("一周的第几天："+dow);       // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
        System.out.println("1个月中的第几天："+dom);
        System.out.println("1年内的第几天："+doy);

    }

}
