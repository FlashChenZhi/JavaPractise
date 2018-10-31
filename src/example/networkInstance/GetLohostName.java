package example.networkInstance;

import java.net.InetAddress;

/**
 *  获取本机ip地址及主机名
 *  使用 InetAddress 类的 getLocalAddress() 方法获取本机ip地址及主机名
 */
public class GetLohostName {
    public static void main(String[] args) throws Exception {
        InetAddress address=InetAddress.getLocalHost();
        System.out.println("获取本机名称："+address.getHostName()+"  本机地址："+address.getHostAddress());

    }
}
