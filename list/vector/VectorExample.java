package list.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        
        Vector<Object> l = new Vector<>();

        l.add(10);
        l.add("A");
        l.add("B");
        l.add(null);

        
        System.out.println(l);
    }   
}
