class BankAccount {
  private int balance = 1000;

  // ❌ WITHOUT synchronized
  void withdrawUnsafe(int amount) {
    if (balance >= amount) {
      try {
        Thread.sleep(10);
      }
      catch (Exception e) {
      } // simulate delay
      balance -= amount;
      System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " | balance: " + balance);
    }
    else {
      System.out.println(Thread.currentThread().getName() + " - insufficient balance: " + balance);
    }
  }

  // ✅ WITH synchronized
  synchronized void withdrawSafe(int amount) {
    if (balance >= amount) {
      try {
        Thread.sleep(10);
      }
      catch (Exception e) {
      } // simulate delay
      balance -= amount;
      System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " | balance: " + balance);
    }
    else {
      System.out.println(Thread.currentThread().getName() + " - insufficient balance: " + balance);
    }
  }

  void resetBalance() {
    balance = 1000;
    System.out.println("\nBalance reset to 1000");
  }
}

public class Main {
  public static void main(String[] args) throws InterruptedException {

    BankAccount acc = new BankAccount();

    // ============================================
    // ❌ WITHOUT synchronized — shows the BUG
    // ============================================
    System.out.println("===== WITHOUT synchronized =====");
    System.out.println("Initial balance: 1000");
    System.out.println("Both Person1 and Person2 trying to withdraw 600\n");
    // acc.withdrawUnsafe(600);
    // acc.withdrawUnsafe(600);

    Thread t1 = new Thread(() -> acc.withdrawUnsafe(600), "Person1");
    Thread t2 = new Thread(() -> acc.withdrawUnsafe(600), "Person2");

    t1.start();
    t2.start();
    t1.join();
    t2.join();

    System.out.println("^ Both withdrew 600 from 1000 = balance went NEGATIVE ❌");

    // ============================================
    // ✅ WITH synchronized — shows the FIX
    // ============================================
    acc.resetBalance();

    System.out.println("\n===== WITH synchronized =====");
    System.out.println("Initial balance: 1000");
    System.out.println("Both Person1 and Person2 trying to withdraw 600\n");

    Thread t3 = new Thread(() -> acc.withdrawSafe(600), "Person1");
    Thread t4 = new Thread(() -> acc.withdrawSafe(600), "Person2");

    t3.start();
    t4.start();
    t3.join();
    t4.join();

    System.out.println("^ Only one person withdrew 600, other got insufficient balance ✅");
  }
}