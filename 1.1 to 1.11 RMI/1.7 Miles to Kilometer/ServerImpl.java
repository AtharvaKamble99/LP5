import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerInterface {
    public ServerImpl() throws RemoteException {}

    public double convertMilesToKilometers(double miles) {
        double kilometers = miles * 1.60934;
        System.out.println("At Server: convertMilesToKilometers(" + miles + ") = " + kilometers);
        return kilometers;
    }
}
