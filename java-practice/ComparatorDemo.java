import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
  String name;
  String dept;
  int salary;

  Employee(String name, String dept, int salary) {
    this.name = name;
    this.dept = dept;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("Name: %-8s | dept: %2d | Salary: Rs.%,d", name, dept, salary);
  }
}

// a - b < 0 (negative - Ascending) | b - a < 0 (positive - Descending)
class SortBySalary implements Comparator<Employee> {
  public int compare(Employee a, Employee b) {
    return a.salary - b.salary; // ascending
  }
}

public class ComparatorDemo {
  public static void main(String[] args) {
    List<Employee> employees = Arrays.asList(
        new Employee("Alice", "Engineering", 95000),
        new Employee("Carol", "Engineering", 20000),
        new Employee("Carol", "HR", 6000),
        new Employee("Bob", "Finanace", 44000));

    System.out.println("Original List:");
    print(employees);

    // ════════════════════════════════════════════════════════════════
    // Method 1 — Using custom Comparator class for sorting
    // ════════════════════════════════════════════════════════════════
    Collections.sort(employees, new SortBySalary());
    System.out.println("\nDisplay after sorting using Method 1:");
    print(employees);

    // ════════════════════════════════════════════════════════════════
    // Method 2 — Using built-in Comparator methods
    // ════════════════════════════════════════════════════════════════
    Comparator<Employee> byName = Comparator.comparing(e -> e.name);
    Comparator<Employee> bySalary = Comparator.comparingInt(e -> e.salary);
    Comparator<Employee> byNameThenSalary = Comparator.comparing((Employee e) -> e.name).thenComparingInt(e -> e.salary);

    // method 1: using collections
    Collections.sort(employees, bySalary);

    // method 2: using lambda function
    employees.sort(byName); // sort by name
    employees.sort((a, b) -> a.salary - b.salary); // same as above one

    employees.sort(Comparator.comparingInt(e -> e.salary)); // sort by salary
    employees.sort(byNameThenSalary); // Sort employees by name, then by dept


    // method 3: using stream
    // sort by salary / name ...
    employees.stream().sorted(bySalary).forEach(item -> System.out.println(item.salary));

    // group by dept and then find the highest salary in each dept
    employees.stream().collect(Collectors.groupingBy(
        e -> e.dept,
        Collectors.maxBy(Comparator.comparingInt(e -> e.salary))))
        .forEach((dept, emp) -> System.out.println(dept + " → " + emp.get().name + " → " + emp.get().salary));

    System.out.println("\nDisplay after sorting using Method 2:");
    print(employees);
  }

  private static void print(List<Employee> employees) {
    employees.forEach(item -> {
      System.out.println(item.name + " → " + item.dept + " → " + item.salary);
    });

    // for (Employee item : employees) {
    //   System.out.println(item.name + " → " + item.dept + " → " + item.salary);
    // }
  }
}

/*
📌⚠️ Note:  Comparator  →  compare(e1, e2)

For case-insensitive sorting, use compareToIgnoreCase() or Comparator.comparing(String::toLowerCase)
*/
