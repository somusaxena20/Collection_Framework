package concurrent_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceptionExample extends Thread{
    static ArrayList<String> l = new ArrayList<>();
    @Override
    public void run() {
       try {
            Thread.sleep(2000);
       } catch (Exception e) {

       }

       System.out.println("Child thread updating...");
       l.add("C");
    }

    public static void main(String[] args) throws Exception{
        l.add("A");
        l.add("B");
        l.add("D");

        ConcurrentModificationExceptionExample t = new ConcurrentModificationExceptionExample();

        t.start();

        Iterator<String> itr = l.iterator();

        while(itr.hasNext())
        {
            System.out.println("Main thread iterating list & current object : "+itr.next());
            Thread.sleep(3000);
        }
    }

    
}
