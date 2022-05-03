// https://www.javatpoint.com/inheritance-in-java
public class Inheritance_OOP {
    public static void main(String[] args) {
        B obj = new B(); // Create an Object of class B
        int len = obj.joinString("\nHappy ", "Coding !");
        System.out.println("Concatenated String Length: " + len);

        B obj1 = new B(10);
        obj1.display();
    }
}

// Parent / Super Class
class A {
    protected int x = 7400;

    public A() {
        System.out.println("\nClass A constructor ");
    }

    public A(int num) {
        System.out.println("\nParameterized Constructor of Class A " + num);
    }

    public int joinString(String s1, String s2) {
        System.out.println(s1.concat(s2));
        return s1.length() + s2.length();
    }

    public void display() {
        System.out.println("Displaying in  **   A  **");
    }

    public void method1() {
        System.out.println("Accessing the method of the Parent Class using Super Keyword");
    }
}

// Child / Sub Class
class B extends A {
    public B() {
        System.out.println("Class B constructor ");
    }

    public B(int num) {
        super(num); //  calls the Super Class constructor
        super.method1();
        System.out.println("Parameterized Constructor of Class B " + num);
    }

    public void display() {
        System.out.println("Displaying in  **   B  **");
        System.out.println("Accessing Protected Variable  " + x + "  from Parent Class");
    }
}

/*
 *  -- when we are create & call the OBJ of SubClass  ==>  then it calls the (SuperClass  +  SubClass) Default Const.
 *  -- use Super(parameter); to call the parameterized constructor for Super Class
 */
