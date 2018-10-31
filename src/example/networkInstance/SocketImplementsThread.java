package example.networkInstance;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  Socket 实现多线程服务器程序
 *  使用 Socket 类的 accept() 方法和 ServerSocket 类的 MultiThreadServer(socketname) 方法来实现多线程服务器程序
 */
public class SocketImplementsThread implements Runnable{
    Socket csocket;

    public SocketImplementsThread(Socket csocket) {
        this.csocket = csocket;
    }

    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket=new ServerSocket(1234);
        System.out.println("开始监听...");
        while(true){
            Socket socket=serverSocket.accept();
            System.out.println("连接服务器");
            new Thread(new SocketImplementsThread(socket)).start();
        }
    }

    @Override
    public void run() {
        try {
            PrintStream print = new PrintStream(csocket.getOutputStream());
            for(int i=10;i>=0;i--){
                print.println(i + " bottles of beer on the wall");
            }
            print.close();
            csocket.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
