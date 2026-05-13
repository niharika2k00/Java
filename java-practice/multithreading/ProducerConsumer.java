import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
  private int capacity;
  private Queue<Integer> queue = new LinkedList<>();

  SharedBuffer(int capacity) {
    this.capacity = capacity;
  }

  // producer calls this
  public synchronized void producer(int item) throws InterruptedException {
    while (queue.size() == capacity) { // buffer full → release lock, wait
      wait();
    }

    queue.add(item);
    System.out.println("Produced: " + item + " | Size: " + queue.size());
    notifyAll(); // wake up all consumer
  }

  // consumer calls this
  public synchronized int consumer() throws InterruptedException {
    while (queue.isEmpty()) { // buffer empty → release lock, wait
      wait();
    }

    int item = queue.poll();
    System.out.println("Consumed: " + item);
    notifyAll(); // wake up producer
    return item;
  }
}

public class ProducerConsumer {
  public static void main(String[] args) {
    SharedBuffer buffer = new SharedBuffer(3);

    // append data to the queue
    Thread producer = new Thread(() -> {
      try {
        for (int i = 1; i <= 5; i++) {
          buffer.producer(i);
          Thread.sleep(100);
        }
      } catch (InterruptedException e) {
      }
    });

    // remove data from the queue
    Thread consumer = new Thread(() -> {
      try {
        for (int i = 0; i < 8; i++) {
          buffer.consumer();
          Thread.sleep(300);
        }
      } catch (InterruptedException e) {
      }
    });

    producer.start();
    consumer.start();
    System.out.println("Process completes");
  }
}

// Thread producer = new Thread(new Runnable() {
// @Override
// public void run() {
// // ... code here
// }
// });

// ⚠️ NO NEED to extends Thread or implements Runnable explicitly when using lambdas. Lambda is the Runnable.
