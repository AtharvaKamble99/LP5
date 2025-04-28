import java.rmi.*;

public interface ServerInterface extends Remote {
    double convertMilesToKilometers(double miles) throws RemoteException;
}
