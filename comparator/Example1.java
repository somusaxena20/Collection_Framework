package comparator;

import java.util.Comparator;
import java.util.TreeSet;

// WAP TO REVERSE ALL THE STRING WITH ITS ALPHABET NUMBERS

public class Example1 implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {

        return s2.compareTo(s1);
    }

    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>(new Example1());

        t.add("SOMU SAXENA");
        t.add("AMUL SHARMA");
        t.add("SHASHANK SHARMA");
        t.add("VIVEK PATEL");
        t.add("SHIVAM SALAME");
        t.add("HIMANSHU WARKAD");

        System.out.println(t);
    }
    
}
