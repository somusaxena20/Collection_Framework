package utility_classes.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchMethodExample {
    public static void main(String[] args) {
        
        ArrayList<String> l = new ArrayList<>();
        
        
        l.add("B");
        l.add("E");
        l.add("P");
        l.add("I");
        l.add("Z");

        System.out.println("Default sorting order\n");
        Collections.sort(l); // default sorting
        System.out.println(l);
        System.out.println(Collections.binarySearch(l, "B")); //0
        System.out.println(Collections.binarySearch(l, "C")); //-2

        System.out.println("\nCustomized sorting order\n");
        Collections.sort(l, new MyComparator());
        System.out.println(l);
        System.out.println(Collections.binarySearch(l, "B", new MyComparator()));
        System.out.println(Collections.binarySearch(l, "C", new MyComparator()));

        

    }
}
