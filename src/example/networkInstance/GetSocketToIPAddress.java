package example.networkInstance;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 使用 Socket 连接到指定主机
 * 使用 net.Socket 类的 getInetAddress() 方法来连接到指定主机
 */
public class GetSocketToIPAddress {
    public static void main(String[] args) {
        try{
            InetAddress address;
            Socket socket=new Socket("www.runoob.com", 80);
            address=socket.getInetAddress();
            System.out.println("连接到指定主机地址："+address);
            socket.close();
        }catch (IOException e){
            System.out.println("无法连接 " + args[0]);
            e.printStackTrace();
        }
    }
}
