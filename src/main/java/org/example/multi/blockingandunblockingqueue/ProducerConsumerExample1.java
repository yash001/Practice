/**
 * 
 */
package org.example.multi.blockingandunblockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 
 */

	class ProducerConsumerExample1 {
	    public static void main(String[] args)  {
	        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

	       /*
	        * Thread producer = new Thread(() -> {
	            try {
	                for (int i = 1; i <= 10; i++) {
	                    queue.put(i);
	                    System.out.println("Produced: " + i);
	                }
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        });

	        Thread consumer = new Thread(() -> {
	            try {
	                for (int i = 1; i <= 10; i++) {
	                    int item = queue.take();
	                    System.out.println("Consumed: " + item);
	                }
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        });
	        */
	        //Using Thread
	        //Producer producer = new Producer(queue);
	        //Consumer consumer = new Consumer(queue);

	        //Using Runnable interface
	        Thread producer = new Thread(new Producer(queue));
	        Thread consumer = new Thread(new Consumer(queue));
	        producer.start();
	        consumer.start();
	        try {
				producer.join();
				consumer.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }
	}
	
	class Producer implements Runnable {
		 LinkedBlockingQueue<Integer> queue ;
		public Producer( LinkedBlockingQueue<Integer> queue ) {
			this.queue = queue;
		}
		
		public void run() {
			 try {
	             for (int i = 1; i <= 10; i++) {
	                 queue.put(i);
	                 System.out.println("Produced: " + i);
	             }
	         } catch (InterruptedException e) {
	             Thread.currentThread().interrupt();
	         }
		}
	}
	
	class Consumer extends Thread {
		 LinkedBlockingQueue<Integer> queue ;
		public Consumer( LinkedBlockingQueue<Integer> queue ) {
			this.queue = queue;
		}
		
		public void run() {
			try {
                for (int i = 1; i <= 10; i++) {
                    int item = queue.take();
                    System.out.println("Consumed: " + item);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
		}
	}

