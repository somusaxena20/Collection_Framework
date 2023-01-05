package concurrent_collections.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample1 {
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<>();

        al.add("A");
        al.add("C");

        CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();

        cowal.add("A");
        cowal.add("B");

        cowal.addAllAbsent(al);

        System.out.println(cowal);

    }
}
