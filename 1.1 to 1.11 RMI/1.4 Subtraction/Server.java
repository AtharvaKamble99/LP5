import java.rmi.*;
public class Server {
    public static void main(String[] args) {
        try{
            ServerImplementation sI= new ServerImplementation();
            Naming.rebind("Server",sI);
            System.out.println("Server Started ...");

        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
