package example.networkInstance;

import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * 获取 URL 响应头信息
 */
public class GetURLMessage {
    public static void main(String[] args) throws Exception{
        //获取文件路径并打开连接，Map集合接收从路径连接中获取头部字段
        //通过Map键值对的形式保存到Set集合中，循环Set集合分别获取对应键的相关值
        URL url = new URL("http://www.runoob.com");
        URLConnection con=url.openConnection();
        Map headers=con.getHeaderFields();
        Set<String> set=headers.keySet();
        for(String str:set){
            String value=con.getHeaderField(str);
            System.out.println("所属键："+str+"\t\t对应值："+value);
        }
            System.out.println("获取最后修改时间："+con.getLastModified());
    }


}
