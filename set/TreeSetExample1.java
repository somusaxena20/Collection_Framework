package set;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        
        TreeSet<Object> t = new TreeSet<>();

        t.add("A");
        t.add("B");
        t.add("a");
        t.add("c");
        t.add("b");

        // t.add(new Integer(10)); // CAUSE CLASS CAST EXCEPTION BECAUSE HETROGENUSE OBJECT IS NOT ALLOWED

        // NOTE : FROM 1.7 VERSION YOU CANNOT ADD NULL IN EMPTY TREE SET BEFORE YOU CAN DO THAT

        // t.add(null); // CAUSE NULL POINTER EXCEPTION

        System.out.println(t);
    }
}
