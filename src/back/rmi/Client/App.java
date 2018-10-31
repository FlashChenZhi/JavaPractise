package back.rmi.Client;

import back.rmi.RmoteInterface.IHello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * RMI客户端
 * @author Alex
 */

public class App  {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException{
        IHello hello=(IHello) Naming.lookup("rmi://192.168.11.24/hello");
        System.out.println( hello.sayHello("Alex"));
    }

}
