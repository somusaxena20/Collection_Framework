package queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        
        // DEFAULT PRIORITY QUEUE

        PriorityQueue<Object> q = new PriorityQueue<>();

        // System.out.println(q.peek()); //null
        // System.out.println(q.remove()); // NoSuchElementException

        for (int i = 0; i < 11; i++) {
            q.offer(i);
        }

        System.out.println(q);

        System.out.println(q.poll());

        System.out.println(q);

        // some platform won't provide proper support for thread priority & priority queue
    }
}
