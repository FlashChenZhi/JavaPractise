package back.rmi.RmoteInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程接口
 * @author oseye
 */
public interface IHello extends Remote{
    String sayHello(String name) throws RemoteException;
}
