package example.networkInstance;

import java.net.URL;
import java.net.URLConnection;

/**
 * 查看主机指定文件的最后修改时间
 */
public class ShowModiffyFileLastTime {
    public static void main(String[] args) throws Exception{
        //获取文件URL路径，打开路径连接，设置缓存并获取最后修改时间
        URL url=new URL("http://127.0.0.1/images/moutain.jpg");
        URLConnection connection=url.openConnection();
        connection.setUseCaches(false);
        long timestamp = connection.getLastModified();
        System.out.println("Socket.jpg 文件最后修改时间 :"+timestamp);

    }

}
