
// ── Custom Exception ────────────────────────────────────────────
class MyCustomException extends Exception {
  public MyCustomException(String message) { // constructor
    super(message);
  }
}

// ── Main Class ──────────────────────────────────────────────────
public class ExceptionDemo {
  public static int customDivide(int a, int b)
      throws IllegalArgumentException, MyCustomException {

    if (b == 0) {
      throw new IllegalArgumentException("b cannot be zero");
    }

    if (a % b != 0) {
      throw new MyCustomException("Result is not a whole number");
    }

    return a / b;
  }

  public static void main(String[] args) {

    // ── Test 1 : b = 0 → IllegalArgumentException ───────────
    System.out.println("── Test 1 : divide by zero ──");
    try {
      int result = customDivide(10, 0);
      System.out.println("Result : " + result);
    }
    catch (IllegalArgumentException e) {
      System.out.println("IllegalArgumentException : " + e.getMessage());
    }
    catch (MyCustomException e) {
      System.out.println("MyCustomException : " + e.getMessage());
    }
    catch (Exception e) {
      System.out.println("Exception : " + e.getMessage());
    }

    // ── Test 2 : not divisible → MyCustomException ───────────
    System.out.println("\n── Test 2 : not divisible ──");
    try {
      int result = customDivide(1, 2);
      System.out.println("Result : " + result);
    }
    catch (IllegalArgumentException e) {
      System.out.println("IllegalArgumentException : " + e.getMessage());
    }
    catch (MyCustomException e) {
      System.out.println("MyCustomException : " + e.getMessage());
    }
    catch (Exception e) {
      System.out.println("Exception : " + e.getMessage());
    }

    // ── Test 3 : valid input → success ───────────────────────
    System.out.println("\n── Test 3 : valid divide ──");
    try {
      int result = customDivide(10, 2);
      System.out.println("Result : " + result);
    }
    catch (IllegalArgumentException e) {
      System.out.println("IllegalArgumentException : " + e.getMessage());
    }
    catch (MyCustomException e) {
      System.out.println("MyCustomException : " + e.getMessage());
    }
    catch (Exception e) {
      System.out.println("Exception : " + e.getMessage());
    }
  }
}
