import java.util.*;

/*
  Set — stores UNIQUE elements only, NO duplicates allowed
  HashSet       → no order guaranteed
  LinkedHashSet → insertion order maintained
  TreeSet       → sorted order maintained

  Set<Integer> set = new HashSet<>();      ✅
  Set<Integer> set = new LinkedHashSet<>();✅
  Set<Integer> set = new TreeSet<>();      ✅
*/

public class SetDemo {
  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(10); // duplicate — will be ignored
    set.add(99);
    System.out.println("After add: " + set); // order not guaranteed

    Set<Integer> set1 = new HashSet<>(set);
    Set<Integer> set2 = new HashSet<>(Arrays.asList(44, 66, 88, 33, 99, 10)); // set operations

    set2.addAll(set1); // union/merge
    set2.retainAll(set1); // intersection (common)
    set2.removeAll(set1); // delete set1 all items
    System.out.println("\nAfter operation: " + set2);

    // access
    System.out.println("Size: " + set.size()); // 4 (not 5, duplicate ignored)
    System.out.println("Contains 20: " + set.contains(20)); // true
    System.out.println("Contains 55: " + set.contains(55)); // false
    System.out.println("isEmpty: " + set.isEmpty()); // false

    // remove
    set.remove(99); // return boolean
    System.out.println("After remove 99: " + set);
    System.out.println("Remove non-existing: " + set.remove(999)); // false

    // iterate
    System.out.print("\nFor-each: "); // ✅
    for (int val : set) {
      System.out.print(val + " ");
    }
    set.forEach(item -> System.out.print(item + " "));

    System.out.print("\nIterator: ");
    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }

    // convert to sorted — use TreeSet
    Set<Integer> sortedSet = new TreeSet<>(set);
    System.out.println("Sorted (TreeSet): " + sortedSet);

    // convert to insertion order — use LinkedHashSet
    Set<Integer> linkedSet = new LinkedHashSet<>(set);
    System.out.println("Insertion order (LinkedHashSet): " + linkedSet);

    // clear
    set.clear();
    System.out.println("After clear: " + set); // []
    System.out.println("isEmpty: " + set.isEmpty()); // true
  }
}

// https://www.geeksforgeeks.org/java/hashset-in-java/
