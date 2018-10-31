package back.practise.practise0816.course_network;

import java.io.*;
import java.net.Socket;

public class GreetingClient {
    public static void main(String[] args) {
        String serverName="127.0.0.1";
        int port=9999;

        try{
            System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
            Socket client=new Socket(serverName,port);
            System.out.println("远程主机地址："+client.getRemoteSocketAddress());
            OutputStream os=client.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);
            dos.writeUTF("获取本机服务地址："+client.getLocalSocketAddress());

            InputStream is=client.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            System.out.println("服务器响应："+dis.readUTF());
            client.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
