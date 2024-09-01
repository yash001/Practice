/**
 * 
 */
package org.example.multi.blockingandunblockingqueue;

/**
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class DrainingExample {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.put("One");
        queue.put("Two");
        queue.put("Three");

        List<String> list = new ArrayList<>();
        queue.drainTo(list); // Drain elements to the list

        System.out.println("Elements in the list: " + list);
        System.out.println("Elements remaining in the queue: " + queue.size());
    }
}

