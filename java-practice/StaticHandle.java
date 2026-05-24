public class StaticHandle {
  int i;
  static int j;
  {
    System.out.println(" Instance Block 1. Value of i = " + i);
  }
  static {
    System.out.println(" Static Block 1. Value of j = " + j);
    method_2();
  }
  {
    i = 5;
  }
  static {
    j = 10;
  }

  StaticHandle() {
    System.out.println(" Welcome to StaticHandle ");
  }

  public static void main(String[] args) {
    StaticHandle obj = new StaticHandle();
  }

  public void method_1() {
    System.out.println(" Instance method. ");
  }

  static {
    System.out.println(" Static Block 2. Value of j = " + j);
  }
  {
    System.out.println(" Instance Block 2. Value of i = " + i);
    method_1();
  }

  public static void method_2() {
    System.out.println(" Static method. ");
  }
}

// Note: class loads → static block runs (once) -> object created → instance block runs → constructor runs