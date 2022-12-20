package list.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        
        ArrayList<Object> l = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            l.add(i);
        }
        System.out.println("BEFORE REMOVING ODD NUMBER...");
        System.out.println(l);

        Iterator<Object> itr = l.iterator();

        // using iterator we can remove also from our collection but in enumeration we cannot do that

        while(itr.hasNext())
        {

            Integer i = (Integer)itr.next();
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                itr.remove();
            }

        }
        System.out.println("AFTER REMOVING ODD NUMBER USING ITERATOR...");
        System.out.println(l);
    }
}
