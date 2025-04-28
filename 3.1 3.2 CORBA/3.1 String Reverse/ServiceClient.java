import ServiceModule.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import java.util.Scanner;

public class ServiceClient {
    public static void main(String[] args) {
        try{
            ORB orb =ORB.init(args,null);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef= NamingContextExtHelper.narrow(objRef);

            String name = "Service";
            ServiceInterface service = ServiceInterfaceHelper.narrow(ncRef.resolve_str(name));

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string you want to reverse");
            String input = sc.nextLine();
            String reverse= service.revString(input);
            System.out.println();
            System.out.println("Client: Reversed string of \"" + input + "\" is \"" + reverse + "\"");
            sc.close();
            orb.shutdown(true);

        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
}