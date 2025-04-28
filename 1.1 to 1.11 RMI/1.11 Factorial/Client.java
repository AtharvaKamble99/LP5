import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            String rmiURL = "rmi://localhost/Server";
            ServerInterface sI = (ServerInterface) Naming.lookup(rmiURL);

            if (args.length < 1) {
                System.out.println("Please provide a number to calculate factorial.");
                return;
            }

            int number = Integer.parseInt(args[0]);
            long fact = sI.factorial(number);
            System.out.println("At Client: Factorial of " + number + " = " + fact);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
