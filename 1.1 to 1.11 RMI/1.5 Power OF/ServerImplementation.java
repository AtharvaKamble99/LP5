import java.rmi.*;
import java.rmi.server.*;
public class ServerImplementation extends UnicastRemoteObject implements ServerInterface{
    public ServerImplementation() throws RemoteException{}

    @Override
    public int calPowerOf(int num) throws RemoteException {
        return (int)Math.pow(num,2);
    }
}
