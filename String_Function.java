
import java.util.*;

public class String_Function {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strA = "Hello World";
        String strB = new String("Happy_Coding!"); // Str formed using Constructor

        System.out.println(strA);
        System.out.println(strA.compareTo(strB)); // Returns the difference between the 2 that differs 
        System.out.println(strA.contains("Wor"));
        System.out.println(strB.endsWith("ing!"));
        System.out.println(strA.equals(strB));
        System.out.println(strA.length());
        System.out.println(strA.replaceAll("o", "OOOO"));
        System.out.println(strA.substring(6));
        System.out.println(strA.concat(strB));
        System.out.println("   Bye   ".trim()); // Removes white spaces
    }
}
