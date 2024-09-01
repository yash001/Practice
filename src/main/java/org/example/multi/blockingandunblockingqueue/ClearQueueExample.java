/**
 * 
 */
package org.example.multi.blockingandunblockingqueue;

/**
 * 
 */
import java.util.concurrent.LinkedBlockingQueue;

public class ClearQueueExample {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        queue.put("Item1");
        queue.put("Item2");

        System.out.println("Queue size before clearing: " + queue.size());

        queue.clear(); // Clears all the elements from the queue

        System.out.println("Queue size after clearing: " + queue.size());
    }
}
