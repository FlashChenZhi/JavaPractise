package example.networkInstance;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**     获取指定主机的IP地址
 *  使用 InetAddress 类的 InetAddress.getByName() 方法来获取指定主机（网址）的IP地址
 */
public class GetIP {
    public static void main(String[] args) {
        InetAddress ia=null;
        try{
            ia=InetAddress.getByName("www.runoob.com");
        }catch (UnknownHostException e){
            System.exit(2);
        }
        System.out.println("主机名称："+ia.getHostName()+"\t\t主机IP地址："+ia.getHostAddress());
        System.exit(0);
    }

}
