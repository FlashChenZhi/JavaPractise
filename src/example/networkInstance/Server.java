package example.networkInstance;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  ServerSocket 和 Socket 通信实例
 *  实现客户端发送消息到服务器，服务器接收到消息并读取输出，然后写出到客户端客户端接收到输出
 *  1、建立服务器端
 * 服务器建立通信ServerSocket
 * 服务器建立Socket接收客户端连接
 * 建立IO输入流读取客户端发送的数据
 * 建立IO输出流向客户端发送数据消息
 */
public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket server=new ServerSocket(8888);
            System.out.println("启动服务器....");
            Socket socket=server.accept();
            System.out.println("客户端："+socket.getInetAddress().getHostName()+" 已经连接到服务器");
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //读取客户端发送来的消息
            String mess= br.readLine();
            System.out.println("接收客户端发送的信息："+mess);
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(mess+"\n");
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
