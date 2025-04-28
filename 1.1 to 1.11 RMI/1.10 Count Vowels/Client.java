import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            String rmiURL = "rmi://localhost/Server";
            ServerInterface sI = (ServerInterface) Naming.lookup(rmiURL);

            if (args.length < 1) {
                System.out.println("Please provide a string to count vowels.");
                return;
            }

            String input = args[0];
            int vowelCount = sI.countVowels(input);
            System.out.println("At Client: Number of vowels in \"" + input + "\" = " + vowelCount);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
