import java.util.List;

import java.util.*;

public class Infytq_ArrayList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        list1.add(20);
        list1.add(25);
        list1.add(40);
        list1.set(1, 10);

        list2.add(25);
        list2.add(list1.get(0) + 5);
        list2.addAll(0, list1);

        Iterator<Integer> it = list2.iterator();
        int count = 0;

        while (it.hasNext()) {
            if (list2.contains(25)) {
                count++;
                list2.set(0, count);
            }
            else
                list2.add(count);
            System.out.println(it.next());
        }
    }
}
