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

public class ComparatorDemo {
  public static void main(String[] args) {
    List<Employee> employees = Arrays.asList(
        new Employee("Alice", "Engineering", 95000),
        new Employee("Carol", "Engineering", 20000),
        new Employee("Carol", "HR", 6000),
        new Employee("Bob", "Finanace", 44000));

    System.out.println("Original List:");
    for (Employee item : employees) {
      System.out.println(item.name + " → " + item.salary);
    }

    Comparator<Employee> byName = Comparator.comparing(e -> e.name);
    Comparator<Employee> bySalary = Comparator.comparingInt(e -> e.salary);
    Comparator<Employee> byNameThenSalary = Comparator.comparing((Employee e) -> e.name).thenComparingInt(e -> e.salary);

    // method 1: using lambda function
    employees.sort(byName); // sort by name
    employees.sort(Comparator.comparingInt(e -> e.salary)); // sort by salary
    employees.sort(byNameThenSalary); // Sort employees by name, then by dept

    // method 2: using stream
    // sort by salary / name ...
    employees.stream().sorted(bySalary).forEach(item -> System.out.println(item.salary));

    // group by dept and then find the highest salary in each dept
    employees.stream().collect(Collectors.groupingBy(
        e -> e.dept,
        Collectors.maxBy(Comparator.comparingInt(e -> e.salary))))
        .forEach((dept, emp) -> System.out.println(dept + " → " + emp.get().name + " → " + emp.get().salary));

    // method 3: using collections
    Collections.sort(employees, bySalary);

    // Display after sorting
    System.out.println("\n");
    System.out.println("After Sorting:");
    employees.forEach(item -> System.out.println(item.name + " → " + item.salary));
  }
}

/*
📌⚠️ Note:
  Comparator  →  compare(e1, e2)

For case-insensitive sorting, use compareToIgnoreCase() or Comparator.comparing(String::toLowerCase)
*/
