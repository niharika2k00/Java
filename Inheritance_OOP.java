
// https://www.javatpoint.com/inheritance-in-java

// Parent / Super Class
class A {
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
}

// Child / Sub Class
class B extends A {
    public B() {
        System.out.println("Class B constructor ");
    }

    public B(int num) {
        super(num);
        System.out.println("Parameterized Constructor of Class B " + num);
    }

}

public class Inheritance_OOP {

    public static void main(String[] args) {
        B obj = new B(); // Create an Object of class B

        int len = obj.joinString("\nHappy ", "Coding !");
        System.out.println("Concatenated String Length: " + len);

        B checkPara = new B(10);

    }

}

/*
 * -- when we are callling the OBJ of SubClass then it calls the (SubClass + SuperClass) Default Const.
 *  -- use Super(parameter); to call the parameterized constructor for Super Class
 */
