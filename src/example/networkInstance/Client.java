package example.networkInstance;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *      建立客户端
 * 1. 创建Socket通信，设置通信服务器的IP和Port
 * 2. 建立IO输出流向服务器发送数据消息
 * 3. 建立IO输入流读取服务器发送来的数据消息
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            InputStream is=socket.getInputStream();
            OutputStream os=socket.getOutputStream();
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
            //向服务器端发送一条消息
            bw.write("测试客户端和服务器通信，服务器接收到消息返回到客户端\n");
            bw.flush();
            //读取服务器返回的消息
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String message=br.readLine();
            System.out.println("客户端发送消息："+message);
        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
