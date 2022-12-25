package comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Example2 implements Comparator<StringBuffer>{

    @Override
    public int compare(StringBuffer s1, StringBuffer s2) {

        return s2.compareTo(s1);
    }
    public static void main(String[] args) {

        // JDK 8

        // if you try to run this program without passing class object 
        // whose implements comparator interface so you get
        //  an runtime exception : ClassCastException because in java 8 string buffer not implements comparable interface 


        // JDK 12

        // from jdk 12 StringBuffer implements comparable interface so there is no problem when 
        // you not pass an comparator object as a constructor agrs so then it implement is default sorting algo

        TreeSet<StringBuffer> t = new TreeSet<>(new Example2());

        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("D"));

        System.out.println(t);
        

    }
}
