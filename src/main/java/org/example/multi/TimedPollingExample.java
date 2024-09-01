/**
 * 
 */
package org.example.multi;

/**
 * 
 */


import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

	public class TimedPollingExample {

	    public static void main(String[] args) throws InterruptedException {
	        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

	        Runnable producer = () -> {
	            try {
	                Thread.sleep(2000); // Simulate some delay
	                queue.put(42);
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        };

	        new Thread(producer).start();

	        System.out.println("Attempting to poll...");
	        Integer result = queue.poll(1, TimeUnit.SECONDS); // Wait for 1 second
	        System.out.println("Polled result: " + result);

	        result = queue.poll(3, TimeUnit.SECONDS); // Wait for 3 seconds
	        System.out.println("Polled result after delay: " + result);
	    }
}



