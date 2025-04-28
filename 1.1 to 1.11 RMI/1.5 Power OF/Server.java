import java.rmi.*;
public class Server {
    public static void main(String[] args) {
        try{
            ServerImplementation si= new ServerImplementation();
            Naming.rebind("Server",si);
            System.out.println("Server Started...");

        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }

    }
}
