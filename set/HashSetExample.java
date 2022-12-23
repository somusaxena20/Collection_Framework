package set;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<Object> h = new HashSet<>();

        h.add("A");
        h.add("B");
        h.add(null);
        h.add("C");
        h.add("D");
        h.add(10);

        System.out.println(h);
    }
}