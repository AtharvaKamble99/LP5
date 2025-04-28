import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerInterface{
    public ServerImpl() throws RemoteException{}
    public double divide(double n1,double n2){
        double result= n1/n2;
        System.out.println("At Server : divide("+n1+","+n2+") = "+result);
        return result;
    }

}
