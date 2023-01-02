package utility_classes.arrays;

import java.util.Arrays;

import utility_classes.collections.MyComparator;

public class SortMethodExample {
    public static void main(String[] args) {
        
        // primitive array

        System.out.println("Primitive sorting\n");
        int []a = {10,4,3,5,7,6};
        System.out.println("Before sorting...");
        for (int x : a) {
            System.out.print(x+" ");
        }

        Arrays.sort(a);
        System.out.println("\nAfter sorting...");
        for (int x : a) {
            System.out.print(x+" ");
        }

        // Object sorting

        System.out.println("\n\nObject sorting\n");

        String []s = {"B", "A", "E", "D", "C"};

        System.out.println("Before Object Sorting...");

        for (String x : s) {
            System.out.print(x+" ");
        }
        Arrays.sort(s);

        System.out.println("\nAfter Object Sorting...");

        for (String x : s) {
            System.out.print(x+" ");
        }


        // Object sorting using comparator

        System.out.println("\n\nObject sorting using comparator\n");

        String []str = {"B", "A", "E", "D", "C"};

        System.out.println("Before Object Sorting using comparator...");

        for (String x : str) {
            System.out.print(x+" ");
        }
        Arrays.sort(str, new MyComparator());

        System.out.println("\nAfter Object Sorting using comparator...");

        for (String x : str) {
            System.out.print(x+" ");
        }
    }
}
