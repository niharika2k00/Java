import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
  public static void main(String[] args) {

    // Collections.sort method is sorting the elements of ArrayList in ascending order automatically as String class implements Comparable interface so can directly use compareTo() method
    ArrayList<String> harrypotter = new ArrayList<String>(
        Arrays.asList("Hufflepuff", "Gryffindor", "Slytherin", "Ravenclaw"));
    Collections.sort(harrypotter);
    Collections.sort(harrypotter, Collections.reverseOrder()); // sort in reverse
    System.out.println("Houses after sorting:\n" + harrypotter + "\n");

    List<Employee> employees = Arrays.asList(
        new Employee("Alice", 95000),
        new Employee("Bob", 60000),
        new Employee("Bob", 2000),
        new Employee("Carol", 82000));

    // method 1
    Collections.sort(employees); // uses compareTo automatically

    // method 2: using stream
    employees.stream().sorted().forEach(e -> System.out.println(e.name + " → " + e.salary));

    employees.forEach(e -> System.out.println(e.name + " → " + e.salary));
  }
}

// Employee implements Comparable — defines its OWN sorting logic
class Employee implements Comparable<Employee> {
  String name;
  int salary;

  Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  // sorting logic lives INSIDE the class
  @Override
  public int compareTo(Employee other) {
    return Integer.compare(this.salary, other.salary); // sort by salary
  }
}

// 📌⚠️ Note:
// Comparable (interface)  →  uses compareTo() method  →  Collection.sort()
