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
// class Dev3 extends Dev2 implements Bank // ✅ internally java treats this class automatically
class Dev3 extends Dev2 {
  public void loan() {}

  public void account() {
    System.out.println("This is account");
  }

  public void extraMethod() {
    System.out.println("This is a method not present in the interface");
  }
}

public class InterfaceDemo {
  public static void main(String[] args) {
    Bank obj1 = new Dev3();
    obj1.account();
    // obj1.extraMethod(); // ❌ error - This object can only call methods defined in Bank interface

    Dev3 obj2 = new Dev3();
    obj2.account();
    obj2.loan();
    obj2.deposit();
    obj2.withdraw();
  }
}
