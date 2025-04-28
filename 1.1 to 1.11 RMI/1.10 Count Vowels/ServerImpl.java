
import java.rmi.*;
import java.rmi.server.*;
public class ServerImpl extends UnicastRemoteObject implements ServerInterface {
    public ServerImpl() throws RemoteException {}

    public int countVowels(String word) throws RemoteException {
        int count = 0;
        for (char ch : word.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("At Server: Number of vowels in \"" + word + "\" = " + count);
        return count;
    }
}
