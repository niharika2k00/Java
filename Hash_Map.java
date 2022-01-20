
import java.io.*;
import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {

        // Create an empty hash map by declaring object of string and integer type without Generics
        HashMap<String, Integer> map = new HashMap<>();

        // using standard add() method
        map.put("Postman", 10);
        map.put("JUnit", 30);
        map.put("Swagger", 20);

        System.out.println("Size of map is   =>   " + map.size());
        System.out.println("Hash_Map  => " + map.values());

        // Enumeration enu = map.keys();
        // System.out.println("\nThe enumeration of keys are:");

        // while (enu.hasMoreElements())
        //     System.out.println(enu.nextElement());

        if (map.containsKey("JUnit")) {
            Integer val = map.get("JUnit");
            System.out.println("\nValue for key" + " \"JUnit\"  =>  " + val);
        }

        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey() + "\t Value: " + e.getValue());

    }
}
