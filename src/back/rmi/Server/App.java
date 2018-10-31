package back.rmi.Server;

import back.rmi.RmoteInterface.IHello;
import back.rmi.Server.HelloImpl;
import java.net.MalformedURLException;
import com.sun.xml.internal.messaging.saaj.util.JaxmURI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * 服务器端
 * @author Alex
 */
public class App {
    public static void main(String[] args) throws RemoteException,JaxmURI.MalformedURIException {
        IHello hello=new HelloImpl();
        LocateRegistry.createRegistry(1099);
        try {
            Naming.rebind("rmi://192.168.11.24/hello", hello);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
