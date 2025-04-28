import ServiceModule.*;
public class ServiceImpl extends ServiceInterfacePOA {
    public String toUpperCasing(String input){
        String result= input.toUpperCase();
        System.out.println("At Server : Uppercasing \""+input+"\"to \""+result);
        return result;
    }
}
