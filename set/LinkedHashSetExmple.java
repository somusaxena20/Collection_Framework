package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExmple {
    public static void main(String[] args) {
        
        // DIFFRENCE B/W HASHSET & LINKEDHASHSET IS LINKEDHASHSET IS INSERTION ORDER PRESEVERD + UNIQUE

        LinkedHashSet<Object> h = new LinkedHashSet<>();

        h.add("A");
        h.add("B");
        h.add(null);
        h.add("C");
        h.add("D");
        h.add(10);

        System.out.println(h);
    }
}
