
public class Autoboxing {

    public static void main(String[] args) {

        //  Auto boxing  -->  Primitive data type converted to Wrapper Class. 
        char ch = 'N';
        Character a = ch;

        // Unboxing the Object
        Integer i = new Integer(10);
        int primitiveInt = i;

        System.out.println("Value of i = " + i + "\nValue of primitiveInt = " + primitiveInt);
    }
}
