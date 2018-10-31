package example.networkInstance;

import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;

/**
 * 获取 URL响应头的日期信息
 * 使用 HttpURLConnection 的 httpCon.getDate() 方法来获取 URL响应头的日期信息
 */
public class HttpURLConnection {
    public static void main(String[] args) throws Exception{
        URL url=new URL("http://www.runoob.com");
        URLConnection connection=url.openConnection();
        long date=connection.getDate();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时:mm分:ss秒 ");
        if(date==0){
            System.out.println("无法获取信息！");
        }else{
            System.out.println("获取时间为："+(sdf.format(date)));
        }
    }
}
