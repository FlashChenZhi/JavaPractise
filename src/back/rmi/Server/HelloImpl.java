package back.rmi.Server;

import back.rmi.RmoteInterface.IHello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class HelloImpl  extends UnicastRemoteObject implements IHello{
    public HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String name)  {
        return "Hello! "+name;
    }
}
