/**
 * 
 */
package org.example.multi.blockingandunblockingqueue;

/**
 * 
 */
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;

public class BulkAddExample {

    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        queue.addAll(Arrays.asList("One", "Two", "Three"));

        System.out.println("Elements in the queue: " + queue);
        
        //  Checking if the Queue Contains an Element
        
        System.out.println("Queue contains 20: " + queue.contains(20));
        System.out.println("Queue contains 40: " + queue.contains(40));
    }
}

