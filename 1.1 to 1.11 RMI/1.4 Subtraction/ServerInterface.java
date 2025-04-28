import java.rmi.*;

public interface ServerInterface extends Remote {
    double subtract(double n1,double n2) throws RemoteException;
}
