import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Object, Object> m = new LinkedHashMap<>();

        m.put(101, "SOMU");
        m.put(102, "AMUL");
        m.put(103, "SHASHANK");
        m.put(104, "VIVEK");

        System.out.println(m);

        Set<Object> keys = m.keySet();
        System.out.println(keys);

        Collection<Object> values = m.values();
        System.out.println(values);

        // IF YOU TRY TO PUT A NEW VALUE WITH ALREADY EXISTING KEY THEN VALUE REPLACE OF THAT EXISTING KEY

        m.put(101, "SOMU SAXENA");

        // HOW TO GET ITERATOR ON MAP OBJECT

        Set<Entry<Object, Object>> set = m.entrySet();

        Iterator<Entry<Object, Object>> itr = set.iterator();

        while (itr.hasNext()) {
            Entry<Object, Object> entry = itr.next();

            System.out.println(entry.getKey() +" -> "+entry.getValue());
        }

        // HOW TO MAKE SYNCRONIZED HASHMAP 

        Map<Object, Object> synMap = Collections.synchronizedMap(m);

        System.out.println(synMap);

    }
}
