package utility_classes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class CollectionsSortMethodExample {
    public static void main(String[] args) {
        
        // DEFAULT NATURAL SORTING ORDER

        ArrayList<String> l = new ArrayList<>();

        l.add("B");
        l.add("A");
        l.add("E");
        l.add("D");
        l.add("A");

        System.out.println("Before Natural Sorting: "+l);
        Collections.sort(l);
        System.out.println("After Natural Sorting : "+l);

        System.out.println("Before Customized Sorting: "+l);
        Collections.sort(l, new MyComparator()); // customized sorting passing comparator as a arguments
        System.out.println("After Customized Sorting : "+l);
    }
}
