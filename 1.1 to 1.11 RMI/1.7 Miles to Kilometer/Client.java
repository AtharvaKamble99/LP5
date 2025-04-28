import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            String rmiURL = "rmi://localhost/Server";
            ServerInterface sI = (ServerInterface) Naming.lookup(rmiURL);
            double miles = Double.parseDouble(args[0]);
            System.out.println("At Client: convertMilesToKilometers(" + miles + ") = " + sI.convertMilesToKilometers(miles));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
