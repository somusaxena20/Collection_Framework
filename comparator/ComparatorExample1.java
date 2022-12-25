package comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample1 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        
        Integer i = (Integer) o1;
        Integer j = (Integer) o2;

        System.out.println(j+" COMPARE WITH "+i);

        // if (i < j) {
        //     return 1;            
        // }
        // else if (i > j) {
        //     return -1;
        // } else {
        //     return 0;
        // }

        return i < j ? 1 : i > j ? -1 : 0;
    }

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new ComparatorExample1());

        t.add(0);
        t.add(10);
        t.add(15);
        t.add(20);
        t.add(20);

        System.out.println(t);

        

    }
    
}
