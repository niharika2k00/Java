
import java.io.*;
import java.util.HashMap;
import java.util.*;
/* 
       Reference ::  https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/#:~:text=In%20simple%20words%2C%20%3D%3D%20checks,that%20has%20overridden%20this%20method.
*/

public class demo {

    public static void main(String[] args) {

        String s3 = "This is prepinsta Material";
        // String s4 = "This is prepinsta Material";
        String s5 = "This is ";
        String s6 = s5 + "prepinsta Material";

        System.out.println(s3 == s6);

        String s1 = "prepinsta";
        String s2 = new String("prepinsta");

        System.out.println(s1 == s2); // false  --  address comparison
        System.out.println(s1.equals(s2)); // true  -- content comparison

        Map<Integer, String> student = new HashMap<Integer, String>();

        student.put(101, "Rahit");
        student.put(102, "Sudhir");
        student.put(103, "Adithya");
        student.put(104, "Sakshi");
        System.out.println(student.remove(102));
    }
}
