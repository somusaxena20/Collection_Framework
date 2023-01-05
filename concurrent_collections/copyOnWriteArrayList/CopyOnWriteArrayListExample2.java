package concurrent_collections.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample2 extends Thread{
    static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
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

        CopyOnWriteArrayListExample2 t = new CopyOnWriteArrayListExample2();

        t.start();

        Iterator<String> itr = l.iterator();

        while(itr.hasNext())
        {
            System.out.println("Main thread iterating list & current object : "+itr.next());
            Thread.sleep(3000);
        }
    }

    
}
