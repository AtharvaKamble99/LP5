import java.rmi.*;

public interface ServerInterface extends Remote {
    int countVowels(String word) throws RemoteException;
}
