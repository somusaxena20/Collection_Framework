package list.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        
        LinkedList<Object> l = new LinkedList<>();

        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);

        System.out.println(l);
    }
}
