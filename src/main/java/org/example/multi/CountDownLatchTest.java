/**
 * 
 */
package org.example.multi;

import java.util.concurrent.CountDownLatch;

/**
 * 
 * 
What is CountDownLatch?
CountDownLatch is a synchronization aid in Java that allows one or more threads to wait until a set of operations being performed by other threads is completed. It works by maintaining a counter that counts down from a specified value to zero. When the counter reaches zero, all waiting threads are released and can proceed with their execution.

Use Cases
Starting Multiple Threads at the Same Time: All threads wait on a CountDownLatch until the latch reaches zero, ensuring that they start at the same time.
Waiting for a Set of Tasks to Complete: A thread can wait until several other threads complete their tasks, making sure all tasks are done before proceeding.
How CountDownLatch Works
Initialization: CountDownLatch is initialized with a count value. This count typically represents the number of events or operations that must occur before the latch is released.
Counting Down: Each time an event occurs (e.g., a task is completed), the countDown() method is called, which decrements the count by one.
Awaiting: The await() method is called by threads that need to wait until the count reaches zero. These threads will block until that happens.
Implementing CountDownLatch in Java
Here’s how CountDownLatch is implemented and used in Java:

1. Initialization
Create a CountDownLatch with a specified count.
The count represents the number of times countDown() must be called before threads waiting on the latch can proceed.
java
Copy code
CountDownLatch latch = new CountDownLatch(3);
2. Worker Threads
Worker threads perform some work and then call countDown() to signal that they have completed their task.
java
Copy code
public class Worker implements Runnable {
    private CountDownLatch latch;

    public Worker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // Simulate work
            System.out.println(Thread.currentThread().getName() + " is working");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " has finished working");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();  // Decrement the count of the latch
        }
    }
}
3. Main Thread Waiting
The main thread or other threads can call await() to wait until the latch’s count reaches zero.
java
Copy code
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);  // 3 tasks to complete

        // Create and start worker threads
        Thread worker1 = new Thread(new Worker(latch), "Worker 1");
        Thread worker2 = new Thread(new Worker(latch), "Worker 2");
        Thread worker3 = new Thread(new Worker(latch), "Worker 3");

        worker1.start();
        worker2.start();
        worker3.start();

        // Main thread waits until all workers finish
        latch.await();

        System.out.println("All workers have finished. Proceeding with the main thread.");
    }
}
4. Output Example
The main thread will wait until all three workers have called countDown(), then it will proceed.
csharp
Copy code
Worker 1 is working
Worker 2 is working
Worker 3 is working
Worker 1 has finished working
Worker 2 has finished working
Worker 3 has finished working
All workers have finished. Proceeding with the main thread.
Key Points
One-Time Use: A CountDownLatch is a one-time use mechanism. Once the count reaches zero, it cannot be reset. For multiple uses, you would need a new CountDownLatch.
Blocking: The await() method blocks until the latch count reaches zero, while countDown() is non-blocking.
Thread Safety: CountDownLatch is thread-safe, meaning multiple threads can safely decrement the count or wait on it simultaneously.
CountDownLatch is a powerful tool for coordinating tasks in concurrent programming, especially when you need to ensure that multiple operations or events have occurred before allowing further execution in a thread.

 */
//CountDownLatchTest

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);  // 3 tasks to complete

        // Create and start worker threads
        Thread worker1 = new Thread(new Worker(latch), "Worker 1");
        Thread worker2 = new Thread(new Worker(latch), "Worker 2");
        Thread worker3 = new Thread(new Worker(latch), "Worker 3");

        worker1.start();
        worker2.start();
        worker3.start();

        // Main thread waits until all workers finish
        latch.await();

        System.out.println("All workers have finished. Proceeding with the main thread.");
    }
}
