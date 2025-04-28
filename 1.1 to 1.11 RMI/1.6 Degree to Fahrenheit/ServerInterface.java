import java.rmi.*;

public interface ServerInterface extends Remote {
    double convertToFahrenheit(double celsius) throws RemoteException;
}
