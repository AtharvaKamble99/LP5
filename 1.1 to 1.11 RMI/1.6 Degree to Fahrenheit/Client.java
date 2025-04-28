import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            String rmiURL = "rmi://localhost/Server";
            ServerInterface sI = (ServerInterface) Naming.lookup(rmiURL);
            double celsius = Double.parseDouble(args[0]);
            System.out.println("At Client: convertToFahrenheit(" + celsius + ") = " + sI.convertToFahrenheit(celsius));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
