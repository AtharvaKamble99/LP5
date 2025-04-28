import java.rmi.*;
public interface ServerInterface extends Remote  {
    double divide(double n1,double n2) throws RemoteException;
}
