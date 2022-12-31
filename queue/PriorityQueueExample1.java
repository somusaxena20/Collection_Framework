package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample1 implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
       
        return o2.compareTo(o1);
    }

    public static void main(String[] args) {
        
        // CUSTOMIZED PRIORITY QUEUE

        PriorityQueue<Integer> q = new PriorityQueue<>(4, new PriorityQueueExample1());

        q.offer(10);
        q.offer(5);
        q.offer(20);
        q.offer(100);

        System.out.println(q);

    }

    
}
