import java.rmi.*;
import java.rmi.server.*;
public class ServerImplementation extends UnicastRemoteObject implements ServerInterface{
    public ServerImplementation() throws RemoteException{}

    @Override
    public double subtract(double n1, double n2) throws RemoteException {
        double result= n1-n2;
        System.out.println("At Server : Subtract("+n1+","+n2+") -> "+result);
        return result;
    }
}
