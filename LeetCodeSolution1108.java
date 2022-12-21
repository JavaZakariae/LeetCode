import java.util.stream.Collectors;
import java.util.stream.Stream;

//1108. Defanging an IP Address
public class LeetCodeSolution1108 {
    public static void main(String[] args) {
        String s = defangIPaddr("192.168.1.1");
        System.out.println("s = " + s);
    }

    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static String defangIPaddrUsingStreamAndRegularExpression(String address) {
        String[] splitedAddress = address.split("\\.{1}");
        return String.join("[.]", splitedAddress);
    }
}
