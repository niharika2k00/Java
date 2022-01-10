
import java.util.*;

public class stringFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strA = "Hello World ";
        String strB = new String("Happy_Coding!"); // Str formed using Constructor

        System.out.println(strA);
        System.out.println(strA.compareTo(strB));
        System.out.println(strA.concat(strB));
        System.out.println(strA.contains("Wor"));
        System.out.println(strA.endsWith("ld"));
        System.out.println(strA.equals(strB));
        System.out.println(strA.length());
        System.out.println(strA.replaceAll("o", "OOOO"));
        System.out.println(strA.substring(6));
        System.out.println("   Bye   ".trim()); // Removes white spaces
    }
}
