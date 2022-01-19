
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

        int n = 5, i;
        ArrayList<Integer> arrList_A = new ArrayList<Integer>(n);
        ArrayList<Integer> vec = new ArrayList<Integer>(4);
        Manupulation Obj = new Manupulation();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (i = 0; i < n; i++) // Append
            arrList_A.add(i);

        System.out.println(arrList_A);
        arrList_A.remove(3);
        System.out.println(arrList_A);

        Obj.printElement(arrList_A);

        System.out.println("\n\nEnter elements for ArrayList : ");
        for (int j = 0; j <= 3; j++) {
            int ele = sc.nextInt(); // sc.nextInt(); 
            vec.add(ele);
        }

        Obj.printElement(vec);
    }
}


class Manupulation {

    // Printing all elements
    public void printElement(ArrayList<Integer> arrList) {
        int i, len = arrList.size();;
        System.out.println("\nElements in the array : ");

        for (i = 0; i < len; i++)
            System.out.print(arrList.get(i) + " ");

        System.out.println();

        for (int ele : arrList) {
            System.out.print(ele + " ");
        }
    }

}