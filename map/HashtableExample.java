import java.util.Hashtable;

class Temp1{
    int i;

    public Temp1(int i)
    {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString()
    {
        return i+"";
    }

    
}

public class HashtableExample {
    public static void main(String[] args) {
        
        Hashtable<Object, Object> t = new Hashtable<>();

        t.put(new Temp1(5), "A");
        t.put(new Temp1(2), "A");
        t.put(new Temp1(6), "A");
        t.put(new Temp1(15), "A");
        t.put(new Temp1(23), "A");
        t.put(new Temp1(16), "A");
        

        System.out.println(t);

    }
}
