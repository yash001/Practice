/**
 * 
 */
package org.example.notes;

/**
 * Implement queue using array
 */
public class ArrayQueue {
    private int front, rear, size;
    private final int capacity;
    private final int[] queue;

    // Constructor to initialize the queue with a given capacity
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    // Remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Get the element at the front of the queue
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get the number of elements in the queue
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5); // Create a queue with capacity of 5

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Display the queue
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Display the queue after dequeue operations
        System.out.println("Front element after dequeues: " + queue.peek());
        System.out.println("Queue size after dequeues: " + queue.size());
    }
}

