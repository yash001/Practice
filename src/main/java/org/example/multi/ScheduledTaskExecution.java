/**
 * 
 */
package org.example.multi;

/**
 * 3. Scheduled Task Execution
This example demonstrates how to schedule tasks using ScheduledExecutorService.
 */
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTaskExecution {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Task executed at " + System.currentTimeMillis());

        System.out.println("Scheduling task...");
        scheduler.schedule(task, 2, TimeUnit.SECONDS); // Schedules the task to run after 5 seconds

        scheduler.shutdown();
    }
}

