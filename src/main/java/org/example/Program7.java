/**
 * 
 */
package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



/**
 * 
 */
public class Program7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for (int i = 1; i <= 5; i++) {
            Runnable task = new Task1(i);
            executor.execute(task); // Submit each task to the executor
        }
		
		//once the task is over shutdown executor service
        executor.shutdown();
		
	}

}

//custom Task which will take integer as input via constructor
class Task1 implements Runnable {
    private final int taskId;

    //constructor
    public Task1(int id) {
        this.taskId = id;
    }

   // it will execute this
    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
    }
}
