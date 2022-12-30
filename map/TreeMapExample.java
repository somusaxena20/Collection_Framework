import java.util.TreeMap;



public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Object, Object> map = new TreeMap<>();

        map.put(101, "ABC");
        map.put(103, "IJK");
        map.put(102, "PQR");
        map.put(104, "XYZ");

        // if you try to insert hetrogenues object in key you will get RE : ClassCastException

        // map.put("101", "ASD");

        // if you try to insert null as a key you will get RE : NPE

        // map.put(null, "map");

        System.out.println(map);

    }
}
