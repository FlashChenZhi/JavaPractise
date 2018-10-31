package back.practise.practise0816.course_network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer extends Thread{
    private ServerSocket serverSocket;

    public GreetingServer(int port) throws IOException {
        serverSocket=new ServerSocket(port);
        serverSocket.setSoTimeout(1000);
    }

    @Override
    public void run(){
        while(true){
            try{
                System.out.println("等待远程连接，本地端口号："+serverSocket.getLocalPort());
                Socket socket=serverSocket.accept();
                System.out.println("远程主机地址："+socket.getRemoteSocketAddress());
                DataInputStream dis=new DataInputStream(socket.getInputStream());
                System.out.println("读取："+dis.readUTF());
                DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
                dos.writeUTF("感谢您的连接："+(socket.getLocalSocketAddress()));
                dos.close();
            }catch (SocketTimeoutException e){
                System.out.println("服务连接超时");
                break;
            }catch (IOException e){
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        int port=Integer.parseInt("9999");
        try{
            Thread t=new Thread();
            t.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
