package list.cursor;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {
        
        Vector<Object> v = new Vector<>();

        Stack<Object> st = new Stack<>();

        

        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }

        Enumeration<Object> l = v.elements();

        while (l.hasMoreElements()) {
            Integer obj = (Integer)l.nextElement();
            System.out.print(obj%2==0 ? obj+" " : "");
        }
    }
}
