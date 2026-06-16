import java.util.*;

public class TwoSum {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    List<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 10, 3, 2, 8, 3));
    int target = 6;

    Map<Integer, Integer> mp = new HashMap<>(); // value, index

    for (int i = 0; i < list.size(); i++) {
      int difference = target - list.get(i);

      if (mp.containsKey(difference)) {
        // System.out.println(list.get(i) + " " + difference); // values
        System.out.println(mp.get(difference) + " " + i); // indexes
      }
      mp.put(list.get(i), i);
    }
  }
}