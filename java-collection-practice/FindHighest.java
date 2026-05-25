import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
  int userId;
  int transactionId;
  int amount; // single transaction amount

  Employee(int userId, int transactionId, int amount) {
    this.userId = userId;
    this.transactionId = transactionId;
    this.amount = amount;
  }
}

// Find top 2 highest userId who has spend maximum amount by adding all the transactions per user
public class FindHighest {
  public static void main(String[] args) {
    List<Employee> emp = new ArrayList<Employee>();
    emp = Arrays.asList(
        new Employee(1, 1, 20),
        new Employee(1, 2, 10),
        new Employee(1, 3, 50),
        new Employee(2, 4, 20),
        new Employee(2, 5, 400),
        new Employee(3, 6, 5000),
        new Employee(4, 7, 88));

    Map<Integer, Integer> totalSpend = new HashMap<>();
    for (Employee e : emp) {
      totalSpend.put(e.userId, totalSpend.getOrDefault(e.userId, 0) + e.amount);
    }
    System.out.println(totalSpend);

    // Method 1: using stream
    List<Integer> res = totalSpend.entrySet().stream()
        .sorted((a, b) -> b.getValue() - a.getValue())
        .limit(2).map(Map.Entry::getKey).collect(Collectors.toList());
    System.out.println(res);

    // Method 2: convert to list and sort manually
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(totalSpend.entrySet());
    System.out.println(list);
    list.sort((a, b) -> b.getValue() - a.getValue());
    System.out.println("Top 2 employee: " + list.get(0).getKey() + ", " + list.get(1).getKey());

    /*
      totalSpend.entrySet() returns a Set of Entry objects:
      [
      Entry(key=1, value=80),
      Entry(key=2, value=1020),
      Entry(key=3, value=500),
      Entry(key=4, value=88)
      ]
    
      new ArrayList<>(totalSpend.entrySet()) converts that Set into a List:
      index 0 → Entry(key=1, value=80)
      index 1 → Entry(key=2, value=1020)
      index 2 → Entry(key=3, value=500)
      index 3 → Entry(key=4, value=88)
    
      List [
      (1, 80),
      (2, 1020),
      (3, 500),
      (4, 88)
      ]
    */
  }
}
