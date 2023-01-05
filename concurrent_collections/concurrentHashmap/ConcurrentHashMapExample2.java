package concurrent_collections.concurrentHashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import concurrent_collections.ConcurrentModificationExceptionExample;

public class ConcurrentHashMapExample2 extends Thread{
    static ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
    @Override
    public void run() {
       try {
            Thread.sleep(1000);
       } catch (Exception e) {

       }

       System.out.println("Child thread updating...");
       
       chm.put(104, "D");
       chm.put(105, "E");

       
    } 

    public static void main(String[] args) throws Exception{
        
        chm.put(101, "A");
        chm.put(102, "B");
        chm.put(103, "C");

        ConcurrentModificationExceptionExample t = new ConcurrentModificationExceptionExample();

        t.start();

        Set<Integer> s = chm.keySet();  

        Iterator<Integer> itr = s.iterator();

        while(itr.hasNext())
        {
            System.out.println("Main thread iterating list & current object : "+itr.next());
            Thread.sleep(3000);
        }


        Set<Integer> set = chm.keySet();

        Iterator<Integer> itr1 = set.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }

    
}

