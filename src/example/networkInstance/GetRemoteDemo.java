package example.networkInstance;

import java.net.URL;
import java.net.URLConnection;

/**
 * 获取远程文件大小
 * 1.新建远程文件URL路径
 * 2.打开URL路径连接
 * 3.获取连接文件长度，并进行判空处理
 */
public class GetRemoteDemo {
    public static void main(String[] args) throws Exception{
        int size;
        URL url=new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
        URLConnection connection=url.openConnection();
        size=connection.getContentLength();
        if(size>0){
            System.out.println("文件大小为："+size+" 字节");
            connection.getInputStream().close();
        }else{
            System.out.println("无法获取文件大小");
        }



    }
}
