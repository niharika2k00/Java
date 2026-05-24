
// Multithreading
public class Threading {
  public static void main(String[] args) {
    Thread t1 = new Thread(new FoodFactory("Bread"));
    Thread t2 = new Thread(new FoodFactory("Pizza"));
    Thread t3 = new Thread(new FoodFactory("Pasta"));
    Thread t4 = new Thread(new FoodFactory("Cake"));

    // If used lambda runnable function (no need for other class)
    // Thread t1 = new Thread(() -> {
    //   System.out.println("Bread processed by " + Thread.currentThread().getName());
    // });

    System.out.println("Current thread: " + t1.currentThread().getName());
    System.out.println("sub-thread name: " + t1.getName());
    System.out.println("sub-thread state: " + t1.getState()); // NEW

    t1.start();
    t2.start();
    t3.start();
    t4.start();

    try {
      t1.join();
      t2.join();
      t3.join();
      t4.join();
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    // if not use .join() then the main() thread won't wait for other child thread to complete their execution
    System.out.println("All orders ready!");
  }
}

class FoodFactory implements Runnable {
  private String item;

  FoodFactory(String item) {
    this.item = item;
  }

  @Override
  public void run() {
    System.out.println("processed by " + Thread.currentThread().getName());
  }
}

// ⚠️⚠️ If .join() is used make sure to handle InterruptedException as it throws it.
// 1. either via try-catch block OR
// 2. via throws InterruptedException from the calling method and pass it up to JVM for handle
