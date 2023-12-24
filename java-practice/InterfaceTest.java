import java.io.*;
import java.lang.*;
import java.util.*;

// Level 1
interface Bank {
    void deposit();

    void withdraw();

    void loan();

    void account();
}

// Level 2
abstract class Dev1 implements Bank {
    public void deposit() {
        System.out.println("Your deposit Amount :" + 100);
    }
}

abstract class Dev2 extends Dev1 {
    public void withdraw() {
        System.out.println("Your withdraw Amount :" + 50);
    }
}

// Level 3
class Dev3 extends Dev2 {
    public void loan() {}

    public void account() {}
}

public class InterfaceTest {
    public static void main(String[] args) {
        Dev3 d = new Dev3();
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
    }
}
