/**
 * 
 */
package org.example.multi.blockingandunblockingqueue;

/**
 * 
 */
import java.util.concurrent.LinkedBlockingQueue;

public class PriorityQueueExample {

    static class Task implements Comparable<Task> {
        private String name;
        private int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task o) {
            return Integer.compare(this.priority, o.priority);
        }

        @Override
        public String toString() {
            return "Task{" + "name='" + name + '\'' + ", priority=" + priority + '}';
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Task> queue = new LinkedBlockingQueue<>();

        queue.put(new Task("Low Priority", 3));
        queue.put(new Task("High Priority", 1));
        queue.put(new Task("Medium Priority", 2));

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.take());
        }
    }
}
