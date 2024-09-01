/**
 * 
 */
package org.example.multi.blockingandunblockingqueue;

/**
 * 
 */
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool {

    private final BlockingQueue<Runnable> taskQueue;
    private final WorkerThread[] workerThreads;

    public CustomThreadPool(int numThreads) {
        // Initialize the BlockingQueue. You can use ArrayBlockingQueue as well.
        taskQueue = new LinkedBlockingQueue<>();
        workerThreads = new WorkerThread[numThreads];

        // Initialize and start worker threads
        for (int i = 0; i < numThreads; i++) {
            workerThreads[i] = new WorkerThread(taskQueue);
            workerThreads[i].start();
            /*
            try {
				workerThreads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
        }
    }

    // Method to submit tasks to the pool
    public void submitTask(Runnable task) {
        try {
            taskQueue.put(task); // Blocking call if queue is full (in case of bounded queue)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Worker thread class that takes tasks from the queue and executes them
    private static class WorkerThread extends Thread {
        private final BlockingQueue<Runnable> taskQueue;

        public WorkerThread(BlockingQueue<Runnable> taskQueue) {
            this.taskQueue = taskQueue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    Runnable task = taskQueue.take(); // Blocking call if queue is empty
                    task.run(); // Execute the task
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        // Create a thread pool with 3 worker threads
        CustomThreadPool threadPool = new CustomThreadPool(3);

        // Submit tasks to the pool
        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            threadPool.submitTask(() -> {
                System.out.println("Executing task " + taskNumber + " by " + Thread.currentThread().getName());
            });
        }
    }
}
