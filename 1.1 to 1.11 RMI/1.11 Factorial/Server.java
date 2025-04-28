import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerImpl sI = new ServerImpl();
            Naming.rebind("Server", sI);
            System.out.println("Server Started ...");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
