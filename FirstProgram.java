
// import java.util.*;  
import java.util.Scanner; // Import the Scanner class

class Main {

    // Function OR Static Method
    public static int Greater(int a, int b) {
        int result = a > b ? a : b;
        return result;
    }

    public static void main(String[] args) {

        Scanner scObj = new Scanner(System.in); // Create a Scanner object -- .in --> input from the keyboard
        System.out.println("Enter Name and Age : ");
        System.out.println("Boolean Result: " + scObj.hasNextInt()); // checks

        // Read User Input : String & Integer
        String userName = scObj.nextLine();
        int age = scObj.nextInt();

        System.out.println("Username is: " + userName + " ,  age: " + age); // Output

        int res = Greater(18, 100);
        System.out.println("Greater no. = " + res);

    }
}
