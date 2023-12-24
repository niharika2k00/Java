
import java.io.*;
// import java.lang.*;
import java.util.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Sachin");
        al.add("Rahul");
        // al.add(10); // Compiler allows this

        String s1 = (String) al.get(0);
        String s2 = (String) al.get(1);

        // Causes Runtime Exception
        // String s3 = (String) al.get(2);
        System.out.println(s2);

        // interface_name<obj> var = new class_name<>();
        List<Integer> l2 = new ArrayList<>();
        l2.add(44);
        l2.add(98);
        System.out.println(l2);
    }
}
