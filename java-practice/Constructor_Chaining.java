
// https://www.geeksforgeeks.org/constructor-chaining-java-examples/?ref=lbp

//          Constructor Chaining 

public class Constructor_Chaining {

    // default constructor 1
    // default constructor will call another constructor using this keyword from same class
    Constructor_Chaining() {
        this(5); // calls constructor 2
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    Constructor_Chaining(int x) {
        this(5, 15); // calls constructor 3
        System.out.println(x);
    }

    // parameterized constructor 3
    Constructor_Chaining(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        // invokes default constructor first
        new Constructor_Chaining();
    }
}

//  super() -> keywords used to call the constructor of the Parent Class
//  this() -> keywords used to call the constructor of itSelf