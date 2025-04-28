import java.rmi.*;
import java.rmi.server.*;

public class ServerImplementation extends UnicastRemoteObject implements ServerInterface{
    public ServerImplementation() throws RemoteException{}
    public double add(double n1,double n2){
        double result= n1+n2;
        System.out.println("At Server : add("+n1+","+n2+") = "+result);
        return result;
    }

}
