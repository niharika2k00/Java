import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
  List is an interface in Java, not a class. Hence, cannot instantiate it directly.

  List<Integer> list = new List<>(); // ❌ compile error

  List<Integer> list = new ArrayList<>();  // ✅
  List<Integer> list = new LinkedList<>(); // ✅
*/

public class ListDemo {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>(); // ✅ recommended
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(1, 99); // add(int index, Object element) | add at index 1 → [10, 99, 20, 30]
    System.out.println("Original list: " + list);

    // create list of products
    List<Product> products = new ArrayList<>();
    products.add(new Product(1, "Laptop", 75000.0));
    products.add(new Product(2, "Mouse", 500.0));
    products.add(new Product(3, "Keyboard", 1200.0));

    // ⭐️⭐️ other ways of declaring list
    /*
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4)); // Java 9+, Immutable
    
    Arrays.asList(1, 2, 3, 4) OR List.of(1, 2, 3, 4) both returns `List<Integer>`
    
      So, if List<Integer> list = new ArrayList<Integer>(); ✅ directly initialize
    list = Arrays.asList(1, 2, 3, 4);
    list = List.of(1, 2, 3, 4);
    
    Otherwise use ➡️,
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    */

    // access
    System.out.println("Get index 0: " + list.get(0)); // 10
    System.out.println("Size: " + list.size()); // 4
    System.out.println("Contains 20: " + list.contains(20)); // true
    System.out.println("Index of 99: " + list.indexOf(99)); // 1

    // update
    list.set(2, 55); // set(int index, E element)	| replace index 2 → [10, 99, 55, 30]
    System.out.println("After set: " + list);

    // remove
    list.remove(0); // remove by index → [99, 55, 30]
    list.remove(Integer.valueOf(30)); // remove by value | remove(Object o) | list.remove(30)
    // list.removeAll(list); // remove all elements from the list
    System.out.println("After remove: " + list);

    // add
    list.add(20); // add(Object o)
    List<Integer> list2 = new ArrayList<>(Arrays.asList(87, 100, 14, 48));
    list.addAll(list2); // addAll(Collection c)
    list.addAll(0, list2); // addAll(int index, Collection C)

    // sort
    Collections.sort(list); // [5, 10, 55, 99]
    System.out.println("After sort: " + list);

    // iterate
    System.out.print("\nIterate: \n");
    // list.forEach((item) -> System.out.print(item + " "));
    for (int val : list) {
      System.out.print(val + " ");
    }

    // search
    System.out.println("\nisEmpty: " + list.isEmpty()); // false

    // clear
    list.clear();
    System.out.println("After clear: " + list); // []
    System.out.println("isEmpty: " + list.isEmpty()); // true
  }
}

// https://www.geeksforgeeks.org/java/arraylist-in-java/
// https://www.w3schools.com/JAVA/java_collections.asp

class Product {
  private int id;
  private String name;
  private double price;

  // Constructor
  public Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  // Getters (and setters if needed)
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  // Optional but recommended for printing
  @Override
  public String toString() {
    return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
  }
}