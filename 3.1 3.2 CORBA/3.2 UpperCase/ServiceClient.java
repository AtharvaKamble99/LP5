import ServiceModule.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import java.util.*;

public class ServiceClient{
    public static void main(String[] args) {
        try{
            ORB orb= ORB.init(args,null);

            org.omg.CORBA.Object objRef=  orb.resolve_initial_references("NameService");
            NamingContextExt ncRef= NamingContextExtHelper.narrow(objRef);

            String name="Service";
            ServiceInterface sI= ServiceInterfaceHelper.narrow(ncRef.resolve_str(name));
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string you want to convert to Uppercase:");
            String input = sc.nextLine();
            String res=sI.toUpperCasing(input);

            System.out.println();
            System.out.println("Client: Uppercased string of\""+input+"\" is\""+res);
            sc.close();
            orb.shutdown(true);
        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
}