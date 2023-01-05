package concurrent_collections.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample3{
    
    public static void main(String[] args) {
        
        CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();

        cowal.add("A");
        cowal.add("B");
        cowal.add("C");
        cowal.add("D");
        cowal.add("E");

        Iterator<String> itr = cowal.iterator();

        // while (itr.hasNext()) {
            
        //     if (itr.next() == "D") {
        //         itr.remove(); // UnsupportedOperationException because iterator cannot remove
                
        //     }

        // }

        ListIterator<String> itr1 = cowal.listIterator();

        while (itr1.hasNext()) {
            if (itr1.next() == "D") {
                itr1.add("F"); // you cannot perform add operation also
            }
        }


    }
    
}
