import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerInterface {
    public ServerImpl() throws RemoteException {}

    public String sayHello(String name) {
        String message = "Hello, " + name + "!";
        System.out.println("At Server: Received name \"" + name + "\", replying with \"" + message + "\"");
        return message;
    }
}
