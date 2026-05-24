
import java.io.*;
import java.util.*;
/*
    Reference ::  https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/#:~:text=In%20simple%20words%2C%20%3D%3D%20checks,that%20has%20overridden%20this%20method.
*/

public class StringEquals {
  public static void main(String[] args) {
    String s3 = "This is prepinsta Material";
    String s4 = "This is prepinsta Material";
    String s5 = "This is ";
    String s6 = s5 + "prepinsta Material";

    System.out.println(s3 == s6);
    System.out.println(s3 == s4);

    String s1 = "prepinsta";
    String s2 = new String("prepinsta");

    System.out.println(s1 == s2); // false -- address comparison
    System.out.println(s1.equals(s2)); // true -- value comparison not the reference

    Map<Integer, String> student = new HashMap<Integer, String>();

    student.put(101, "Rahit");
    student.put(102, "Sudhir");
    student.put(103, "Adithya");
    student.put(104, "Sakshi");
    System.out.println(student.remove(102));

    String X = new String("HELLO");
    String Y = new String("HELLO");

    String A = "HELLO";
    String B = "HELLO";

    System.out.println(A == B); // true
    System.out.println(A.equals(B)); // true
    System.out.println(X == Y); // false
    System.out.println(X.equals(Y)); // true --> content comparison

    System.out.println(A.equals(X)); // true
    System.out.println(A == X); // false

    System.out.println("******************************************************");
    char character = 'a';
    int num = (int) character;
    System.out.println(num);
    System.out.println((char) 65);

    char x = 65;
    System.out.println(x);

    StringBuffer p = new StringBuffer("This is prepinsta Material");
    System.out.println(s3.equals(p.toString())); // convert to String then compare
    System.out.println(s3.contentEquals(p));

    // Java caches Integer objects for values -128 to 127:
    System.out.println("For Integers:");
    Integer k = 127;
    Integer y = 127;
    System.out.println(k == y); // true — cached, same object

    Integer a = 128;
    Integer b = 128;
    System.out.println(a == b); // false — outside cache, new objects
    System.out.println(a.equals(b)); // true — always use equals()

  }
}
