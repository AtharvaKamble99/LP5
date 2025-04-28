import java.rmi.*;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n1= sc.nextInt();
        try{
            String rmiURL="rmi://localhost/Server";
            ServerInterface sv= (ServerInterface) Naming.lookup(rmiURL);
            System.out.println("At Client : Calculate pow ("+n1+") -> "+sv.calPowerOf(4));
        }
        catch(Exception e ){
            System.out.println("Exception : "+e);
        }
    }
}
