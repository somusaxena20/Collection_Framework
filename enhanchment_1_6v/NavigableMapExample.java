package enhanchment_1_6v;

import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        
        TreeMap<String, String> t = new TreeMap<>();

        t.put("A", "Apple");
        t.put("D", "Dog");
        t.put("B", "Ball");
        t.put("F", "Fish");
        t.put("C", "Cat");

        System.out.println(t);

        System.out.println(t.floorKey("B"));
        System.out.println(t.lowerKey("B"));

        System.out.println(t.ceilingKey("B"));
        System.out.println(t.higherKey("B"));

        System.out.println(t.pollFirstEntry());
        System.out.println(t.pollLastEntry());

        System.out.println(t.descendingKeySet());
        System.out.println(t.descendingMap());

    }
}
