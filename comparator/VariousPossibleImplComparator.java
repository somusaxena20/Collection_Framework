package comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class VariousPossibleImplComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        
        Integer i = (Integer) o1;
        Integer j = (Integer) o2;

        // 1ST POSSIBLE

        return i.compareTo(j); // accedending order

        // 2ND POSSIBLE

        // return -i.compareTo(j); // decending order

        // 3rd POSSIBLE

        // return i.compareTo(j); //accending order

        // 4th possible

        // return j.compareTo(i); //decending order

        // 5th possible

        // return +1; // insertion order

        // 6th possible

        // return -1; // reverse order of insertion

        // 7th possible

        // return 0; // only first element inserted other elements are duplicate
    }

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new VariousPossibleImplComparator());

        t.add(0);
        t.add(10);
        t.add(15);
        t.add(20);
        t.add(20);

        System.out.println(t);
    }
    
}
