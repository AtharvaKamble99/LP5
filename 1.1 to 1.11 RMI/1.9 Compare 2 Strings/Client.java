import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            String rmiURL = "rmi://localhost/Server";
            ServerInterface sI = (ServerInterface) Naming.lookup(rmiURL);

            if (args.length < 2) {
                System.out.println("Please provide two strings to compare.");
                return;
            }

            String str1 = args[0];
            String str2 = args[1];

            String result = sI.findLexicographicallyLargest(str1, str2);
            System.out.println("At Client: " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
