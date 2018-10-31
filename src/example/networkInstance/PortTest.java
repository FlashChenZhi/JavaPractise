package example.networkInstance;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 查看端口是否已使用
 */
public class PortTest {
    public static void main(String[] args) {
        Socket skt;
        String host="localhost";
        if(args.length>0){
            host=args[0];
        }
        for(int i=0;i<1024;i++){
            try{
                System.out.println("查看："+i);
                skt=new Socket(host,i);
                System.out.println("端口号："+i+"  被占用！");
            }catch (UnknownHostException e){
                System.out.println("Exception ");
                break;
            }catch (IOException e){

            }
        }


    }
}
