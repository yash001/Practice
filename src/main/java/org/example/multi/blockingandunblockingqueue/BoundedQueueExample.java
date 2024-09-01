/**
 * 
 */
package org.example.multi.blockingandunblockingqueue;

/**
 * 
 */
import java.util.concurrent.LinkedBlockingQueue;

public class BoundedQueueExample {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(3); // Bounded to 3 elements

        queue.put("One");
        queue.put("Two");
        queue.put("Three");

        System.out.println("Queue is full, trying to add one more element...");
        // This will block until space becomes available
//        queue.put("Four");
//        String s = queue.take();
//        System.out.println(s);
//        System.out.println(queue.size());
        
        System.out.println("Added fourth element after space became available");
    }
}

