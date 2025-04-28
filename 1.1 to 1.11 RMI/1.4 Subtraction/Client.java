import java.rmi.*;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        try{

            String rmiURL ="rmi://localhost/Server";
            ServerInterface si= (ServerInterface) Naming.lookup(rmiURL);
            double result= si.subtract(num1,num2);
            System.out.println("Result: " + result);
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }

    }
}
