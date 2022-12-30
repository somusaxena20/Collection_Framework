import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

    public static void main(String[] args) {
        
        HashMap<Object, Object> m1 = new HashMap<>();

        IdentityHashMap<Object, Object> m2 = new IdentityHashMap<>();

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        // PUTTING INTEGER VALUE IN HASHMAP WHERE DUPLICATE IDENTIFICATION BASED ON .equals() METHOD / BASED ON CONTENT
        m1.put(i1, "SOMU");
        m1.put(i2, "AMUL");

        // PUTTING INTEGER VALUE IN IDENTITYHASHMAP WHERE DUPLICATE IDENTIFICATION BASED ON == OPERATOR / BASED ON ADDRESS OR REFRENCE
        m2.put(i1, "SOMU");
        m2.put(i2, "AMUL");

        System.out.println("HASHMAP : "+m1);
        System.out.println("IDENTITYHASHMAP : "+m2);
    }
}