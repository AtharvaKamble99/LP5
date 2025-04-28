import java.rmi.*;


interface ServerInterface extends Remote{

    String findLexicographicallyLargest(String str1, String str2) throws RemoteException;

}