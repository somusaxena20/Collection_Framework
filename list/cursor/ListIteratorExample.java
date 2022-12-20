package list.cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Object> l = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            l.add(i);
        }

        ListIterator<Object> itr = l.listIterator();

        while (itr.hasNext()) {
            itr.add("a"); // but it's add this object or show this object after completing this iteration
            // l.add("a");
            if(itr.nextIndex() == 2)
            {   
                System.out.println(itr.previous());
                break;
            }
            System.out.println(itr.next()+" ");
        }
        System.out.println(l);
    }
}
