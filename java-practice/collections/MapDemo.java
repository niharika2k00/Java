import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
  🎯 Map — stores KEY-VALUE pairs  ➡️  Keys are UNIQUE, values can be duplicate

  HashMap        → no order guaranteed
  LinkedHashMap  → insertion order maintained
  TreeMap        → sorted by key

  Map<String, Integer> map = new HashMap<>();       ✅
  Map<String, Integer> map = new LinkedHashMap<>(); ✅
  Map<String, Integer> map = new TreeMap<>();       ✅
*/

public class MapDemo {
  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();
    map.put("Alice", 90);
    map.put("Charlie", 85);
    map.put("Bob", 75);
    map.put("Alice", 95); // duplicate key — OVERWRITES previous value
    System.out.println("After put: " + map);

    Map<String, Integer> map1 = new HashMap<>(Map.of("Alice", 90, "Bob", 75)); // wrap to make this mutable

    // access
    System.out.println("Get Alice: " + map.get("Alice")); // 95
    System.out.println("Get unknown: " + map.get("Zara")); // null
    System.out.println("getOrDefault: " + map.getOrDefault("Zara", 0)); // 0 getOrDefault(Object key, V defaultValue)
    System.out.println("ContainsKey Bob: " + map.containsKey("Bob")); // true
    System.out.println("ContainsValue 85: " + map.containsValue(85)); // true
    System.out.println("Size: " + map.size()); // 3
    System.out.println("isEmpty: " + map.isEmpty()); // false

    // update
    map.put("Bob", 80); // overwrite
    map.putIfAbsent("Dave", 70); // only adds if key doesn't exist
    map.putIfAbsent("Alice", 00); // Alice exists — ignored ✅
    System.out.println("After update: " + map);

    // remove
    map.remove("Charlie"); // remove by key
    System.out.println("After remove: " + map);

    // ─────────────────────────────────────────────────────────
    // iterate — entrySet (most common) ✅
    System.out.println("\nUsing EntrySet iterate:");
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println("  " + entry.getKey() + " → " + entry.getValue());
    }

    // iterate — forEach lambda ✅
    System.out.println("\nUsing forEach lambda iterate:");
    map.forEach((key, value) -> System.out.println("  " + key + " → " + value));

    // iterate — keySet
    System.out.print("\nKeys: ");
    for (String key : map.keySet()) {
      System.out.print(key + " ");
    }

    // iterate — values only
    System.out.print("\nValues: ");
    for (int val : map.values()) {
      System.out.print(val + " ");
    }
    // ─────────────────────────────────────────────────────────

    // sort by key — TreeMap
    Map<String, Integer> sortedMap = new TreeMap<>(map);
    System.out.println("\n\nSorted by key (TreeMap): " + sortedMap);

    // insertion order — LinkedHashMap
    Map<String, Integer> linkedMap = new LinkedHashMap<>(map);
    System.out.println("\nInsertion order (LinkedHashMap): " + linkedMap);

    // clear
    map.clear();
    System.out.println("After clear: " + map); // {}
    System.out.println("isEmpty: " + map.isEmpty()); // true
  }
}

// https://www.geeksforgeeks.org/java/java-util-hashmap-in-java-with-examples/