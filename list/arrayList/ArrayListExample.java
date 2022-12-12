package list.arrayList;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList<Object> l = new ArrayList<>();

        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);

        System.out.println(l);

        l.add(2, "M");
        
        System.out.println(l);

        l.remove(1);

        System.out.println(l);
    }
}