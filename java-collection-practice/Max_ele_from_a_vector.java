import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Max_ele_from_a_vector {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        vec.add(32);
        vec.add(14);
        vec.add(98);
        vec.add(11);
        System.out.println(vec.get(2));
        System.out.println("maximum element: " + Collections.max(vec));

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("bura");
        ll.add("na mano");
        ll.add("holi hain");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
    }
}
