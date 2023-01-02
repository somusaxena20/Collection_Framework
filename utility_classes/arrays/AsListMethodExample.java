package utility_classes.arrays;

import java.util.Arrays;
import java.util.List;

public class AsListMethodExample {
    public static void main(String[] args) {
        String []s = {"A", "B", "C"};

        List<String> l = Arrays.asList(s);

        System.out.println(l);
        l.set(0, "Z");
        System.out.println(Arrays.toString(s));

        // if you are trying to increase/decrease the size of object you will get 
        // RE : UnsupportedOperationException

        // l.add("I"); // ERROR

        // if you are trying to replace homogenues object with hetrogenues object
        // RE : ArrayStoreException

        // l.set(0, new Integer(2));



    }
}
