
import java.io.*;
import java.util.*;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) throws IOException {

        int n = 5, i;
        Manupulation Obj = new Manupulation();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ---------------------------------------------------------------------
        //                        ArrayList
        // ---------------------------------------------------------------------
        ArrayList<Integer> arrList_A = new ArrayList<Integer>(n);

        for (i = 0; i < n; i++) // Append
            arrList_A.add(i);

        System.out.println(arrList_A);
        arrList_A.remove(3);
        System.out.println(arrList_A);

        Obj.printElement(arrList_A);

        // ---------------------------------------------------------------------
        //                       User Input uisng ArrayList
        // ---------------------------------------------------------------------
        ArrayList<Integer> vec = new ArrayList<Integer>(4);
        System.out.println("\n\nEnter elements for ArrayList : ");
        for (int j = 0; j <= 3; j++) {
            // int ele = sc.nextInt(); 
            int ele = Integer.parseInt(br.readLine());
            vec.add(ele);
        }

        Obj.printElement(vec);

        // ---------------------------------------------------------------------
        //                       String of Array using ArrayList
        // ---------------------------------------------------------------------
        ArrayList<String> stringVec = new ArrayList<>();
        stringVec.add("Computer");
        stringVec.add("Engineering");
        stringVec.add(1, "Science");

        System.out.println();
        for (String str : stringVec)
            System.out.print(str + " ");
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