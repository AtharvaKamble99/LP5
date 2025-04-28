import java.rmi.*;
public interface ServerInterface extends Remote{
    int calPowerOf(int num) throws RemoteException;

}
