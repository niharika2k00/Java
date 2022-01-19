
public class Swap_2Num {

    // Swap 2 Numbers in Java  WITHOUT  taking a 3rd Variable.
    public static void main(String[] args) {

        int a = 3, b = 7;
        // METHOD - 1 
        method1(a, b);

        // METHOD - 2 
        method2(a, b);
    }

    // using DIfference 
    static void method2(int x, int y) {
        x = x - y;
        y = x + y;
        x = y - x;

        System.out.println("X = " + x + " Y = " + y);
    }

    // uisng XOR Properties 
    static void method1(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("X = " + x + " Y = " + y);
    }

}