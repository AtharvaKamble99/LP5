import java.rmi.*;
import java.rmi.server.*;

public class ServerImplementation extends UnicastRemoteObject implements ServerInterface {
    public ServerImplementation() throws RemoteException {}

    public double convertToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("At Server: convertToFahrenheit(" + celsius + ") = " + fahrenheit);
        return fahrenheit;
    }
}
