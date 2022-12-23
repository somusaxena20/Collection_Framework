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

        boolean flag = true;
        while (itr.hasNext()) {
            if (flag) {
                flag = false;
                itr.add("a"); // but it's add this object or show this object after completing this iteration
            }
            
            // l.add("a");
           
            System.out.println(itr.previous()+" "+itr.next()+" "+itr.next());
        }
        System.out.println(l);
        System.out.println(itr.getClass().getName());
    }
}
