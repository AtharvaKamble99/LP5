import ServiceModule.*;
public class ServiceImpl extends ServiceInterfacePOA {
    public String revString(String inputStr){
        String reversed= new StringBuilder(inputStr).reverse().toString();
        System.out.println();
        System.out.println("At Server: reverse(\"" + inputStr + "\") = \"" + reversed + "\"");
        return reversed;
    }
}
