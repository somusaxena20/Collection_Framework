package concurrent_collections.copyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample4 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();

        cowal.add("A");
        cowal.add("B");
        cowal.add("C");

        Iterator<String> itr = cowal.iterator();

        cowal.add("D"); // you cannot add element after getting iterator in ArrayList

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
