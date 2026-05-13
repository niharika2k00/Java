import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
  public static void main(String[] args) {
    // --------------------------
    // ways to initialise List
    // --------------------------
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Mango");

    List<String> colors = List.of("Red", "Green", "Blue"); // Java 9+
    List<String> names = Arrays.asList("Alice", "Bob", "Jerry");
    List<String> streamList = Stream.of("one", "two", "three").collect(Collectors.toList()); // Java 8+
    List<String> streamList1 = Stream.of("one", "two", "three").toList(); // ✅ cleaner! introduced in Java 16+

    // --------------------------
    // ways to create streams [.stream(), Stream.of()]
    // --------------------------
    String[] fruitArray = { "Apple", "Mango", "Guava", "Melon", "Kiwi", "Dragonfruit" };
    List<String> fruitList = List.of("Apple", "Mango", "Guava", "Melon", "Kiwi", "Dragonfruit");
    List<Integer> numberList = Arrays.asList(20, 6, 2, 11, 3, 14, 8, 10, 20, 19, 7);

    Stream<String> stream1 = Arrays.stream(fruitArray); // convert an Array -> stream
    Stream<String> stream2 = Arrays.asList(fruitArray).stream(); // convert an Array -> List -> stream equivalent to list.stream()
    Stream<String> stream3 = Stream.of(fruitArray); // array, strings, BUT NOT LIST
    Stream<String> stream4 = fruitList.stream(); // .stream() works on Set, List ✅ always, NOT ON Array!

    // --------------------------
    // operations on stream
    // --------------------------
    List<String> result = stream4.sorted().distinct().map(String::toUpperCase).collect(Collectors.toList()); // .collect(Collectors.joining(", "))
    System.out.println(result);

    numberList.stream().distinct().filter(x -> x % 2 == 0).sorted().map(x -> x * 2).collect(Collectors.toList()).forEach(System.out::println); // 🚨📌 important
    long count = numberList.stream().count();
    System.out.println("total number of elements: " + count);

    // --------------------------
    //  set and map
    // --------------------------
    Set<String> set = Set.of(fruitArray); // create set
    Stream<String> setToStream = set.stream(); // set -> stream
    Set<String> set1 = Stream.of(fruitArray).collect(Collectors.toSet()); // array -> set

    Map<Integer, String> map = Map.of(1, "mango", 2, "apple", 3, "grapes");
    Stream<Map.Entry<Integer, String>> entryStream = map.entrySet().stream();
    Stream<Integer> keyStream = map.keySet().stream();
    Stream<String> valueStream = map.values().stream(); // stream of only values
  }
}

// https://www.geeksforgeeks.org/java/stream-in-java/
// https://rameshfadatare.medium.com/java-stream-methods-1d8dd8c78f45

/*
Collectors.toList()      // → collect into List
Collectors.toSet()       // → collect into Set
Collectors.toMap()       // → collect into Map
Collectors.joining()     // → join into String
Collectors.counting()    // → count elements
*/
