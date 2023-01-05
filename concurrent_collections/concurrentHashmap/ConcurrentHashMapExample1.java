package concurrent_collections.concurrentHashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample1 {
    public static void main(String[] args) {
        
        ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();

        chm.put(102, "B");
        chm.put(101, "A");
        

        chm.putIfAbsent(103, "C");
        chm.putIfAbsent(101, "D");

        chm.remove(101, "D");

        chm.replace(102, "B", "I");

        System.out.println(chm);


    }
}
