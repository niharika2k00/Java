
// import java.util.*;  
import java.util.Scanner; // Import the Scanner class

class Main {
    public static void main(String[] args) {

        Scanner scObj = new Scanner(System.in); // Create a Scanner object -- in --> input from the keyboard
        System.out.println("Enter username and age : ");
        System.out.println("Boolean Result: " + scObj.hasNextInt()); // checks whether the next typed material is Int or
                                                                     // Not.
        String userName = scObj.nextLine(); // Read user input
        int age = scObj.nextInt();
        System.out.println("Username is: " + userName + " age: " + age); // Output

    }
}