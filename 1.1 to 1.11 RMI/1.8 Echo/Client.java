import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            String rmiURL = "rmi://localhost/Server";
            ServerInterface sI = (ServerInterface) Naming.lookup(rmiURL);
            String name = args[0];
            System.out.println("At Client: " + sI.sayHello(name));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
