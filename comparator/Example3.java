package comparator;

import java.util.Comparator;
import java.util.TreeSet;

// WAP to add String & StringBuffer object & sort them based on increasing length sorting order 
// if two objects having same length then consider as a alphabet order

public class Example3 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        
        String s1 = o1.toString();
        String s2 = o2.toString();

        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 < l2) {
            return -1;
        }
        else if(l2 < l1)
        {
            return 1;
        }
        else{
            return s1.compareTo(s2);
        }
    }

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new Example3());

        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        
        System.out.println(t);

    }
    
}
