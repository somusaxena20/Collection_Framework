import java.util.HashMap;
import java.util.WeakHashMap;

class Temp {

    @Override
    public String toString()
    {
        return "This is temp class";
    }

    @Override
    public void finalize()
    {
        System.out.println("Garbage collection called...");
    }
}

public class WeakHashMapExample {
    public static void main(String[] args)throws Exception {

        // HERE YOU CAN CHECK WHO CAN DOMINATE WHO'S 😅😅😅
        // LIKE GARBAGE COLLECTION CALLED IN BELOW EXAMPLE : HERE GARBAGE COLLECTION DOMINATE TEMP OBJECT
        /* 
        Temp t = new Temp();
        System.out.println(t);

        t = null;

        System.gc();

        Thread.sleep(5000);
        System.out.println(t);
        */

        // WITH HASHMAP

        // in hashmap garbage collection didn't called because that object temp is associated with hashmap object
        // so garbage collection did not destroy that object so garbage collection didnot called so hashmap dominate
        // garbage collection

        /*

        HashMap<Temp, Object> m = new HashMap<>();

        Temp t = new Temp();

        m.put(t, "SOMU");
        
        System.out.println(m);

        t = null;

        System.gc();

        Thread.sleep(5000);
        System.out.println(m);

         */

        // in this garbage collection dominates the weakhashmap so this destroy that object whos associated with
        // weakhashmap so weakhashmap cannot protect that object so garbage collection destroy that object
        WeakHashMap<Temp, Object> m = new WeakHashMap<>();

        Temp t = new Temp();

        m.put(t, "SOMU");
        
        System.out.println(m);

        t = null;

        System.gc();

        Thread.sleep(5000);
        System.out.println(m);
    }
}
