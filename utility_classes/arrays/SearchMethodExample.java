package utility_classes.arrays;

import java.util.Arrays;

import utility_classes.collections.MyComparator;

public class SearchMethodExample {
    public static void main(String[] args) {
        
        System.out.println("Search Natural Sorting");
        String a[] = {"E", "C", "A", "D", "B"};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Search B : "+Arrays.binarySearch(a, "B")); // return index
        System.out.println("Search F : "+Arrays.binarySearch(a, "F")); // insertion point

        System.out.println("Search Customized Sorting");
        Arrays.sort(a, new MyComparator());
        System.out.println(Arrays.toString(a));
        System.out.println("Search B : "+Arrays.binarySearch(a, "B", new MyComparator())); // return index
        System.out.println("Search F : "+Arrays.binarySearch(a, "F", new MyComparator())); // insertion point
    }
}
