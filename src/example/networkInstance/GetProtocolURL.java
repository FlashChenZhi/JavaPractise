package example.networkInstance;

import java.io.IOException;
import java.net.URL;

/**
 * 解析 URL
 * 使用 net.URL 类的 url.getProtocol() ,url.getFile() 等方法来解析 URL 地址
 */
public class GetProtocolURL {
    public static void main(String[] args) throws IOException{
        URL url = new URL("http://www.runoob.com/front.html5/front.html5-tutorial.front.html5");
        System.out.println("URL："+url.toString());
        System.out.println("路径："+url.getPath());
        System.out.println("协议："+url.getProtocol());
        System.out.println("文件名称："+url.getFile());
        System.out.println("主机名称："+url.getHost());
        System.out.println("端口号："+url.getPort());
        System.out.println("默认端口："+url.getDefaultPort());

    }
}
