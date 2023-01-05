package concurrent_collections.copyOnWriteArraySet;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {
    public static void main(String[] args) {
        
        CopyOnWriteArraySet<String> s = new CopyOnWriteArraySet<>();

        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add(null);
        s.add(null); // duplicate
        System.out.println(s);


    }
}
